package cn.zw.gen2;
/**
 * ����ʱʹ�÷���
 * <p>Title:Student</p>
 * <p>Description:��ĸ�У�T(Type),K V(key value),E(element)��
 * ע�⣺1.����ֻ��ʹ���������ͣ�����ʹ�û�������
 * 	   2.��������ʱ����ʹ�þ�̬������̬����</p>
 * @author zhengwei
 * @date 2017-5-3 ����9:51:00
 * @param <T>
 */
public class Student<T1,T2> {
	private T1 javaScore;
	private T2 orcaleScore;
	
//	private static T1 fj;
	public T1 getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(T1 javaScore) {
		this.javaScore = javaScore;
	}
	public T2 getOrcaleScore() {
		return orcaleScore;
	}
	public void setOrcaleScore(T2 orcaleScore) {
		this.orcaleScore = orcaleScore;
	}
	public static void main(String[] args) {
		Student<String,Integer> stu=new Student<String,Integer>();
		
		//1.��ȫ���Զ����ͼ��
		stu.setJavaScore("asd");
		//2.ʡ�ģ������Զ�ת��
		stu.getOrcaleScore();
	}
}
