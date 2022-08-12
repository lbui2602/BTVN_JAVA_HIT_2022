
package bai3;

import java.util.Scanner;


public class PtBac2 {
    private int a;
    private int b;
    private int c;
    static Scanner sc=new Scanner (System.in);
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
    public void Input(){
        System.out.print("nhap a : ");
        a=sc.nextInt();
        System.out.print("nhap b : ");
        b=sc.nextInt();
        System.out.print("nhap c : ");
        c=sc.nextInt();
    }
    public void Output(){
        if(a==0){
            if(b==0){
                if(c==0){
                    System.out.println("phuong trinh vo so nghiem");
                }
                else{
                    System.out.println("phuong trinh vo nghiem");
                }
            }
            else{
                float x=(-c)/b;
                System.out.print("nhap a : ");
                System.out.println("nghiem cua he la : "+x);
            }
        }else{
            double denta=b*b-(4*a*c);
            if(denta<0){
                System.out.println("phuong trinh vo nghiem");
            }
            else if(denta==0){
                float x=(-b)/(2*a);
                System.out.println("phuong trinh co nghiem kep la : "+x);
            }
            else{
                float x1=((-b)+(float)Math.sqrt(denta))/(2*a);
                float x2=((-b)-(float)Math.sqrt(denta))/(2*a);
                System.out.println("phuong trinh co 2 nghiem phan biet la : "+x1 +", "+x2);
            }
        }
    }
    public static void main(String[] args) {
        PtBac2 pt=new PtBac2();
        pt.Input();
        pt.Output();
    }
}
