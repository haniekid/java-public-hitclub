package buoi1;

import java.util.Scanner;

public class test1 {
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

        switch (month) {
            case 1: {
                if (day >= 20) {
                    System.out.println("Bao Binh");
                } else
                    System.out.println("Ma Ket");
                break;
            }
            case 2: {
                if (day >= 19) {
                    System.out.println("Song Ngu");
                } else
                    System.out.println("Bao Binh");
                break;
            }
            case 3: {
                if (day >= 21)
                    System.out.println("Bach Duong");
                else
                    System.out.println("Song Ngu");
                break;
            }
            case 4: {
                if (day >= 21)
                    System.out.println("Kim Nguu");
                else
                    System.out.println("Bach Duong");
                break;
            }
            case 5: {
                if (day >= 21)
                    System.out.println("Song Tu");
                else
                    System.out.println("Kim Nguu");
                break;
            }
            case 6: {
                if (day >= 22)
                    System.out.println("Cu Giai");
                else
                    System.out.println("Song Tu");
                break;
            }
            case 7: {
                if (day >= 23)
                    System.out.println("Su Tu");
                else
                    System.out.println("Cu Giai");
                break;
            }
            case 8: {
                if (day >= 23)
                    System.out.println("Xu Nu");
                else
                    System.out.println("Su Tu");
                break;
            }
            case 9: {
                if (day >= 23)
                    System.out.println("Thien Binh");
                else
                    System.out.println("Xu Nu");
                break;
            }
            case 10: {
                if (day >= 24)
                    System.out.println("Bo Cap");
                else
                    System.out.println("Thien Binh");
                break;
            }
            case 11: {
                if (day >= 23)
                    System.out.println("Nhan Ma");
                else
                    System.out.println("Bo Cap");
                break;
            }
            case 12: {
                if (day >= 22)
                    System.out.println("Ma Ket");
                else
                    System.out.println("Nhan Ma");
                break;
            }
        }
    }
}
