package lottery;

import java.util.Random;

public class LotteryApplicationCastro {

		private Random randInt;
		private int lotteryNumbers[];

		/**
		 * Default Constructor - sets a random number from 1-9 in a forloop
		 */
		public LotteryApplicationCastro() {
			randInt = new Random(1);
			lotteryNumbers = new int[5];
			for (int i = 0; i < 5; i++)
				lotteryNumbers[i] = randInt.nextInt(10);
		}

		/**
		 * The newLotteryNumbers method stores new integer values between 0 and 9
		 * inclusive in the lotteryNumbers array using the randInt Random.
		 */
		public void newLotteryNumbers() {
			// Stores random values in the lotteryNumbers array
			for (int i = 0; i < 5; i++)
				lotteryNumbers[i] = randInt.nextInt(10);
		}

		/**
		 * The toString method stores the values of the lotteryNumbers
		 * 
		 * @return str A String containing all of the values stored
		 */
		public String toString() {
			
			String str = Integer.toString(lotteryNumbers[0]);
			for (int i = 1; i < 5; i++)
				str += " " + Integer.toString(lotteryNumbers[i]);
			return str;
		}

		public int compareNumbers(int userNum[]) {
			int match = 0;
			for (int i = 0; i < 5; i++) {
				if (userNum[i] == lotteryNumbers[i])
					match++;
			}

			return match;
		}

		/**
		 * The copyArray method copies the lotteryNumbers
		 * @return copy An integer array 
		 */
		public int[] copyArray() {
			int copy[] = new int[5];
			for (int i = 0; i < 5; i++)
				copy[i] = lotteryNumbers[i];

			return copy;
		}
	}