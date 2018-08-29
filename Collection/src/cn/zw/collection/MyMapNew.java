package cn.zw.collection;

import java.util.LinkedList;

/**
 * 
 * <p>Title:MyMapNew</p>
 * <p>Description:自定义Map的升级版。提高查询效率</p>
 * <p>Map 低层实现:数组+链表</p>
 * <p>两个内容相同的对象具有相等具有相等的hashcode,equals相等则hashcode也相等</p>
 * @author zhengwei
 * @date 2017-4-30 下午1:06:43
 */
public class MyMapNew {
	LinkedList []arr=new LinkedList[1000];//Map的低层结构是数组加链表
	int size;
	public void put(Object key,Object value){
		MyEntry e=new MyEntry(key, value);
		
		int a=key.hashCode()%arr.length;
		if(arr[a]==null){
			LinkedList list=new LinkedList();//数组里面的那个链表
			arr[a]=list;
			list.add(e);
		}else{
			LinkedList list=arr[a];
			for (int i = 0; i < list.size(); i++) {
				MyEntry e2=(MyEntry) list.get(i);
				if (e2.key.equals(key)) {
					e2.value=value;
				}
			}
			arr[a].add(e);
		}
		
	}
	public Object get(Object key){
		int a=key.hashCode()%arr.length;
		if (arr[a]!=null) {
			LinkedList list=arr[a];
			for (int i = 0; i < list.size(); i++) {
				MyEntry e=(MyEntry) list.get(i);
				if (e.key.equals(key)) {
					return e.value;
				}
			}
		}
		return null;
	}
	public static void main(String[] args) {
		MyMapNew map=new MyMapNew();
		map.put("郑伟", "杨蓉");
		map.put("郑伟", "李思佳");
		System.out.println(map.get("郑伟"));
	}
}
