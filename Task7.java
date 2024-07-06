

import java.util.ArrayList;
import java.util.Scanner;

class Item{
    String name;
    int price,quantity;
    Item(String name,int price,int quantity){
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }
}
class ShoppingCart{
    ArrayList<Item> ItemObjectsArray =new ArrayList<>();

    void add(Item object){
        boolean check=false;
        for (Item item: ItemObjectsArray){
            if (item.name.equals(object.name)){
                check=true;

            }
        }
        if (check){
            ItemObjectsArray.add(object);
            System.out.println("Item Added Successfully");
        }
        else {
            System.out.println("Item already exist");
        }



    }
    void update(String name,int quantity){
        for (Item item: ItemObjectsArray){
            if (item.name.equals(name)){
                item.quantity=quantity;
            }
        }
        System.out.println("Quantity Update Successfully");

    }
    void remove(String name){
        for (Item item: ItemObjectsArray){
            if (item.name.equals(name)){
                ItemObjectsArray.remove(item);
                System.out.println("done");
            }
        }
        System.out.println("Item Removed Successfully");

    }
    void totalBill(){
        int totalbill=0;
        for (Item item: ItemObjectsArray){
            totalbill+=((item.quantity)* (item.price));
        }
        System.out.println("Total bill: "+totalbill);
    }

    void printall(){
        System.out.println("Show All");
        for (Item item: ItemObjectsArray){
            System.out.println("Product Name: "+item.name);
            System.out.println("Product Price: "+item.price);
            System.out.println("Product Quantity: "+item.quantity);
        }

    }
}

public class Task7 {
    public static void main(String[]args){
        ShoppingCart cart=new ShoppingCart();

        Scanner user=new Scanner(System.in);
        System.out.println("-----Shopping Cart-----");
        System.out.println("-----Enter Product details-----");

        String customercontinue;
        do{
            System.out.println("What you want to do ?");
            System.out.print("Add/Update Quantity/Remove/Total bill/Show all: ");
            String customerDecide=user.next().toLowerCase();
            user.nextLine();
            switch (customerDecide){
                case "add":
                    System.out.print("Enter Product name: ");
                    String name = user.next();
                    user.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = user.nextInt();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = user.nextInt();
                    Item productDetail = new Item(name, price, quantity);
                    cart.add(productDetail);
                    break;
                case "update":
                    System.out.print("Enter Product name: ");
                    String nameUpdate = user.next();
                    user.nextLine();
                    System.out.print("Enter Product Quantity: ");
                    int quantityUpdate = user.nextInt();
                    cart.update(nameUpdate,quantityUpdate);
                    break;
                case "remove":
                    System.out.print("Enter Product name: ");
                    String nameremove = user.next();
                    user.nextLine();
                    cart.remove(nameremove);
                    break;
                case "total":
                    cart.totalBill();
                    break;
                case "show":
                    cart.printall();
                    break;
                default:
                    System.out.println("Invalid Command");
            }
            System.out.print("Do you want to Continue (y or n): ");
            customercontinue=user.next().toLowerCase();

        }while (customercontinue.equals("y"));
        user.close();


    }

}

