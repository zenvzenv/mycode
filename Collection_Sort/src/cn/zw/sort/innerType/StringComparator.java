package cn.zw.sort.innerType;

import java.util.Comparator;
/**
 * 
 * <p>Title:StringComparator</p>
 * <p>Description:按规则排序的业务类</p>
 * @author zhengwei
 * @date 2017-5-5 上午11:01:02
 */
public class StringComparator implements Comparator<String> {
	/**
	 * 按长度比较大小
	 * 正数>
	 * 负数<
	 * 0 ==
	 */
	@Override
	public int compare(String o1, String o2) {
		int len1=o1.length();
		int len2=o2.length();
		return len1=len2;
	}
	
}
