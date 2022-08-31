import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    public void firstNameValidation() {
        Scanner sc = new Scanner(System.in);
        final String FIRSTNAME = "([A-Z][a-z]{2,})";
        System.out.print("Enter the FirstName & LastName to validate\nFirstName : ");
        String firstName = sc.nextLine();
        System.out.print("LastName : ");
        String lastName = sc.nextLine();
        boolean resultForFirstName = Pattern.matches(FIRSTNAME, firstName);
        boolean resultForLastName = Pattern.matches(FIRSTNAME, lastName);
        if (resultForFirstName && resultForLastName) {
            System.out.println("First Name & Last Name both are valid and acceptable.");
        }
        else if (!resultForFirstName){
            System.out.println("Enter valid First Name");
            firstNameValidation();
        } else if (!resultForLastName) {
            System.out.println("Enter valid Last Name");
            firstNameValidation();
        }
    }
}
