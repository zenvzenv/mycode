package cn.zw.sort.innerType;

import java.util.Comparator;
/**
 * 
 * <p>Title:StringComparator</p>
 * <p>Description:�����������ҵ����</p>
 * @author zhengwei
 * @date 2017-5-5 ����11:01:02
 */
public class StringComparator implements Comparator<String> {
	/**
	 * �����ȱȽϴ�С
	 * ����>
	 * ����<
	 * 0 ==
	 */
	@Override
	public int compare(String o1, String o2) {
		int len1=o1.length();
		int len2=o2.length();
		return len1=len2;
	}
	
}
