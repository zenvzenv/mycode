package cn.zw.Test01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * 
 * <p>Title:Demo</p>
 * <p>Description:����һ��Student�࣬���ԣ�name ������no ��ţ�score �÷�</p>
 * @author zhengwei
 * @date 2017-5-4 ����10:08:41
 */
public class Demo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		exam(list);
		
		//ͳ��
		Map<String,ClassRoom> rooms=new HashMap<String,ClassRoom>();
		count(rooms,list);
		//��ӡ
		printScore(rooms);
	}
	/**
	 * ������Student������뵽List��
	 * @param list
	 */
	public static void exam(List<Student> list){
		list.add(new Student("a","001",80));
		list.add(new Student("b","002",80));
		list.add(new Student("c","003",80));
		list.add(new Student("d","004",80));
		list.add(new Student("e","002",80));
		list.add(new Student("f","004",80));
	}
	/**
	 * ͳ�Ʒ���
	 * @param rooms
	 * @param list
	 */
	public static void count(Map<String, ClassRoom> rooms,List<Student> list){
		for (Student student : list) {
			String no=student.getNo();
			double score=student.getScore();
			//���ݰ༶��Ų鿴Map���Ƿ���ڸð༶���ּ�˼·
			ClassRoom room=rooms.get(no);
			if(null==room){
				room=new ClassRoom(no);
				rooms.put(no, room);
			}
			//�洢�ܷ�
			room.setTotal(room.getTotal()+score);
			room.getStus().add(student);
		}
	}
	
	public static void printScore(Map<String,ClassRoom> rooms){
		Set<Map.Entry<String, ClassRoom>> entrySet=rooms.entrySet();
		Iterator<Map.Entry<String, ClassRoom>> it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry<String, ClassRoom> entry=it.next();
			ClassRoom room=entry.getValue();
			double avg=room.getTotal()/room.getStus().size();
			System.out.println("���Ϊ��"+room.getNo()+"���ܷ֣�"+room.getTotal()+"��ƽ���֣�"+avg);
		}
		
		
	}
}
 