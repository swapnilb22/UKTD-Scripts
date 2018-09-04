package practice;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int iMonth;
		Scanner s1 =new Scanner(System.in);
		System.out.println("Enter Month");
		iMonth =s1.nextInt();
		
		switch(iMonth) {
		case 1: System.out.println("Jan");
		break;
		case 2: System.out.println("Feb");
		break;
		case 3: System.out.println("MAr");
		break;
		case 4: System.out.println("Apr");
		break;
		case 5: System.out.println("May");
		break;
		case 6: System.out.println("Jun");
		break;
		case 7: System.out.println("Jul");
		break;
		default:System.out.println("Invalid");
		}
	}

}
