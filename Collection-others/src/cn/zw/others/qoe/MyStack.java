package cn.zw.others.qoe;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * <p>Title:MyStack</p>
 * <p>Description:使用队列实现自定义堆栈</p>
 * 1.弹栈
 * 2.压栈
 * 3.获取头
 * @author zhengwei
 * @date 2017-5-6 上午10:14:07
 * @param <E>
 */
public class MyStack<E> {
	//容器
	private Deque<E> contatiner=new ArrayDeque<E>();
	private int cap;
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	//压栈
	public boolean push(E e){
		if (contatiner.size()+1>cap) {
			return false;
		}
		return contatiner.offerLast(e);
	}
	//弹栈
	public E pop(){
		return contatiner.pollLast();
	}
	//获取
	public int size(){
		return this.contatiner.size();
	}
}
