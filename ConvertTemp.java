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
		panel = new JPanel();
		buttonFtoC= new JButton("Convert");
		buttonFtoK= new JButton("Convert");
		buttonCtoK= new JButton("Convert");
		buttonCtoF= new JButton("Convert");
		buttonKtoF= new JButton("Convert");
		buttonKtoC= new JButton("Convert");
		
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
		buttonFtoC.addActionListener(buttonListener());
		buttonFtoK.addActionListener(buttonListener());
		buttonCtoK.addActionListener(buttonListener());
		buttonCtoF.addActionListener(buttonListener());
		buttonKtoF.addActionListener(buttonListener());
		buttonKtoC.addActionListener(buttonListener());
		
		//load the panel
		panel.add(textFtoC);
		panel.add(buttonFtoC);
		panel.add(labelFtoC);

		panel.add(textFtoK);
		panel.add(buttonFtoK);
		panel.add(labelFtoK);

		panel.add(textCtoK);
		panel.add(buttonCtoK);
		panel.add(labelCtoK);

		panel.add(textCtoF);
		panel.add(buttonCtoF);
		panel.add(labelCtoF);

		panel.add(textKtoF);
		panel.add(buttonKtoF);
		panel.add(labelKtoF);

		panel.add(textKtoC);
		panel.add(buttonKtoC);
		panel.add(labelKtoC);

	}
	
	public Component getContent()
	{
		return (panel);
	}
	
	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = textFtoC.getText();
				double tempInF = Double.parseDouble(input);//convert String to double
				double tempInC = (tempInF-32)*(5.0/9.0); //convert F to C
				String newText = "Temp in C: " + String.format("%.2f",tempInC);//convert double to String and
											       //only display 2 places past decimal
				labelFtoC.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
}