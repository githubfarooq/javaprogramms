package singleDimensionarray;

import java.util.Arrays;
import java.util.Scanner;

public class avgArray {

	public static void main(String[] args) {
		
		Scanner G = new Scanner(System.in);
		System.out.println("please enter array size:");
		int arrSize =G.nextInt();
		int [] arr=new int [arrSize];
		System.out.println("please enter the array values:");
		for(int i=0;i<arrSize;i++) {
			arr[i]=G.nextInt();
			
			
		}
		System.out.println("input: "+Arrays.toString(arr));
		int sum=0;
		for(int i=0;i<arr.length;i++) {
			sum +=arr[i];
			
		}
		System.out.println("output:"+sum/arr.length);
		G.close();
			
		

	}

}
