package cn.zw.others.three;

import java.lang.ref.WeakReference;

/**
 * 
 * <p>Title:RelDemo</p>
 * 分类引用：强、软、弱、虚
 * 重点是：强与弱的引用
 * @author zhengwei
 * @date 2017-5-6 下午9:09:22
 */
public class RelDemo {
	public static void main(String[] args) {
		String str=new String("zw is good");//不是在常量池中，而是在堆中
		//弱类型管理对象
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc调用前:"+wr.get());
		//断开引用
		str=null;
		//通知回收
		System.gc();
		System.runFinalization();
		//对象被回收
		System.out.println("gc调用后:"+wr.get());
		
	}
	public static void testStrong(){
		//字符串常量池，是共享的（不能回收）
		String str="zw is good";//在常量池中
		//弱引用 管理对象
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc运行前:"+wr.get());
		//断开引用
		str=null;
		//通知回收
		System.gc();
		System.runFinalization();
		System.out.println("gc运行后:"+wr.get());
	}
}
