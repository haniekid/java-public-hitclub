package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLyCanBo {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<CanBo> list = new ArrayList<>();

    public static void main(String[] args) {
        int choice;

        do{
            System.out.println("--------------------MENU-------------------");
            System.out.println("1: Add một cán bộ vào list tương ứng");
            System.out.println("2: Hiển thị danh sách các cán bộ");
            System.out.println("3: Xóa 1 cán bộ theo id");
            System.out.println("4: Tìm kiếm 1 cán bộ theo id");
            System.out.println("5: Dừng chương trình");

            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addCanBo();
                    break;
                case 2:
                    outputCanBo();
                    break;
                case 3:
                    deleteByID();
                    break;
                case 4:
                    searchByID();
                case 5:
                    System.out.println("Dừng chương trình");
                    return;
                default:
                    return;
            }

        }while(choice != 5);
    }

    public static void addCanBo() {
        System.out.println("1 - Add Công nhân");
        System.out.println("2 - Add Kỹ sư");
        System.out.println("3 - Add Nhân viên");
        System.out.println("Nhập lựa chọn cán bộ cần add");
        int choice1 = sc.nextInt();
        CanBo canBo;
        switch (choice1) {
            case 1:
                canBo = new CongNhan();
                break;
            case 2:
                canBo = new KySu();
                break;
            case 3:
                canBo = new NhanVien();
                break;
            default:
                canBo = new CanBo();
        }
        canBo.input();
        list.add(canBo);
    }

    private static void outputCanBo() {
        System.out.println("Thông tin list cán bộ bạn vừa add");
        for (CanBo canBo : list) {
            System.out.println("--------");
            canBo.output();
        }
    }

    public static void deleteByID() {
        System.out.println("Nhập id cán bộ bạn muốn xóa: ");
        int id1 = sc.nextInt();
        int count1 = 0;
        for(CanBo canBo : list){
            if(canBo.id == id1){
                list.remove(canBo);
                count1++;
            }
        }
        if(count1 == 0){
            System.out.println("Không tồn tại cán bộ có id này!");
        }
    }

    public static void searchByID() {
        System.out.println("Nhập id cán bộ bạn muốn tìm: ");
        int id2 = sc.nextInt();
        int count2 = 0;

        for(CanBo canBo : list){
            if(canBo.id == id2){
                count2++;
                canBo.output();
            }
        }

        if(count2 == 0) {
            System.out.println("Không tồn tại cán bộ có id này!");
        }
    }
}
