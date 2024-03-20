package inventoryManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int op;
        Product product[] =new Product[100];
        product[0] = new Product(1,"laptop",150000000f,12);

        Scanner input = new Scanner(System.in);

        System.out.print("Mời nhập lưạ chọn:");
        op = input.nextInt();
        switch (op){
            case 1:
                for (int i =0; i<=product.length+1;i++){
                    int id,quantity;
                    float price;
                    String name;
                    if (i<= product.length){
                        if(product[i] == null){
                            System.out.print("Mời nhập id sản phẩm:");
                            id = input.nextInt();
                            product[i].setId(id);

                            System.out.print("Mời nhập tên sản phẩm:");
                            name = input.toString();
                            product[i].setName(name);

                            System.out.print("Mời nhập giá sản phẩm:");
                            price = input.nextInt();
                            product[i].setPrice(price);

                            System.out.print("Mời nhập số lượng sản phẩm:");
                            quantity = input.nextInt();
                            product[i].setQuantity(quantity);
                            break;
                        }
                    }else System.out.println("CSDL đã đầy");
                }
                break;

        }
    }
}
