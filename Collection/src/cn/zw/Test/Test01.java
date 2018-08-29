package cn.zw.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:一个对象对于一条记录，一个类对应一个表结构</p>
 * @author zhengwei
 * @date 2017-5-1 下午3:37:41
 */
public class Test01 {
	public static void main(String[] args) {
		//一个对象一个记录
		Employee e=new Employee(01, "郑伟", 3000, "开发部", "2017-7");
		Employee e2=new Employee(02, "郑伟", 3000, "开发部", "2017-7");
		Employee e3=new Employee(03, "郑伟", 3000, "开发部", "2017-7");
		List<Employee> list=new ArrayList<Employee>();
		list.add(e);
		list.add(e2);
		list.add(e3);
		printEmpName(list);
	}
	public static void printEmpName(List<Employee> list){
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).getName());
		}
	}
}
