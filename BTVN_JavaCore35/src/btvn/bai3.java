package btvn;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        //Cho hai số a và b, tạo menu với 4 lựa chọn
        // 1, Tính tổng hai số
        // 2, Tính hiệu hai số
        // 3, Tính tích hai số
        // 4, Tính thương hai số
        // 5, Thoát chương tình
        int a, b, opt, compute;
        Scanner input = new Scanner(System.in);

        System.out.print("Nhập số a: ");
        a = input.nextInt();

        System.out.print("Nhập số b: ");
        b = input.nextInt();

        System.out.print(
                "1: Tính tổng hai số\n" +
                "2: Tính hiệu hai số\n" +
                "3: Tính tích hai số\n" +
                "4: Tính thương hai số\n"+
                "Nhập lựa chọn: ");
        opt = input.nextInt();

        switch (opt){
            case 1:
                compute = a+b;
                System.out.println("Tổng hai số: "+compute);
                break;
            case 2:
                compute = a-b;
                System.out.println("Hiệu hai số: "+compute);
                break;
            case 3:
                compute = a*b;
                System.out.println("Tích hai số: "+compute);
                break;
            case 4:
                if(b != 0){
                    compute = a/b;
                    System.out.println("Thương hai số: "+compute);
                }else{
                    System.out.println("Không thể chia cho 0");
                }
                break;
            default:
                System.out.println("???");
                break;
        }
    }
}
