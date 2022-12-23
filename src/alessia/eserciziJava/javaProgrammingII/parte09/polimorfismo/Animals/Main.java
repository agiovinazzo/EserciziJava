package alessia.eserciziJava.javaProgrammingII.parte09.polimorfismo.Animals;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		dog.bark();
		dog.eat();

		Dog fido = new Dog("Fido");
		fido.bark();
		
		System.out.println("***PARTE 3***");

		Cat cat = new Cat();
		cat.purr();
		cat.eat();

		Cat garfield = new Cat("Garfield");
		garfield.purr();
		
		System.out.println("***PARTE 4***");
		
		NoiseCapable dog2 = new Dog();
		dog2.makeNoise();

		NoiseCapable cat2 = new Cat("Garfield");
		cat2.makeNoise();
		Cat c = (Cat) cat2;
		c.purr();
	}

}
