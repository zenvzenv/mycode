package cn.zw.sort.col;

import java.util.Comparator;

public class Worker implements Comparable<Worker>{
	private String type;
	private double salary;
	public Worker() {
		super();
	}
	public Worker(String type, double salary) {
		super();
		this.type = type;
		this.salary = salary;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public int compareTo(Worker o) {
		
		return 0;
	}
	
}	
