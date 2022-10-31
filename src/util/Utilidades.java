package util;

public class Utilidades {
	
	public static String sliceSelectedItem(String sel){
		if(sel.startsWith("(DIR)")){
			return sel.substring(5);
		}else {
			return sel;
		}
	}

}
