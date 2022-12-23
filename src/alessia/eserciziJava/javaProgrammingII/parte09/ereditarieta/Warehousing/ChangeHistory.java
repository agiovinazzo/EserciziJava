package alessia.eserciziJava.javaProgrammingII.parte09.ereditarieta.Warehousing;

import java.util.ArrayList;

public class ChangeHistory {

	private ArrayList<Double> changeHistory;

	public ChangeHistory() {
		this.changeHistory = new ArrayList<>();
	}

	//adds provided status as the latest amount to remember in the change history.
	public void add(double status) {
		this.changeHistory.add(status);
	}

	//empties the history.
	public void clear() {
		this.changeHistory.clear();
	}

	public String toString() {
		return changeHistory.toString();
	}

	//returns the largest value in the change history. 
	//If the history is empty, the method should return zero.
	public double maxValue() {
		if (this.changeHistory.size() == 0) {
			return 0;
		}
		double maxChange = 0;

		for (Double product : changeHistory) {
			if (product > maxChange) {
				maxChange = product;
			}
		}
		return maxChange;
	}

	//il contrario di maxValue
	public double minValue() {
		if (this.changeHistory.size() == 0) {
			return 0;
		}

		double minChange = 10000000;

		for (Double product : changeHistory) {
			if (product < minChange) {
				minChange = product;
			}
		}

		return minChange;
	}
	
	//come i precedenti ma con la media
	public double average() {
		if (this.changeHistory.size() == 0) {
			return 0;
		}

		double products = 0;

		for (Double product : changeHistory) {
			products += product;
		}

		return (double) products / this.changeHistory.size();
	}
}
