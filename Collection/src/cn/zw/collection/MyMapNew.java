package cn.zw.collection;

import java.util.LinkedList;

/**
 * 
 * <p>Title:MyMapNew</p>
 * <p>Description:�Զ���Map�������档��߲�ѯЧ��</p>
 * <p>Map �Ͳ�ʵ��:����+����</p>
 * <p>����������ͬ�Ķ��������Ⱦ�����ȵ�hashcode,equals�����hashcodeҲ���</p>
 * @author zhengwei
 * @date 2017-4-30 ����1:06:43
 */
public class MyMapNew {
	LinkedList []arr=new LinkedList[1000];//Map�ĵͲ�ṹ�����������
	int size;
	public void put(Object key,Object value){
		MyEntry e=new MyEntry(key, value);
		
		int a=key.hashCode()%arr.length;
		if(arr[a]==null){
			LinkedList list=new LinkedList();//����������Ǹ�����
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
		map.put("֣ΰ", "����");
		map.put("֣ΰ", "��˼��");
		System.out.println(map.get("֣ΰ"));
	}
}
