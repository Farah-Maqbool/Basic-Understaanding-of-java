import java.util.HashMap;
import java.util.Scanner;

public class Mango {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        HashMap<String,Integer> MangoShop=new HashMap<>();
        MangoShop.put("Chaunsa",300);
        MangoShop.put("Sindhri",200);
        MangoShop.put("Langra",400);
        System.out.println("----Mango Shop----");
        System.out.print("Type of Mango: ");
        String userNeed=user.next();
        System.out.print("Your Budget: ");
        int UserBudget=user.nextInt();
        boolean mangofound=false;
        for (String i: MangoShop.keySet()) {
            if (userNeed.equals(i)) {
                if (MangoShop.get(i) <= UserBudget) {
                    System.out.println("Get Your Mango \uD83E\uDD6D");
                    mangofound = true;
                    break;
                } else {
                    System.out.println("Out of Budget");
                    mangofound = true;
                    break;
                }
            }
        }
        if (!mangofound){
            System.out.println("Looks like the jinns got to them all! Try back later");
        }

    }
}