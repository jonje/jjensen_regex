package edu.neumont.jjensen.labs.regex;

import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;


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
            fileReader.close();

        } catch (FileNotFoundException fileNotFoundException) {
            fileNotFoundException.printStackTrace();

        } catch(IOException ioException) {
            ioException.printStackTrace();
        }

        /*for(String line : lines) {

            UrlParsing.printUrls(line);
            System.out.println(line);
        } */

        Iterator<String> stringIterator = lines.iterator();

        while(stringIterator.hasNext()) {
            String line = stringIterator.next();
            UrlParsing.printUrls(line);
        }



    }



}
