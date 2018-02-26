package swing_design;

	import java.awt.*;
	import java.awt.event.*;
	import javax.swing.*;

	
	public class FruitsExample extends JPanel
	                          implements ActionListener {
	    JLabel picture;
	    JPanel cards; //a panel that uses CardLayout
	    final static JLabel Description =  new JLabel("Fruits r very good for health");
	    final static JLabel TEXTPANEL =  new JLabel("Fruits r looking good");


	    public FruitsExample() {
	        super(new BorderLayout());
	        JPanel comboBoxPane = new JPanel(); 
	        String[] petStrings = { "Select","Banana.gif", "Cherry.jpg", "Grapes.jpg", "Green Apple.JPG", "Guava.jpg" , "Lemon.JPG" , "Orange.jpg", "Papaya.jpg","WaterMelon.jpg"};

	        @SuppressWarnings("unchecked")
			JComboBox petList = new JComboBox(petStrings);
	        petList.addActionListener(this);
	        comboBoxPane.add(petList);
	       

	       

	        //Set up the picture.
	        picture = new JLabel();
	        picture.setFont(picture.getFont().deriveFont(Font.ITALIC));
	        picture.setHorizontalAlignment(JLabel.CENTER);
	        updateLabel(petStrings[petList.getSelectedIndex()]);
	        picture.setBorder(BorderFactory.createEmptyBorder(10,0,0,0));
	        picture.setPreferredSize(new Dimension(177, 122+10));


	        //The preferred size is hard-coded to be the width of the
	        //widest image and the height of the tallest image + the border.
	        //A real program would compute this.
	      
	        //Lay out the demo.
//	        add(petList, BorderLayout.PAGE_START);
//	        add(picture, BorderLayout.PAGE_END);
	      
	        //Create the "cards".
	        JPanel card1 = new JPanel();
//	        card1.add(picture, BorderLayout.CENTER);
	        card1.add(Description, BorderLayout.PAGE_END);
	        
	        JPanel card2 = new JPanel();
	        card2.add(TEXTPANEL, BorderLayout.PAGE_END);
	        
	        cards = new JPanel(new CardLayout());
	        cards.add(card1);
	        cards.add(card2);
	        
	       add(comboBoxPane, BorderLayout.PAGE_START);
	       add(picture, BorderLayout.CENTER);
	       add(cards, BorderLayout.PAGE_END);


//	        add(comboBoxPane, BorderLayout.PAGE_START);
//	        add(card1, BorderLayout.CENTER);
	        
	        setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
	    }

	    /** Listens to the combo box. */
	    public void actionPerformed(ActionEvent e) {
	        JComboBox cb = (JComboBox)e.getSource();
	        String petName = (String)cb.getSelectedItem();
	        updateLabel(petName);
	    }

	    protected void updateLabel(String name) {
	        ImageIcon icon = createImageIcon("Images/fruits/" +name );
	        picture.setIcon(icon);
	        picture.setToolTipText("A drawing of a " + name.toLowerCase());
	        if (icon != null) {
	            picture.setText(null);
	        } else {
	            picture.setText("Image not found");
	        }
	    }

	    /** Returns an ImageIcon, or null if the path was invalid. */
	    protected static ImageIcon createImageIcon(String path) {
	        java.net.URL imgURL = FruitsExample.class.getResource(path);
	        if (imgURL != null) {
	            return new ImageIcon(imgURL);
	        } else {
	            System.err.println("Couldn't find file: " + path);
	            return null;
	        }
	    }

	    /**
	     * Create the GUI and show it.  For thread safety,
	     * this method should be invoked from the
	     * event-dispatching thread.
	     */
	    private static void createAndShowGUI() {
	        //Create and set up the window.
	        JFrame frame = new JFrame("ComboBoxDemo");
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	        //Create and set up the content pane.
	        JComponent newContentPane = new FruitsExample();
	        newContentPane.setOpaque(true); //content panes must be opaque
	        frame.setContentPane(newContentPane);

	        //Display the window.
	        frame.pack();
	        frame.setVisible(true);
	    }

	    public void itemStateChanged(ItemEvent evt) {
	        CardLayout cl = (CardLayout)(cards.getLayout());
	        cl.show(cards, (String)evt.getItem());
	    }

	    
	    public static void main(String[] args) {
	        //Schedule a job for the event-dispatching thread:
	        //creating and showing this application's GUI.
	        javax.swing.SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                createAndShowGUI();
	            }
	        });
	    }
	}
