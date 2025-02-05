package Library.main;
import java.util.Scanner;

public class Main{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        Comand Comand = new Comand();

        while(true){
            System.out.println("==== Library ====");
            System.out.println("1. LogIn");
            System.out.println("2. CreateUser");
            System.out.print("Choice: ");
            int choice  = scan.nextInt();
            
            if(choice == 1){
                System.out.print("User: ");
                String username = scan.nextLine();
                
                Comand.SearchUser(username);
            }else if(choice == 2){
                System.out.println("\n==== Create User ====");
                System.out.print("Username: ");
                String username = scan.nextLine();

                Comand.CreateUser(username);
            }else if(choice == 3){
                break;
            }else{
                System.out.println("Command does not exist");
            }
        }
    }
} 