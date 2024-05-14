
import java.util.Scanner;

public class PasswordChecker {
    public static boolean identify(String UserPass){
        char[] chksym={'@','#','$','%','&'};
        int Symbol=0;
        int number=0;
        int UpperCase=0;
        int LowerCase=0;

        if (UserPass.length()==8){
            for (int i=0 ; i<=7 ; i++){

                char letter=UserPass.charAt(i);

                for (int j=0 ; j<=4 ; j++){ // symbol

                    if (letter==chksym[j]) {
                        if (Symbol!=2){
                            Symbol++;
                        }
                    }
                }
                for (int k=48 ; k<=57 ; k++){ // number
                    char num = (char) k;
                    if (letter==num) {
                        if (number!=2){
                            number++;
                        }
                    }
                }
                for (int L=65 ; L<=90 ; L++){ // Uppercase AAlphabet
                    char upper = (char) L;
                    if (letter==upper) {
                        if (UpperCase!=2){
                            UpperCase++;
                        }
                    }
                }
                for (int M=97 ; M<=122 ; M++){ // number
                    char lower = (char) M;
                    if (letter==lower) {
                        if (LowerCase!=2){
                            LowerCase++;
                        }
                    }
                }
            }

        }
        System.out.println("Checking.........");
        if (Symbol==2 && number==2 && UpperCase==2 && LowerCase==2){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[]args){
        Scanner user=new Scanner(System.in);
        System.out.println("-----Password Checker-----");
        System.out.print("Enter Password: ");


        while (true){
            String UserPass=user.next();
            boolean result=identify(UserPass);

            if (result){
                System.out.print("Result: ");
                System.out.print("Strong Password");

                break;
            }
            System.out.println("Weak Password");
            System.out.print("Enter Password again: ");

        }

        user.close();
    }
}

