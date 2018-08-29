package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class BufferedIn {
	public static void main(String[] args){
		try {
			BufferedInputStreamIn();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void BufferedReaderIn() throws IOException{
		InputStream is=System.in;
		BufferedReader bi=new BufferedReader(new InputStreamReader(is));
		System.out.println("«Î ‰»Î:");
		String str=bi.readLine();
		System.out.println(str);
	}
	public static void BufferedInputStreamIn() throws IOException{
		InputStream is=System.in;
		BufferedInputStream bis=new BufferedInputStream(is);
		System.out.println("«Î ‰»Î");
		byte[] flush=new byte[1024];
		int len=0;
		while (-1!=(len=bis.read(flush))) {
			System.out.println(new String(flush,0,len));
		}
	}
}
