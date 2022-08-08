package buoi3;

import java.util.Scanner;

public class Employee2 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee2 e1 = new Employee2();
        Employee2 e2 = new Employee2();
        Employee2 e3 = new Employee2();
        Employee2 e4 = new Employee2();
        Employee2 e5 = new Employee2();

        System.out.println("Enter employee information: ");
        e1.input();
        e2.input();
        e3.input();
        e4.input();
        e5.input();
        System.out.println("----------------------------");
        System.out.println("\t\tEmployees information:");
        System.out.println("ID\t\tNAME\tAGE\tADDRESS\tDEPARTMENT");
        e1.output();
        e2.output();
        e3.output();
        e4.output();
        e5.output();
        System.out.println("-----------------------------");
        e1.output();
        e2.output();
        e3.output();
        e4.output();
        e5.output();
    }

    private int id;
    private static int temp = 1;
    private int age;
    private String name;
    private String address;
    private String department;

    public Employee2() {
        id = temp++;
    }
//
//    public Employee2(int age, String name, String address, String department) {
//        this.age = age;
//        this.name = name;
//        this.address = address;
//        this.department = department;
//    }

    public void input() {
        System.out.print("AGE: ");
        name = sc.nextLine();
        System.out.print("NAME: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.print("ADDRESS: ");
        address = sc.nextLine();
        System.out.print("DEPARTMENT: ");
        department = sc.nextLine();
    }

    public void output() {
        System.out.println(id + "\t\t" + age + "\t\t" + name + "\t\t" + address + "\t\t" + department);
    }

}
