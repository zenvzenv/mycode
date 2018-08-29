package cn.zw.others.qoe;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * 
 * <p>Title:MyStack</p>
 * <p>Description:ʹ�ö���ʵ���Զ����ջ</p>
 * 1.��ջ
 * 2.ѹջ
 * 3.��ȡͷ
 * @author zhengwei
 * @date 2017-5-6 ����10:14:07
 * @param <E>
 */
public class MyStack<E> {
	//����
	private Deque<E> contatiner=new ArrayDeque<E>();
	private int cap;
	public MyStack(int cap) {
		super();
		this.cap = cap;
	}
	//ѹջ
	public boolean push(E e){
		if (contatiner.size()+1>cap) {
			return false;
		}
		return contatiner.offerLast(e);
	}
	//��ջ
	public E pop(){
		return contatiner.pollLast();
	}
	//��ȡ
	public int size(){
		return this.contatiner.size();
	}
}
