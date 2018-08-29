package cn.zw.io.others;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ObjectStreamDemo01 {
	public static void main(String[] args) {
		try {
			seri("c:/迅雷下载/2.txt");
			read("c:/迅雷下载/2.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void seri(String destPath) throws FileNotFoundException, IOException{
		TestSerializableEmployee emp=new TestSerializableEmployee("zw", 1000);
		int[] arr=new int[]{1,2,3,4,5};
		//创建源
		File dest=new File(destPath);
		//选择流
		ObjectOutputStream oos=new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(dest)));
		//操作，写出的顺序为读出做准备
		oos.writeObject(emp);
		oos.writeObject(arr);
		oos.close();
	}
	public static void read(String srcPath) throws FileNotFoundException, IOException, ClassNotFoundException{
		File src=new File(srcPath);
		ObjectInputStream ois=new ObjectInputStream(new BufferedInputStream(new FileInputStream(src)));
		Object obj=ois.readObject();
		if (obj instanceof TestSerializableEmployee) {
			TestSerializableEmployee emp=(TestSerializableEmployee) obj;
			System.out.println(emp.getName());
			System.out.println(emp.getSalary());
		}
		
		obj=ois.readObject();
		int[] arr=(int[]) obj;
		System.out.println(Arrays.toString(arr));
		ois.close();
	}
}
