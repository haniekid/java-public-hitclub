package kiemtra;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static ArrayList<SinhVien> list = new ArrayList<>();
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // Trịnh Thu Ha

        /*
            Người chấm: Nguyễn Hoàng Lâm
            Output không theo dạng bảng: -0.5đ
            Tạo đúng cấu trúc quan hệ: 1.5đ
            Tạo được menu : 1.5đ
            Code đẹp rõ ràng, dễ đọc: 0.5đ
            Ý 1: 1đ
            Ý 2: 1đ
            Ý 3: 1đ
            Ý 4: 1đ
            Ý 5: 1đ
            Ý 6: 1đ
            Ý 7: 1đ
            => 9.5đ
         */
        int choice;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("---------------MENU--------------");
            System.out.println("1. Nhập vào thông tin 1 sinh viên mới (mã sv tự tăng bắt đầu từ 1).");
            System.out.println("2. Hiển thị thông tin các sinh viên ra màn hình");
            System.out.println("3. Xóa một sinh viên khỏi danh sách theo mã sinh viên");
            System.out.println("4. Sửa thông tin các sinh viên khoa QTKD  thành khoa CNTT.");
            System.out.println("5. Sắp xếp các sinh viên theo chiều tăng dần của khóa học và in ra màn hình");
            System.out.println("6. Sắp xếp các sinh viên theo chiều giảm dần của tên sinh viên và in ra màn hình");
            System.out.println("7. Thoát chương trình \n");

            System.out.println("Nhập lựa chọn của bạn: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    SinhVien sinhVien = new SinhVien();
                    sinhVien.input();
                    list.add(sinhVien);
                    break;
                case 2:
                    outputSV();
                    break;
                case 3:
                    deleteByID();
                    outputSV();
                    break;
                case 4:
                    change();
                    outputSV();
                    break;
                case 5:
                    sortKhoaHoc();
                    outputSV();
                    break;
                case 6:
                    sortTenSV();
                    outputSV();
                    break;
                case 7:
                    System.exit(0);

            }
        }while (choice != 7);
    }

    public static void outputSV(){
        System.out.println("Thông tin list sinh viên bạn vừa add");
        for(SinhVien sinhVien : list){
            sinhVien.output();
        }
    }

    public static void deleteByID() {
        System.out.println("Nhập id sinh viên bạn muốn xóa: ");
        int id1 = sc.nextInt();
        int count1 = 0;
        for(SinhVien sinhVien : list){
            if(sinhVien.getId() == id1){
                list.remove(sinhVien);
                count1++;
                break;
            }
        }
        if(count1 == 0){
            System.out.println("Không tồn tại cán bộ có id này!");
        }
    }

    public static void change(){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getKhoa().equals("QTKD")) {
                list.get(i).setKhoa("CNTT");
            }
        }
    }

    public static void sortKhoaHoc(){
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = i+1; j < list.size(); j++){
                if (list.get(i).getKhoaHoc() > list.get(j).getKhoaHoc()) {
                    SinhVien temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

    public static void sortTenSV(){
        for (int i = 0; i < list.size() - 1; i++) {
            for(int j = i+1; j < list.size(); j++){
                if (list.get(j).getName().compareToIgnoreCase(list.get(i).getName() ) > 0  ) {
                    SinhVien temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }

}
