package cn.zw.gen2;
/**
 * 声明时使用泛型
 * <p>Title:Student</p>
 * <p>Description:字母有：T(Type),K V(key value),E(element)，
 * 注意：1.泛型只能使用引用类型，不能使用基本类型
 * 	   2.泛型声明时不能使用静态方法或静态属性</p>
 * @author zhengwei
 * @date 2017-5-3 上午9:51:00
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
		
		//1.安全：自动类型检查
		stu.setJavaScore("asd");
		//2.省心：类型自动转换
		stu.getOrcaleScore();
	}
}
