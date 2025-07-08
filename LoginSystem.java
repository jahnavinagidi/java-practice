import java.util.Scanner;

public class LoginSystem {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String username = "javauser";
        String password = "pass123";

        System.out.println("Enter Username: ");
        String u = sc.nextLine();

        System.out.print("Enter Password");
        String p = sc.nextLine();

        if(u.equals(username) && p.equals(password)){
            System.out.println("Login Sucessful");

        }
        else{
            System.out.println("Incorrect username or password ❌");
        }
    }
}
