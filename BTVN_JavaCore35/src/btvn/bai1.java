package btvn;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        int a,b,c;
        //a,Tính tổng ba số và in ra màn hình
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập a: ");
        a = input.nextInt();

        System.out.print("Nhập b: ");
        b = input.nextInt();

        System.out.print("Nhập c: ");
        c = input.nextInt();

        int sum = a+b+c;
        System.out.println("Tổng ba số: "+ sum);

        //b, Tìm số lớn nhất và in ra màn hình
        int t = 0;
        if(a>b && a>c){
           t = a;
        } else if (b>a && b>c) {
           t =b;
        }else {
           t = c;
        }

        System.out.println("Số lớn nhất trong ba số: "+ t);
    }
}

