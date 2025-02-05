package Library.main;

import java.util.Scanner;
import Library.Modules.Book;
import Library.Modules.User;

public class UserComand {

    private Comand comand;
    private User currentUser;

    public UserComand(Comand comand, User user) {
        this.comand = comand;
        this.currentUser = user;
    }

    @SuppressWarnings("resource")
    public void UserInterface() {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("==== User Menu ====");
            System.out.println("1. Rent Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline
            
            if (choice == 1) {
                rentBook();
            } else if (choice == 2) {
                returnBook();
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    @SuppressWarnings("resource")
    public void rentBook() {
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Rent a Book ====");
        boolean availableBooks = false;
        for (Book book : comand.Books) {
            if (book.getAvailable()) {
                System.out.println(book);
                availableBooks = true;
            }
        }

        if (!availableBooks) {
            System.out.println("No books available for rent.");
            return;
        }

        System.out.print("Enter book ID to rent: ");
        int bookId = scan.nextInt();

        for (Book book : comand.Books) {
            if (book.getID() == bookId && book.getAvailable()) {
                currentUser.borrowBook(book);
                return;
            }
        }

        System.out.println("Book not found or already rented.");
    }

    @SuppressWarnings("resource")
    public void returnBook() {
        Scanner scan = new Scanner(System.in);

        System.out.println("==== Return a Book ====");
        if (currentUser.getBorrowedBooks().isEmpty()) {
            System.out.println("You have no borrowed books.");
            return;
        }

        for (Book book : currentUser.getBorrowedBooks()) {
            System.out.println(book);
        }

        System.out.print("Enter book ID to return: ");
        int bookId = scan.nextInt();

        for (Book book : currentUser.getBorrowedBooks()) {
            if (book.getID() == bookId) {
                currentUser.returnBook(book);
                return;
            }
        }

        System.out.println("You do not have this book.");
    }
}
