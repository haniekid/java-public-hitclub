package bai1;

import java.util.Scanner;

public class CanBo {
    static int temp = 1;
    protected int id;
    protected String name;
    protected int birth;
    protected String gender;
    protected String address;

    public CanBo() {
        this.id = temp++;
    }

    Scanner sc = new Scanner(System.in);
    public void input() {
        System.out.println("Nhập tên: ");
        name = sc.nextLine();
        System.out.println("Nhập năm sinh");
        birth = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập giới tính");
        gender = sc.nextLine();
        System.out.println("Nhập địa chỉ: ");
        address = sc.nextLine();
    }

    public void output() {
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Birth: " + birth);
        System.out.println("Gender: " + gender);
        System.out.println("Address: " + address);
    }
}
