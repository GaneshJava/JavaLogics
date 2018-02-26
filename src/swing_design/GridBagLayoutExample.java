package swing_design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class GridBagLayoutExample {
	
	 public static JFrame mainframe = new JFrame();
	
	public static void main(String args[]){
		
	   
		
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
		
		GridBagLayout gridbag = new GridBagLayout();
        GridBagConstraints c = new GridBagConstraints();

      
        mainframe.setLayout(gridbag);
        c.fill = GridBagConstraints.BOTH;
        c.gridwidth = GridBagConstraints.RELATIVE;
        makePanel(panel1, gridbag, c);
        makePanel(panel2, gridbag, c);
        makePanel(panel3, gridbag, c);
   
     
        c.gridwidth = GridBagConstraints.REMAINDER;
        makePanel(panel4, gridbag, c);
        makePanel(panel5, gridbag, c);


        c.gridwidth = GridBagConstraints.REMAINDER;
        makePanel(panel6, gridbag, c); //another row
        makePanel(panel7, gridbag, c);
        makePanel(panel8, gridbag, c);



        c.gridwidth = GridBagConstraints.REMAINDER;
        makePanel(panel9, gridbag, c);

      

//        c.gridwidth = 1;                //reset to the default
//        c.gridheight = 2;
//        c.weighty = 1.0;
//        makePanel(panel1, gridbag, c);

//        c.weighty = 0.0;                //reset to the default
//        c.gridwidth = GridBagConstraints.REMAINDER; //end row
//        c.gridheight = 1;               //reset to the default
//        makePanel(panel9, gridbag, c);
//        makePanel(panel9, gridbag, c);



		
		
		 mainframe.setFont(new Font("SansSerif", Font.PLAIN, 14));
         mainframe.setVisible(true);
 		 mainframe.setSize(200,200);
 		 
 		 
	}

	private static void makePanel(JPanel panel1, GridBagLayout gridbag,
			GridBagConstraints c) {
		// TODO Auto-generated method stub
		
        gridbag.setConstraints(panel1, c);
        mainframe.add(panel1);

		
	}

	}

 		
		
