import java.util.Scanner;

class Calculator{

    int addition(int num1,int num2){
        return num1+num2;
    }
    int subtraction(int num1,int num2){
        return num1-num2;
    }
    int multiplication(int num1,int num2){
        return num1*num2;
    }
    int division(int num1,int num2){
        return num1/num2;
    }

}

public class Task2 {
    public static void main(String[]args){
        Calculator calc=new Calculator();
        Scanner user1=new Scanner(System.in);
        System.out.println("----Calculator-----");
        System.out.print("Enter number 1: ");
        int num1=user1.nextInt();
        System.out.print("Enter number 2: ");
        int num2=user1.nextInt();
        System.out.println("Addition result: "+calc.addition(num1,num2));
        System.out.println("Subtraction result: "+calc.subtraction(num1,num2));
        System.out.println("Multiplication result: "+calc.multiplication(num1,num2));
        System.out.println("Division result: "+calc.division(num1,num2));
    }
}
