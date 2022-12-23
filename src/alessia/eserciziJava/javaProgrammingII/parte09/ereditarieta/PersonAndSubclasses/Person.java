package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.PersonAndSubclasses;

public class Person {

	private String name;
	private String address;

	public Person (String name, String address) {
		this.name=name;
		this.address=address;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	@Override
	public String toString() {
		return name + '\n' + "  " + address;
	}
}