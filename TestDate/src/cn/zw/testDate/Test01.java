package cn.zw.testDate;

import java.util.Date;

/**
 * Date�ĺ�������
 * <p>Title:Test01</p>
 * <p>Description:����ʱ������÷�</p>
 * @author zhengwei
 * @date 2017-4-15 ����10:04:22
 */
public class Test01 {
	public static void main(String[] args) {
		Date d=new Date();
		long t=System.currentTimeMillis();
		System.out.println(t);
		System.out.println(d);
		Date d2=new Date(1000);
		System.out.println(d2.toGMTString());//���ʱ�׼ʱ�䣬������ʹ��
		d2.setTime(123);
		System.out.println(d2.getTime());
		System.out.println(d.getTime()<d2.getTime());
	}
}
