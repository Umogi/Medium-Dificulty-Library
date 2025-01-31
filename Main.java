import java.util.Scanner;

public class Main{
    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        UserComand userComand = new UserComand();

        while(true){
            System.out.println("==== Library ====");
            System.out.println("1. LogIn");
            System.out.println("2. CreateUser");
            System.out.println("Choice: ");
            int choice  = scan.nextInt();
            
            if(choice == 1){
                System.out.print("User: ");
                String username = scan.nextLine();
                
                userComand.SearchUser(username);
            }else if(choice == 2){
                System.out.println("\n==== Create User ====");
                System.out.println("Username: ");
                String username = scan.nextLine();

                userComand.CreateUser(username);
            }else if(choice == 3){
                break;
            }else{
                System.out.println("Command does not exist");
            }
        }
    }
} 