package code3��27;

public class Test2 {
	public static void main(String[] args) {
		Student s=new Student();
		s.name="֣ΰ";
		s.age=18;
		
		Computer c=new Computer();
		c.brand="������";
		c.cpuSpeed=1000;
		
		s.computer=c;
		
		System.out.println(s.computer.brand);
	}
}
