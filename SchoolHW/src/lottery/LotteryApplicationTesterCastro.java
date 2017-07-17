package lottery;

import java.util.Scanner;

public class LotteryApplicationTesterCastro {
	public static void main(String[] args) {
		// Object Declaration
		LotteryApplicationCastro lottery = new LotteryApplicationCastro();
		int userNum[] = new int[5];
		Scanner keyboard = new Scanner(System.in);

		// Primitive Declaration
		int temp;

		// Populate the user array with inputs
		for (int i = 0; i < 5; i++) {
			System.out.printf("Please enter your %d lottery number: ", (i + 1));
			temp = keyboard.nextInt();
			keyboard.nextLine();
			userNum[i] = temp;
		}

		// Determine if the player wins or loses
		if (lottery.compareNumbers(userNum) == 5)
			System.out
					.printf("You are the grand prize winner  as you matched all the winning numbers.\nThe winning numbers were:  "
							+ lottery.toString());
		else
			System.out.printf("You are a loser as you only matched " + lottery.compareNumbers(userNum)
					+ " numbers.\nThe winning numbers were:  " + lottery.toString());
		keyboard.close();

	}

}
