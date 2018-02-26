/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swings;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Ganesh
 */
public class SwingTest extends JComponent{
    public static void main(String args[]){
        JLabel label = new JLabel("Name:");
        JTextField tf = new JTextField(10);
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        panel.add(label);
        panel.add(tf);
        
        
        frame.add(panel);
        frame.setSize(300,200);
        frame.setVisible(true);
    }
}
