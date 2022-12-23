package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.Warehousing;

public class Warehouse {

    private double capacity;
    private double balance;

    public Warehouse(double capacity) {
    	
    	// an invalid capacity (<=0) creates a useless warehouse, with the the capacity 0
        if (capacity > 0.0) {
            this.capacity = capacity;
        } else {
            this.capacity = 0.0;
        }

        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }

    public double getCapacity() {
        return this.capacity;
    }

    public double howMuchSpaceLeft() {
        return this.capacity - this.balance;
    }

    public void addToWarehouse(double amount) {
        if (amount < 0) {
            return;
        }
        if (amount <= howMuchSpaceLeft()) {
            this.balance = this.balance + amount;
        } else {
            this.balance = this.capacity;
        }
    }

    
//   The method returns much we actually get.
//    If the desired amount is negative, nothing changes and we return 0. 
//    		If the desired amount is greater than the amount the warehouse contains, 
//    		we get all there is to take and the warehouse is emptied.
    public double takeFromWarehouse(double amount) {
        if (amount < 0) {
            return 0.0;
        }
        if (amount > this.balance) {
            double allThatWeCan = this.balance;
            this.balance = 0.0;
            return allThatWeCan;
        }

        this.balance = this.balance - amount;
        return amount;
    }

    public String toString() {
        return "balance = " + this.balance + ", space left " + howMuchSpaceLeft();
    }
}