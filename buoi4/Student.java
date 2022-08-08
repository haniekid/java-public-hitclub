package buoi4;

import java.util.Scanner;

public class Student {
    Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private String address;
    Date date;

    public void input(){
        System.out.println("ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("NAME: ");
        name = sc.nextLine();
        System.out.println("ADDRESS: ");
        address = sc.nextLine();
        date = new Date();
        date.input();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void output(){
        System.out.println("ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("ADDRESS: " + address);
        date.output();
    }
}
