package cn.zw.gen;
/**
 * 
 * <p>Title:Student</p>
 * <p>Description:Object���Խ����������͵Ĳ�������Ϊ������̬</p>
 * @author zhengwei
 * @date 2017-5-3 ����9:41:56
 */
public class Student {
	private Object javaScore;
	private Object oracleScore;
	public Student(Object javaScore, Object oracleScore) {
		super();
		this.javaScore = javaScore;
		this.oracleScore = oracleScore;
	}
	public Object getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(Object javaScore) {
		this.javaScore = javaScore;
	}
	public Object getOracleScore() {
		return oracleScore;
	}
	public void setOracleScore(Object oracleScore) {
		this.oracleScore = oracleScore;
	}
	
}
