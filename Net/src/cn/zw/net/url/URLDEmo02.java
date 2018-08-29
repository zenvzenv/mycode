package cn.zw.net.url;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;

/**
 * 货物资源，即源代码
 * <p>Title:URLDEmo02</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-12 下午2:56:04
 */
public class URLDEmo02 {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");//访问页面主页
		//获取资源，网络流
		/*InputStream is=url.openStream();
		byte[] flush=new byte[1024];
		int len=0;
		while(-1!=(len=is.read(flush))){
			System.out.println(new String(flush,0,len));
		}
		is.close();*/
		//转换流
		/*BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"UTF-8"));
		BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("baidu.html"),"utf-8"));
		String msg=null;
		while ((msg=br.readLine())!=null) {
			//System.out.println(msg);
			writer.append(msg);
			writer.newLine();
		}
		writer.flush();
		writer.close();*/
		
	}
}
