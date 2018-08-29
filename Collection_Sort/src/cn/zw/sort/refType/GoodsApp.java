package cn.zw.sort.refType;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * <p>Title:GoodsApp</p>
 * <p>Description:实现Comparator排序，可以把实体类与排序类进行解耦，方便应对多变的排序规则</p>
 * @author zhengwei
 * @date 2017-5-5 下午12:09:41
 */
public class GoodsApp {
	public static void main(String[] args) {
		List<Goods> list=new ArrayList<Goods>();
		list.add(new Goods("高琪视频",500,60));
		list.add(new Goods("马士兵视频", 200, 66));
		list.add(new Goods("裴新视频", 300, 50));
		System.out.println("排序前"+list);
		Collections.sort(list, new GoodsPricecomp());
		System.out.println("排序后"+list);
		Collections.sort(list, new GoodsFavComp());
		System.out.println("按收藏量排序"+list);
	}
}
