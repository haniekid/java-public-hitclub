package exercise2;

import java.util.Scanner;

public class Student {
    private int id;
    private String name;
    private int age;
    Address address = new Address();

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("STUDENT-ID: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("NAME: ");
        name = sc.nextLine();
        System.out.println("AGE: ");
        age = sc.nextInt();

        address.input();
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void output() {
        System.out.println("STUDENT-ID: " + id);
        System.out.println("NAME: " + name);
        System.out.println("AGE: " + age);

        address.output();
    }
}
