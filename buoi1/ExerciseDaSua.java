package buoi1;

import java.util.Scanner;

public class ExerciseDaSua {
    static Scanner sc = new Scanner(System.in);

    static boolean check(int day, int month, int year) {
        if (day < 1 || day > 31)
            return false;
        else if (month < 1 || month > 12)
            return false;
        else if (month == 2) {
            if ((year % 400 == 0) ||(year % 4 == 0 && year % 100 != 0)) {
                if(day > 29) return false;
            } else {
                if (day > 28) return false;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            if (day > 30) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int day, month, year;
        do {
            System.out.println("Day / Month / Year: ");
            day = sc.nextInt();
            month = sc.nextInt();
            year = sc.nextInt();
        } while (!check(day, month, year));

        if ((month == 1 && day >= 20) || (month == 2 && day < 19)) {
            System.out.println("Bao Binh");
        } else if ((month == 1 && day < 20) || (month == 12 && day >= 22)) {
            System.out.println("Ma Ket");
        } else if ((month == 2 && day >= 19) || (month == 3 & day < 21)) {
            System.out.println("Song Ngu");
        } else if ((month == 3 && day >= 21) || (month == 4 && day < 21)) {
            System.out.println("Bach Duong");
        } else if ((month == 4 && day >= 21) || (month == 5 && day < 21)) {
            System.out.println("Kim Nguu");
        } else if ((month == 5 && day >= 21) || (month == 6 && day < 22)) {
            System.out.println("Song Tu");
        } else if ((month == 6 && day >= 22) || (month == 7 && day < 23)) {
            System.out.println("Cu Giai");
        } else if ((month == 7 && day >= 23) || (month == 8 && day < 23)) {
            System.out.println("Su Tu");
        } else if ((month == 8 && day >= 23) || (month == 9 && day < 23)) {
            System.out.println("Xu Nu");
        } else if ((month == 9 && day >= 23) || (month == 10 && day < 24)) {
            System.out.println("Thien Binh");
        } else if ((month == 10 && day >= 24) || (month == 11 && day < 23)) {
            System.out.println("Bo Cap");
        } else if ((month == 11 && day >= 23) || (month == 12 && day < 22)) {
            System.out.println("Nhan Ma");
        }
    }
}
