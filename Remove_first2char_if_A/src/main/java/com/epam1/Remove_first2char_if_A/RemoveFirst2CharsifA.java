package com.epam1.Remove_first2char_if_A;

public class RemoveFirst2CharsifA {

	public static String remove(String string) {
		int stringLength = string.length();
		String res = "";
		if(stringLength == 0) {
			res = "";
		} else if(stringLength == 1) {
			if(string.charAt(0) != 'A') {
				res = res + string.charAt(0);
			}
		} else {

			if(string.charAt(0) != 'A') {
				res = res + string.charAt(0);
			} if(string.charAt(1) != 'A') {
				res = res + string.charAt(1);
			}
			if(stringLength > 2) {
				res = res + string.substring(2);
			}
		}
		return res;
	}
}
