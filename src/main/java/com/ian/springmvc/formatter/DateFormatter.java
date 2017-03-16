package com.ian.springmvc.formatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.format.Formatter;

public class DateFormatter implements Formatter<Date>{

	private String datePattern;
	private SimpleDateFormat dateFormat;
	
	public DateFormatter(String datePattern){
		this.setDatePattern(datePattern);
		this.dateFormat = new SimpleDateFormat(datePattern);
	}
	
	public String print(Date date, Locale paramLocale) {
		return dateFormat.format(date);
	}

	public Date parse(String paramString, Locale paramLocale) throws ParseException {
		try {
			return dateFormat.parse(paramString);
		} catch (Exception e) {
			e.printStackTrace();
			throw new IllegalArgumentException();
		}		
	}

	public String getDatePattern() {
		return datePattern;
	}

	public void setDatePattern(String datePattern) {
		this.datePattern = datePattern;
	}
}
