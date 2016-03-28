import javax.swing.JFrame;


public class SafeConverter 
{
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		ConvertTemp conversion = new ConvertTemp();
		
		frame.getContentPane().add(conversion.getContent());
		frame.setSize(500, 300);
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}
}