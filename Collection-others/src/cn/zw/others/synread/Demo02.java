package cn.zw.others.synread;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 
 * <p>Title:Demo02</p>
 * <p>Description:ֻ������</p>
 * emptyXxx()	�յĲ��ɱ�ļ���
 * singletonXxx()	ֻ����һ��Ԫ�صĲ��ɱ�����
 * unmodifiableXxx	���ɱ�����
 * @author zhengwei
 * @date 2017-5-6 ����10:12:10
 */
public class Demo02 {
	public static void main(String[] args) {
		Map<String,String> map=new HashMap<String,String>();
		map.put("tets", "tes");
		map.put("zw", "aa");
		//ֻ������
		Map<String,String> map2=Collections.unmodifiableMap(map);
		//map2.put("a", "b");	����
		
		//һ��Ԫ�ص���������,ֻ�ܰ���һ��Ԫ��
		List<String> list=Collections.singletonList(new String());
		list.add("zw");
		//list.add("b");	//����
		
		
	}
	public static Set<String> oper(Set<String> set){
		if (null==set) {
			return Collections.EMPTY_SET;
		}
		return set;
	}
}
