package kiemtra;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    static int temp = 1;
    int id;
    private String khoa;
    private int khoaHoc;
    private LopHoc a = new LopHoc();


    public static int getTemp() {
        return temp;
    }
    public String getName() {
        return name;
    }
    public static void setTemp(int temp) {
        SinhVien.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public int getKhoaHoc() {
        return khoaHoc;
    }

    public void setKhoaHoc(int khoaHoc) {
        this.khoaHoc = khoaHoc;
    }

    public void input(){
        super.input();

        a.input();

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập khoa sinh viên: ");
        khoa = sc.nextLine();
        System.out.println("Nhập khóa học sinh viên: ");
        khoaHoc = sc.nextInt();
    }

    public void output(){
        super.output();

        a.output();
        System.out.println("Id_SinhVien: " + id);
        System.out.println("Khoa_SinhVien: " + khoa);
        System.out.println("KhoaHoc_SinhVien: " + khoaHoc);
    }

    public SinhVien() {
        this.id = temp++;
    }
}
