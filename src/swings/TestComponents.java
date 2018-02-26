/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swings;

import javax.swing.*;

/**
 *
 * @author Ganesh
 */
public class TestComponents {
    
    public static void main(String args[]){
       
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        
        JTextField com = new JTextField(1);
        JTextArea ta = new JTextArea(10,10);
        JTable table = new JTable(null);
        JCheckBox ck = new JCheckBox();
        JRadioButton rd = new JRadioButton();
        
        
        panel.add(rd);
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400, 400);
        
        
       
    }
    
}
