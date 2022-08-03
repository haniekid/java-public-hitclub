package buoi3;
import java.util.Scanner;
import static java.lang.Math.sqrt;
public class PTB2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        PTB2 xuli = new PTB2();
        xuli.nhapInfor();
        xuli.Tinh();
    }

    Scanner scan = new Scanner(System.in);
    private double a, b, c;
    private double x1, x2;

    public PTB2() {
    }

    public PTB2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void nhapInfor() {
        System.out.println("NHAP a: ");
        a = scan.nextDouble();
        System.out.println("NHAP b: ");
        b = scan.nextDouble();
        System.out.println("NHAP c: ");
        c = scan.nextDouble();
    }

    public void Tinh() {
        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    System.out.println("phuong trinh vo so nghiem");
                } else
                    System.out.println("phuong trinh vo nghiem");
            } else {
                System.out.println("Co mot nghiem x = " + (-c / b));
            }
        } else {
            double denta = Math.pow(b, 2) - 4 * a * c;
            if (denta == 0) {
                System.out.println("PT co nghiem kep: x1 = x2 = " + -b / (2 * a));
            } else if (denta > 0) {
                System.out.println("PT co 2 nghiem phan biet");
                System.out.println("x1 = " + (b + sqrt(denta)) / (2 * a));
                System.out.println("x2 = " + (b - sqrt(denta)) / (2 * a));
            } else {
                System.out.println("PT vo nghiem");
            }
        }
    }
}



