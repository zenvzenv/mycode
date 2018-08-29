package cn.zw.io.file;

import java.io.File;

/**
 * 
 * <p>Title:Separator</p>
 * <p>Description:两个常量</p>
 * 1.路径分隔符
 * 2.文件分隔符
 * 相对路径和绝对路径来构建File
 * @author zhengwei
 * @date 2017-5-8 下午11:01:35
 */
public class Separator {
	public static void main(String[] args) {
		//System.out.println(File.pathSeparator);
		//System.out.println(File.separator);
		//路径表示
		//String path="c:"+File.separator+"迅雷下载";
		//System.out.println(path);
		
		String parentPath="c:/迅雷下载";
		String name="1.txt";
		File src=new File(parentPath,name);
		src=new File(new File(parentPath),name);
		System.out.println(src.getName());
		System.out.println(src.getPath());
		File file=new File("c:/迅雷下载/1.txt");
		System.out.println(file.getName());
		System.out.println(file.getAbsolutePath());
	}
}
