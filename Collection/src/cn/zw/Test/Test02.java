package cn.zw.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Test02 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("id", "01");
		map.put("name", "zw");
		map.put("salary", "3000");
		map.put("department", "开发部");
		map.put("hireDate", "2017-07");
		
		Map map2=new HashMap();
		map2.put("id", "01");
		map2.put("name", "zw");
		map2.put("salary", "3000");
		map2.put("department", "开发部");
		map2.put("hireDate", "2017-07");
		
		Map map3=new HashMap();
		map3.put("id", "01");
		map3.put("name", "zw");
		map3.put("salary", "3000");
		map3.put("department", "开发部");
		map3.put("hireDate", "2017-07");
		
		List<Map> list=new ArrayList<Map>();
		list.add(map);
		list.add(map2);
		list.add(map3);
		
		printEmpName(list);
	}
	public static void printEmpName(List<Map> list){
		for (int i = 0; i < list.size(); i++) {
			Map tempMap=list.get(i);
			System.out.println(tempMap.get("name"));
		}
	}
}
