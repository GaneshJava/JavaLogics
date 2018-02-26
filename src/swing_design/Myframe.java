package swing_design;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Myframe {

	public static void main(String args[]){
		JFrame frame = new JFrame();
		JButton btn1 = new JButton("With sec_id");
		JButton btn2 = new JButton("With out sec_id");
		
		frame.add(btn1);
		frame.add(btn2);
		frame.setLayout(new FlowLayout());
		frame.setSize(300,200);
		frame.setVisible(true);
	}
}
