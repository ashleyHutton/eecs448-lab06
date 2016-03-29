import javax.swing.*;
import java.awt.event.*;
import java.awt.Component;
import java.awt.GridLayout;

public class ConvertTemp 
{
	private JPanel panel;
	
	private JTextField textFtoC;
	private JTextField textFtoK;
	private JTextField textCtoK;
	private JTextField textCtoF;
	private JTextField textKtoF;
	private JTextField textKtoC;

	private JButton buttonFtoC;
	private JLabel labelFtoC;
	private JButton buttonFtoK;
	private JLabel labelFtoK;
	private JButton buttonCtoK;
	private JLabel labelCtoK;
	private JButton buttonCtoF;
	private JLabel labelCtoF;
	private JButton buttonKtoF;
	private JLabel labelKtoF;
	private JButton buttonKtoC;
	private JLabel labelKtoC;
	
	public ConvertTemp()
	{
		panel = new JPanel(new GridLayout(0,1));
		buttonFtoC= new JButton("Convert from F to C");
		buttonFtoK= new JButton("Convert from F to K");
		buttonCtoK= new JButton("Convert from C to K");
		buttonCtoF= new JButton("Convert from C to F");
		buttonKtoF= new JButton("Convert from K to F");
		buttonKtoC= new JButton("Convert from K to C");
		
		labelFtoC = new JLabel("Enter a temperature from F to C");
		labelFtoK = new JLabel("Enter a temperature from F to K");
		labelCtoK = new JLabel("Enter a temperature from C to K");
		labelCtoF = new JLabel("Enter a temperature from C to F");
		labelKtoF = new JLabel("Enter a temperature from K to F");
		labelKtoC = new JLabel("Enter a temperature from K to C");

		textFtoC = new JTextField(3);//3 cols, not 20 chars
		textFtoK = new JTextField(3);
		textCtoK = new JTextField(3);
		textCtoF = new JTextField(3);
		textKtoF = new JTextField(3);
		textKtoC = new JTextField(3);
		
		//Load the listener
		buttonFtoC.addActionListener(button1Listener());
		buttonFtoK.addActionListener(button2Listener());
		buttonCtoK.addActionListener(button3Listener());
		buttonCtoF.addActionListener(button4Listener());
		buttonKtoF.addActionListener(button5Listener());
		buttonKtoC.addActionListener(button6Listener());
		
		//load the panel
		panel.add(labelFtoC);
		panel.add(textFtoC);
		panel.add(buttonFtoC);

		panel.add(labelFtoK);
		panel.add(textFtoK);
		panel.add(buttonFtoK);
		
		panel.add(labelCtoK);
		panel.add(textCtoK);
		panel.add(buttonCtoK);

		panel.add(labelCtoF);
		panel.add(textCtoF);
		panel.add(buttonCtoF);

		panel.add(labelKtoF);
		panel.add(textKtoF);
		panel.add(buttonKtoF);

		panel.add(labelKtoC);
		panel.add(textKtoC);
		panel.add(buttonKtoC);

	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener button1Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{

				try{
					String input = textFtoC.getText();
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					labelFtoC.setText(newText);
				}

				catch(NumberFormatException exception){

					labelFtoC.setText("Not an int");
				}
			}
		};
		
		return listener;
	}
		private ActionListener button2Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try{
					String input = textFtoK.getText();
					double tempInF = Double.parseDouble(input);//convert String to double
					double tempInK = ((tempInF-32)*(5.0/9.0))+273; 
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					labelFtoK.setText(newText);
				}
				catch(NumberFormatException exception){

					labelFtoK.setText("Not an int");
				}
			}
		};
		
		return listener;
	}	
		private ActionListener button3Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					String input = textCtoK.getText();
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInK = tempInC + 273;
					String newText = "Temp in K: " + String.format("%.2f",tempInK);//convert double to String and
												       //only display 2 places past decimal
					labelCtoK.setText(newText);
				}
				catch(NumberFormatException exception){

					labelCtoK.setText("Not an int");
				}
			}
		};
		
		return listener;
	}
		private ActionListener button4Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					String input = textCtoF.getText();
					double tempInC = Double.parseDouble(input);//convert String to double
					double tempInF = ((9.0/5.0) * tempInC) + 32; 
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					labelCtoF.setText(newText);
				}
				catch(NumberFormatException exception){

					labelCtoF.setText("Not an int");
				}
			}
		};
		
		return listener;
	}
		private ActionListener button5Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					String input = textKtoF.getText();
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInF = ((9.0/5.0) * (tempInK - 273)) + 32;
					String newText = "Temp in F: " + String.format("%.2f",tempInF);//convert double to String and
												       //only display 2 places past decimal
					labelKtoF.setText(newText);
				}
				catch(NumberFormatException exception){

					labelKtoF.setText("Not an int");
				}
			}
		};
		
		return listener;
	}
		private ActionListener button6Listener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				try {
					String input = textKtoC.getText();
					double tempInK = Double.parseDouble(input);//convert String to double
					double tempInC = tempInK - 273;
					String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
												       //only display 2 places past decimal
					labelKtoC.setText(newText);
				}
				catch(NumberFormatException exception){

					labelKtoC.setText("Not an int");
				}
			}
		};
		
		return listener;
	}
}



