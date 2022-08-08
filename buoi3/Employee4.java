package buoi3;

import java.util.Scanner;

public class Employee4 {
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Employee4 e = new Employee4();
        e.input();
        System.out.println("--------------------");
        e.output();
        System.out.println("--------------------");
        e.output();
    }

    int price = 50;
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;

    public Employee4(String id, String name, int age, int workingDays, double salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
        this.salary = salary;
    }

    public Employee4() {
        this.id = id;
        this.name = name;
        this.age = age;
        this.workingDays = workingDays;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getSalary() {
        return workingDays * price;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void input() {
        System.out.println("ID: ");
        id = sc.next();
        System.out.println("Name: ");
        name = sc.next();
        System.out.println("Age: ");
        age = sc.nextInt();
        System.out.println("Working days: ");
        workingDays = sc.nextInt();
    }

    public void output() {
        System.out.println("ID: " + getId());
        System.out.println("Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Working days: " + getWorkingDays());
        System.out.println("Salary: " + getSalary());
    }

}



