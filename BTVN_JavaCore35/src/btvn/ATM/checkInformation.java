package ATM;

import java.util.Scanner;

public class checkInformation {
    Scanner input = new Scanner(System.in);
    public void endLine(){
        System.out.println("*******************************************************");
    }
    public void OptionHandle(user arr){
        int option =0;
        boolean close = true;
        do {
            do {
                System.out.println("1, Rút tiền");
                System.out.println("2, Truy vấn thông tin tài khoản");
                System.out.println("3, Thoát chương trình");
                System.out.print("Nhập lựa chọn: ");
                option = input.nextInt();
                endLine();
                if (option >3 || option<1) {
                    option = 0;
                    System.out.println("Lựa chọn sai mời nhập lại!");
                    endLine();
                }
            }while (option == 0);

            switch (option){
                case 1:
                    float moneyInput;
                    System.out.print("Mời nhập số tiền: ");
                    moneyInput = input.nextFloat();
                    if(moneyInput<=arr.getBalance() && moneyInput>0){
                        arr.setBalance(arr.getBalance()-moneyInput);
                        System.out.print("Số dư: ");
                        System.out.println(arr.getBalance());
                        endLine();
                    }else {
                        if (moneyInput==0){
                            System.out.println("Số tiền rút phải > 0");
                        }else System.out.println("Số dư không đủ");

                        endLine();
                    };
                    break;
                case 2:
                    System.out.print("Tên chủ tài khoản: ");
                    System.out.println(arr.getName());
                    System.out.print("Số dư: ");
                    System.out.println(arr.getBalance());
                    endLine();
                    break;
                case 3:
                    close = false;
                    System.out.println("gud bye , see you later <3");
                    endLine();
                    break;
            }
        }while (close);
    }
}
