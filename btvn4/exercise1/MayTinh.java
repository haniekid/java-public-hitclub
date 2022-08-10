package exercise1;

import java.util.Scanner;

public class MayTinh {
    private String maMay;
    private String kieuMay;
    private String tinhTrang;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA MAY: ");
        maMay = sc.nextLine();
        System.out.println("NHAP KIEU MAY: ");
        kieuMay = sc.nextLine();
        System.out.println("NHAP TINH TRANG: ");
        tinhTrang = sc.nextLine();
    }

    public void output() {
        System.out.println("MA MAY: " + maMay);
        System.out.println("KIEU MAY: " + kieuMay);
        System.out.println("TINH TRANG: " + tinhTrang);
    }
}
