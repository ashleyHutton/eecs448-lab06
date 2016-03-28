import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

public class RollDice implements ActionListener{

	JPanel panel;
	JButton button;
	JLabel label;
	JTextField text;

	public RollDice(){

		panel = new JPanel();
		button = new JButton("Roll");
		label = new JLabel("Enter number of sides on die:");
		text = new JTextField(10);

		button.addActionListener(this);

		panel.add(label);
		panel.add(text);
		panel.add(button);

	}

	public Component getPanel(){

		return(panel);

	}

	public void actionPerformed(ActionEvent e){

		try{

			int input = Integer.parseInt(text.getText());

			if (input > 0){

				Random rand = new Random();
				int n = rand.nextInt(input) + 1;

				System.out.println(n);

				//JOptionPane.showMessageDialog(frame, roll);
			}
			else{

				System.out.println("invalid input.");
			}
		}

		catch(NumberFormatException exception){

			System.out.println("Not an int");
		}



	}

}