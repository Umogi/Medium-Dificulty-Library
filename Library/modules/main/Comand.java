package Library.main;

import java.util.ArrayList;

import Library.Modules.Book;
import Library.Modules.User;

public class Comand {
    public ArrayList<User> Users;
    public ArrayList<Book> Books;
        
    private int AIK = 0;
    private int BookID = 0;
    
    public Comand() {
        Users = new ArrayList<>();
        Books = new ArrayList<>();
    }
    
    public void SearchUser(String username) {
        for (User i : Users) {
            if (i.getName().equals(username)) {
                System.out.println("User found!");
                if (i.getRole().equals(User.Role.user)) {
                    UserComand userComand = new UserComand(this, i);
                    userComand.UserInterface();
                    return;
                }
            }
        }
        System.out.println("User not found.");
    }

    public void CreateUser(String user){
        AIK++;
        Users.add(new User(user, AIK, User.Role.user));
    }
    
    public void insertBook(String title, String author, int isbn){
        BookID++;
        Books.add(new Book(BookID, title, author, isbn, true));
    }
}
