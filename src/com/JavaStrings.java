package com;

public class JavaStrings {
	public static String yesterday = "yesterday it was raining";
	public static String today = "today it is sunny";

	public static void printWeather() {
		System.out.println(today.toUpperCase() + ", " + yesterday.toUpperCase());

	}

	public static void substringWeather() {
		String str1 = today.substring(0, 12);
		String str2 = yesterday.substring(17);
		System.out.println(str1.toUpperCase() + str2.toUpperCase());

	}

	public static int countString(String str) {
		int count = 0;
		if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') {
					count++;
				}
			}
			count = count + 1;
		}
		return count;

	}

	public static void verticalString(String str) {

		for (int i = 0; i < str.length(); ++i) {
			System.out.println(str.charAt(i));
		}

	}

	public static void verticalWord(String wrd) {
		String newWrd = "";
		if (!(" ".equals(wrd.substring(0, 1))) || !(" ".equals(wrd.substring(wrd.length() - 1)))) {
			for (int i = 0; i < wrd.length(); i++) {
				newWrd += wrd.charAt(i);
				if (wrd.charAt(i) == ' ') {
					newWrd += "\n";
				}
			}
			System.out.println(newWrd);
		}

	}

	public static void displayCompleted() {
		printWeather();
		substringWeather();
		System.out.println("Number of words in the string: " + countString("what time is it right now"));
		// verticalString("hello friend");
		verticalWord("today was a lot of fun");
	}
}
