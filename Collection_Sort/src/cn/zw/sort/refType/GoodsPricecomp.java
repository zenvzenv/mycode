package cn.zw.sort.refType;

import java.util.Comparator;

public class GoodsPricecomp implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		return -(o1.getPrice()-o2.getPrice()>0?1:(o1.getPrice()==o2.getPrice()?0:-1));
	}
	
}
