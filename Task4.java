class Shape{
    static String color="Black";
}
class Circle extends Shape{
    int radius;
    void calculateRadius(){
        System.out.println("Area: "+3.14159*(radius*radius));
    }
}

public class Task4 {
    public static void main(String[]args){
        Circle user=new Circle();
        user.radius=4;
        user.calculateRadius();
    }
}
