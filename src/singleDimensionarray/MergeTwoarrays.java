package singleDimensionarray;

import java.util.Arrays;
import java.util.Scanner;

public class MergeTwoarrays {

	public static void main(String[] args) {
		Scanner G = new Scanner(System.in);
		System.out.println("please enter array size:");
		int arr1Size =G.nextInt();
		String [] arr1=new String[arr1Size];
		System.out.println("please enter the array values:");
		for(int i=0;i<arr1Size;i++) {
			arr1[i]=G.next();
			
			
		}
		
		
			
		
		System.out.println("please enter array2 size:");
		int arr2Size =G.nextInt();
		String [] arr2=new String[arr2Size];
		System.out.println("please enter the array2 values:");
		for(int i=0;i<arr2Size;i++) {
			arr2[i]=G.next();
			
			
		}
		System.out.println("input1: "+Arrays.toString(arr1));
		System.out.println("input2: "+Arrays.toString(arr2));
		
		String[] arr3=new String[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			arr3[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			arr3[i+arr1.length]=arr2[i];
		}
		System.out.println("output: "+Arrays.toString(arr3));
		
			
		//System.out.println("output:"+sum);
		G.close();
			

	}

}
