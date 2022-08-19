package bai2;

import java.util.Scanner;

public class PhuongTien {
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private float triGia;
    private float thuePhaiNop;

    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên chủ xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Nhập loại xe: ");
        loaiXe = sc.nextLine();
        System.out.println("Nhập dung tích xe: ");
        dungTich= sc.nextInt();
        System.out.println("Nhập trị giá xe: ");
        triGia = sc.nextFloat();
    }

    public void output(){
        System.out.printf("%-15s %-15s %-10d %-10f %-10f\n ", tenChuXe, loaiXe, dungTich, triGia, getThuePhaiNop());
    }

    public PhuongTien() {
    }

    public PhuongTien(String tenChuXe, String loaiXe, int dungTich, float triGia, float thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = thuePhaiNop;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public float getTriGia() {
        return triGia;
    }

    public void setTriGia(float triGia) {
        this.triGia = triGia;
    }

    public float getThuePhaiNop() {
        if(getDungTich() < 100) {
            return (float) (getTriGia()*0.02);
        }else if(getDungTich() >= 100 && getDungTich() <= 200){
            return (float) (getTriGia()*0.06);
        }else{
            return (float) (getTriGia()*0.01);
        }
    }

    public void setThuePhaiNop(float thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }

}
