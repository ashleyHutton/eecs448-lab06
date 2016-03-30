import javax.swing.*;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.event.*;
import java.util.*;
import java.io.*;

public class CastVote implements ActionListener{

	JPanel panel;
	JButton button;
	JLabel firstName;
	JLabel lastName;
	JTextField fNameText;
	JTextField lNameText;
	JLabel label2;

	JRadioButton cand1Button;
	JRadioButton cand2Button;
	JRadioButton cand3Button;
	JRadioButton cand4Button;

	String cand1 = "Dog";
	String cand2 = "Cat";
	String cand3 = "Pig";
	String cand4 = "Horse";

	public CastVote(){

		panel = new JPanel();
		button = new JButton("Vote");
		firstName = new JLabel("First Name:");
		lastName = new JLabel("Last Name:");
		fNameText = new JTextField(10);
		lNameText = new JTextField(10);
		label2 = new JLabel();

		button.addActionListener(this);

		cand1Button = new JRadioButton(cand1);
	   	cand2Button = new JRadioButton(cand2);
	    cand3Button = new JRadioButton(cand3);
	    cand4Button = new JRadioButton(cand4);

	    cand1Button.setSelected(true);

	    //Group the radio buttons.
	    ButtonGroup group = new ButtonGroup();
	    group.add(cand1Button);
	    group.add(cand2Button);
	    group.add(cand3Button);
	    group.add(cand4Button);

		panel.add(firstName);
		panel.add(fNameText);
		panel.add(lastName);
		panel.add(lNameText);

		panel.add(cand1Button);
		panel.add(cand2Button);
		panel.add(cand3Button);
		panel.add(cand4Button);

		panel.add(button);
		panel.add(label2);

	}

	public Component getPanel(){

		return(panel);

	}

	public void actionPerformed(ActionEvent e){

		String fName = fNameText.getText();
		String lName = lNameText.getText();

		String candidate = "hi";

		if (cand1Button.isSelected()){ candidate = cand1; }
		if (cand2Button.isSelected()){ candidate = cand2; }
		if (cand3Button.isSelected()){ candidate = cand3; }
		if (cand4Button.isSelected()){ candidate = cand4; }

		String fileName = lName + "_" + fName + "_ballot.txt";

		try{

			File f = new File(fileName);

			if (f.createNewFile()){ // file create was successful

				System.out.println(candidate);
				FileWriter writer = new FileWriter(fileName);
				writer.write(candidate);

			}
			else { // file with this name already exists

				System.out.println("File already exists. User has already voted.");

			}
		}
		catch (Exception exception){
			exception.printStackTrace();
		}

		return;

	}

}






