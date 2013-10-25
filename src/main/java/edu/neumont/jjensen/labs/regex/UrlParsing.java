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

    /**
     * Takes in a string then and determines if it meets the
     * criteria of a url.  If it meets this criteria it will
     * display the url to the console.
     * @param text
     */
    public static void printUrls(String text) {
        //Compile the pattern
        Pattern urlPattern = Pattern.compile("(\")(?<url>(https?://)(?<domain>(www.)?([\\da-zA-Z.-]+).([a-z]{2,6}))(?<path>(/[/\\da-zA-Z?.-]*)))(\")");
        Matcher matcher = urlPattern.matcher(text);

        //Find all the matches and print them out.
        while(matcher.find()) {
            System.out.println("Url: " + matcher.group("url"));
            System.out.println("Domain: " + matcher.group("domain"));
            System.out.println("Path: " + matcher.group("path") + "\n");

        }

    }

}
