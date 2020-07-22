package com.charter.xstoresupport.DateUtilities;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils 
{
	public static String getFormattedString(Date pDate) {
		String returnVal = "";

		if (pDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("MM/dd/yyyy");
			returnVal = formatter.format(pDate);
		}
		return returnVal;

	}

	public static String getTodaysDateAndTime() 
	{
	   	//Displaying current date and time in 12 hour format with AM/PM
    	DateFormat dateFormat2 = new SimpleDateFormat("dd/MM/yyyy hh.mm aa");    
		
		return dateFormat2.format(new Date()).toString();
	}
	
	public static String getyyyymmddFormattedString(Date pDate) {
		String returnVal = "";

		if (pDate != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
			returnVal = formatter.format(pDate);
		}
		return returnVal;

	}

	public static String getTodayAsString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
		return dateFormat.format(new Date());

	}

	public static Date getFormattedDate(String pString) {
		Date returnVal = null;

		if (pString != null) {
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

			try {
				returnVal = formatter.parse(pString);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return returnVal;
	}
}
