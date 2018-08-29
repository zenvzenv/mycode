package cn.zw.thread.syn;
/**
 * 单例设计模式
 * 1.懒汉式
 * a.构造器私有化
 * b.声明私有的静态属性
 * c.对外提供访问属性的静态方法，确保对象存在
 * <p>Title:MyJvm</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 下午9:24:18
 */
public class MyJvm {
	private static MyJvm instance;
	private MyJvm(){
		
	}
	public static MyJvm getInstance(){
		if(null==instance){//提高效率
			synchronized(MyJvm.class){
				if (null==instance) {
					instance=new MyJvm();
				}
			}
		}
		return instance;
	}
}
/**
 * 
 * <p>Title:MyJvm2</p>
 * 饿汉式
 * 1.构造区私有化
 * 2.声明私有的静态属性，同时创建对象
 * 3.声明公告的静态的访问属性的访问方法
 * @author zhengwei
 * @date 2017-5-11 下午9:28:58
 */
class MyJvm2{
	private static MyJvm2 instance=new MyJvm2();
	private MyJvm2(){
		
	}
	public static MyJvm2 getInstance(){
		return instance;
	}
}
/**
 * 类在使用的时候加载，延缓加载时间，提高效率
 * <p>Title:MyJvm3</p>
 * <p>Description:</p>
 * @author zhengwei
 * @date 2017-5-11 下午9:33:04
 */
class MyJvm3{
	private static class JVMholder{
		private static MyJvm3 instance=new MyJvm3();
	}
	private MyJvm3(){
		
	}
	public static MyJvm3 getInstance(){
		return JVMholder.instance;
	}
}
