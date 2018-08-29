package cn.zw.myCollection;
/**
 * 模拟实现JDK中提供的ArrayList类
 * @author zhengwei
 *
 */
public class MyArrayList {
	//the value is used for object storage
	private Object[] value;
	//the size is the number of object 
	private int size;
	
	public Object[] getValue() {
		return value;
	}
	
	public int getSize() {
		return size;
	}
	
	public MyArrayList(){
		//value=new Object[16];
		this(16);
	}
	public MyArrayList(int size){
		value=new Object[size];
	}
	public void add(Object obj){
		value[size]=obj;
		size++;
		if(size>=value.length){
			//装不下了，扩容
			int newCapacity=value.length*2;
			Object[] newList=new Object[newCapacity];
			for (int i = 0; i < value.length; i++) {
				newList[i]=value[i];
			}
			value=newList;
		}
	}
	public Object get(int index){
		if (index<0||index>size-1) {//[0,index]
			try {
				throw new Exception();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return value[index];
	}
	public static void main(String[] args) {
		MyArrayList mal=new MyArrayList(2);
		mal.add("aa");
		mal.add(new Human("郑伟"));
	}
}
