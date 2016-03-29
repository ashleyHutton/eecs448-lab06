import javax.swing.*;
import java.awt.*;

public class VotingSystem{

	private static void createGUI(){

		JFrame frame = new JFrame();
		CastVote vote = new CastVote();

		frame.getContentPane().add(vote.getPanel());
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}


	public static void main(String[] args){

		createGUI();

	}
}