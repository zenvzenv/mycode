package cn.zw.gen;
/**
 * 
 * <p>Title:App</p>
 * <p>Description:获取值：强制类型转换</p>
 * 手动类型检查，避免出现java.lang.ClassCastException异常
 * @author zhengwei
 * @date 2017-5-3 上午9:42:57
 */
public class App {
	public static void main(String[] args) {
		//存入整数 int-->Integer-->Object
		Student stu=new Student(80, 90);
		
		Object obj=80;
		int score=(int) obj;//Object-->Integer-->自动拆箱
		System.out.println(score);
		
		int javaScore=(int) stu.getJavaScore();
		String oracleScore=null;
		if (stu.getOracleScore() instanceof String) {
			oracleScore=(String) stu.getOracleScore();
		}
		System.out.println("分数为"+javaScore+"\t"+oracleScore);
	}
}
