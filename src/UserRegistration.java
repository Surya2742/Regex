import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void firstNameValidation() {
        Scanner sc = new Scanner(System.in);
        final String FIRSTNAME = "([A-Z][a-z]{2,})";
        System.out.print("Enter the FirstName to validate : ");
        String firstName = sc.nextLine();
        boolean resultForFirstName = Pattern.matches(FIRSTNAME, firstName);
        if (resultForFirstName) {
            System.out.println("First Name is valid and acceptable.");
        }
        else {
            System.out.println("Enter valid First Name");
            firstNameValidation();
        }
    }
}
