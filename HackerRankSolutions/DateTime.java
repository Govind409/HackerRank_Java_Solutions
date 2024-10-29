package HackerRankSolutions;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        int month = scan.nextInt();
        int day = scan.nextInt();
        LocalDate myDate = LocalDate.of(year, month, day);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        String formattedDate = myDate.format(formatter);
        System.out.println(formattedDate);

        DayOfWeek str = myDate.getDayOfWeek();
        System.out.println(str);
    }

}
