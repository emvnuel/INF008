package prova.q2;

import java.util.List;

public class StringUtil {

	public static String formatString(List<String> strings) {
		String result = "";
		for (String string : strings) {
			result += string;
		}
		return result; 
	}
}
