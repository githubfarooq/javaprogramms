package singleDimensionarray;

import java.util.Arrays;
import java.util.Scanner;

public class maxNumber {

	public static void main(String[] args) {
		
		Scanner G = new Scanner(System.in);
		System.out.println("please enter array size:");
		
		int arrSize =G.nextInt();
		
		int [] arr=new int[arrSize];
		
		System.out.println("please enter the array values:");
		for(int i=0;i<arrSize;i++) {
			arr[i]=G.nextInt();
		}
		System.out.println("input:"+Arrays.toString(arr));
		
		int LargestNumber = arr[0];
		int LargestNumberIndex = 0;
        for (int i=0;i<arr.length;i++) {
        	if(LargestNumber<arr[i]) 
        	{
        		LargestNumber=arr[i];
        		LargestNumberIndex=i;
        	}
        		
        	
        	
        }
        System.out.println("largest number"+LargestNumber);
        System.out.println("LargestNumberIndex:"+LargestNumberIndex);
		G.close();
	}

}
