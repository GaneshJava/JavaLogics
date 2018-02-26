package swing_design;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
import java.awt.event.*;

class NewLoginPage extends JFrame{
	
	private static final long serialVersionUID = 1L;
	public static JTextField  text1;
	public static JTextField text2;
	public static JDialog loginFrame = new JDialog();
		
NewLoginPage(){
	/* JPanel emptypanel = new JPanel();
     emptypanel.setBorder(BorderFactory.createLineBorder(Color.black));
     emptypanel.add(loginFrame);
				 */
	 final JButton SUBMIT;
	 JButton CANCLE;
	 JLabel label,label1,label2;
	 
//	 	 loginFrame.setUndecorated(true);
	    
	 	 loginFrame.getContentPane().setBackground( Color.white );
	 	 loginFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
	 	 JDialog.setDefaultLookAndFeelDecorated(true);
		 loginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
	    // loginFrame.getRootPane().setWindowDecorationStyle(JRootPane.NONE);  
		 loginFrame.setTitle("Sec_id Login Form");
		 loginFrame.setLayout(null);
		 loginFrame.setResizable(false);
		// loginFrame.getRootPane().setWindowDecorationStyle(JRootPane.NONE); 
		 loginFrame.remove(getMenuBar());
		 loginFrame.removeWindowStateListener(null);
		 
		
		
		 label = new JLabel();
		 label.setText("Login");
		 label.setAlignmentX(TOP_ALIGNMENT);
		 label.setFont(new Font("TIMESNEWROMAN", Font.BOLD, 14));
		 Color c = new Color(70,130,180 );
		 label.setForeground(c);
		 		
		 
	    label1 = new JLabel();
	    label1.setText("Username:");
	    text1 = new JTextField(15);
	    text1.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				text1.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				text1.setBorder(BorderFactory.createLineBorder(Color.green));
			}
		});

	      
	    label2 = new JLabel();
	    label2.setText("Password:");
	    text2 = new JPasswordField(15);
	    text2.addFocusListener(new FocusListener() {
			
			@Override
			public void focusLost(FocusEvent arg0) {
				// TODO Auto-generated method stub
				text2.setBorder(BorderFactory.createLineBorder(Color.BLACK));
			}
			
			@Override
			public void focusGained(FocusEvent arg0) {
				// TODO Auto-generated method stub
				text2.setBorder(BorderFactory.createLineBorder(Color.green));
			}
		});

	    SUBMIT=new JButton("Login");
	    CANCLE=new JButton("Cancle");
	    label.setBounds(130, 5, 200, 50);
	    label1.setBounds(60,50,100,20);
	    text1.setBounds(150,50,150,20);
	    label2.setBounds(60,80,100,20);
	    text2.setBounds(150,80,150,20);
	    SUBMIT.setBounds(150,110,75,20);
	    SUBMIT.isFocusable();
	    CANCLE.setBounds(225, 110, 75, 20);
	    loginFrame.add(label);
	    loginFrame.add(label1);
	    loginFrame.add(text1);
	    loginFrame.add(label2);
	    loginFrame.add(text2);
	    loginFrame.add(SUBMIT);
	    loginFrame.add(CANCLE);

	    loginFrame.setVisible(true);
	    loginFrame.setBounds(400, 200, 400, 200);
	    
	    Color c1 = new Color(240,248,255);
	    loginFrame.setForeground(c1);
	    
	    text1.addKeyListener(getKeyListener(SUBMIT, text1, text2));
	    text2.addKeyListener(getKeyListener(SUBMIT, text1, text2));


	    SUBMIT.addActionListener(new ActionListener(){
	    	 
	    public void actionPerformed(ActionEvent ae){
	    	 String value1=text1.getText();
	    	 String value2=text2.getText();
//	    	 text1.addKeyListener((KeyListener) SUBMIT);
//	    	 text2.addKeyListener(KeyListener(SUBMIT, text1, text2));
	    	 KeyListener keyListener = null;
			SUBMIT.addKeyListener(keyListener);
			getLoginValidate(SUBMIT,text1,text2);
	
	    }
	   
	 });
	  
	 CANCLE.addActionListener(new ActionListener(){
		 public void actionPerformed(ActionEvent ae){
			 loginFrame.dispose();
	
		 }
		 });
	 
	  }

	 
	 public  KeyListener getKeyListener( final JButton button,  final JTextField usrNametextField,  final JTextField text22) {

			KeyAdapter keyAdapter = new KeyAdapter(){

				public void keyTyped(KeyEvent event) {

					if(event.getKeyChar() == '\n'){
						
						getLoginValidate(button, usrNametextField, text22);
					}
				}

			};
			return keyAdapter;
		}
				
	 public static void getLoginValidate(JButton btn,JTextField text1,JTextField text2){
		 String value1=text1.getText();
    	 String value2=text2.getText();
		 if(value1.equals("") && value2.equals("")) {
		      JOptionPane.showMessageDialog(null,"Enter login name and password","Error",JOptionPane.ERROR_MESSAGE);
		  }
		 else if(value1.equals("admin") && value2.equals("admin")) {
			
			 Homepage page = new Homepage();
			 page.goHomePage(value1);
		    loginFrame.dispose();
		    }
		 else if(value1.equals("admin") && !value2.equals("admin")) {
			 JOptionPane.showMessageDialog(null,"Enter the correct Password!!!","Error",JOptionPane.WARNING_MESSAGE);
		     text1.setText("admin");
		     text2.setText("");
		    }
		 else if(!value1.equals("admin") && !value2.equals("admin")){
			 JOptionPane.showMessageDialog(null,"Invalid Login!!!","Error",JOptionPane.ERROR_MESSAGE);
		     text1.setText("");
		     text2.setText("");
		 }
	 }
	 
		public static FocusListener getFocusListener(final JButton button, final JTextField textField) {
			FocusListener focusListener = new FocusListener() {

				@Override
				public void focusLost(FocusEvent e) {
					
					textField.selectAll();
					textField.setBorder(BorderFactory.createLineBorder(new Color(70,130,180)));
				}

				@Override
				public void focusGained(FocusEvent e) {

					button.setEnabled(true);
					textField.setBorder(BorderFactory.createLineBorder(Color.green));
				}

			};
			return focusListener;
		}
	  
		 public static void main(String arg[]){
			 NewLoginPage Login = new NewLoginPage();
			 
			
		}
		
	}


