import java.util.ArrayList;
import java.util.List;

public class User{

    enum Role {
        user, 
        admin
    }
    
    String name;
    int userId;
    Role role;
    public List<Book> borrowedBooks;
    
    User(String name, int userId, Role role, Book borrowedBooks){
        this.name = name;
        this.userId = userId;
        this.role = role != null ? role : Role.user;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public Role getRole() {
        return this.role;
    }

    public int getUserid(){
        return this.userId;
    }
    
    

    // User Array -> userID -> usetBookList -> bookID
}