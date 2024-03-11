package btvn;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        //Cho một số nhập vào từ bàn phím, kiểm tra xem số đó có phải số NT hay không5
        //Cũng là số đó, kiểm tra xem có phải số hoàn hảo hay không
        int a;
        int sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Nhập số: ");
        a = input.nextInt();

        if(a == 2 || a%2 != 0){
            System.out.println(a+" là số nguyên tố");
        }else {
            System.out.println(a+" không là số nguyên tố");
        }

        for(int i=1;i<a;i++){
            if(a%i == 0){
                sum +=i;
            }
        }
        if(sum == a){
            System.out.println(a+" là số hoàn hảo");
        }else{
            System.out.println(a+" không là số hoàn hảo");
        }
    }
}
