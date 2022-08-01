import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Regular_expresion2 {
		 
	    public static void main(String args[])
	    {
	 
	        Pattern pattern = Pattern.compile("hello");
	 
	        Matcher m = pattern.matcher("haihello");
	        while (m.find())
	        System.out.println("Pattern found from "
	                               + m.start() + " to "
	                               + (m.end() - 1));
	    }

}

