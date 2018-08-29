package cn.zw.textreflection;
/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:测试各种类型对应的java.lang.Class对象的获取方式</p>
 * .class
 * .getClass
 * Class c=forName()
 * @author zhengwei
 * @date 2017-5-14 下午8:17:51
 */
@SuppressWarnings("all")
public class Demo01 {
	public static void main(String[] args) {
		String path="cn.zw.bean.User";
		
		try {
			//对象就表示一些数据，一个类被加载后，JVM会创建一个对应该类的Class对象，类的整个结构信息都会被放到对应的Class对象中去
			//这个Class对象就像一面镜子一样，通过这面镜子我们可以看到对应类的全部星星——这就是反射
			Class clz=Class.forName(path);
			System.out.println(clz.hashCode());
			
			Class clz2=Class.forName(path);//一个类只对应一个对象
			System.out.println(clz2.hashCode());
			
			Class clz3=String.class;
			Class clz4=path.getClass();
			System.out.println(clz3==clz4);
			
			Class clz5=int.class;
			
			int[] a=new int[10];
			int[] b=new int[30];
			System.out.println(a.getClass().hashCode());
			System.out.println(b.getClass().hashCode());
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
