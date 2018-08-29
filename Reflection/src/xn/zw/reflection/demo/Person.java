package xn.zw.reflection.demo;

public class Person {
	private String nane;
	private int salary;
	public Person() {
		super();
	}
	public Person(String nane, int salary) {
		super();
		this.nane = nane;
		this.salary = salary;
	}
	public String getNane() {
		return nane;
	}
	public void setNane(String nane) {
		this.nane = nane;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
}
