import java.util.Scanner;

import java.util.ArrayList;

public class UserComand {
    private ArrayList<User> Users;
    private ArrayList<Book> Books;
    private int AIK = 0;

    public UserComand() {
        Users = new ArrayList<>();
        Books = new ArrayList<>();
    }

    @SuppressWarnings("resource")
    public void UserInterface(){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("==== User ====");
            System.out.println("1. Rent");
            System.out.println("2. Return");
            System.out.println("Choice: ");
            int choice  = scan.nextInt();

            if (choice == 1) {
                
            }
        }
    }

    @SuppressWarnings("resource")
    public void rentBook(){
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Rent Book ====");
        for(Book book : Books){
            System.out.println(book);
        }

        int choice = scan.nextInt();

        for(Book book : Books){
            if(book.getID() == choice){
                
                break;        
            }
        }

        System.err.println("book did not found");
    }

    public void SearchUser(String user){
        for(User i : Users){
            if (i.getName().equals(user)){
                System.out.print("User found!");
                if(i.getRole().equals(User.Role.user)){
                    UserInterface();
                    break;
                }else{

                }
            }
        }   
        System.out.println("User didn't found");
        return;
    }

    public void CreateUser(String user){
        AIK++;
        Users.add(new User(user, AIK, User.Role.user, null));
    }
    
    public void insertBook(){
        
    }
}
