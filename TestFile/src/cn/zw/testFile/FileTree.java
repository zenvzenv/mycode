package cn.zw.testFile;

import java.io.File;

public class FileTree {
	public static void printFile(File file,int level){
		for (int i = 0; i < level; i++) {
			System.out.print("-");
		}
		System.out.println(file.getName());
		if (file.isDirectory()) {
			File[] files=file.listFiles();
			for (File f : files) {
				printFile(f,level+1);
			}
		}
	}
	public static void main(String[] args) {
		File f=new File("c:/Ѹ������");
		printFile(f,0);
	}
}
