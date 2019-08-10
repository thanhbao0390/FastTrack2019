package sts.com.vn.util;

public class ConvertUtil {

	public static int getLengthType(String str) {
		int rs = 0;

		int indexS = str.indexOf("(");
		int indexE = str.indexOf(",") > 0 ? str.indexOf(",") : str.indexOf(")");
		if (indexS > 0 && indexE > 0) {
			// System.out.println(str.substring(indexS + 1, indexE));
			rs = Integer.valueOf(str.substring(indexS + 1, indexE));
		}
		return rs;
	}

	public static String getType(String s) {
		String result = "NotDefine"; // default varChar

		int len = getLengthType(s);
		// BIT
		if (s.toUpperCase().contains("BIT")) {
			result = "byte[]";
		}
		// TINYINT
		if (s.toUpperCase().contains("TINYINT")) {
			if (len > 1)
				result = "Integer";
			else
				result = "Boolean";
		}
		// BOOL, BOOLEAN
		if (s.toUpperCase().contains("BOOL") || s.toUpperCase().contains("BOOLEAN")) {
			result = "Boolean";
		}
		// SMALLINT, MEDIUMINT
		if (s.toUpperCase().contains("SMALLINT") || s.toUpperCase().contains("MEDIUMINT")) {
			result = "Integer";
		}
		// INT, INTEGER
		if (s.toUpperCase().contains("INT") || s.toUpperCase().contains("INTEGER")) {
			result = "Integer";
		}
		// BIGINT
		if (s.toUpperCase().contains("BIGINT")) {
			result = "Long";
		}

		// FLOAT
		if (s.toUpperCase().contains("FLOAT")) {
			result = "Float ";
		}

		// DOUBLE
		if (s.toUpperCase().contains("DOUBLE")) {
			result = "Double";
		}

		// DECIMAL
		if (s.toUpperCase().contains("DECIMAL")) {
			result = "BigDecimal";
		}

		// DATE
		if (s.toUpperCase().contains("DATE")) {
			result = "Date";
		}

		// TIME
		if (s.toUpperCase().contains("TIME")) {
			result = "Time";
		}

		// DATETIME, TIMESTAMP
		if (s.toUpperCase().contains("DATETIME") || s.toUpperCase().contains("TIMESTAMP")) {
			result = "Timestamp";
		}

		// CHAR, VARCHAR, TINYTEXT, TEXT, MEDIUMTEXT, LONGTEXT
		if (s.toUpperCase().contains("CHAR") || s.toUpperCase().contains("VARCHAR")
				|| s.toUpperCase().contains("TINYTEXT") || s.toUpperCase().contains("TEXT")
				|| s.toUpperCase().contains("MEDIUMTEXT") || s.toUpperCase().contains("LONGTEXT")) {
			result = "String";
		}

		// BINARY, VARBINARY, TINYBLOB, BLOB, MEDIUMBLOB, LONGBLOB
		if (s.toUpperCase().contains("BINARY") || s.toUpperCase().contains("VARBINARY")
				|| s.toUpperCase().contains("TINYBLOB") || s.toUpperCase().contains("BLOB")
				|| s.toUpperCase().contains("MEDIUMBLOB") || s.toUpperCase().contains("LONGBLOB")) {
			result = "byte[]";
		}

		// System.out.println(COLUMN_TYPE);
		return result;
	}

	public static String convertClassName(String str) {

		str = str.toLowerCase();
		str = convertCamelCase(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return str;
	}

	public static String convertPropertiesName(String str) {
		str = convertCamelCase(str);
		str = str.substring(0, 1).toLowerCase() + str.substring(1);
		return str;
	}

	public static String convertSetMethod(String str) {
		str = convertCamelCase(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return "set" + str;
	}

	public static String convertGetMethod(String str) {
		str = convertCamelCase(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
		return "get" + str;
	}

	public static String convertCamelCase(String s) {
		StringBuffer result = new StringBuffer();
		String replace = "-_";

		boolean covertToLowerCase = false;
		for (char c : replace.toCharArray()) {
			if (s.contains(String.valueOf(c)))
				covertToLowerCase = true;
		}
		if (covertToLowerCase)
			s = s.toLowerCase();

		boolean toUpperCase = false;
		if (s != null) {
			for (char c : s.toCharArray()) {

				if (replace.contains(String.valueOf(c))) {
					toUpperCase = true;
				} else {
					result.append(toUpperCase ? String.valueOf(c).toUpperCase() : String.valueOf(c));
					toUpperCase = false;
				}
			}

		}

		return result.toString();
	}
}
