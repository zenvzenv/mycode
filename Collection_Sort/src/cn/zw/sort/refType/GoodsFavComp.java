package cn.zw.sort.refType;

import java.util.Comparator;

public class GoodsFavComp implements Comparator<Goods>{

	@Override
	public int compare(Goods o1, Goods o2) {
		return -(o1.getFav()-o2.getFav()>0?1:(o1.getFav()==o2.getFav()?0:-1));
	}
	
}
