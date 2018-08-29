package cn.zw.collection;
/**
 * 
 * <p>Title:MyMap</p>
 * <p>Description:�Զ���ʵ��Map�Ĺ���</p>
 * <p>Map:��ż�ֵ�ԣ����ݼ������Ҷ�Ӧ��ֵ���󣬼������ظ�</p>
 * @author zhengwei
 * @date 2017-4-30 ����12:47:14
 */
public class MyMap {
	MyEntry []arr=new MyEntry[1000];
	int size;
	public void put(Object key,Object value){
		MyEntry e=new MyEntry(key, value);
		//�����ֵ�ظ��Ĵ��������ظ�������ֱ�Ӹ���
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
		map.put("֣ΰ",new Wife("����"));
		map.put("֣ΰ",new Wife("��˼��"));
		Wife w=(Wife) map.get("֣ΰ");
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