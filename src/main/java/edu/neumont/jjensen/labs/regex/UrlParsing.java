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
        Pattern urlPattern = Pattern.compile("(https?://)(www.)?([\\da-zA-Z.-]+).([a-z]{2,6})(/[/\\da-zA-Z?.-]*)");
        Matcher matcher = urlPattern.matcher(text);

        //Find all the matches and print them out.
        while(matcher.find()) {
            System.out.println(matcher.group());

        }

    }

}
