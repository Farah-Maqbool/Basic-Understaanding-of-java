

import java.util.ArrayList;
import java.util.Scanner;

class Product{
    String name;
    int price,quantity;
    public Product(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }


}
class GroceryStore {
    ArrayList<Product> ProductObjectsArray =new ArrayList<>();


    void add(Product object){
        //Add product in inventory
        ProductObjectsArray.add(object);
        System.out.println("Add");
    }
    void sell(String name,int quantity){
        // reduce 1 in product quantity
        System.out.println("Sell");
        for (Product product : ProductObjectsArray) {
            if (product.name.equals(name)) {
                product.quantity -= quantity;
                System.out.println("Product Sold!!");

            }
        }
    }
    void search(String name){
        //Search for a product by name and display its details (if found).
        System.out.println("Search");
        for (Product product : ProductObjectsArray){
            if (product.name.equals(name)){
                System.out.println("Product Name: "+product.name);
                System.out.println("Product Price: "+product.price);
                System.out.println("Product Quantity: "+product.quantity);
                return;
            }
        }
        System.out.println("Product not Found");
    }
    void printall(){
        //Print a report showing all products and their current stock levels
        System.out.println("Show All");
        for (Product product : ProductObjectsArray){
            System.out.println("Product Name: "+product.name);
            System.out.println("Product Price: "+product.price);
            System.out.println("Product Quantity: "+product.quantity);
        }


    }
}

public class Task6 {
    public static void main(String[]args){
        GroceryStore store=new GroceryStore();

        Scanner user=new Scanner(System.in);
        System.out.println("----Grocery Store----");
        System.out.println("Enter Product Details");

        String booll;
        do {
            System.out.print("Add/Sell/Search/Show: ");
            String decide=user.next().toLowerCase();
            switch (decide) {
                case "add":
                    System.out.print("Enter Product name: ");
                    String name = user.next();
                    user.nextLine();
                    System.out.print("Enter Product Price: ");
                    int price = user.nextInt();
                    System.out.print("Enter Product Quantity: ");
                    int quantity = user.nextInt();
                    Product productDetail = new Product(name, price, quantity);
                    store.add(productDetail);
                    break;
                case "sell":
                    System.out.print("Enter Product name: ");
                    String SPname = user.next();
                    user.nextLine();
                    System.out.print("How much products are sell: ");
                    int Squantity = user.nextInt();
                    store.sell(SPname, Squantity);
                    break;
                case "search":
                    System.out.print("Enter Product name: ");
                    String SRname = user.next();
                    user.nextLine();
                    store.search(SRname);
                    break;

                case "show":
                    store.printall();
                    break;
                default:
                    System.out.println("Invalid Command");
            }

            System.out.print("Do you want to continue (y/n): ");
            booll=user.next();
        }while (booll.equalsIgnoreCase("y"));
        user.close();


    }

}
