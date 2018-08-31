package _03_More_Array_Fun;

public class MoreArrayFun {
	// 1. Create a main method to test the other methods you write.
	public static void main(String[] args) {

		// 2. Write a method that takes an array of Strings and prints all the Strings
		// in the array.
		String[] letters = { "a", "b", "c", "d", "e" };
		// for (int i = 0; i < letters.length; i++) {
		// System.out.println(letters[i]);
		// }

		// 3. Write a method that takes an array of Strings and prints all the Strings
		// in the array
		// in reverse order.
		// for (int j = letters.length - 1; j >= 0; j--) {
		// System.out.println(letters[j]);
		// }

		// 4. Write a method that takes an array of Strings and prints every other
		// String in the array.
		for (int i = 0; i < letters.length; i += 2) {
			System.out.println(letters[i]);
		}
		// 5. Write a method that takes an array of Strings and prints all the Strings
		// in the array
		// in a completely random order. Almost every run of the program should result
		// in a different order.

	}
}
