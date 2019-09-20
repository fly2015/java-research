package algorithms;

import java.util.HashSet;
import java.util.Set;

public final class SumNumberArrays {
	
	private static SumNumberArrays sumNumberArrays = new SumNumberArrays();
	
	private SumNumberArrays()
	{
		
	}
	
	public static SumNumberArrays getInstance()
	{
		return sumNumberArrays;
	}
	
	/*
	 * check the sum of 2 any elements value of integer array equal a predefine number or not.
	 * int [] a - an integer array
	 * int sum - a target number need to compare
	 */
	public boolean isEqual(int [] arr, int sum)
	{
		Set<Integer> diffs = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) 
		{
			if(diffs.contains(arr[i]))
			{
				return true;
			}
			
			diffs.add(sum - arr[i]);
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		int arr1 [] = {1, 2, 3, 9};
		System.out.println(SumNumberArrays.getInstance().isEqual(arr1, 8));
		
		int arr2 [] = {1, 2, 4, 4};
		System.out.println(SumNumberArrays.getInstance().isEqual(arr2, 8));
		
		int arr3 [] = {1, 2, 6, 4};
		System.out.println(SumNumberArrays.getInstance().isEqual(arr3, 8));
	}
}
