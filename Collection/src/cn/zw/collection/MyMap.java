package cn.zw.collection;
/**
 * 
 * <p>Title:MyMap</p>
 * <p>Description:自定义实现Map的功能</p>
 * <p>Map:存放键值对，根据键对象找对应的值对象，键不能重复</p>
 * @author zhengwei
 * @date 2017-4-30 下午12:47:14
 */
public class MyMap {
	MyEntry []arr=new MyEntry[1000];
	int size;
	public void put(Object key,Object value){
		MyEntry e=new MyEntry(key, value);
		//解决键值重复的处理，后面重复的内容直接覆盖
		for (int i = 0; i < size; i++) {
			if(arr[i].key.equals(key)){
				arr[i].value=value;
				return ;
			}
		}
		arr[size++]=e;
		
	}
	public Object get(Object key){
		for (int i = 0; i < size; i++) {
			arr[i].key.equals(key);
			return arr[i].value;
		}
		return null;
	}
	public static void main(String[] args) {
		MyMap map=new MyMap();
		map.put("郑伟",new Wife("杨蓉"));
		map.put("郑伟",new Wife("李思佳"));
		Wife w=(Wife) map.get("郑伟");
		System.out.println(w.name);
	}
	public boolean containsKey(Object key){
		for (int i = 0; i < size; i++) {
			if(arr[i].key.equals(key)){
				return true;
			}
		}
		return false;
	}
}
class MyEntry{
	Object key;
	Object value;
	public MyEntry(Object key,Object value){
		super();
		this.key=key;
		this.value=value;
	}
}
class Wife{
	String name;
	public Wife(String name){
		this.name=name;
	}
}