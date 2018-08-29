package cn.zw.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {
	public static void main(String[] args) throws MalformedURLException {
		//����·������URL
		URL url=new URL("http://www.baidu.com:80/index.html?name=zw#aa");
		System.out.println("Э��Ϊ"+url.getProtocol());
		System.out.println("����Ϊ"+url.getHost());
		System.out.println("�˿�"+url.getPort());
		System.out.println("��Դ"+url.getFile());
		System.out.println("���·��"+url.getPath());
		System.out.println("ê��"+url.getRef());//ê��
		System.out.println("����"+url.getQuery());//�������������ê�㣬�򷵻�null
		
		//���·������URL
		url=new URL("http://www.baidu.com:80/a/");
		url=new URL(url,"b.txt");
		System.out.println(url.toString());
	}
}
