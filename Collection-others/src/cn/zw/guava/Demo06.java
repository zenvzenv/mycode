package cn.zw.guava;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * 
 * <p>Title:Demo06</p>
 * 双键Map-->Table-->rowKey+colKey+value
 * 所有的行数据:cellSet()
 * 所有的学生:rowKeySet()
 * 所有的课程:colnumKeySet()
 * 所有的成绩:values()
 * 学生对应的课程:rowMap+get(学生)
 * 			 row(学生)
 * 课程对应的学生:colnumMap+get(课程)
 * 			  colnum(课程)
 * @author zhengwei
 * @date 2017-5-8 下午2:06:26
 */
public class Demo06 {
	public static void main(String[] args) {
		Table<String,String,Integer> table=HashBasedTable.create();
		//测试数据
		table.put("a", "javase", 80);
		table.put("b", "javase", 90);
		table.put("a", "oracle", 100);
		table.put("c", "oracle", 95);
		//所有的行数据
		Set<Cell<String,String,Integer>> cells=table.cellSet();
		for (Cell<String, String, Integer> temp : cells) {
			System.out.println(temp.getRowKey()+"-->"+temp.getColumnKey()+"-->"+temp.getValue());
		}
		System.out.println("###################################");
		System.out.print("学生\t");
		//所有课程
		Set<String> cours=table.columnKeySet();
		for (String temp : cours) {
			System.out.print(temp+"\t");
		}
		System.out.println();
		//所有的学生
		Set<String> stus=table.rowKeySet();
		for (String temp : stus) {
			System.out.print(temp+"\n");
			Map<String,Integer> score=table.row(temp);
			for (String c : cours) {
				System.out.print(score.get(c)+"\t");
			}
		}
		System.out.println();
	}
}
