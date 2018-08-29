package cn.zw.testFile;

import java.io.File;
import java.io.IOException;

public class Test01 {
	public static void main(String[] args) {
		File f=new File("c:/迅雷下载");//路径
		File f2=new File("c:/迅雷下载/BrazzersExxtra - Stream Creaming - Vanessa Decker [720p].mp4");
		File f3=new File(f,"666.txt");
		try {
			f3.createNewFile();
			f3.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(f2.isFile()){
			System.out.println("是一个文件");
		}
		if(f.isDirectory()){
			System.out.println("是一个目录");
		}
		File file3=new File("c:/迅雷下载");
		printFile(file3,0);
	}
	public static void printFile(File file,int level){
		for (int i = 0; i < level; i++) {
			System.out.println("-");
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files=file.listFiles();
			for (File file2 : files) {
				printFile(file2,level+1);
			}
		}
	}
}
