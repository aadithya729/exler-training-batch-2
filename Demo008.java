import java.util.Scanner;

public class Demo008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String loginid = "";
        String pwd = "";
        String reply;

        do {
            System.out.println("Welcome to Malla Reddy University");
            System.out.println("Have you visited our site earlier? (yes/no)");
            reply = sc.nextLine();

            if (reply.equals("no")) {
                System.out.println("Login here");
                System.out.println("Enter your ID and password");
                loginid = sc.nextLine();
                pwd = sc.nextLine();
            } else {
                System.out.println("You are our valued customer");
            }
        } while (loginid.equals("adithya") && pwd.equals("1234"));

        sc.close();
    }
}
