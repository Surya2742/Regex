import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc;
    public void nameValidation() {
        sc = new Scanner(System.in);
        final String FIRSTNAME = "([A-Z][a-z]{2,})";
        System.out.print("Enter the FirstName & LastName to validate\nFirstName : ");
        String firstName = sc.nextLine();
        System.out.print("LastName : ");
        String lastName = sc.nextLine();
        boolean resultForFirstName = Pattern.matches(FIRSTNAME, firstName);
        boolean resultForLastName = Pattern.matches(FIRSTNAME, lastName);
        if (resultForFirstName) {
            System.out.println("First Name is valid and acceptable.");
        }
        if (resultForLastName) {
            System.out.println("Last Name is valid and acceptable.");
        }
        if (!resultForFirstName){
            System.out.println("Invalid First Name");
        }
        if (!resultForLastName) {
            System.out.println("Invalid Last Name");
        }
    }

    public void eMailValidation () {
        sc = new Scanner(System.in);
        final String emailPattern = "[a-zA-Z1-9]+([.]xyz|)+@bl+[.]co([.]in|)";
        System.out.print("Enter email address to validate : ");
        String eMail = sc.nextLine();
        boolean resultForEmailValidation = Pattern.matches(emailPattern, eMail);
        if (resultForEmailValidation)
            System.out.println("Email ID is acceptable.");
        if (!resultForEmailValidation)
            System.out.println("Email ID is not acceptable.");
    }
}
