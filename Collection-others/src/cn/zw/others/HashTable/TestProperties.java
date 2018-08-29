package cn.zw.others.HashTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
/**
 * 
 * <p>Title:TestProperties</p>
 * <p>Description:Properties用法</p>
 * 资源配置文件，动态更换数据库
 * storeToXML(OutputStream os, String comment) 
 * @author zhengwei
 * @date 2017-5-6 上午11:18:26
 */
public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		//存储
		pro.setProperty("driver", "oracle.jdbc.drover.OracleDirver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:oracle");
		pro.setProperty("user", "scott");
		pro.setProperty("pvd", "tiger");
		//获取
		String url=pro.getProperty("url", "zw");//存在键所对应的值则返回对应的值，否则返回指定的默认值
		System.out.println(url);
		//存储到硬盘上，绝对路径
		pro.store(new FileOutputStream(new File("C:/迅雷下载/db.properties")), "db配置文件");
		pro.storeToXML(new FileOutputStream(new File("C:/迅雷下载/db.xml")), "db配置文件");
		//相对路径
		pro.store(new FileOutputStream(new File("src/db.properties")), "db配置文件");
		//读取配置文件,绝对路径
		pro.load(new FileReader("C:/迅雷下载/db.properties"));
		System.out.println(pro.getProperty("user", "zw"));
		//读取相对路径
		pro.load(new FileReader("src/db.properties"));
		System.out.println(pro.getProperty("pvd", "zw"));
		//类相对路径的
		//pro.load(TestProperties.class.getResourceAsStream("/Collection-others/src/db.properties"));
		//""表示bin
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
		System.out.println(pro.getProperty("user", "zw"));
	}
}
