import java.util.regex.*;
public class Regular_Expression1 {
	public static void main(String[] args) {

		String pattern = "[A-Z]+";
		String check = "hai ALL";
		Pattern p = Pattern.compile(pattern);
		Matcher c = p.matcher(check);
		while (c.find())
	      	System.out.println( check.substring( c.start(), c.end() ) );
		}

}
