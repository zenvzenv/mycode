package code3��28;

/**
 * ����static����
 * @author zhengwei
 * �����У���static���εĳ�Ա����Ϊ��̬���������������������
 * ��Ϊ����Ĺ��ñ����������࣬�����������ʵ�����������౻����ʱ����ʾ��ʼ����
 * ���ڸ�������ж�����˵��static��Աֻ��һ�ݡ����������ж�����
 * ����ʹ�á�����.�������������ã�������һ����ʹ�á�����.�����ԡ������á�
 * static�������ڷ�������
 * ��̬��������ֱ��ͨ������ֱ�ӵ��ã�Ҳ����ͨ��ʵ��������з���
 * �ھ�̬�������治�ܵ��÷Ǿ�̬�Ķ���
 * �Ǿ�̬�ķ����������Ե��þ�̬�Ķ���
 */

public class TestStaticStudent1 {
	public static void main(String[] args) {
		TestStaticStudent.ss=13231;
		TestStaticStudent.printSS();
		
		TestStaticStudent s=new TestStaticStudent();
		s.ss=12312;
		s.printSS();
	}
}
