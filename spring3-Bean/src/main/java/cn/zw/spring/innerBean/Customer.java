package cn.zw.spring.innerBean;

public class Customer {
	private Person person;

	public Customer(Person person) {
		super();
		this.person = person;
	}

	public Customer() {
		super();
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String toString() {
		return "Customer [person=" + person + "]";
	}
	
}
