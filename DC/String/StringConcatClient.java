import java.rmi.Naming;
import java.util.Scanner;

public class StringConcatClient {
    public static void main(String[] args) {
        try {
            // Look up the remote object
            StringConcatServer concatService = (StringConcatServer) Naming.lookup("rmi://localhost/StringConcatService");

            // Get input from user
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter first string: ");
            String str1 = sc.nextLine();
            System.out.println("Enter second string: ");
            String str2 = sc.nextLine();

            // Call the remote method
            String result = concatService.concatenateStrings(str1, str2);
            System.out.println("Concatenated String: " + result);
        } catch (Exception e) {
            System.out.println("Client exception: " + e.getMessage());
        e.printStackTrace();
        }
    }
}