package Java_Basics;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyFormatter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat US_formatter = NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        NumberFormat c = NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat f = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String us = US_formatter.format(payment);
        String india = indiaFormat.format(payment);
        String china = c.format(payment);
        String france = f.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

    }

}
