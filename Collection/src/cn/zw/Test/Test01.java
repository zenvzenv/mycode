package cn.zw.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/**
 * 
 * <p>Title:Test01</p>
 * <p>Description:һ���������һ����¼��һ�����Ӧһ����ṹ</p>
 * @author zhengwei
 * @date 2017-5-1 ����3:37:41
 */
public class Test01 {
	public static void main(String[] args) {
		//һ������һ����¼
		Employee e=new Employee(01, "֣ΰ", 3000, "������", "2017-7");
		Employee e2=new Employee(02, "֣ΰ", 3000, "������", "2017-7");
		Employee e3=new Employee(03, "֣ΰ", 3000, "������", "2017-7");
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
