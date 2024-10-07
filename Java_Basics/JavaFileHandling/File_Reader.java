package Java_Basics.JavaFileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class File_Reader {
    public static void main(String[] args) {
        File file = new File(
                "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt");
        try (

                FileReader myreader = new FileReader(
                        "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\java\\JavaFileHandingFiles\\govind.txt")) {
            BufferedReader br = new BufferedReader(myreader);
            System.out.println(br.readLine());

            br.close();
        } catch (IOException e) {
            System.out.println("An error occured");
            e.printStackTrace();
        }

    }

}
