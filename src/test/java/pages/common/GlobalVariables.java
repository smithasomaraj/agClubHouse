package pages.common;

import java.util.Map;
import java.util.HashMap;

public class GlobalVariables {
	
	private static Map<String, String> map = new HashMap<String, String>();
	private static Map<String, Object> objectMap = new HashMap<String, Object>();
	
	public static void addGlobalVariable(String key, String value) {
			map.put(key, value);
	}
	
	public static String getGlobalVariable(String key) {
		return map.get(key);
	}

	public static void addGlobalObject(String key, Object value) {
		objectMap.put(key, value);
	}
	
	public static Object getObject(String key) {
		return objectMap.get(key);
	}
}
