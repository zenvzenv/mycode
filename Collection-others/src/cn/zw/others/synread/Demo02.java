package cn.zw.others.synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <p>Title:Demo02</p>
 * <p>Description:只读设置</p>
 * emptyXxx()	空的不可变的集合
 * singletonXxx()	只包含一个元素的不可变容器
 * unmodifiableXxx	不可变容器
 * @author zhengwei
 * @date 2017-5-6 下午10:12:10
 */
public class Demo02 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("tets", "tes");
		map.put("zw", "aa");
		//只读控制
		Map<String,String> map2=Collections.unmodifiableMap(map);
		//map2.put("a", "b");	报错
		
		//一个元素的容器测试,只能包含一个元素
		List<String> list=Collections.singletonList(new String());
		list.add("zw");
		//list.add("b");	//报错
		
		
	}
	public static Set<String> oper(Set<String> set){
		if (null==set) {
			return Collections.EMPTY_SET;
		}
		return set;
	}
}
