package cn.zw.io.others;
/**
 * 
 * <p>Title:TestSerializableEmployee</p>
 * <p>Description:�������л�</p>
 * ����ʵ��java.io.Serializable�ӿ�
 * @author zhengwei
 * @date 2017-5-10 ����4:36:57
 */
public class TestSerializableEmployee implements java.io.Serializable{
	//�������л��Ķ�����transient����
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
