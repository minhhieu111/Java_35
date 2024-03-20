package ATM;

import java.util.Scanner;

public class ATM {
    public void CheckId(String id, String password){

    }
    public static void main(String[] args) {
        String idInput,passwordInput;
        user[] users = {
                new user("001","A","123456",100000f),
                new user("002","B","123467",500000f)
        };
        boolean check = true;
        Scanner input = new Scanner(System.in);
        checkInformation checkInfo = new checkInformation();

        do {
            checkInfo.endLine();
            System.out.print("Mời nhập id: ");
            idInput = input.next();

            System.out.print("Mời nhập mật khẩu: ");
            passwordInput = input.next();


            for(int i=0;i<users.length;i++) {
                if (idInput.equals(users[i].getId()) && passwordInput.equals(users[i].getPassword())) {
                    System.out.println("Welcome");
                    user arr = users[i];
                    checkInfo.OptionHandle(arr);
                    check = false;
                }
            }
            if (check) System.out.println("Sai thông tin đăng nhập mời nhập lại");
        }while (check);

    }
}
