package kiemtra;

import java.util.Scanner;

public class LopHoc {
    private int idLH;
    private String nameLH;
//    private SinhVien s = new SinhVien();

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id lớp: ");
        idLH = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập tên lớp: ");
        nameLH = sc.nextLine();

    }

    public void output(){
        System.out.println("ID_lớp: " + idLH);
        System.out.println("Name_Lớp: " + nameLH);
//
//        s.output();
    }

}
