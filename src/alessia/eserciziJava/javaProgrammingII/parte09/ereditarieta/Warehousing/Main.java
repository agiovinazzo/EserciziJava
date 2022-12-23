package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.Warehousing;

public class Main {

	public static void main(String[] args) {
		
		ProductWarehouse juice = new ProductWarehouse("Juice", 1000.0);
		juice.addToWarehouse(1000.0);
		juice.takeFromWarehouse(11.3);
		System.out.println(juice.getName());
		System.out.println(juice);  
		
		//parte 5
		System.out.println("*****************");
		// the usual:
		ProductWarehouseWithHistory juice2 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
		juice2.takeFromWarehouse(11.3);
		System.out.println(juice2.getName()); // Juice
		juice2.addToWarehouse(1.0);
		System.out.println(juice2);           // Juice: balance = 989.7, space left 10.3

		// etc

		// however, history() still doesn't work properly:
		System.out.println(juice2.history()); // [1000.0]
		// so we only get the initial state of the history set by the constructor...
		
		//parte 6
		System.out.println("*****************");
		// the usual:
		ProductWarehouseWithHistory juice3 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
		juice3.takeFromWarehouse(11.3);
		System.out.println(juice3.getName()); // Juice
		juice3.addToWarehouse(1.0);
		System.out.println(juice3);           // Juice: balance = 989.7, space left 10.3

		// etc

		// and now we have the history:
		System.out.println(juice3.history()); // [1000.0, 988.7, 989.7]
		
		//parte 7
		System.out.println("*****************");
		ProductWarehouseWithHistory juice4 = new ProductWarehouseWithHistory("Juice", 1000.0, 1000.0);
		juice4.takeFromWarehouse(11.3);
		juice4.addToWarehouse(1.0);
		//System.out.println(juice.history()); // [1000.0, 988.7, 989.7]

		juice4.printAnalysis();

	}

}
