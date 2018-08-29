package cn.zw.guava;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

/**
 * 
 * <p>Title:Demo04</p>
 * <p>Description:分析查看教师教授的每门课程</p>
 * Multimap：key-value可以重复
 * @author zhengwei
 * @date 2017-5-8 上午11:48:15
 */
public class Demo04 {
	public static void main(String[] args) {
		Map<String,String> coures=new HashMap<String,String>();
		//加入数据
		coures.put("改革开放", "邓小平");
		coures.put("三个代表", "江泽民");
		coures.put("八荣八耻", "胡锦涛");
		coures.put("强力反腐", "习近平");
		coures.put("和谐社会", "习近平");
		//Multimap
		Multimap<String,String> teachers=ArrayListMultimap.create();
		Iterator<Map.Entry<String,String>> it=coures.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<String, String> entry=it.next();
			String key=entry.getKey();
			String value=entry.getValue();
			//教师-->课程
			teachers.put(value, key);
		}
		Set<String> keyset=teachers.keySet();
		for (String key : keyset) {
			Collection<String> col=teachers.get(key);
			System.out.println(key+"-->"+col);
		}
	}
}
