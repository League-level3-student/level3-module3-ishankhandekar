package _01_StringBuilder;


public class _03_StringBuilder {
    
    public static String append(String str, char[] characters) {
    	StringBuilder s = new StringBuilder(str);
    	
        return s.append(characters).toString();
    }
    
    public static String reverse(String str) {
    	StringBuilder s = new StringBuilder(str);
        return s.reverse().toString();
    }
    
    public static String insert(String str, int index, char newChar) {
    	StringBuilder s = new StringBuilder(str);
        return s.insert(index, newChar).toString();
    }
    
    public static String delete(String str, int startIndex, int endIndex) {
    	StringBuilder s = new StringBuilder(str);
        return s.delete(startIndex, endIndex).toString();
    }
}