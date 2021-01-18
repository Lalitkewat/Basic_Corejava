package basic;

/**
 * @author Write a program to replace one character to another character.
 *
 */
public class Replace {
	 public static void main(String[] args) {
		String s="Amitabh Bachchan";
		System.out.println("a is replaced by b="+s.replace("a","b"));
		System.out.println("all a is replaced by b="+s.replaceAll("a", "b"));
		
	}

}
