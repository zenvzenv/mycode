package cn.zw.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * <p>Title:GoodsApp</p>
 * <p>Description:ʵ��Comparator���򣬿��԰�ʵ��������������н������Ӧ�Զ����������</p>
 * @author zhengwei
 * @date 2017-5-5 ����12:09:41
 */
public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("������Ƶ",500,60));
		list.add(new Goods("��ʿ����Ƶ", 200, 66));
		list.add(new Goods("������Ƶ", 300, 50));
		System.out.println("����ǰ"+list);
		Collections.sort(list, new GoodsPricecomp());
		System.out.println("�����"+list);
		Collections.sort(list, new GoodsFavComp());
		System.out.println("���ղ�������"+list);
	}
}
