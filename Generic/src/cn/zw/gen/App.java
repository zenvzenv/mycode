package cn.zw.gen;
/**
 * 
 * <p>Title:App</p>
 * <p>Description:��ȡֵ��ǿ������ת��</p>
 * �ֶ����ͼ�飬�������java.lang.ClassCastException�쳣
 * @author zhengwei
 * @date 2017-5-3 ����9:42:57
 */
public class App {
	public static void main(String[] args) {
		//�������� int-->Integer-->Object
		Student stu=new Student(80, 90);
		
		Object obj=80;
		int score=(int) obj;//Object-->Integer-->�Զ�����
		System.out.println(score);
		
		int javaScore=(int) stu.getJavaScore();
		String oracleScore=null;
		if (stu.getOracleScore() instanceof String) {
			oracleScore=(String) stu.getOracleScore();
		}
		System.out.println("����Ϊ"+javaScore+"\t"+oracleScore);
	}
}
