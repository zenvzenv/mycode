package cn.zw.io.others;
/**
 * 
 * <p>Title:TestSerializableEmployee</p>
 * <p>Description:测试序列化</p>
 * 必须实现java.io.Serializable接口
 * @author zhengwei
 * @date 2017-5-10 下午4:36:57
 */
public class TestSerializableEmployee implements java.io.Serializable{
	//不想序列化的对象用transient修饰
	private transient String name;
	private double salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public TestSerializableEmployee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public TestSerializableEmployee() {
		super();
	}
	
}
