class Rectangle{
    int height,width;
    int areaRectangle(){
        return height*width;
    }

}
public class Task5 {
    public static void main(String[]args){
        Rectangle r1=new Rectangle();
        r1.height=4;
        r1.width=5;
        System.out.println("Area: "+r1.areaRectangle());

        Rectangle r2 =new Rectangle();
        r2.height=6;
        r2.width=23;
        System.out.println("Area: "+ r2.areaRectangle());

    }
}

