package com.rds.individeo.common;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CommonUtils {

	public static boolean isNotEmpty(String str) {
		return str != null && !str.isEmpty();
	}

	public static Date stringToDate(String strdate, String format) {
		if (isNotEmpty(strdate) && isNotEmpty(format)) {
			try {
				SimpleDateFormat sdf = new SimpleDateFormat(format);
				return sdf.parse(strdate);
			} catch (ParseException e) {
				e.printStackTrace();
			}
		}

		return null;
	}

}
