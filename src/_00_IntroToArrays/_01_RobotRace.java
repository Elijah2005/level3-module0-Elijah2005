package _00_IntroToArrays;

import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class _01_RobotRace {

	// 1. make a main method
	public static void main(String[] args) {

		// 2. create an array of 5 robots.
		Robot[] bot = new Robot[5];
		// 3. use a for loop to initialize the robots.
		for (int i = 0; i < bot.length; i++) {
			bot[i] = new Robot();
		}
		// 4. make each robot start at the bottom of the screen, side by side, facing up
		bot[0].moveTo(300, 550);
		bot[1].moveTo(150, 550);
		bot[2].moveTo(450, 550);
		bot[3].moveTo(600, 550);
		bot[4].moveTo(750, 550);
		// 5. use another for loop to iterate through the array and make each robot move
		// a random amount less than 50.
		boolean raceIsOver = false;
		while (!raceIsOver) {
			for (int i = 0; i < bot.length; i++) {
				Random rand = new Random();
				bot[i].setSpeed(10);
				bot[i].move(rand.nextInt(49));
				bot[i].setRandomPenColor();
				bot[i].penDown();
				bot[i].getY();
				if (bot[i].getY() <= 0) {
					raceIsOver = true;
					JOptionPane.showMessageDialog(null, "Robot # " + i + " is the winner");
					bot[i].sparkle();

				}
			}
		}
		// 6. use a while loop to repeat step 5 until a robot has reached the top of the
		// screen.

		// 7. declare that robot the winner and throw it a party!

		// 8. try different races with different amounts of robots.

		// 9. make the robots race around a circular track.
	}
}
