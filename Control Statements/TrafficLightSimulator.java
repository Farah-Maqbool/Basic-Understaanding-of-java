import java.util.Scanner;

public class TrafficLightSimulator{
    public static void main(String[] args) {
        System.out.print("Enter Traffic Light Color (Red, Yellow, Green): ");
        Scanner user=new Scanner(System.in);
        String TrafficInput=user.next();

        if (TrafficInput.equals("Red")){
            System.out.println("Stop!!!!");
        } else if (TrafficInput.equals("Green")) {
            System.out.println("Go :)");
        } else if (TrafficInput.equals("Yellow")) {
            System.out.println("Be Ready");
        }
    }
}