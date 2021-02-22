package eip.integrations.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.OffsetDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.stream.Collectors;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class TypeUtil {
	public static int stringToInt(String input) {
		if (input != null) {
			int i = Integer.parseInt(input);
			return i;
		} else
			return 0;
	}

	public static Date stringToDate(String input) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Date date = formatter.parse(input);
		return date;
	}

	public static Date stringToDate2(String input) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		Date date = formatter.parse(input);
		return date;
	}

	public static Date stringToDate1(String input) throws ParseException {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		Date date = formatter.parse(input);
		return date;
	}

	public static String getCurrentDateTimeMS() {
		Date dNow = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmssMs");
		String datetime = ft.format(dNow);
		return datetime;
	}

	public static long getCurrentDateTimeMSInLong() {
		Date dNow = new Date();
		long datetime = dNow.toInstant().toEpochMilli();
		return datetime;
	}

	public static String datetoString(Date date) {
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String stringDate = formatter.format(date);

		return stringDate;
	}

	public static String longToString(Long input) {
		String data = null;
		if (input != null)
			data = String.valueOf(input);
		return data;
	}

	public static String bigIntToString(BigInteger input) {
		String data = "";
		if (input != null)
			data = input.toString();

		return data;
	}

	public static String bigDecimalToString(BigDecimal input) {
		if (input != null) {
			String data = input.toString();
			return data;
		} else
			return "";

	}

	public static Long intoLong(Integer input) {
		if (input != null) {
			Long l2 = Long.valueOf(input);
			return l2;
		} else
			return 0L;

	}

	public static String stringToStringWithDate(String input) {
		DateTimeFormatter convertFormatter = new DateTimeFormatterBuilder()
				.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+04:00")
				.optionalEnd().optionalStart().appendOffset("+HHMM", "0000").optionalEnd().toFormatter();

		OffsetDateTime dt = OffsetDateTime.parse(input, convertFormatter);
		long ldt = dt.toInstant().toEpochMilli();
		Date date = new Date(ldt);

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String dateString = simpleDateFormat1.format(date);
		return dateString;
	}

	public static String stringToStringWithDate1(String input) {
		DateTimeFormatter convertFormatter = new DateTimeFormatterBuilder()
				.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+04:00")
				.optionalEnd().optionalStart().appendOffset("+HHMM", "0000").optionalEnd().toFormatter();

		OffsetDateTime dt = OffsetDateTime.parse(input, convertFormatter);
		long ldt = dt.toInstant().toEpochMilli();
		Date date = new Date(ldt);

		SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		String dateString = simpleDateFormat1.format(date);
		return dateString;
	}

	@SuppressWarnings("deprecation")
	public static long DateToDays() throws ParseException {
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
		timestamp.getDate();
		Date date = new Date();
		Calendar calender = Calendar.getInstance();
		calender.setTime(date);
		long year = calender.get(Calendar.YEAR);
		long month = calender.get(Calendar.MONTH) + 1l;
		long day = calender.get(Calendar.DAY_OF_MONTH);
		long calDate = year * 100 + month;
		calDate = calDate * 100 + day;
		return calDate;
	}

	public static String getTimeDate() {
		Date date = new Date();
		SimpleDateFormat sdDormat = new SimpleDateFormat("yyyyMMddHHmmss");
		String batchIdData = sdDormat.format(date);
		return batchIdData;
	}

	public static XMLGregorianCalendar datetoXMLGregorianCalendar(Date input) throws DatatypeConfigurationException {

		GregorianCalendar cal = new GregorianCalendar();
		cal.setTime(input);

		XMLGregorianCalendar xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);

		return xmlGregCal;
	}

	public static java.sql.Date utilDateToSqlDate(Date input) {
		java.sql.Date date = null;
		if (input != null)
			date = new java.sql.Date(input.getTime());

		return date;
	}

	public static java.sql.Date stringToSqlDate(String input) throws ParseException {
		java.sql.Date date = null;
		if (input != null) {
			DateTimeFormatter convertFormatter = new DateTimeFormatterBuilder()
					.append(DateTimeFormatter.ISO_LOCAL_DATE_TIME).optionalStart().appendOffset("+HH:MM", "+00:00")
					.optionalEnd().optionalStart().appendOffset("+HHMM", "0000").optionalEnd().toFormatter();

			OffsetDateTime dt1 = OffsetDateTime.parse(input, convertFormatter);
			long ldt = dt1.toInstant().toEpochMilli();
			Date date1 = new Date(ldt);

			SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
			String dateString = simpleDateFormat1.format(date1);
			java.util.Date dt = simpleDateFormat1.parse(dateString);
			date = new java.sql.Date(dt.getTime());
		}

		return date;
	}

	public static Date stringDateToDate(String string) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date dt = dateFormat.parse(string);
		return dt;
	}
	
	public static String stringDatetoString(String date) throws ParseException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
		SimpleDateFormat fromDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'");
		String stringDate = dateFormat.format(fromDateFormat.parse(date));
		return stringDate;
	}

	public static <T> List<T> convertArrayToList(T array[]) {
		return Arrays.stream(array).collect(Collectors.toList());
	}
	
	public static String stringToDate3(String input) throws ParseException {
		SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
	    SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd");
		String stringDate = sdf2.format(sdf1.parse(input));
		return stringDate;
	}

	public static Date localDateToString(LocalDateTime input) throws ParseException {
		Instant instant = input.toInstant(ZoneOffset.UTC);
		Date date = Date.from(instant);
		return date;
	}
}
