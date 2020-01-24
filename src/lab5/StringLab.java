package lab5;

/*
 * @Author Kyle Warchuck
 */

import java.util.Scanner;

public class StringLab {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		System.out.println("Please input a word in all lower case");
		String word = scnr.nextLine();
		System.out.println("Please put in a sentence that includes the words waldo and math");
		String phrase = scnr.nextLine();
		System.out.println("Please input another word");
		String a = scnr.nextLine();
		System.out.println("Please input another word");
		String b = scnr.nextLine();
		System.out.println("Please input one final word");
		String s = scnr.nextLine();
		scnr.close();

		capitalize(word);
		wheresWaldo(phrase);
		firstThingsFirst(a, b);
		reverse(s);
		soLong(a, b);
		afterMath(phrase);
		letterSize(word);
		camelCase(phrase);

	}

	public static void capitalize(String word) {
		System.out.println(word.toUpperCase().charAt(0) + word.substring(1));
	}

	public static void wheresWaldo(String phrase) {
		System.out.println(phrase.indexOf("Waldo"));
	}

	public static void firstThingsFirst(String a, String b) {

		char a1 = a.toUpperCase().charAt(0);
		char b1 = b.toUpperCase().charAt(0);
		if (a1 < b1) {
			System.out.println(a + " " + b);
		} else if (b1 < a1) {
			System.out.println(b + " " + a);
		} else
			System.out.println("Both start with the same letter");
	}

	public static void reverse(String s) {

		String reverse = "";

		for (int i = s.length() - 1; i >= 0; i--) {

			reverse = reverse + s.charAt(i);

		}
		System.out.println(reverse);
	}

	public static void soLong(String a, String b) {
		int a2 = a.length();
		int b2 = b.length();
		if (a2 > b2) {
			System.out.println(a + " " + b);

		} else if (b2 > a2) {
			System.out.println(b + " " + a);
		} else {
			System.out.println("Both are the same length");
		}

	}

	public static void afterMath(String phrase) {
		int start = phrase.toLowerCase().indexOf("math");
		System.out.println(phrase.substring(start + 4));

	}

	public static void letterSize(String word) {
		for (int i = 0; i < word.length(); i++) {
			System.out.println(word.charAt(i));
		}

	}

	public static String camelCase(String phrase) {
		String result = "";
		char firstChar = phrase.charAt(0);
		result = result + Character.toUpperCase(firstChar);
		for (int i = 1; i < phrase.length(); i++) {
			char currentChar = phrase.charAt(i);
			char previousChar = phrase.charAt(i - 1);
			if (previousChar == ' ') {
				result = result + Character.toUpperCase(currentChar);
			} else {
				result = result + Character.toLowerCase(currentChar);
			}
			result = result.trim().replaceAll("\\s+", " ");

		}

		return(result.toLowerCase().charAt(0) + result.substring(1));
	}

}
