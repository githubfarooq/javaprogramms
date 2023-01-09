package forLoop;

import java.util.Scanner;

public class printValues {

	public static void main(String[] args) {
		
		Scanner M=new Scanner(System.in);
		System.out.println("Please enter the starting number:");
		int startingNumber=M.nextInt();
		//int number=startingNumber;
		
		System.out.println("please enter ending number:");
		int endingNumber=M.nextInt();
		for (int i=startingNumber;i>=endingNumber;i--) {
			if(i%2==1)
			
			System.out.println(i);
		}
			


	}

}
