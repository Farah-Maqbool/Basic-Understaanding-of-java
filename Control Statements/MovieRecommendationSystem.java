import java.util.Scanner;

public class MovieRecommendationSystem {
    public static void main(String[]args){
        Scanner user=new Scanner(System.in);
        System.out.print("Enter you Age: ");
        int age=user.nextInt();
        if (age<=14){
            System.out.println("Comedy Genre");
        } else if (age>14 && age<30) {
            System.out.println("Action Genre");
        } else if (age>30) {
            System.out.println("Comedy Genre");
        }
    }
}
