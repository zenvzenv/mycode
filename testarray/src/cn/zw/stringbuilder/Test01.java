package cn.zw.stringbuilder;
/**
 * String���ɱ��ַ�����
 * StringBuikder���ɱ䳤�ַ������̲߳���ȫ��Ч�ʽϵ�
 * StringBuffer�̰߳�ȫ��Ч�ʵ�
 * @author zhengwei
 *
 */
public class Test01 {
	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder();//�ַ�����Ĭ��Ϊ16
		StringBuilder sb1=new StringBuilder(4);//�ַ�������Ϊ4
		StringBuilder sb2=new StringBuilder("abcd");//�ַ�����Ϊ32,value[]={'a','b','c','d',/u000,/u000,....}
		sb2.append("efg");//�ַ����ۼ�
		sb2.append(true).append(321).append("zw");//������
		System.out.println(sb2);
		
		System.out.println("###################");
		StringBuilder sb3=new StringBuilder("a");
		for (int i = 0; i < 1000; i++) {//�ַ������Ȳ���ʱ�������鳤��=������ĳ���*2+2
			sb3.append(i);
		}
		System.out.println(sb3);
	}
}
