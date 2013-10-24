package edu.neumont.jjensen.labs.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: jjensen
 * Date: 10/23/13
 * Time: 8:27 AM
 */
public class UrlParsing {

    public static void printUrls(String text) {
        Pattern urlPattern = Pattern.compile("(\")(https?://)+([da-z.-]+).([a-z.]{2,6})([/a-zA-Z/?.-]*)*(\")");
        Matcher matcher = urlPattern.matcher(text);

        while(matcher.find()) {
            System.out.print(matcher.group());

        }

        System.out.println("Not in loop");


    }

}
