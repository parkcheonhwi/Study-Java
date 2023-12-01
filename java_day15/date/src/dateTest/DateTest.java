package dateTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String[] args) {
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� a hh�� mm�� ss�� E����")));
		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd�� HH�� mm�� ss��")));
		
//		LocalDate now = LocalDate.now();
//		System.out.println(now);
//		
//		System.out.println(now.format(DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
//		System.out.println(LocalDate.parse("1900�� 12�� 04��", DateTimeFormatter.ofPattern("yyyy�� MM�� dd��")));
		
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
//		Calendar calendar = Calendar.getInstance();
//		System.out.println(calendar);
//		
//		System.out.println(simpleDateFormat.format(calendar.getTime()));
//		try {
//			System.out.println(simpleDateFormat.parse("2020/12/04"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
		
//		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
//		Date date = new Date();
//		System.out.println(date);
//		System.out.println(simpleDateFormat.format(date));
//		try {
//			System.out.println(simpleDateFormat.parse("1900�� 12�� 04��"));
//		} catch (ParseException e) {
//			e.printStackTrace();
//		}
	}
}
