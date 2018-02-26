package swing_design;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class ButtonExample {
	public static void main(String args[]){
		final JFrame frame = new JFrame();
		final JButton btn = new JButton("clikme");
		final JLabel label = new JLabel("Button clicked");
		frame.add(btn);
		frame.setVisible(true);
		frame.setSize(200, 200);

		btn.addActionListener(new ActionListener() {
			 
	            public void actionPerformed(ActionEvent e)
	            {
//	            		            	btn.setHideActionText(true);
	            		            	btn.setText("clicked");
	            		            	frame.add(btn);
//	            		            	frame.show(true);
	            		            
	                System.out.println("You clicked the button");
	            }
	        });   
		
		
		
		
	}

}
