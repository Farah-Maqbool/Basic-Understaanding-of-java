import java.util.Scanner;

public class CricketInnings {
    public static void main(String[] args) {
        Scanner user=new Scanner(System.in);
        int innings=0;
        String check, reason;
        while (true){
            System.out.print("Batsman Innings: ");
            int batsman=user.nextInt();
            innings+=batsman;
            System.out.println("Batsman total runs: "+innings);
            System.out.println("Batsman out or not: ");
            check=user.next();
            if (check.equals("Out")){
                break;
            }
        }
        System.out.print("Reason for being out (duck out, LBW, Bowled): ");
        reason=user.next();
        switch (reason){
            case "Duck out":
                System.out.println("Golden duck look like biryani for lunch");
                break;
            case "LBW":
                System.out.println("LBW? The umpire need some lassi to cool down");
                break;
            case "Bowled":
                System.out.println("Batsman got bowled out quicker than cheap candle in windy day");
                break;
            default:
                System.out.println("Looks like batsman got out quicker than hiccup");
        }
    }
}
