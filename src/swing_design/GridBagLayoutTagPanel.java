package swing_design;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GridBagLayoutTagPanel extends JPanel {
private static final long serialVersionUID = -441746014057882848L;
private final int NB_TAGS = 5;

public GridBagLayoutTagPanel() {
    setLayout(new GridLayout());

    JPanel pTags = new JPanel(new GridBagLayout());
    pTags.setBackground(Color.ORANGE);
    GridBagConstraints c = new GridBagConstraints();
    c.ipadx = 5;
    c.ipady = 5;

    int rowIndex = 0;
    for (int i = 0; i < NB_TAGS; i++) {
        //add tag name
        JLabel lTagName = new JLabel(String.format("Tag %s:", i));
        lTagName.setFont(lTagName.getFont().deriveFont(Font.BOLD));
        c.fill = GridBagConstraints.NONE;
        c.gridx = 0;
        c.gridy = rowIndex++;
        pTags.add(lTagName, c);

        //add tag values
        JPanel pTag = new JPanel(new BorderLayout());
        pTag.add(new JLabel("+"), BorderLayout.LINE_START); //label used to add new tags
        pTag.add(getWrapPanel(), BorderLayout.CENTER); //the list of tag values
        c.fill = GridBagConstraints.HORIZONTAL;
        c.gridx = 1;
        pTags.add(pTag, c);
    }

    //JScrollPane sp = new JScrollPane(pTags);
    //sp.setBorder(BorderFactory.createEmptyBorder());

    add(pTags);
    }

private static JPanel getWrapPanel() {
   JPanel p = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));

   for (int i = 0; i < 50; i++) {
           p.add(new JLabel("t" + i));
   }
   return p;
}

public static void main(String[] args) {
    JFrame f = new JFrame();
    f.getContentPane().add(new GridBagLayoutTagPanel());
    f.setSize(new Dimension(500, 300));
    f.setVisible(true);
}
}
