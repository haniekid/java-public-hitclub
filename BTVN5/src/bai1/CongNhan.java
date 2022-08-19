package bai1;

import java.util.Scanner;

public class CongNhan extends CanBo {
    private String rank;

    Scanner sc = new Scanner(System.in);
    public void input() {
        super.input();
        System.out.println("Nhập cấp bậc: ");
        rank = sc.nextLine();
    }

    public void output() {
        super.output();
        System.out.println("Rank: " + rank);
    }


    }

