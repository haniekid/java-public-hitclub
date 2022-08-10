package exercise1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("NHAP SO PHONG MAY: ");
        int n = sc.nextInt();
        // Cấp phát số lượng phần tử
        PhongMay phongmay[] = new PhongMay[n];
        for(int i = 0; i < n; i++) {
            System.out.println("----------------------------------------");
            System.out.println("NHAP THONG TIN PHONG MAY THU " + (i+1));
            // Cấp phát
            phongmay[i] = new PhongMay();
            phongmay[i].input();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------------");
            System.out.println("THONG TIN PHONG MAY THU " + (i+1));
            phongmay[i].output();
        }
    }
}
