package kiemtra;

import java.util.Scanner;

public class Nguoi {
    protected String name;
    protected int age;
    protected String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập họ tên: ");
        name = sc.nextLine();
        System.out.println("Nhập tuổi: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập quê quán: ");
        address = sc.nextLine();
    }

    public void output(){
        System.out.println("Họ tên: "+ name);
        System.out.println("Tuổi: "+ age);
        System.out.println("Quê quán: "+ address);
    }
}
