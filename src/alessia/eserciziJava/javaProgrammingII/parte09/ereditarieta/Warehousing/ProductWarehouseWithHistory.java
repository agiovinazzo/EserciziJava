package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.Warehousing;

public class ProductWarehouseWithHistory extends ProductWarehouse {

	private ChangeHistory changeHistory;

	public ProductWarehouseWithHistory(String productName, double capacity, double initialBalance) {
		super(productName, capacity);
		super.addToWarehouse(initialBalance);
		this.changeHistory = new ChangeHistory();
		this.changeHistory.add(initialBalance);
	}

	public String history() {
		return changeHistory.toString();
	}

	//works just like the method in the Warehouse class, but we also record the changed state to the history. 
	//NB: the value recorded in the history should be the warehouse's balance after adding, not the amount added!
	public void addToWarehouse(double amount) {
		super.addToWarehouse(amount);
		this.changeHistory.add(super.getBalance());
	}

	
	//works just like the method in the Warehouse class, but we also record the changed state to the history.
	//NB: the value recorded in the history should be the warehouse's balance after removing, not the amount removed!
	public double takeFromWarehouse(double amount) {
		if (super.getBalance() < amount) {
			this.changeHistory.add(super.getBalance());
			return super.getBalance();
		}
		super.takeFromWarehouse(amount);
		this.changeHistory.add(super.getBalance());

		return super.getBalance();
	}

	//which prints history related information for the product in the way presented in the example.
	public void printAnalysis() {
		System.out.println("Product: " + super.getName());
		System.out.println("History: " + this.history());
		System.out.println("Largest amount of product: " + this.changeHistory.maxValue());
		System.out.println("Smallest amount of product: " + this.changeHistory.minValue());
		System.out.println("Average: " + this.changeHistory.average());
	}
}