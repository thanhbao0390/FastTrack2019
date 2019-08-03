package sts.com.vn.util;

public class ConvertUtil {

	public static String convertClassName(String str) {

		str = convertCamelCase(str);
		str = str.substring(0, 1).toUpperCase() + str.substring(1);
//
//		int index = str.indexOf("_");
//		if (index > 0) {
//			System.out.println(index);
//			str = str.substring(0, index) + str.substring(index + 1, index + 2).toUpperCase()
//					+ str.substring(index + 2);
//			System.out.println(str);
//		}
//
//		index = str.indexOf("-");
//		if (index > 0) {
//			System.out.println(index);
//			str = str.substring(0, index) + str.substring(index + 1, index + 2).toUpperCase()
//					+ str.substring(index + 2);
//			System.out.println(str);
//		}
//
		return str;
	}

	public static String convertCamelCase(String s) {
		StringBuffer result = new StringBuffer();
		String replace = "-_";
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
