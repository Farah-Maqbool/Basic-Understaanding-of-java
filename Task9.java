import java.util.ArrayList;
import java.util.Scanner;

class Dish{
    String category, description, name;
    int price;

    Dish(String category,String name,String description,int price){
        this.category = category;
        this.name = name;
        this.description = description;
        this.price = price;
    }
}

class ResturantManu{
    ArrayList<Dish> dishObj = new ArrayList<>();

    void add(Dish obj){
        dishObj.add(obj);
    }

    void display(){
        for (Dish dish : dishObj){
            System.out.println("Name: "+dish.name);
            System.out.println("Price: "+dish.price);
        }
    }

    void search(String name){
        for (Dish dish : dishObj){
            if (dish.name.equals(name)){
                System.out.println("Name: "+dish.name);
                System.out.println("Description: "+dish.description);
                System.out.println("Price: "+dish.price);
                break;
            }
        }
    }

    void category(){
        for (Dish dish : dishObj){
            if (dish.category.equals("appetizer")){
                System.out.println("Appetizer");
                System.out.println("Name:" + dish.name);
                System.out.println("Description: "+dish.description);
                System.out.println("Price: "+dish.price);
            }
        }
        for (Dish dish : dishObj){
            if (dish.category.equals("main course")){
                System.out.println("Main Course");
                System.out.println("Name:" + dish.name);
                System.out.println("Description: "+dish.description);
                System.out.println("Price: "+dish.price);
            }
        }
        for (Dish dish : dishObj){
            if (dish.category.equals("dessert")){
                System.out.println("Desserts");
                System.out.println("Name:" + dish.name);
                System.out.println("Description: "+dish.description);
                System.out.println("Price: "+dish.price);
            }
        }

    }
}

public class Task9 {
    public static void main(String[]args){
        System.out.println("------Resturant Menu------");
        Scanner user = new Scanner(System.in);
        ResturantManu resturant=new ResturantManu();
        String userchoice;
        do {
            System.out.print("Add/Search/Display/Category: ");
            String choice=user.next().toLowerCase();
            user.nextLine();
            switch (choice){
                case "add":
                    System.out.print("Name: ");
                    String name=user.nextLine();
                    System.out.print("Category Appetizer, Main Course, Dessert: ");
                    String category=user.nextLine();
                    System.out.print("Description: ");
                    String description=user.nextLine();
                    System.out.print("Price: ");
                    int price=user.nextInt();
                    Dish dish=new Dish(category,name,description,price);
                    resturant.add(dish);
                    break;
                case "search":
                    System.out.print("Name: ");
                    String dishName=user.nextLine();
                    resturant.search(dishName);
                    break;
                case "display":
                    resturant.display();
                    break;
                case "category":
                    resturant.category();
                    break;
                default:
                    System.out.println("Invalid option Try again");
            }
            System.out.print("Do you want to Continue (y or n):  ");
            userchoice=user.next().toLowerCase();
        } while (userchoice.equals("y"));
    }
}
