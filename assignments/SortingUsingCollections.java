package week3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollections {

	public static void main(String[] args) {

		String[] str = { "Wipro", "HCL", "TCS", "Aspire Systems", "CTS" };

		List<String> liststr = new ArrayList<String>();

		for (String eachstring : str) {
			liststr.add(eachstring); // added each string into the list
		}
		System.out.println("The Unsorted List : " + liststr);

		Collections.sort(liststr); // sored the list in ascending order

		System.out.println("The Sorted List   : " + liststr);

	}

}
