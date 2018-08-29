package cn.zw.collection;

import java.util.Iterator;


/**
 * 
 * <p>Title:MyArrayList</p>
 * <p>Description:自定义实现ArrayList，以理解低层结构</p>
 * @author zhengwei
 * @date 2017-5-1 下午1:51:02
 */
public class MyArrayList implements java.lang.Iterable<String>{
	private Object[] elementData;
	private int size;
	public int getSize(){
		return size;
	} 
	public MyArrayList(){
		this(10);
	}
	public MyArrayList(int initialCapacity){
		if(initialCapacity<0){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData=new Object[initialCapacity];
	}
	private void RangeCheck(int index){
		if(index>=size){
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		elementData[--size]=null;
	}
	private void ensureCapacity(){//扩容
		if(size==elementData.length){
			Object[] newArray=new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData=newArray;
		}
	}
	/**
	 * 
	 * <p>Title:MyIterator</p>
	 * <p>Description:内部类实现迭代器基本原理</p>
	 * @author zhengwei
	 * @date 2017-5-3 下午2:10:44
	 */
	private class MyIterator implements Iterator<String>{
		private int cursor=-1;
		@Override
		/**
		 * 判断是否在一个元素
		 */
		public boolean hasNext() {
			return cursor+1<size;
		}

		@Override
		/**
		 * 获得下一个元素
		 */
		public String next() {
			cursor++;
			return (String) elementData[cursor];
		}

		@Override
		/**
		 * 删除元素
		 */
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public Iterator<String> iterator(){
		return new MyIterator();
	}
	public void add(Object o){
		//数组扩容和数据的拷贝
		ensureCapacity();
		
		elementData[size++]=o;
	}
	public boolean isEmpty(){
		return size==0;
	}
	public Object get(int index){
		RangeCheck(index);
		return elementData[index];
	}
	public void remove(int index){
		//删除指定位置的对象
		int numMoved=size-index-1;
		if(numMoved>0){
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
	}
	public void remove(Object o){
		//删掉指定的对象
		for (int i = 0; i < size; i++) {
			if (get(i).equals(o)) {//镀层调用的是equsls，而不是==号
				remove(i);
			}
		}
	}
	public Object set(int index,Object o){
		RangeCheck(index);
		Object oldValue=elementData[index];
		elementData[index]=o;
		return oldValue;
	}
	public void add(int index,Object o){
		RangeCheck(index);
		System.arraycopy(elementData, index, elementData, index+1, size-index);
		elementData[index]=o;
		size++;
	}
	public static void main(String[] args) {
		MyArrayList list=new MyArrayList();
		list.add("zw0");
		list.add("zw1");
		list.add("zw2");
		list.add("zw3");
		list.add("zw4");
		list.add("zw5");
		list.add("zw6");
		list.add("zw7");
//		System.out.println(list.getSize());
//		System.out.println(list.get(3));
		
		Iterator<String> iterator=list.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		//增强for循环来遍历,需实现java.lang.Iterator接口,重写iterator方法
		for (String temp : list) {
			System.out.println(temp);
		}
	}
}
