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
 * <p>Description:Properties�÷�</p>
 * ��Դ�����ļ�����̬�������ݿ�
 * storeToXML(OutputStream os, String comment) 
 * @author zhengwei
 * @date 2017-5-6 ����11:18:26
 */
public class TestProperties {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties pro=new Properties();
		//�洢
		pro.setProperty("driver", "oracle.jdbc.drover.OracleDirver");
		pro.setProperty("url", "jdbc:oracle:thin:@localhost:1521:oracle");
		pro.setProperty("user", "scott");
		pro.setProperty("pvd", "tiger");
		//��ȡ
		String url=pro.getProperty("url", "zw");//���ڼ�����Ӧ��ֵ�򷵻ض�Ӧ��ֵ�����򷵻�ָ����Ĭ��ֵ
		System.out.println(url);
		//�洢��Ӳ���ϣ�����·��
		pro.store(new FileOutputStream(new File("C:/Ѹ������/db.properties")), "db�����ļ�");
		pro.storeToXML(new FileOutputStream(new File("C:/Ѹ������/db.xml")), "db�����ļ�");
		//���·��
		pro.store(new FileOutputStream(new File("src/db.properties")), "db�����ļ�");
		//��ȡ�����ļ�,����·��
		pro.load(new FileReader("C:/Ѹ������/db.properties"));
		System.out.println(pro.getProperty("user", "zw"));
		//��ȡ���·��
		pro.load(new FileReader("src/db.properties"));
		System.out.println(pro.getProperty("pvd", "zw"));
		//�����·����
		//pro.load(TestProperties.class.getResourceAsStream("/Collection-others/src/db.properties"));
		//""��ʾbin
		pro.load(Thread.currentThread().getContextClassLoader().getResourceAsStream(""));
		System.out.println(pro.getProperty("user", "zw"));
	}
}
