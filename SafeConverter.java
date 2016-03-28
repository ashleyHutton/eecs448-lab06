import javax.swing.*;
import java.awt.*;

public class SafeConverter{

	private static void createGUI(){

		JFrame frame = new JFrame();
		ConvertTemp convertTemp = new ConvertTemp();

		frame.getContentPane().add(convertTemp.getPanel());
		frame.setSize(500, 300);

		frame.setVisible(true);
	}


	public static void main(String[] args){

		createGUI();

	}
}