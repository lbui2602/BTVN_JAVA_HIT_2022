
package bai4;

import java.util.Scanner;


public class Employee {
    private String id;
    private String name;
    private int age;
    private int workingDays;
    double salary;
    public static final int PRICE = 24;
    static Scanner sc=new Scanner (System.in);
    public Employee() {
    }
    public Employee(String id, String name, int age, int workingDays) {
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
    public double salary(){
        this.salary=workingDays*PRICE;
        return this.salary;
    }
    public void input(){
        System.out.print("nhap vao ma nhan vien : "); 
        id=sc.nextLine();
        System.out.print("nhap vao ten nhan vien : "); 
        name=sc.nextLine();
        System.out.print("nhap vao tuoi nhan vien : "); 
        age=sc.nextInt();
        System.out.print("nhap vao so ngay cong : "); 
        workingDays=sc.nextInt();
    }
    public void output(){
        System.out.println("-----------------");
        System.out.println("ma nhan vien : "+id);
        System.out.println("ten nhan vien : "+name);
        System.out.println("tuoi : "+age);
        System.out.println("so ngay cong : "+workingDays);
        System.out.println("tien luong nhan duoc : "+salary());
    }
    public static void main(String[] args) {
        Employee a=new Employee();
        a.input();
        a.output();
    }
}
