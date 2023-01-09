package whileLoop;

import java.util.Scanner;

public class printHundredvalues {

	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
		System.out.println("Please enter the starting number:");
		int startingNumber=M.nextInt();
		
		
		System.out.println("please enter ending number:");
		int endingNumber=M.nextInt();
		int number=startingNumber;
		while(number<=endingNumber){
			System.out.println(number);
			number++;
		}
		M.close();

	}

}
