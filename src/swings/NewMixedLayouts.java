package swings;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.Panel;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class NewMixedLayouts {
	
	 public static JFrame mainframe = new JFrame();
	
	public static void main(String args[]){
		
	   
		mainframe.setLayout(new GridLayout(4,1));
		JPanel panel1 = new JPanel(); 
		panel1.setBackground(Color.blue);
		JPanel panel2 = new JPanel(); 
		panel2.setBackground(Color.green);
		JPanel panel3 = new JPanel(); 
		panel3.setBackground(Color.cyan);
		JPanel panel4 = new JPanel(); 
		panel4.setBackground(Color.red);
		JPanel panel5 = new JPanel(); 
		panel5.setBackground(Color.gray);
		JPanel panel6 = new JPanel(); 
		panel6.setBackground(Color.magenta);
		JPanel panel7 = new JPanel(); 
		panel7.setBackground(Color.DARK_GRAY);
		JPanel panel8 = new JPanel(); 
		panel8.setBackground(Color.LIGHT_GRAY);
		JPanel panel9 = new JPanel(); 
		panel9.setBackground(Color.pink);
		
		JLabel label1 = new JLabel("A");
		label1.setBackground(Color.white);
		panel1.add(label1);
		
		JLabel label2 = new JLabel("B");
		label2.setBackground(Color.yellow);
		panel2.add(label2);
		
		JLabel label3 = new JLabel("C");
		label3.setBackground(Color.green);
		panel3.add(label3);
		
		JLabel label4 = new JLabel("D");
		label1.setBackground(Color.black);
		panel4.add(label4);
		
		JLabel label5 = new JLabel("E");
		label1.setBackground(Color.BLUE);
		panel5.add(label5);
		
		JLabel label6 = new JLabel("F");
		label1.setBackground(Color.pink);
		panel6.add(label6);
		
		JLabel label7 = new JLabel("G");
		label1.setBackground(Color.cyan);
		panel7.add(label7);
		
		JLabel label8 = new JLabel("H");
		label1.setBackground(Color.LIGHT_GRAY);
		panel8.add(label8);
		
		JLabel label9 = new JLabel("I");
		label1.setBackground(Color.blue);
		panel9.add(label9);
		
		JPanel gridpanel1 = new JPanel(new GridLayout(1,3));
		JPanel gridpanel2 = new JPanel(new GridLayout(1,2));
		JPanel gridpanel3 = new JPanel(new GridLayout(1,3));
		JPanel gridpanel4 = new JPanel(new GridLayout(1,1));
		
		gridpanel1.add(panel1);
		gridpanel1.add(panel2);
		gridpanel1.add(panel3);
		
		gridpanel2.add(panel4);
		gridpanel2.add(panel5);
		
		gridpanel3.add(panel6);
		gridpanel3.add(panel7);
		gridpanel3.add(panel8);
		
		gridpanel4.add(panel9);
		
		JPanel contentPane = new JPanel(new BorderLayout());
//		contentPane.setLayout(new FlowLayout());
		JPanel contentPane1 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
		JPanel contentPane2 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
		JPanel contentPane3 = new JPanel(new FlowLayout(FlowLayout.LEFT, 0,0));
		
	        contentPane.add(panel1, BorderLayout.EAST);
	        contentPane.add(panel2, BorderLayout.CENTER);
	        contentPane.add(panel3, BorderLayout.WEST);
	        
	        contentPane1.add(gridpanel2);
	        contentPane2.add(gridpanel3);
	        contentPane3.add(gridpanel4);
	      
	       
	       
	        mainframe.add(contentPane);
	        mainframe.add(contentPane1);
	        mainframe.add(contentPane2);
	        mainframe.add(contentPane3);




		
		 mainframe.setFont(new Font("SansSerif", Font.PLAIN, 14));
         mainframe.setVisible(true);
 		 mainframe.setSize(200,200);
 		 
 		 
	}

	}

 		
		