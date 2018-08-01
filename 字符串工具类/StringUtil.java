package io.github.cr9c._04_char_sequence;

public class StringUtil {
	
	private StringUtil() {}
	
	public static boolean hasLength(String str) {
		return str != null && !"".equals(str.trim());
	}
	
	public static boolean isBlank(String str) {
		return !hasLength(str);
	}

}
