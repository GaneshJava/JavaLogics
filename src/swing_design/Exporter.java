package swing_design;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JTable;
import javax.swing.table.TableModel;

import org.w3c.dom.Document;

public class Exporter {
//		public Exporter() { }
		public static void main(String args[]) throws IOException {
			JTable  doc = null;
			File file = null;
//			file = new File("D:/example.txt");
			TableModel model = (TableModel) doc.getColumnModel();
			FileWriter out = new FileWriter(file);
			
			for(int i=0; i < model.getColumnCount(); i++) {
		out.write(model.getColumnName(i)+ "|");
			}
//			out.write("\n");

			for(int i=0; i< model.getRowCount(); i++) {
		for(int j=0; j < model.getColumnCount(); j++) {
			out.write(model.getValueAt(i,j).toString()+"|");
			}
//			out.write("\n");
		}

		out.close();
		System.out.println("write out to: " + file);
	}
}
