package Library.Modules;
import java.util.ArrayList;
import java.util.List;

public class User {

    public enum Role {
        user, 
        admin
    }
    
    String name;
    int userId;
    Role role;
    public List<Book> borrowedBooks;
    
    public User(String name, int userId, Role role) {
        this.name = name;
        this.userId = userId;
        this.role = role != null ? role : Role.user;
        this.borrowedBooks = new ArrayList<>();
    }

    public String getName() {
        return this.name;
    }

    public Role getRole() {
        return this.role;
    }

    public int getUserid() {
        return this.userId;
    }

    public List<Book> getBorrowedBooks() {
        return borrowedBooks;
    }

    public void borrowBook(Book book) {
        if (book.getAvailable()) {
            borrowedBooks.add(book);
            book.setAvailable(false);
            System.out.println("You have successfully borrowed: " + book.getTitle());
        } else {
            System.out.println("This book is not available.");
        }
    }

    public void returnBook(Book book) {
        if (borrowedBooks.contains(book)) {
            borrowedBooks.remove(book);
            book.setAvailable(true);
            System.out.println("Book returned successfully: " + book.getTitle());
        } else {
            System.out.println("You do not have this book.");
        }
    }

    @Override
    public String toString() {
        return name + " - " + userId + " - " + role;
    }
}
