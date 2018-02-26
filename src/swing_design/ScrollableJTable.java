package swing_design;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

public class ScrollableJTable{
  public static void main(String[] args) {
  new ScrollableJTable();
  }
  public ScrollableJTable(){
  JFrame frame = new JFrame("Creating a Scrollable JTable!");
  JPanel panel = new JPanel();
  String data[][] = {{"001","vinod","Bihar","India","Biology","65","First"},
   {"002","kudos knowledge service prv lmt","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"},
   {"001","vinod","Bihar","India","Biology","65","First"},
   {"002","Raju","ABC","Kanada","Geography","58","second"},
   {"003","Aman","Delhi","India","computer","98","Dictontion"},
   {"004","Ranjan","Bangloor","India","chemestry","90","Dictontion"}};
  String col[] = {"Roll","Name","State","country","Math","Marks","Grade"};
  JTable table = new JTable(data,col);
//  table.getColumnModel().getColumn(1).setPreferredWidth(100);
  TableColumnModel columnModel = table.getColumnModel();
  TableModel row = table.getModel();
  //TableModel rowcount = table.

for(int i= 0; i<col.length; i++){
	columnModel.getColumn(i).setPreferredWidth(col[i].length() * 10);
//	System.out.println("Header Length at"+i+":"+col[i].length() * 10);
}
for(int k= 0; k<row.getRowCount(); k++){
	for(int j=0; j<row.getColumnCount(); j++){
		String str = (String) row.getValueAt(k, j);
//		System.out.println("row length at"+k+","+j+":-"+str.length());
		if((col[j].length())<=str.length()){
			columnModel.getColumn(j).setPreferredWidth(str.length()*20);
			//columnModel.
			System.out.println("value at"+k+","+j+":"+columnModel.getColumn(j).getHeaderValue());
			//columnModel.getColumn(k).setPreferredWidth(str.length() * 10);
		}
	}
}

//adding a bit of extra space between the columns.
columnModel.setColumnMargin( 5 );

  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
  table.setAutoscrolls(true);
  JTableHeader header = table.getTableHeader();
  header.setBackground(Color.yellow);
  JScrollPane pane = new JScrollPane(table);
  table.setCellSelectionEnabled(true);
//  table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
  panel.add(pane);
  frame.add(pane);
  frame.setSize(500,150);
  frame.setUndecorated(true);
  frame.getRootPane().setWindowDecorationStyle(JRootPane.PLAIN_DIALOG);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.setVisible(true);
  }
}