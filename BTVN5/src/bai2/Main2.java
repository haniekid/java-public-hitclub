package bai2;

import java.util.ArrayList;
import java.util.Scanner;

import static com.sun.tools.javac.jvm.ByteCodes.swap;

public class Main2 {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<PhuongTien> listxe = new ArrayList<>();
    public static PhuongTien xe = new PhuongTien();

    public static void main(String[] args) {
        do {
            System.out.println("--------------MENU-----------");
            System.out.println("1.Nhập thông tin và tạo danh sách các xe");
            System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe");
            System.out.println("3.  Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần");
            System.out.println("4. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần");
            System.out.println("5.  Thoát");

            System.out.println("Nhập lựa chọn của bạn: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Nhập số xe: ");
                    int n = sc.nextInt();
                    for (int i = 0; i < n; i++) {
                        xe.input();
                        listxe.add(xe);
                    }
                    break;
                case 2:
                    for (PhuongTien xe : listxe) {
                        System.out.printf("%-15s %-15s %-10d %-10f %-10f ", "Tên chủ xe", "Loai xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                        xe.output();
                    }
                    break;
                case 3:
                    for (int i = 0; i < listxe.size(); i++) {
                        if (listxe.get(i).getThuePhaiNop() < listxe.get(i + 1).getThuePhaiNop()) {
                            PhuongTien temp = listxe.get(i);
                            listxe.set(i, listxe.get(i + 1));
                            listxe.set(i + 1, temp);
                        }
                    }
                    for (int i = 0; i < listxe.size(); i++) {
                        System.out.printf("%-15s %-15s %-10d %-10f %-10f ", "Tên chủ xe", "Loai xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                        listxe.get(i).output();
                    }
                    break;
                case 4:
                    for (int i = 0; i < listxe.size(); i++) {
                        if (listxe.get(i).getTriGia() > listxe.get(i + 1).getTriGia()) {
                            PhuongTien temp = listxe.get(i);
                            listxe.set(i, listxe.get(i + 1));
                            listxe.set(i + 1, temp);
                        }
                    }
                    for (int i = 0; i < listxe.size(); i++) {
                        System.out.printf("%-15s %-15s %-10d %-10f %-10f ", "Tên chủ xe", "Loai xe", "Dung tích", "Trị giá", "Thuế phải nộp");
                        listxe.get(i).output();
                    }
                    break;
                case 5:
                    return;
            }
        } while (true);
    }
}
