package regex;





import java.util.regex.*;

public class MatchAlphaNumOnly {
	public static void main(String[] args) {
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "fh8h38"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "fh8h38d"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "fh8h3!"));
	System.out.println(Pattern.matches("[a-zA-Z0-9]{6}", "fh8H38"));
	

}
}