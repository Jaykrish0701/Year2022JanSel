package week3;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWordInSet {
	public static void main(String[] args) {

		String str = "we learn week1 sessions as java basics as a part of java sessions in week1 java";

		String[] splitstr = str.split(" "); // split the string with space

		Set<String> eachword = new LinkedHashSet<String>();

		for (String each : splitstr) {

			eachword.add(each); // add the word in set

		}

		System.out.println("Removed Duplicates : " + eachword);

	}
}