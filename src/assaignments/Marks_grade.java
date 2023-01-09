package assaignments;

import java.util.Scanner;

public class Marks_grade {

	public static void main(String[] args) {
		Scanner M=new Scanner(System.in);
		System.out.println("please enter the student marks:");
		int marks=M.nextInt();
		if(marks<35) {
			System.out.println("you are fail");
		}
		else if(marks==35) {
			System.out.println("you are just passed");
			
		}
		else if(marks>36 && marks<70) {
			System.out.println("you are 2nd class");
		}
		else if(marks>=70 && marks<90) {
			System.out.println("you are firstclass");
		}
		
		
		else if (marks>=90 && marks<=100) {
			System.out.println("you got top rank");
		}
		else {
			System.out.println("your marks are invalid");
		}
		

	}

}
