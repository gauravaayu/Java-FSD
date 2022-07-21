package PracticeProject6;
import java.util.regex.Pattern;

public class RegularExpressionExample {

	public static void main(String[] args) {
		// Following line prints "true" because the whole
        // text "hiiiamgaurav" matches pattern
        // "hiiiamggaurav"
        System.out.println(Pattern.matches(
            "hiiiamgaurav", "hiiiamgaurav"));
 
        // Following line prints "false" because the whole
        // text "hiiiamgau" doesn't match pattern "hiiiamgau,,rav"
        System.out.println(
            Pattern.matches("hiiiamgau,,rav", "hiiiamgau"));

	}

}
