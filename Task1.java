class Student{
    String name,rollNO;
    int[] marks;
    Student(String name,String rollNO,int math,int computer,int eng){
        this.name=name;
        this.rollNO=rollNO;
        this.marks = new int[]{math, computer, eng};


    }
}
public class Task1 {
    public static void main(String[] args) {
        Student user=new Student("Farah","23AI-02",50,40,50);

    }
}