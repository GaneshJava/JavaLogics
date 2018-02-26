package swings;

/*
 * Copyright (c) 1995, 2008, Oracle and/or its affiliates. All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 *   - Redistributions of source code must retain the above copyright
 *     notice, this list of conditions and the following disclaimer.
 *
 *   - Redistributions in binary form must reproduce the above copyright
 *     notice, this list of conditions and the following disclaimer in the
 *     documentation and/or other materials provided with the distribution.
 *
 *   - Neither the name of Oracle or the names of its
 *     contributors may be used to endorse or promote products derived
 *     from this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS
 * IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO,
 * THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR
 * PURPOSE ARE DISCLAIMED.  IN NO EVENT SHALL THE COPYRIGHT OWNER OR
 * CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO,
 * PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR
 * PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF
 * LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS
 * SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */ 



/*
 * CardLayoutDemo.java
 *
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class CardLayoutExample implements ItemListener {
	JPanel cards; //a panel that uses CardLayout
	final static String BUTTONPANEL = "Card with JButtons";
	final static String TEXTPANEL = "Card with JTextField";
	JLabel picture;
	public void addComponentToPane(Container pane) {
		//Put the JComboBox in a JPanel to get a nicer look.
		JPanel comboBoxPane = new JPanel(); //use FlowLayout
		String comboBoxItems[] = { "Select","Banana.gif", "Cherry.jpg", "Grapes.jpg", "Green Apple.JPG", "Guava.jpg" , "Lemon.JPG" , "Orange.jpg", "Papaya.jpg","WaterMelon.jpg"};
		JComboBox cb = new JComboBox(comboBoxItems);
		cb.setEditable(false);

		cb.addItemListener(this);
		comboBoxPane.add(cb);

		//Set up the picture.
		picture = new JLabel("Select ComboBox");
		picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
		picture.setHorizontalAlignment(JLabel.CENTER);
//		updateLabel(comboBoxItems[cb.getSelectedIndex()]);
		picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
		picture.setPreferredSize(new Dimension(177, 122+10));

		JLabel SelectLabel = new JLabel("Select Combobox to show Fruits ");
		
		
		

		//Create the "cards".
		JPanel card0 = new JPanel();
		JLabel Selectlbl = new JLabel("Select Combo to find Fruits");
		card0.add(Selectlbl);

		JPanel card1 = new JPanel();
		JLabel Bananalbl = new JLabel("this is Banana");
		card1.add(Bananalbl);


		JPanel card2 = new JPanel();
		JLabel Cheerylbl = new JLabel("this is Cherry");
		card2.add(Cheerylbl);

		JPanel card3 = new JPanel();
		JLabel Grapeslbl = new JLabel("this is Grapes");
		card3.add(Grapeslbl);

		JPanel card4 = new JPanel();
		JLabel GreenApplelbl = new JLabel("this is Green Apple");
		card4.add(GreenApplelbl);

		JPanel card5 = new JPanel();
		JLabel Guavalbl = new JLabel("this is Guava");
		card5.add(Guavalbl);

		JPanel card6 = new JPanel();
		JLabel Lemonlbl = new JLabel("this is Lemon");
		card6.add(Lemonlbl);

		JPanel card7 = new JPanel();
		JLabel Orangelbl = new JLabel("this is Orange");
		card7.add(Orangelbl);

		JPanel card8 = new JPanel();
		JLabel Papayalbl = new JLabel("this is Papaya");
		card8.add(Papayalbl);

		JPanel card9 = new JPanel();
		JLabel WaterMelonlbl = new JLabel("this is WaterMelon");
		card9.add(WaterMelonlbl);

		//Create the panel that contains the "cards".
		cards = new JPanel(new CardLayout());
		cards.add(card0, "Select");
		cards.add(card1, "Banana.gif");
		cards.add(card2, "Cherry.jpg");

		cards.add(card3, "Grapes.jpg");
		cards.add(card4, "Green Apple.JPG");
		cards.add(card5, "Guava.jpg");

		cards.add(card6, "Lemon.JPG");
		cards.add(card7, "Orange.jpg");
		cards.add(card8, "Papaya.jpg");
		cards.add(card9, "WaterMelon.jpg");
		
		JPanel Selectpanel = new JPanel();
		Selectpanel.add(SelectLabel);
		
		JPanel contentpanel = new JPanel();
		contentpanel.add(cards);
		contentpanel.add(picture);
		
		JPanel cardpanel = new JPanel();
		cardpanel = new JPanel(new CardLayout());
		cardpanel.add(Selectpanel, "Select");
		cardpanel.add(contentpanel);
		
		pane.add(comboBoxPane, BorderLayout.PAGE_START);
		pane.add(picture, BorderLayout.CENTER);
		pane.add(cards, BorderLayout.PAGE_END);


	}

	public void itemStateChanged(ItemEvent evt) {

		//    	updateLabel(evt);
		CardLayout cl = (CardLayout)(cards.getLayout());
		cl.show(cards, (String)evt.getItem());

		if(evt.getItem().equals("Select")){
			ImageIcon icon = null;
			picture.setIcon(icon);
			picture.setToolTipText("Select" );
			picture.setText("Select ComboBox");
		}
		else{
			ImageIcon icon = createImageIcon("Images/fruits/" +evt.getItem() );
			picture.setIcon(icon);
			picture.setToolTipText("A drawing of a " + evt.getItem());
			if (icon != null) {
				picture.setText(null);
			} else {
				picture.setText("Image not found");
			}
			
		}
	}

	/**
	 * Create the GUI and show it.  For thread safety,
	 * this method should be invoked from the
	 * event dispatch thread.
	 */
	private static void createAndShowGUI() {

		JFrame frame = new JFrame("CardLayoutDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		CardLayoutExample demo = new CardLayoutExample();
		demo.addComponentToPane(frame.getContentPane());

		frame.pack();
		frame.setVisible(true);
	}

	/*public void actionPerformed(ActionEvent e) {
		System.out.println("in uactionPerformed methiod");
		JComboBox cb = (JComboBox)e.getSource();
		String petName = (String)cb.getSelectedItem();
		updateLabel(petName);
	}*/

	/*protected void updateLabel(String name) {
		System.out.println("selected fruit:"+name);
		System.out.println("in updatelabel methiod");
		ImageIcon icon = createImageIcon("Images/fruits/" +name );
		picture.setIcon(icon);
		picture.setToolTipText("A drawing of a " + name.toLowerCase());
		if (icon != null) {
			picture.setText(null);
		} else {
			picture.setText("Image not found");
		}
	}*/
	protected static ImageIcon createImageIcon(String path) {
		System.out.println("in createImageIcon methiod");
		java.net.URL imgURL = FruitsExample.class.getResource(path);
		if (imgURL != null) {
			return new ImageIcon(imgURL);
		} else {
			System.err.println("Couldn't find file: " + path);
			return null;
		}
	}


	public static void main(String[] args) {
		/* Use an appropriate Look and Feel */
		try {
			//UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (UnsupportedLookAndFeelException ex) {
			ex.printStackTrace();
		} catch (IllegalAccessException ex) {
			ex.printStackTrace();
		} catch (InstantiationException ex) {
			ex.printStackTrace();
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		}
		/* Turn off metal's use of bold fonts */
		UIManager.put("swing.boldMetal", Boolean.FALSE);

		//Schedule a job for the event dispatch thread:
		//creating and showing this application's GUI.
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				createAndShowGUI();
			}
		});
	}
}
