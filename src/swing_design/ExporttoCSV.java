package swing_design;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

public class ExporttoCSV {
	static JTable doc = null;
	public static void main(String[] args) {
		String[][] data = {
			{ "Housewares", "$1275.00" },
			{ "Pets", "$125.00" },
			{ "Electronics", "$2533.00" },
			{ "Menswear", "$497.00" }

		};
		String[] headers = { "Department", "Daily Revenue" };
		
		final JFrame frame = new JFrame("JTable to Excel Hack");
		DefaultTableModel model = new DefaultTableModel(data,headers);
		final JTable table = new JTable(model);
		
		final JScrollPane scroll = new JScrollPane(table);
		//final JPanel scroll = new JPanel();
		scroll.add(table);
		final JPanel contentpanel = new JPanel(new BorderLayout());

		JButton export = new JButton("Show table");
		try{
		File file = new File("LEI Test - 2.xml");
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
//		doc = db.parse(file);
		}
		catch(Exception e){
			
		}
		
		export.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				
				JButton btn1 = new JButton();
				btn1.setBorder(BorderFactory.createEmptyBorder(3, 3, 3, 3));
				Icon imgicon = new ImageIcon("11_cyrcle_one_24.gif");
				//JLabel btn1 = new JLabel("mylabel",imgicon,JLabel.CENTER);
				btn1.setIcon(imgicon);
			
				contentpanel.add(btn1,BorderLayout.CENTER);
				frame.add(contentpanel,BorderLayout.CENTER);
				frame.setVisible(true);
	/*try {                
			Exporter exp = new Exporter(); 
			exp.exportTable(doc, new File("results.txt"));
		} catch (IOException ex) {
			System.out.println(ex.getMessage());
			ex.printStackTrace();

		}*/
			}
		});
		frame.add(export,BorderLayout.NORTH);
//		frame.add(contentpanel,BorderLayout.NORTH);
		frame.pack();
		frame.setSize(400,400);
		frame.setVisible(true);
//		frame.getContentPane().add("North",scroll);
//		frame.getContentPane().add("Center",contentpanel);
//		frame.getContentPane().add("South",export);
		
	}

}
