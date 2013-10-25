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

    private ArrayList<String> fileLines;

    public RegexLab() {
        fileLines = new ArrayList<String>();
    }

    /**
     * Starting point of the regexlab application loads in a file
     * then prints out all of the urls contained in the document.
     */
    public void begin() {
        loadFile("/home/jjensen/Projects/Java/jjensen_regex/src/Fish.html");
        printAllUrls();

    }

    /**
     * Prints out all the Urls it found in the collection
     *
     */
    private void printAllUrls() {
        for(String fileLine : fileLines) {
            UrlParsing.printUrls(fileLine);
        }
    }

    /**
     * Loads the contents of a file line by line into a collection
     * to be worked with later on.
     * @param filePath
     */
    private void loadFile(String filePath) {
        try(BufferedReader fileReader = new BufferedReader(new FileReader(new File(filePath)))) {

            // Read the file when its ready to be read
            // And add the lines to the collection of strings
            while(fileReader.ready()) {
                fileLines.add(fileReader.readLine());

            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();

        } catch (IOException e) {
            e.printStackTrace();

        }

    }



}
