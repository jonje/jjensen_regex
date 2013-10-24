package edu.neumont.jjensen.labs.regex;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: jjensen
 * Date: 10/24/13
 * Time: 7:49 AM
 */
public class RegexLab {

    private ArrayList<String> lines = new ArrayList<String>();
    public void begin() {
       /* try(BufferedReader fileReader = new BufferedReader(new FileReader(new File("/home/jjensen/Projects/Java/jjensen_regex/src/Fish.html")))) {
            String line = "";

            while(fileReader.ready()) {
                line = fileReader.readLine();
                UrlParsing.printUrls(line);
                System.out.println("Still Running");
                System.out.println(fileReader.ready());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }*/

        try {
            BufferedReader fileReader = new BufferedReader(new FileReader(new File("/home/jjensen/Projects/Java/jjensen_regex/src/Fish.html")));

            while(fileReader.ready()) {
                lines.add(fileReader.readLine());
            }
            int numLoops = 0;
            for(String line : lines) {
                System.out.println(numLoops++);
                printUrls(line);
                //System.out.println(line);
            }
        } catch (FileNotFoundException io) {
            io.printStackTrace();
        } catch(IOException io) {
            io.printStackTrace();
        }



    }

    public void printUrls(String text) {
        Pattern urlPattern = Pattern.compile("(\")(https?://)+([da-z.-]+).([a-z.]{2,6})([/a-zA-Z/?.-]*)*(\")");


        Matcher matcher = urlPattern.matcher(text);

        if(matcher.find()) {
            System.out.println(matcher.group());
        }




    }

}
