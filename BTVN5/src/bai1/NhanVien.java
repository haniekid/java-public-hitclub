package bai1;

import java.util.Scanner;

public class NhanVien extends CanBo {
    private String works;

    Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhập công việc: ");
        works = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Work: " + works);
    }

}
