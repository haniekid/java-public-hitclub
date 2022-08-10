package exercise2;

import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------1---------------------");
        System.out.println("NHAP SO SINH VIEN: ");
        int n = sc.nextInt();
        //Cấp phát số lượng phần tủ
        Student s[] = new Student[n];

        for(int i = 0; i < n; i++) {
            System.out.println("----------------------------------");
            System.out.println("NHAP THONG TIN SINH VIEN THU " + (i+1));
            // Cấp phát cho từng phần tử
            s[i] = new Student();
            s[i].input();
        }

        System.out.println("-----------------------2---------------------");
        for (int i = 0; i < n; i++) {
            System.out.println("----------------------------------");
            System.out.println("THONG TIN SINH VIEN THU " + (i+1));
            s[i].output();
        }

        System.out.println("-----------------------3---------------------");
        System.out.println("NHAP ID SINH VIEN CAN TIM: ");
        int ID1 = sc.nextInt();
        searchID(s,ID1);

        System.out.println("-----------------------4---------------------");
        change(s);

        System.out.println("-----------------------5---------------------");
        System.out.println("NHAP ID SINH VIEN CAN XOA");
        int ID2 = sc.nextInt();
        deleteStudentByID(s, ID2);

    }

    public static void searchID(Student s[], int ID) {
        for(int i = 0 ; i < s.length; i++) {
            if(s[i].getId() == ID) {
                s[i].output();
            }else {
                System.out.println("KHONG TON TAI SV CO ID NAY");
            }
        }
    }

    public static void change(Student s[]) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getAddress().getProvince() == "Thanh Hoa") {
                s[i].getAddress().setProvince("Hai Phong");
            }
        }
        for(int i = 0; i < s.length; i++) {
            s[i].output();
        }
    }

    public static void deleteStudentByID(Student s[], int ID) {
        for (int i = 0; i < s.length; i++) {
            if (s[i].getId() == ID) {
                for (int j = i; j < s.length; j++) {
                    s[i] = s[i + 1];
                }
            }
        }
        for(int i = 0; i < s.length; i++) {
            s[i].output();
        }
    }


}
