package whileLoop;

import java.util.Arrays;
import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
		
		System.out.println("please enter array size:");
		int arrsize=M.nextInt();
		int [] arr=new int [arrsize];
		System.out.println("please enter the array values");
		for(int  i=0;i<=arrsize;i++) {
			arr[i]=M.nextInt();
			
		}
		System.out.println("input :"+Arrays.toString(arr));
		
		
	}
        
		
		

	}


