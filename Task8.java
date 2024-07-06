import java.util.ArrayList;
import java.util.Scanner;

class Post{
    String authorName, content;
    int likes;

    Post(String authorName,String content,int likes){
        this.authorName=authorName;
        this.content=content;
        this.likes=likes;

    }
}

class socialMediaPlatform{
    // array of post
    ArrayList<Post> UserPost=new ArrayList<>();

    void addPost(Post postobj){
        UserPost.add(postobj);
    }
    void SearchDisplay(String name){
        Scanner user=new Scanner(System.in);
        for (Post post : UserPost){
            if (post.authorName.equals(name)){
                System.out.println("Loading........");
                System.out.println(post.authorName);
                System.out.println(post.content);
                System.out.println("Likes: "+post.likes);
                System.out.println("Do you want to like (y or n) :");
                String check=user.next().toLowerCase();
                if (check.equals("y")){
                    post.likes+=1;
                }
                else {
                    System.out.println("Thanks");
                    break;
                }
            }
        }
    }

    void HighestLikes(){
        System.out.println("loading.............................");
        int check=0;
        for (Post post : UserPost){
            if (post.likes>check){
                check=post.likes;
            }
        }
        for (Post post : UserPost){
            if (post.likes==check){
                System.out.println("Highest like.......");
                System.out.println(post.authorName);
                System.out.println(post.content);
                System.out.println(post.likes);
            }

        }

    }
}



public class Task8 {
    public static void main(String[]args){
        Scanner user=new Scanner(System.in);
        System.out.println("----Social media Post----");

        socialMediaPlatform postPlace=new socialMediaPlatform();
        String userchoice;
        do {
            System.out.print("Add/Search/Highlike: ");
            String choice=user.next().toLowerCase();
            user.nextLine();
            switch (choice){
                case "add":
                    System.out.print("Author name: ");
                    String name=user.nextLine();
                    System.out.println("Content: ");
                    String content=user.nextLine();
                    int likes=0;
                    Post postObj=new Post(name,content,likes);
                    postPlace.addPost(postObj);
                    break;
                case "search":
                    System.out.println("Author name: ");
                    String searchName=user.nextLine();
                    postPlace.SearchDisplay(searchName);
                    break;
                case "highlike":
                    postPlace.HighestLikes();
                    break;
                default:
                    System.out.println("Invalid option Try again");
            }
            System.out.println("Do you want to Continue (y or n):  ");
            userchoice=user.next().toLowerCase();
        } while (userchoice.equals("y"));
        
    }
}
