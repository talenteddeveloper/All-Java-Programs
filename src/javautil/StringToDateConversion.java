package javautil;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class StringToDateConversion {

	public static void main(String[] args) throws ParseException {
		String dateInString="28-Jan-2023";
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MMM-yyyy");
		Date date= formatter.parse(dateInString);
		System.out.println(date);
		System.out.println(formatter.format(date));
		
		Date date2= new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH).parse(dateInString);
		System.out.println(date2);
		
		System.out.println("---");
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MMM-yyyy", Locale.ENGLISH);
		LocalDate localDate=LocalDate.parse(dateInString, dateTimeFormatter);
		System.out.println(localDate);
		System.out.println(localDate.getYear());
		System.out.println(localDate.getMonthValue());
	}

}
