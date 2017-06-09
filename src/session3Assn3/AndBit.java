package session3Assn3;

import java.util.Scanner;

public class AndBit {

	public static void main(String[] args)  {
			Scanner in = new Scanner(System.in);
			
			System.out.println(" Enter first number:");
			byte a = in.nextByte();
			
			System.out.println(" Enter second number:");
			byte b = in.nextByte();
			
			int x = a, y = b;
			System.out.println(x&y);
			System.out.println(x==1 && y==1);
		
	}

}
