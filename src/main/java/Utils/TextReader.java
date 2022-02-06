package Utils;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

/**
 * Found this solution on
 * https://www.java67.com/2016/07/how-to-read-text-file-into-arraylist-in-java.html#:~:text=All%20you%20need%20to%20do,readLine()%3B%20while%20(line%20!
 */
public class TextReader {

    public static List<String> readFileIntoList(String file) {
        List<String> lines = Collections.<String>emptyList();

        try {
            lines = Files.readAllLines(Paths.get(file), StandardCharsets.UTF_8);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return lines;
    }
}
