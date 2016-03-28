import javax.swing.*;
import java.awt.*;

public class Dice{

	private static void createGUI(){

		JFrame frame = new JFrame();
		RollDice rollDice = new RollDice();

		frame.getContentPane().add(rollDice.getPanel());
		frame.setSize(500, 300);

		frame.setVisible(true);
	}


	public static void main(String[] args){

		createGUI();

	}
}