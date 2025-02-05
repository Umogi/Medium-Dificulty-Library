package Library.main;

import java.util.Scanner;

public class AdminComand {

    @SuppressWarnings("resource")
    public void AdminInterface() {
        Scanner scan = new Scanner(System.in);
        
        while (true) {
            System.out.println("==== Admin Menu ====");
            System.out.println("1. Add Book");
            System.out.println("2. Exit");
            System.out.print("Choice: ");
            
            int choice = scan.nextInt();
            scan.nextLine(); // Consume newline
            
            if (choice == 1) {
                addBook();
            } else if (choice == 2) {
                break;
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        }
    }

    @SuppressWarnings("resource")
    public void addBook(){
        Scanner scan = new Scanner(System.in);

        Comand Comand = new Comand();
        
        System.out.print("Book Name: ");
        String newName = scan.nextLine();

        System.out.print("Book Author: ");
        String newAuthor = scan.nextLine();

        System.out.print("Book ISBN: ");
        int newISBN = scan.nextInt();

        Comand.insertBook(newName, newAuthor, newISBN);
    }
}
