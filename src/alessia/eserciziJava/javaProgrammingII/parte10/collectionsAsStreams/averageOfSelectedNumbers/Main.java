package alessia.eserciziJava.javaProgrammingII.parte10.collectionsAsStreams.averageOfSelectedNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();

		while (true) {
			System.out.println("Inserisci un numero o scrivi 'end' per terminare il programma:");
			String input = scanner.nextLine();
			if (input.equals("end")) {
				break;
			}

			inputs.add(input);
		}

		double average = 0;

		System.out.println("Stampare la media dei numeri positivi o dei numeri negativi? (n/p)");
		String avg = scanner.nextLine();
		if (avg.equals("p")) {
			average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(x -> x > 0).average().getAsDouble();
			System.out.println("Media dei numeri positivi: " + average);
		} else if (avg.equals("n")) {
			average = inputs.stream().mapToInt(s -> Integer.valueOf(s)).filter(x -> x < 0).average().getAsDouble();
			System.out.println("Media dei numeri negativi: " + average);
		}
	}
}
