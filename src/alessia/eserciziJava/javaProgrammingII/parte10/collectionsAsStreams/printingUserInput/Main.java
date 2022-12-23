package alessia.eserciziJava.javaProgrammingII.parte10.collectionsAsStreams.printingUserInput;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
		ArrayList<String> inputs = new ArrayList<>();

		while (true) {
			System.out.println("scrivi qualcosa. premi invio senza scrivere per uscire");
			String input = scanner.nextLine();
			if ((input.isEmpty())) {
				System.out.println("Arrivederciffg");
				break;
			}

			inputs.add(input);
		}

		inputs.stream().forEach(item -> System.out.println(item));
    }
}
