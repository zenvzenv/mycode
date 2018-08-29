package cn.zw.net.url;

import java.net.MalformedURLException;
import java.net.URL;

public class URLDemo01 {
	public static void main(String[] args) throws MalformedURLException {
		//绝对路径构建URL
		URL url=new URL("http://www.baidu.com:80/index.html?name=zw#aa");
		System.out.println("协议为"+url.getProtocol());
		System.out.println("域名为"+url.getHost());
		System.out.println("端口"+url.getPort());
		System.out.println("资源"+url.getFile());
		System.out.println("相对路径"+url.getPath());
		System.out.println("锚点"+url.getRef());//锚点
		System.out.println("参数"+url.getQuery());//参数，如果存在锚点，则返回null
		
		//相对路径构建URL
		url=new URL("http://www.baidu.com:80/a/");
		url=new URL(url,"b.txt");
		System.out.println(url.toString());
	}
}
