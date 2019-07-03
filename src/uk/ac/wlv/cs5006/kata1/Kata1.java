package uk.ac.wlv.cs5006.kata1;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Kata1 {

	private static boolean stringContainsNumber(String s) {
		return Pattern.compile("[0-9]").matcher(s).find();
	}

	public static boolean areAnagrams(String s1, String s2) {
		boolean status = false;
		if (s1 == null || s2 == null) {
			status = false;
		} else {
			if (s1.length() != s2.length()) {
				status = false;
			} else {
				char[] arrayStr1 = s1.toLowerCase().toCharArray();
				char[] arrayStr2 = s2.toLowerCase().toCharArray();
				Arrays.sort(arrayStr1);
				Arrays.sort(arrayStr2);
				status = Arrays.equals(arrayStr1, arrayStr2);
			}

			if (stringContainsNumber(s1) || stringContainsNumber(s2)) {
				status = false;
			}
			if (s1.isEmpty() || s2.isEmpty()) {
				status = false;
			}
			if (s1.isEmpty() && s2.isEmpty()) {
				status = true;
			}

		}

		return status;
	}
}
