package cn.zw.others.three;

import java.util.EnumMap;

/**
 * 
 * <p>Title:EnumMapDemo</p>
 * <p>Description:EnumMapҪ���Ϊö��</p>
 * @author zhengwei
 * @date 2017-5-6 ����9:32:57
 */
public class EnumMapDemo {
	public static void main(String[] args) {
		EnumMap<Season,String> map=new EnumMap<Season,String>(Season.class);
		//���ֵ
		map.put(Season.SPRING, "����");
		map.put(Season.SUMMER, "������");
		map.put(Season.AUTUMN, "�﷦");
		map.put(Season.WINNER, "����");
		System.out.println(map.size());
		System.out.println(map.get(Season.SPRING));
	}
}
enum Season{
	SPRING,SUMMER,AUTUMN,WINNER
}