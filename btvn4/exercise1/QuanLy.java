package exercise1;

import java.io.InputStream;
import java.util.Scanner;

public class QuanLy {
    private String maQL;
    private String hoTen;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA QL: ");
        maQL = sc.nextLine();
        System.out.println("NHAP HO TEN QUAN LY: ");
        hoTen = sc.nextLine();
    }

    public void output() {
        System.out.println("MA QL: " + maQL);
        System.out.println("HO TEN QUAN LY: " + hoTen);
    }
}
