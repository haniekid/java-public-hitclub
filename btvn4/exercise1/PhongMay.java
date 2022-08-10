package exercise1;

import java.util.Scanner;

public class PhongMay {
    private String maPhong;
    private String tenPhong;
    private float dienTich;
    private MayTinh mt = new MayTinh();
    private QuanLy ql = new QuanLy();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP MA PHONG: ");
        maPhong = sc.nextLine();
        System.out.println("NHAP TEN PHONG: ");
        tenPhong = sc.nextLine();
        System.out.println("NHAP DIEN TICH PHONG: ");
        dienTich = sc.nextFloat();

        mt.input();

        ql.input();
    }

    public void output() {
        System.out.println("MA PHONG: " + maPhong);
        System.out.println("TEN PHONG: " + tenPhong);
        System.out.println("DIEN TICH PHONG: " + dienTich);

        mt.output();

        ql.output();
    }

}
