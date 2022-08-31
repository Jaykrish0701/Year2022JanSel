package week3;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesCharacter {

	public static void main(String[] args) {

		String str = "PayPal India";
		char[] ch = str.toCharArray();
		Set<Character> setchar = new HashSet<Character>();

		for (Character eachchar : ch) {
			if (eachchar != ' ') {
				setchar.add(eachchar);										// add each character in set
			}

		}
		System.out.println("Removed Duplicates : " + setchar);

	}

}
