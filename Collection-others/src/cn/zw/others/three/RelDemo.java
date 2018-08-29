package cn.zw.others.three;

import java.lang.ref.WeakReference;

/**
 * 
 * <p>Title:RelDemo</p>
 * �������ã�ǿ����������
 * �ص��ǣ�ǿ����������
 * @author zhengwei
 * @date 2017-5-6 ����9:09:22
 */
public class RelDemo {
	public static void main(String[] args) {
		String str=new String("zw is good");//�����ڳ������У������ڶ���
		//�����͹������
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc����ǰ:"+wr.get());
		//�Ͽ�����
		str=null;
		//֪ͨ����
		System.gc();
		System.runFinalization();
		//���󱻻���
		System.out.println("gc���ú�:"+wr.get());
		
	}
	public static void testStrong(){
		//�ַ��������أ��ǹ���ģ����ܻ��գ�
		String str="zw is good";//�ڳ�������
		//������ �������
		WeakReference<String> wr=new WeakReference<String>(str);
		System.out.println("gc����ǰ:"+wr.get());
		//�Ͽ�����
		str=null;
		//֪ͨ����
		System.gc();
		System.runFinalization();
		System.out.println("gc���к�:"+wr.get());
	}
}
