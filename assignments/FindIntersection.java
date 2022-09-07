package week3;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {
	
	public static void main(String[] args) {
		
		
		 int[] arr1={3,2,11,4,6,7};
		 
	      int[] arr2={1,2,8,4,9,7};
	       
	      List<Integer> list1 =  new ArrayList<Integer>();
	      List<Integer>list2 = new ArrayList<Integer>();
	       
	      for(int i =0; i< arr1.length;i++) {
		
	    	  list1.add(arr1[i]);
		}
		System.out.println("List 1 is:"+list1);
		
		for (Integer eachNum2 : arr2) {
			list2.add(eachNum2);
		}
		
		System.out.println("List 2 is :"+list2);
		
		        for (Integer num1 : list1) {
				
				for (Integer num2 : list2) {
					
					if(num1.equals(num2)) {
						System.out.println(num1);
					}
					
				}
				
				
	
			}
			
		
	}
}

