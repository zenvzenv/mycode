package cn.zw.net.url;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

public class URLDemo03 {
	public static void main(String[] args) throws IOException {
		URL url=new URL("http://www.baidu.com");
		
//		InputStream is=url.openStream();
//		byte[] flush=new byte[1024];
//		int len=0;
//		while (-1!=(len=is.read(flush))) {
//			System.out.println(new String(flush,0,len));
//		}
		
//		BufferedInputStream bis=new BufferedInputStream(url.openStream());
//		byte[] flush=new byte[1024];
//		int len=0;
//		while (-1!=(len=bis.read(flush))) {
//			System.out.println(new String(flush,0,len));
//		}
		
//		BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream(),"utf-8"));
//		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("c:/Ñ¸À×ÏÂÔØ/a.html"),"utf-8"));
//		String str=null;
//		while ((str=br.readLine())!=null) {
//			bw.write(str);
//			bw.newLine();
//		}
//		bw.flush();
//		bw.close();
//		br.close();
		
		BufferedInputStream bis=new BufferedInputStream(url.openStream());
		BufferedOutputStream bos=new BufferedOutputStream(new FileOutputStream("c:/Ñ¸À×ÏÂÔØ/b.html"));
		int len=0;
		byte[] flush=new byte[1024];
		while (-1!=(len=bis.read(flush))) {
			System.out.println(new String(flush,0,len));
			bos.write(flush, 0, len);
		}
		bos.flush();
		bos.close();
		bis.close();
		
		
		
		
		
	}
}
