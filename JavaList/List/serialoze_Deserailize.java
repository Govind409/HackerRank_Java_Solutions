package JavaList.List;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class serialoze_Deserailize {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        try {
            // Serialization
            FileOutputStream fos = new FileOutputStream(
                    "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\Java_hackerRank_solutions\\serailize_deserialize.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(al);
            fos.close();
            oos.close();
            // Deserialization
            FileInputStream fis = new FileInputStream(
                    "C:\\Users\\k govind\\OneDrive\\Documents\\SDE1_training\\Java_hackerRank_solutions\\serailize_deserialize.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            ArrayList list = (ArrayList) ois.readObject();
            System.out.println(list);

        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
