package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {

	public static void main(String[] args) {
		MoreArrayFun array = new MoreArrayFun();
		String[] letters = { "a", "b", "c", "d", "h" };
		array.RandomString(letters);
	}

	// 1. Create a main method to test the other methods you write.
	// 2. Write a method that takes an array of Strings and prints all the Strings
	// in the array.
	void StringPrinter(String[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}

	}

	// 3. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in reverse order.
	void ReverseStringPrinter(String[] array) {
		for (int j = array.length - 1; j >= 0; j--) {
			System.out.println(array[j]);

		}
	}

	// 4. Write a method that takes an array of Strings and prints every other
	// String in the array.
	void EveryOtherString(String[] array) {
		for (int i = 0; i < array.length; i += 2) {
			System.out.println(array[i]);
		}
	}

	// 5. Write a method that takes an array of Strings and prints all the Strings
	// in the array
	// in a completely random order. Almost every run of the program should result
	// in a different order.
	void RandomString(String[] array) {
		String[] letters = new String[array.length];
		int numberPrinted = 0;
		while (numberPrinted < array.length) {
			Boolean words = true;
			Random rand = new Random();
			int random = rand.nextInt(array.length);
			String randomWord = array[random];
			for (int i = 0; i < letters.length; i++) {
				if (randomWord == letters[i]) {
					words = false;
				}
			}
			if (words == true) {
				System.out.println(randomWord);
				letters[numberPrinted] = randomWord;
				numberPrinted++;
			}
		}

	}
}
