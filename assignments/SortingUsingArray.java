package assignments;

import java.util.Arrays;

public class SortingUsingArray{
	public static void main(String[] args) {
	
		String [] arr = { "HCL","Wipro","Aspire Systems","CTS"};
		
		int length = arr.length; //to get the array length

		Arrays.sort(arr);
			
		for(int i =length-1;i>=0;i--) 
		{
			System.out.print(arr[i] +".");
		}
		
	}

}
