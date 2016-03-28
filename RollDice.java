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
	JLabel label2;

	public RollDice(){

		panel = new JPanel();
		button = new JButton("Roll");
		label = new JLabel("Enter number of sides on die:");
		text = new JTextField(10);
		label2 = new JLabel();

		button.addActionListener(this);

		panel.add(label);
		panel.add(text);
		panel.add(button);
		panel.add(label2);

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

				String newText = "Roll: " + String.format("%d",n);
				label2.setText(newText);

			}
			else{

				label2.setText("Invalid input");
			}
		}

		catch(NumberFormatException exception){

			label2.setText("Not an int");
		}

	}

}