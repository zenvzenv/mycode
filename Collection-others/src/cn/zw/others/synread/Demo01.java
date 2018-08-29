package cn.zw.others.synread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 
 * <p>Title:Demo01</p>
 * <p>Description:使用Collections管理同步容器</p>
 * synchronizedList()
 * synchronizedSet()
 * synchronizedMap()
 * @author zhengwei
 * @date 2017-5-6 下午10:08:25
 */
public class Demo01 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		list.add("a");
		list.add("b");
		//list可以同步
		List synList=Collections.synchronizedList(list);
		System.out.println(list);
	}
}
