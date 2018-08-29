import java.util.HashMap;
import java.util.Map;


public class No282 {
	public static void main(String[] args) {
		Person p1=new Person("张三", 18, 90, "背景");
		Person p2=new Person("李四", 28, 50, "上海");
		Map<Integer,Person> map1=new HashMap<Integer,Person>();
		Map<Integer,Person> map2=new HashMap<Integer,Person>();
		map1.put(1, p1);
		map2.put(2, p2);
		System.out.println(map1.get(1).getName());
	}
}
class Person{
	private String name;
	private int age;
	private int weight;
	private String address;
	public Person() {
		super();
	}
	public Person(String name, int age, int weight, String address) {
		super();
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.address = address;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}