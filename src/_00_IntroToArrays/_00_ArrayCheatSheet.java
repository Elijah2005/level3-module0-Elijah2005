package _00_IntroToArrays;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		// 1. make an array of 5 Strings
		String[] letters = { "a", "b", "c", "d", "e" };
		// 2. print the third element in the array
		System.out.println(letters[2]);
		// 3. set the third element to a different value
		letters[2] = "f";
		// 4. print the third element again
		System.out.println(letters[2]);
		// 5. use a for loop to set all the elements in the array to a string of your
		// choice
		for (int i = 0; i < letters.length; i++) {
			letters[i] = "g";
			System.out.println(letters[i]);
		}

		// 6. use a for loop to print all the values in the array
		// BE SURE TO USE THE ARRAY'S length VARIABLE

		// 7. make an array of 50 integers
		// int[] x = new int[50];
		// 8. use a for loop to make every value of the integer array a random number

		// for (int i = 0; i < x.length; i++) {
		// Random rand = new Random();
		// x[i] = rand.nextInt(50);

		// 9. without printing the entire array, print only the smallest number on the
		// array
		// int least = x[0];
		// for (int i = 0; i < x.length; i++) {
		// if (x[i] < least) {
		// least = x[i];

		// }
		// }
		// System.out.println(least);
		// 10 print the entire array to see if step 8 was correct
		// for (int i = 0; i < x.length; i++) {
		// System.out.println(x[i]);
		// }
		// // 11. print the largest number in the array.
		// int greatest = x[0];
		// for (int i = 0; i > x.length; i++) {
		// if (x[i] > greatest) {
		// greatest = x[i];

		// }
		// }
		// System.out.println(greatest);
		// 12. print only the last element in the array
		// System.out.println(x[49]);
		// }
	}
}
