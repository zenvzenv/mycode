package cn.zw.guava;

import java.util.Map;
import java.util.Set;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;
import com.google.common.collect.Table.Cell;

/**
 * 
 * <p>Title:Demo06</p>
 * ˫��Map-->Table-->rowKey+colKey+value
 * ���е�������:cellSet()
 * ���е�ѧ��:rowKeySet()
 * ���еĿγ�:colnumKeySet()
 * ���еĳɼ�:values()
 * ѧ����Ӧ�Ŀγ�:rowMap+get(ѧ��)
 * 			 row(ѧ��)
 * �γ̶�Ӧ��ѧ��:colnumMap+get(�γ�)
 * 			  colnum(�γ�)
 * @author zhengwei
 * @date 2017-5-8 ����2:06:26
 */
public class Demo06 {
	public static void main(String[] args) {
		Table<String,String,Integer> table=HashBasedTable.create();
		//��������
		table.put("a", "javase", 80);
		table.put("b", "javase", 90);
		table.put("a", "oracle", 100);
		table.put("c", "oracle", 95);
		//���е�������
		Set<Cell<String,String,Integer>> cells=table.cellSet();
		for (Cell<String, String, Integer> temp : cells) {
			System.out.println(temp.getRowKey()+"-->"+temp.getColumnKey()+"-->"+temp.getValue());
		}
		System.out.println("###################################");
		System.out.print("ѧ��\t");
		//���пγ�
		Set<String> cours=table.columnKeySet();
		for (String temp : cours) {
			System.out.print(temp+"\t");
		}
		System.out.println();
		//���е�ѧ��
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
