import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			String input = JOptionPane.showInputDialog("ENTER  5 numbers");
			numbers[i] = Integer.parseInt(input);
		}
		for (int i = 0; i < numbers.length; i += numbers[i]) {
			JOptionPane.showMessageDialog(null, numbers + " ");
		}
	}
}
