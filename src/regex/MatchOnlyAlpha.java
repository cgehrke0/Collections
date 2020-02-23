package regex;

import java.util.regex.Pattern;

public class MatchOnlyAlpha {
	
	public static void main(String[] args) {
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Waluigii"));
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Waluig1s"));
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Waluigisd"));
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Baluigii"));
		System.out.println(Pattern.matches("[W][a-zA-Z]{7}", "Waaaaaai"));
	}

}
