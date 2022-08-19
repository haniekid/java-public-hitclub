package bai1;

import java.util.Scanner;

public class KySu extends CanBo {
    private String profession;

    Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhập ngành đào tạo: ");
        profession = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Profession: " + profession);
    }
}
