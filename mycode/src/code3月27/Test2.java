package code3ÔÂ27;

public class Test2 {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="Ö£Î°";
		s.age=18;
		
		Computer c=new Computer();
		c.brand="ÍâĞÇÈË";
		c.cpuSpeed=1000;
		
		s.computer=c;
		
		System.out.println(s.computer.brand);
	}
}
