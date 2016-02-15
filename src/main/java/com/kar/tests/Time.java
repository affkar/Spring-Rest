package com.kar.tests;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Time {
	
	private Calendar cal=new GregorianCalendar();
	public Time(Date date){
		cal.setTime(date);
	}
	public Calendar getCal() {
		return cal;
	}
	public void setCal(Calendar cal) {
		this.cal = cal;
	}
	
	
	
}
