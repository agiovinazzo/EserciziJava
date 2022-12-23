package alessia.eserciziJava.javaProgrammingII.parte10.collectionsAsStreams.averageOfNumbers;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();

		//TODO: manca controllo se input non è numerico
		while (true) {
			System.out.println("Inserisci un numero o scrivi 'end' per terminare il programma:");
			String input = scanner.nextLine();

			if (input.equals("end")) {
				break;
			}
			inputs.add(input);
		}

		Double avg = inputs.stream()
				.mapToInt(s -> Integer.valueOf(s))
				.average().
				getAsDouble();

		System.out.println("average of the numbers: " + avg);
	}
}
