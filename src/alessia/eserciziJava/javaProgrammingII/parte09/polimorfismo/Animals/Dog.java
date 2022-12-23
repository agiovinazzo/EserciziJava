package alessia.eserciziJava.javaProgrammingII.parte09.polimorfismo.Animals;

public class Dog extends Animal implements NoiseCapable {

	public Dog(String name) {
		super(name);
	}
	
	public Dog() {
		super("Dog");
	}

	@Override
	public void makeNoise() {
		this.bark();
		
	}
	
	public void bark() {
		System.out.println(super.getName()  + " barks");
	}
}
