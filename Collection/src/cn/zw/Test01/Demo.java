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
 * <p>Description:定义一个Student类，属性：name 姓名；no 班号；score 得分</p>
 * @author zhengwei
 * @date 2017-5-4 上午10:08:41
 */
public class Demo {
	public static void main(String[] args) {
		List<Student> list=new ArrayList<Student>();
		exam(list);
		
		//统计
		Map<String,ClassRoom> rooms=new HashMap<String,ClassRoom>();
		count(rooms,list);
		//打印
		printScore(rooms);
	}
	/**
	 * 将若干Student对象放入到List中
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
	 * 统计分数
	 * @param rooms
	 * @param list
	 */
	public static void count(Map<String, ClassRoom> rooms,List<Student> list){
		for (Student student : list) {
			String no=student.getNo();
			double score=student.getScore();
			//根据班级编号查看Map中是否存在该班级，分拣思路
			ClassRoom room=rooms.get(no);
			if(null==room){
				room=new ClassRoom(no);
				rooms.put(no, room);
			}
			//存储总分
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
			System.out.println("班号为："+room.getNo()+"，总分："+room.getTotal()+"，平均分："+avg);
		}
		
		
	}
}
 