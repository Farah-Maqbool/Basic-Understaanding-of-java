class Book{
    String title,author,genre;

    void displayDetails(){
        System.out.println("Book Title: "+title);
        System.out.println("Author Name: "+author);
        System.out.println("Genre: "+genre);
    }
}


public class Task3 {
    public static void main(String[]args){
        Book user=new Book();
        user.title="Atomic Habits";
        user.author="James Clear";
        user.genre="Self help";
        user.displayDetails();
    }
}
