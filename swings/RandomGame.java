/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package swings;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Ganesh
 */
public class RandomGame {

    static JFrame frame = new JFrame("Random Numbers Game");
    static JPanel inputPanel = new JPanel();
    static JPanel centerPanel = new JPanel();
    static JPanel outputPanel;

    public static void main(String args[]) {
        JButton button = new JButton("Play!");
        JLabel label = new JLabel("Dices:");
        final JComboBox combo = new JComboBox();
        combo.addItem("1");
        combo.addItem("2");
        combo.addItem("3");
        combo.addItem("4");
        inputPanel.add(label);
        inputPanel.add(combo);
        inputPanel.add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                outputPanel = new JPanel(new GridLayout(2, 2));
                centerPanel.removeAll();
                frame.validate();
                for (int i = 0; i <= combo.getSelectedIndex(); i++) {
                    JButton button = new JButton(rand());
                    outputPanel.add(button);
                }

                centerPanel.add(outputPanel);
                frame.add(centerPanel, BorderLayout.CENTER);
                frame.repaint();
                frame.validate();
            }
        });

        frame.add(inputPanel, BorderLayout.NORTH);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setSize(200, 200);
    }

    public static String rand() {
        int n = 1;
        int m = 6;
        int span = m - n + 1;
        double r = Math.random();
        int raw = (int) (r * span);
        Integer ret = n + raw;
        String s = ret.toString();
        return (s);
    }
}
