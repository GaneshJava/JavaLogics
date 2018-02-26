package swing_design;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.GroupLayout.Alignment;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRootPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumnModel;

public class NewLoadingIcon {

	final static JFrame frame = new JFrame("GPC get holdings");
	final static JPanel emptypanel = new JPanel();
	final static JLabel btn1 = new JLabel();
	static JScrollPane pane = new JScrollPane();
	static int i = 0;
	static JTextField pk_txtfld = new JTextField();
	static JTextField pd_txtfld = new JTextField();
	static JTextField date_txtfld = new JTextField();

	public static void main(String args[]) {

		JLabel pk_lbl = new JLabel("Portfolio_Key");
		JLabel pd_lbl = new JLabel("Provider Datasource");
		JLabel date_lbl = new JLabel("As of Date");

		

		JButton submitbtn = new JButton("submit");
		submitbtn.setSize(1, 1);

		final JPanel inputparapanel = new JPanel(new GridLayout(3, 2));
		inputparapanel.add(pk_lbl);
		inputparapanel.add(pk_txtfld);
		inputparapanel.add(pd_lbl);
		inputparapanel.add(pd_txtfld);
		inputparapanel.add(date_lbl);
		inputparapanel.add(date_txtfld);

		final JPanel inputbtnparapanel = new JPanel();
		inputbtnparapanel.add(submitbtn);

		final JPanel borderpanel = new JPanel(new GridLayout(2, 1));
		borderpanel.add(inputparapanel);
		borderpanel.add(inputbtnparapanel);

		emptypanel.setLayout(new FlowLayout(FlowLayout.LEFT));

		emptypanel.setBorder(BorderFactory.createLineBorder(Color.black));
		emptypanel.add(borderpanel);

		frame.add(emptypanel, BorderLayout.NORTH);
		frame.setSize(600, 600);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		submitbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				waitingmethod();
			}
		});

	}

	private static void waitingmethod() {
		System.out.println("in asys thread");
		Runnable task = new Runnable() {
			public void run() {
				loadindWait();
				try {
					displayTable();
				} catch (Exception ex) {
					// handle error which cannot be thrown back
				}
			}
		};
		new Thread(task).start();
	}

	public static void loadindWait() {
		try {
			System.out.println("in loadindWait  method");
			btn1.setHorizontalAlignment(SwingConstants.CENTER);
			btn1.setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
			Icon imgicon = new ImageIcon("src/Images/Icons/ajax-loader(6).gif");
			btn1.setIcon(imgicon);

			frame.remove(pane);
			frame.add(emptypanel, BorderLayout.NORTH);
			frame.add(btn1, BorderLayout.CENTER);
			frame.repaint();

		} catch (Exception e) {

		}
	}

	private static void displayTable() {
		try {
			System.out.println("in displayTable method");
			String str =  pk_txtfld.getText();
			String str1 = pd_txtfld.getText();
			String str2 = date_txtfld.getText();
			
			System.out.println("pk field:"+str);
			System.out.println("pd field:"+str1);
			System.out.println("date field:"+str2);
			
//			Thread.activeCount();
			Thread.sleep(1000);
			JPanel panel = new JPanel();
			String data[][] = {
					{ "", "", "", "", "", "", "", "", "", "", "", "" },
					{ "", "", "", "", "", "", "", "", "", "", "", "" } };
			String col[] = { "PORTFOLIO KEY", "PORTFOLIO PROVIDER CODE",
					"ASSET KEY", "ASSET PROVIDER CODE", "SECURITY NAME",
					"SHARES", "BOOK VALUE", "BOOK VALUE BASE",
					"TRANCTION DATA", "SETTLEMENT DATA", "START DATE",
					"END DATE" };

			JTable table = new JTable(data, col);
			TableColumnModel columnModel = table.getColumnModel();
			for (int i = 0; i < col.length; i++) {
				columnModel.getColumn(i).setPreferredWidth(col[i].length() * 10);
			}
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			table.setAutoscrolls(true);
			JTableHeader header = table.getTableHeader();
			header.setBackground(Color.yellow);
			pane = new JScrollPane(table);
			table.setCellSelectionEnabled(true);
			table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
			panel.add(pane);
			frame.remove(btn1);
			frame.add(emptypanel, BorderLayout.NORTH);
			frame.add(pane, BorderLayout.CENTER);
			frame.repaint();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}
