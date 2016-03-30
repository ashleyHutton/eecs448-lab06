import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;

public class CastVote implements ActionListener{

	JPanel panel;
	JButton button;
	JLabel firstName;
	JLabel lastName;
	JTextField fNameText;
	JTextField lNameText;
	JLabel label2;

	public CastVote(){

		String cand1 = "Dog";
		String cand2 = "Cat";
		String cand3 = "Pig";
		String cand4 = "Horse";


		panel = new JPanel();
		button = new JButton("Vote");
		firstName = new JLabel("First Name:");
		lastName = new JLabel("Last Name:");
		fNameText = new JTextField(10);
		lNameText = new JTextField(10);
		label2 = new JLabel();

		button.addActionListener(this);

		JRadioButton cand1Button = new JRadioButton(cand1);
	    cand1Button.setMnemonic(KeyEvent.VK_C1);
	    cand1Button.setActionCommand(cand1);
	    cand1Button.setSelected(true);

	    JRadioButton cand2Button = new JRadioButton(cand2);
	    cand2Button.setMnemonic(KeyEvent.VK_C2);
	    cand2Button.setActionCommand(cand2);

	    JRadioButton cand3Button = new JRadioButton(cand3);
	    cand3Button.setMnemonic(KeyEvent.VK_C3);
	    cand3Button.setActionCommand(cand3);

	    JRadioButton cand4Button = new JRadioButton(cand4);
	    cand4Button.setMnemonic(KeyEvent.VK_C4);
	    cand4Button.setActionCommand(cand4);

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(birdButton);
	    group.add(catButton);
	    group.add(dogButton);
	    group.add(rabbitButton);

	    //Register a listener for the radio buttons.
	    birdButton.addActionListener(this);
	    catButton.addActionListener(this);
	    dogButton.addActionListener(this);
	    rabbitButton.addActionListener(this);

		panel.add(firstName);
		panel.add(fNameText);
		panel.add(lastName);
		panel.add(lNameText);

		panel.add(birdButton);
		panel.add(catButton);
		panel.add(dogButton);
		panel.add(rabbitButton);

		panel.add(button);
		panel.add(label2);

	}

	public Component getPanel(){

		return(panel);

	}

	public void actionPerformed(ActionEvent e){
/*
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
		}*/

	}

}