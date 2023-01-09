package forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner M =new Scanner(System.in);
		System.out.println("please enter number:");
		int number=M.nextInt();
		//int startingNumber=number;
		int count=0;
		
		for(int i=2;i<number/2;i++) {
			if(number%2==0)
			{
				count++;
				break;
			
			}
			
			if(count==0 && number!=1)
			{
				System.out.println(number+":is a prime");
			}
			else {
				System.out.println(number+"is not a prime");
			}
		}

	}

}
