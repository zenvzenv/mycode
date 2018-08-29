package cn.zw.collection;

import java.util.Iterator;


/**
 * 
 * <p>Title:MyArrayList</p>
 * <p>Description:�Զ���ʵ��ArrayList�������Ͳ�ṹ</p>
 * @author zhengwei
 * @date 2017-5-1 ����1:51:02
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
	private void ensureCapacity(){//����
		if(size==elementData.length){
			Object[] newArray=new Object[size*2+1];
			System.arraycopy(elementData, 0, newArray, 0, elementData.length);
			elementData=newArray;
		}
	}
	/**
	 * 
	 * <p>Title:MyIterator</p>
	 * <p>Description:�ڲ���ʵ�ֵ���������ԭ��</p>
	 * @author zhengwei
	 * @date 2017-5-3 ����2:10:44
	 */
	private class MyIterator implements Iterator<String>{
		private int cursor=-1;
		@Override
		/**
		 * �ж��Ƿ���һ��Ԫ��
		 */
		public boolean hasNext() {
			return cursor+1<size;
		}

		@Override
		/**
		 * �����һ��Ԫ��
		 */
		public String next() {
			cursor++;
			return (String) elementData[cursor];
		}

		@Override
		/**
		 * ɾ��Ԫ��
		 */
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}
	public Iterator<String> iterator(){
		return new MyIterator();
	}
	public void add(Object o){
		//�������ݺ����ݵĿ���
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
		//ɾ��ָ��λ�õĶ���
		int numMoved=size-index-1;
		if(numMoved>0){
			System.arraycopy(elementData, index+1, elementData, index, numMoved);
		}
	}
	public void remove(Object o){
		//ɾ��ָ���Ķ���
		for (int i = 0; i < size; i++) {
			if (get(i).equals(o)) {//�Ʋ���õ���equsls��������==��
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
		//��ǿforѭ��������,��ʵ��java.lang.Iterator�ӿ�,��дiterator����
		for (String temp : list) {
			System.out.println(temp);
		}
	}
}
