package cn.zw.test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;

import javax.tools.JavaCompiler;
import javax.tools.ToolProvider;

public class Test {
	public static void main(String[] args) throws IOException, Exception, SecurityException {
		JavaCompiler compiler=ToolProvider.getSystemJavaCompiler();
		int result=compiler.run(null, null, null, "c:/Ѹ������/HelloWorld.java");
		System.out.println(result==0?"����ɹ�":"����ʧ��");
		
		//ͨ��Runtime����
		Runtime run=Runtime.getRuntime();
		Process process=run.exec("java -cp c:/Ѹ������	HelloWorld");
		InputStream is=process.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		URL[] urls=new URL[]{new URL("file:/"+"c:/Ѹ������/")};
		URLClassLoader loader=new URLClassLoader(urls);
		Class c=loader.loadClass("HelloWorld");
		//���ü������main����
		//Method method=c.getMethod("main", String[].class);
		Method method=c.getDeclaredMethod("main", String[].class);
		method.invoke(null, (Object)new String[]{"aa","bb"});
		//���ڿɱ������JDK5.0�Ժ���У��������Objectǿת�Ļ�������Ĵ������ѳ�method.invoke(null,"a","b");
		
	}
}
