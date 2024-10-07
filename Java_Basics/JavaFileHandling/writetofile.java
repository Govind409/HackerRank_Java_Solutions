package Java_Basics.JavaFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class writetofile {
    public static void main(String[] args) {
        String[] lines = {
                "This is the first line.",
                "This is the second line.",
                "This is the third line.",
                "And this is the fourth line."
        };
        @SuppressWarnings("unused")
        File file = new File(
                "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt");
        try (
                // writing text into a file
                FileWriter mywriter = new FileWriter(
                        "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt")) {
            for (String line : lines) {
                mywriter.write(line + "\n"); // Write each line to the file
            }
            mywriter.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }

}
