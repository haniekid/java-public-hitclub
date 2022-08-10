package exercise2;

import java.util.Scanner;

public class Address {
    private int id;
    private String district;
    private String province;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ADDRESS-ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("DISTRICT: ");
        district = sc.nextLine();
        System.out.println("PROVINCE: ");
        province = sc.nextLine();
    }

    public void output() {
        System.out.println("ADDRESS-ID: " + id);
        System.out.println("DISTRICT: " + district);
        System.out.println("PROVINCE: " + province);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }
}
