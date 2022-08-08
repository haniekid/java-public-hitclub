package buoi4;

import java.util.Scanner;

public class Date {
    private int day;
    private int month;
    private int year;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("DAY: ");
        day = sc.nextInt();
        System.out.println("MONTH: ");
        month = sc.nextInt();
        System.out.println("YEAR: ");
        year = sc.nextInt();
    }

    public void output(){
        System.out.println(day + "/" + month + "/" + year);
    }
}
