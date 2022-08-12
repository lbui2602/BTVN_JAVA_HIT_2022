/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bai1;

import javax.swing.*;
import java.util.Scanner;

public class Student {
    static Scanner sc = new Scanner(System.in);
    private String id;
    private String name;
    private int age;
    private Address address = new Address();

    public void input()
    {
        System.out.print("    Nhập vào MSV: ");
        id = sc.nextLine();
        System.out.print("    Nhập vào tên: ");
        name = sc.nextLine();
        System.out.print("    Nhập vào tuổi: ");
        age = sc.nextInt();
        address.input();
    }

    public void output()
    {
        System.out.println("    MSV: " + id);
        System.out.println("    Tên: " + name);
        System.out.println("    Tuổi: " + age);
        address.output();
    }

    public static void main(String[] args) {
        int so, n=0, m=0, c=0;
        String a;
        Student obj[] = new Student[100];
        while (1>0)
        {
            System.out.print("NHẬP CHỨC NĂNG: ");
            so = sc.nextInt();
            System.out.print("-----------------\n\n");
            switch (so)
            {
                case 1:
                    System.out.print("Số lượng sinh viên cần nhập: ");
                    n = sc.nextInt();
                    for(int i=m; i<n+m; i++)
                    {
                        sc.nextLine();
                        System.out.println("  Nhập thông tin sinh viên thứ " + (i+1) + ": ");
                        obj[i] = new Student();
                        obj[i].input();
                    }
                    m+=n;
                    System.out.println();
                    break;
                case 2:
                    System.out.println("THÔNG TIN SINH VIÊN\n-------------------");
                    for(int i=0; i<m; i++)
                    {
                        System.out.println("  Thông tin sinh viên thứ " + (i+1) + ": ");
                        obj[i].output();
                    }
                    System.out.println();
                    break;
                case 3:
                    System.out.println("TÌM SINH VIÊN\n-------------");
                    System.out.print("  Nhập MSV cần tìm: ");
                    sc.nextLine();
                    a = sc.nextLine();
                    for(int i=0; i<m; i++)
                    {
                        if(a.equals(obj[i].id))
                        {
                            obj[i].output();
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 4:
                    System.out.println("LOADING...");
                    for(int i=0; i<m; i++)
                    {
                        if("Thanh Hóa".equals(obj[i].address.province))
                        {
                            System.out.println("  Đã sửa sinh viên " + obj[i].id);
                            obj[i].address.province = "Hải Phòng";
                        }
                    }
                    System.out.println();
                    break;
                case 5:
                    System.out.println("ĐUỔI HỌC 1 SINH VIÊN HƯ HỎNG\n----------------------------");
                    System.out.print("  Nhập MSV của nó đi: ");
                    sc.nextLine();
                    a = sc.nextLine();
                    for(int i=0; i<m; i++)
                    {
                        if(a.equals(obj[i].id))
                        {
                            obj[i] = null;
                            System.out.println("  Em nó đã bay màu!!!");
                            if(i!=m-1)
                            {
                                for (int j=i; j<m-1; j++)
                                {
                                    obj[j]=obj[j+1];
                                }
                            }
                            m--;
                            break;
                        }
                    }
                    System.out.println();
                    break;
                case 6:
                    c=1;
                    System.out.println("MỆT RỒI, NGHỈ THÔI!!!");
                    break;
            }
            if (c==1) break;
        }
    }
}

