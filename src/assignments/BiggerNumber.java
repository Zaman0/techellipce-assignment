package assignments;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		System.out.println("Enter 1st Number: ");
		int num1 = s.nextInt();
		System.out.println("Enter 2dn Number: ");
		int num2 = s.nextInt();
		System.out.println("Enter 3rd Number: ");
		int num3 = s.nextInt();
		
		int max = num1;
		
		if (num2 > max) {
			max = num2;
		}
		if (num3 > max) {
			max = num3;
		}
		
		System.out.println("The greatest number is " + max);

	}

}
