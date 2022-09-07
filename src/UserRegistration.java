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
        if (!resultForFirstName) {
            System.out.println("Invalid First Name");
        }
        if (!resultForLastName) {
            System.out.println("Invalid Last Name");
        }
    }

    public void eMailValidation() {
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

    public void phoneNumberValidation() {
        sc = new Scanner(System.in);
        final String phoneNumberPattern = "[0-9]{2}+(\\s)+[6-9][0-9]{9}";
        System.out.print("Enter Phone Number to validate : ");
        String phoneNumber = sc.nextLine();
        boolean resultForPhoneNumberValidation = Pattern.matches(phoneNumberPattern, phoneNumber);
        if (resultForPhoneNumberValidation)
            System.out.println("Phone Number is Valid");
        if (!resultForPhoneNumberValidation)
            System.out.println("Phone Number is Invalid");
    }

    public void passwordValidation() {
        sc = new Scanner(System.in);
        final String passwordPattern = "(?=.*?[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        System.out.print("Enter password to validate : ");
        String password = sc.nextLine();
        boolean resultForPasswordValidation = Pattern.matches(passwordPattern, password);
        if (resultForPasswordValidation)
            System.out.println("Password is Valid");
        if (!resultForPasswordValidation)
            System.out.println("Password is Invalid");
    }

    public void listOfEmailValidation() {
        sc = new Scanner(System.in);
        final String emailPattern = "^[a-zA-Z0-9]{1,}[.+-]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,}){1,2}$";
        System.out.print("Enter Email from List to validate: ");
        String email = sc.nextLine();
        boolean resultForListOfEmail = Pattern.matches(emailPattern, email);
        if (resultForListOfEmail)
            System.out.println("Email ID is acceptable.");
        if (!resultForListOfEmail)
            System.out.println("Email ID is not acceptable.");
    }
}
