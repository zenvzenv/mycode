package cn.zw.sort.col;

public class Person {
	private String name;
	private final int handsome;
	public Person() {
		name=null;
		handsome=0;
	}
	public Person(String name, int handsome) {
		super();
		this.name = name;
		this.handsome = handsome;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHandsome() {
		return handsome;
	}
	@Override
	public String toString() {
		return "����:"+this.name+"˧��ָ��"+this.handsome+"\n";
	}
}
