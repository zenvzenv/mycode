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
		int result=compiler.run(null, null, null, "c:/迅雷下载/HelloWorld.java");
		System.out.println(result==0?"编译成功":"编译失败");
		
		//通过Runtime调用
		Runtime run=Runtime.getRuntime();
		Process process=run.exec("java -cp c:/迅雷下载	HelloWorld");
		InputStream is=process.getInputStream();
		BufferedReader br=new BufferedReader(new InputStreamReader(is));
		String str="";
		while((str=br.readLine())!=null){
			System.out.println(str);
		}
		
		URL[] urls=new URL[]{new URL("file:/"+"c:/迅雷下载/")};
		URLClassLoader loader=new URLClassLoader(urls);
		Class c=loader.loadClass("HelloWorld");
		//调用加在类的main方法
		//Method method=c.getMethod("main", String[].class);
		Method method=c.getDeclaredMethod("main", String[].class);
		method.invoke(null, (Object)new String[]{"aa","bb"});
		//由于可变参数是JDK5.0以后才有，如果不加Object强转的话，上面的代码会变已成method.invoke(null,"a","b");
		
	}
}
