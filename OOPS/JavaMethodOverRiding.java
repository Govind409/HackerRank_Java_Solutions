package OOPS;

import java.util.Scanner;

public class JavaMethodOverRiding {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Sports sport = new Sports();
        Soccer soc = new Soccer();
        String a = sport.getname();
        System.out.println(a);
        sport.getNumberOfTeamMembers();
        String b = soc.getname();
        System.out.println(b);
        soc.getNumberOfTeamMembers(n);
    }

}

class Sports {
    String getname() {
        return "Generic Sports";
    }

    void getNumberOfTeamMembers() {
        System.out.println("Each team has n players in " + getname());
    }
}

class Soccer extends Sports {

    String getname() {
        return "Soccer Class";
    }

    void getNumberOfTeamMembers(int n) {
        System.out.println("Each team has " + n + " players in " + getname());
    }

}