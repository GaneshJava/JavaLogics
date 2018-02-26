package swings;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import com.mm.exp.clock.TimePicker;
import com.mm.exp.clock.ClockView.TimeListener;

public class WorldClock {
	static JTextField tf2 = new JTextField(15);
	static TimePicker tp = new TimePicker();
	static TimePicker tp2 = new TimePicker();
	static Date date = new Date();
	static JComboBox combo = new JComboBox();
	public static void main(String[] args) {
		JFrame frame = new JFrame("Time Zone");
//		JPanel panel1 = new JPanel(new GridLayout(1,4));
		JPanel panel1 = new JPanel();
		JPanel mainPanel = new JPanel();

		JLabel timeLbl= new JLabel("Convert time:");
		Object[] items = {"IN-US","US-IN"};
		combo = new JComboBox(items);

		String formatPattern ="dd-MM-yyyy  hh:mm:ss a";
		TimeZone T1 = TimeZone.getTimeZone("GMT+5:30");// UTC+5:30	IST
		SimpleDateFormat sdf = new SimpleDateFormat(formatPattern);
		sdf.setTimeZone(T1);
		System.out.println("current india time:- "+sdf.format(date));

		TimeZone T2 = TimeZone.getTimeZone("GMT-5:00");//UTC-5:00	EST
		SimpleDateFormat sdf2 = new SimpleDateFormat(formatPattern);
		sdf2.setTimeZone(T2);
		System.out.println("current us time:- "+sdf2.format(date));

		
		tp.getTimeModel().setTime(date, T1);
		tp2.getTimeModel().setTime(date, T2);
		tf2.setEditable(false);
		tf2.setText(sdf2.format(date));
		
		panel1.add(timeLbl);
		panel1.add(combo);
		panel1.add(tp);
		panel1.add(tf2);

		//panel2.add(tf2);

		mainPanel.add(panel1);
		//mainPanel.add(panel2);
		frame.add(mainPanel);
		frame.setVisible(true);
		frame.setBounds(300, 100, 550, 100);
		frame.setSize(550,100);
		
		combo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("in combo ActionListener");
				getIndiaToUSTime();
				
			}
		});
			

		tp.addTimeListener(new TimeListener() {
			@Override
			public void timeChanged(Integer arg0, Integer arg1, Integer arg2) {
				System.out.println("in TimeListener");
				getIndiaToUSTime();
			}
		});
		
	}

	public static void getIndiaToUSTime(){
		int hh = tp.getTimeModel().getHourOfDay();
		int mm = tp.getTimeModel().getMinute();
		int ss = tp.getTimeModel().getSecond();
		
		Calendar entryTime = Calendar.getInstance();
		entryTime.set(Calendar.HOUR, hh);
		entryTime.set(Calendar.MINUTE, mm);
		entryTime.set(Calendar.SECOND, ss);
		String timeZone="";
		String cuntry = "";
		if(combo.getSelectedItem().equals("IN-US")){
			cuntry="US";
			timeZone="GMT-5:00";
		}
		else if(combo.getSelectedItem().equals("US-IN")){
			cuntry="INDIA";
			timeZone="GMT+16:00";
		}
		Calendar DisplayTime = new GregorianCalendar(TimeZone.getTimeZone(timeZone));
		long millis= entryTime.getTimeInMillis();
		DisplayTime.setTimeInMillis(millis);
		int dd = DisplayTime.get(Calendar.DAY_OF_MONTH);
		int mn = DisplayTime.get(Calendar.MONTH)+1;
		int yy = DisplayTime.get(Calendar.YEAR);
		
		int hour = DisplayTime.get(Calendar.HOUR);
		int minute = DisplayTime.get(Calendar.MINUTE);
		int second = DisplayTime.get(Calendar.SECOND);
		int am_pm = DisplayTime.get(Calendar.AM_PM);
		String AM_PM="";
		if(am_pm==1){
			AM_PM="AM";
		}else
			AM_PM="PM";
		String displayTimeStr = dd+"-"+mn+"-"+yy+"  "+hour+":"+minute+":"+second+" "+AM_PM;
		tf2.setText(displayTimeStr);
		System.out.printf(cuntry+" time : "+displayTimeStr);
	}
	
}
