package Java_Basics.JavaFileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class JavaFile {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt");

        try {
            // creating new file
            if (file.createNewFile()) {
                System.out.println("created new file " + file.getName());
            } else {
                System.out.println("unable to create new file");
            }
        } catch (IOException e) {
            System.out.println("error occured");
            e.printStackTrace();
        }
        try (
                // writing text into a file
                FileWriter mywriter = new FileWriter(
                        "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt")) {
            mywriter.write("Hello GOvind how r u \n Hi charu i am fine");
            mywriter.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }
}
