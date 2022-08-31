package week3;

import java.util.Scanner;

public class RemoveDuplicatesWordsInArray {
	public static void main(String[] args) {

		String txt = "we learn java basics as part of java session in java week1";

		int count;

		String[] word = txt.split(" "); // split returns string array

		for (int i = 0; i < word.length; i++) {
			count = 0;
			for (int j = i + 1; j < word.length; j++) {

				if (word[i].equals(word[j])) {
					count = count + 1;
				}

				if (count > 0) {
					txt = txt.replace(word[i], "");

				}

			}

		}
		System.out.println(txt);

	}
}
