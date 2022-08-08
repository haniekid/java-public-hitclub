package buoi3;

import java.util.Scanner;

public class HinhChuNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        HinhChuNhat a = new HinhChuNhat();
        System.out.println("HCN a:");
        System.out.println("LENGTH: ");
        a.setLength(sc.nextDouble());
        System.out.println("WIDTH: ");
        a.setWidth(sc.nextDouble());

        System.out.println("HCN b:");
        HinhChuNhat b = new HinhChuNhat();
        b.input();

        System.out.println("-------------------------");
        System.out.println("HCN a:");
        System.out.println("LENGTH: " + a.getLength());
        System.out.println("WIDTH: " + a.getWidth());
        System.out.println("PERIMETER: " + a.getPerimeter());
        System.out.println("AREA: " + a.getArea());

        System.out.println("--------------------------");
        System.out.println("HCN b:");
        b.output();

        System.out.println("--------------------------");
        if (a.getArea() > b.getArea()) {
            System.out.println("Dien tich cua Hcn a lon hon: " + a.getArea());
        } else if (a.getArea() < b.getArea()) {
            System.out.println("Dien tich cua Hcn b lon hon: " + b.getArea());
        } else
            System.out.println("Hai hinh chu nhat co dien tich bang nhau");
    }

    Scanner sc = new Scanner(System.in);
    private double length;
    private double width;

    public HinhChuNhat(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public HinhChuNhat() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getPerimeter() {
        return (length + width) * 2;
    }

    public double getArea() {
        return length * width;
    }

    public void input() {
        System.out.print("LENGTH: ");
        length = sc.nextDouble();
        System.out.print("WIDTH: ");
        width = sc.nextDouble();
    }

    public void output() {
        System.out.println("LENGTH: " + length);
        System.out.println("WIDTH " + width);
        System.out.println("PERIMETER: " + getPerimeter());
        System.out.println("AREA: " + getArea());
    }
}
