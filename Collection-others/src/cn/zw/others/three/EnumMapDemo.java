package cn.zw.others.three;

import java.util.EnumMap;

/**
 * 
 * <p>Title:EnumMapDemo</p>
 * <p>Description:EnumMap要求键为枚举</p>
 * @author zhengwei
 * @date 2017-5-6 下午9:32:57
 */
public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<Season,String> map=new EnumMap<Season,String>(Season.class);
		//存放值
		map.put(Season.SPRING, "春困");
		map.put(Season.SUMMER, "夏无力");
		map.put(Season.AUTUMN, "秋乏");
		map.put(Season.WINNER, "冬眠");
		System.out.println(map.size());
		System.out.println(map.get(Season.SPRING));
	}
}
enum Season{
	SPRING,SUMMER,AUTUMN,WINNER
}