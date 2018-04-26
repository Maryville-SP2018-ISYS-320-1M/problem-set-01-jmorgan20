
/*
	ISYS 320
	Name(s):
	Date: 
*/
import java.util.*;

public class P9_ATMDispenser {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("How much money do you want to withdraw?");

		int money = console.nextInt();

		System.out.println("Dispensing " + money / 10 + " ten dollar bills.");
		System.out.println("Dispensing " + money % 10 + " one dollar bills.");

	}

}
