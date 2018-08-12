package Dates;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BirthdayCalculator implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField text1,text2,text3;
	JButton button;
	int days;
	public static void main(String[] args) {
		BirthdayCalculator calc = new BirthdayCalculator();
		calc.start();
	}
	public void start() {
		frame = new JFrame();
		panel = new JPanel();
		text1 = new JTextField(10);
		//month/day/year 24hourtime
		text1.setText("00/00/00 00 ");
		text2 = new JTextField(10);
		text2.setText("00/00/00 00 ");
		text3 = new JTextField(30);
		button = new JButton("Calculate");
		button.addActionListener(this);
		panel.add(text1);
		panel.add(text2);
		panel.add(button);
		panel.add(text3);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();
		
		}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		//month
		int month1 = Integer.parseInt(text1.getText().substring(0, 2));
		int month2 = Integer.parseInt(text2.getText().substring(0, 2));
		//day
		int day1 = Integer.parseInt(text1.getText().substring(3, 5));
		int day2 = Integer.parseInt(text2.getText().substring(3, 5));
		//year
		int year1 = Integer.parseInt(text1.getText().substring(6, 8));
		int year2 = Integer.parseInt(text2.getText().substring(6, 8));
		int hour1 = Integer.parseInt(text1.getText().substring(9, 11));
		int hour2 = Integer.parseInt(text2.getText().substring(9, 11));
		//System.out.println(month1+" "+month2+" "+day1+" "+day2);
		if(year1<year2) {
			int years = year2 - year1-1;
			int day = 365-dateToInt(month1,day1)+dateToInt(month2,day2);
			days = day+365*years;
			
		}else {
			days = dateToInt(month2,day2)-dateToInt(month1,day1)-1;
		}
		//firstday+days*24+lastday
		int hours = 24-hour1+days*24+hour2;
		text3.setText(days+" days or "+hours+" hours or "+hours*3600+" seconds");
	}
	public int dateToInt(int month, int day) {
		int integer = 0;
		switch(month) {
		case 1:
			integer+=0;
			break;
		case 2:
			integer+=31;
			break;
		case 3:
			integer+=59;
			break;
		case 4:
			integer+=90;
			break;
		case 5:
			integer+=120;
			break;
		case 6:
			integer+=151;
			break;
		case 7:
			integer+=181;
			break;
		case 8:
			integer+=212;
			break;
		case 9:
			integer+=243;
			break;
		case 10:
			integer+=273;
			break;
		case 11:
			integer+=304;
			break;
		case 12:
			integer+=334;
			break;
		}
		integer+=day;
		return integer;
	}
}
