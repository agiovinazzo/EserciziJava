package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.ABC;

public class Main {

	public static void main(String[] args) {

		A a = new A();
		B b = new B();
		C c = new C();

		a.a();
		b.b();
		c.c();

		//esercizio parte 2
		c.a();
		c.b();
		c.c();

	}


}
