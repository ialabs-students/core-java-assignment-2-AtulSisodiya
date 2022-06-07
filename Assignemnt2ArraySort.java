package coreassignment;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Assignemnt2ArraySort {
	public static void main(String args[]) {
		 ArrayList<BigInteger> list = new ArrayList<BigInteger>();
		 	list.add(new BigInteger("24"));
	        list.add(new BigInteger("543534"));
	        list.add(new BigInteger("545"));
	        list.add(new BigInteger("2342"));
	        list.add(new BigInteger("9"));


	        System.out.println("Before sorting: " + list);
	        
	        System.out.println("After Sorting:" + arrayListSortDesc(list));
	        
	        
	               
	}
	
	  
public static List<BigInteger> arrayListSortDesc(List<BigInteger> list) {
	  
	Collections.sort(list, Collections.reverseOrder());
	  return list;
}

}
