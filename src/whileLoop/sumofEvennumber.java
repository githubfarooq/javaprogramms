package whileLoop;

import java.util.Scanner;

public class sumofEvennumber {

	public static void main(String[] args) {
		
		
		Scanner M=new Scanner(System.in);
		System.out.println("Please enter the starting number:");
		int startingNumber=M.nextInt();
		
		
		System.out.println("please enter ending number:");
		int endingNumber=M.nextInt();
		int sum=0;
		int number=startingNumber;
		while(number<=endingNumber) {
			if(number%2==0)
				sum += number;
			     
			number++;
		}
		System.out.println("sum of the even number is:" +sum);
		M.close();


	}

}
