package cn.zw.io.file;

import java.io.File;

public class PrintDir {
	public static void main(String[] args) {
		File file=new File("c:/Ñ¸À×ÏÂÔØ");
		//printName(file);
		File[] roots=File.listRoots();
		for (File temp : roots) {
			printName(temp);
		}
	}
	public static void printName(File file){
		if (!file.exists()||null==file) {
			return;
		}
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			for (File temp : file.listFiles()) {
				printName(temp);
			}
		}
	}
}
