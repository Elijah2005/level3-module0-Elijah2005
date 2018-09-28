import javax.swing.JOptionPane;

public class Checkpoint {
	public static void main(String[] args) {
		int[] numbers = new int[5];
		for (int i = 0; i < numbers.length; i++) {
			String input = JOptionPane.showInputDialog("ENTER  1 number");
			numbers[i] = Integer.parseInt(input);
		}
		int sum = 0;
		for (int i = 0; i < numbers.length; i ++) {
		sum = sum + numbers[i]	;
			
		}
		JOptionPane.showMessageDialog(null,  sum + " ");
	}
}
