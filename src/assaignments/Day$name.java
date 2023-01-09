package assaignments;

import java.util.Scanner;

public class Day$name {
	public static void main(String[] args) {
		Scanner S=new Scanner(System.in);
		System.out.println("please enter the Day name:");
		String dayName=S.next();
		if(dayName.equals("Monday") ||
				dayName.equals("tuesday")||
				dayName.equals("wednesday")||
				dayName.equals("thrusday")||
				dayName.equals("friday"))
			System.out.println("uff,its a week day");
		else if(dayName.equals("saturday")||
				dayName.equals("sunday"))
			System.out.println("yay,its a weekend");
		
		S.close();
		
				
	}

}
