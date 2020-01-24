package lab5;

import java.util.Scanner;

public class StringMethods {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Would you like to test wheres capitalize, wheresWaldo, firstThingsFirst, reverse, soLong, aftermath or camelCase?");
		
		String choice = scnr.next();
		
		switch (choice) {
		
		case "capitalize":
			System.out.println("Please input a lower case word");
			String word = scnr.next();
			StringLab.capitalize(word);
		break;
		
		case "wheresWaldo":
			System.out.println("Please enter a sentence that contains waldo");
			String phrase = scnr.nextLine();
			StringLab.wheresWaldo(phrase);
		break;
		
		case "firstThingsFirst":
			System.out.println("Please enter a word");
			String a = scnr.next();
			System.out.println("Please enter a word");
			String b = scnr.next();
			StringLab.firstThingsFirst(a, b);
		break;
		
		case "reverse":
			System.out.println("Please enter a word");
			String s = scnr.next();
			StringLab.reverse(s);
		break;
		
		case "soLong":
			System.out.println("Please enter a word");
			String a1 = scnr.next();
			System.out.println("Please enter a word");
			String b1 = scnr.next();
			StringLab.soLong(a1, b1);
		break;
		
		case "aftermath":
			System.out.println("Please enter a word");
			String phrase2 = scnr.nextLine();
			StringLab.afterMath(phrase2);
		break;
		
		case "LetterSize":
			System.out.println("Please enter a word");
			String word2 = scnr.next();
			StringLab.letterSize(word2);
			
		case "camelCase":
			System.out.println("Please enter a phrase");
			String phrase3 = scnr.nextLine();
			StringLab.camelCase(phrase3);
		break;


		}
		System.out.println("Goodbye");

	}

}
