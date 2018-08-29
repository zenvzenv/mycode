package cn.zw.io.file;

import java.io.File;
import java.util.Arrays;

/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:������ＶĿ¼���������</p>
 * @author zhengwei
 * @date 2017-5-9 ����10:58:10
 */
public class Demo01 {
	public static void main(String[] args) {
		String path="c:/Ѹ������";
		File file=new File(path);
		//print(file);
		
		//��������̷�
		File[] roots=File.listRoots();
		System.out.println(Arrays.toString(roots));
		for (File temp : roots) {
			print(temp);
		}
	}
	public static void print(File file){
		if (null==file||!file.exists()) {
			return;
		}
		System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			for (File temp : file.listFiles()) {
				print(temp);
			}
		}
	}
	
}
