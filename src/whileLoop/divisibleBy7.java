package whileLoop;

import java.util.Scanner;

public class divisibleBy7 {

	public static void main(String[] args) {
		
		Scanner M=new Scanner(System.in);
		System.out.println("Please enter the starting number:");
		int startingNumber=M.nextInt();
		
		
		System.out.println("please enter ending number:");
		int endingNumber=M.nextInt();
		int number=startingNumber;
		while(number<=endingNumber) {
			if(number%7==0)
				System.out.println(number);
			     
			number++;
		}
		M.close();

	}

}
	
