import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface IValidation {
    String validate(String regex, String inputStr);
}

public class LambdaValidation {
    static Scanner sc = new Scanner(System.in);

    public static void firstNameValidation() {
        System.out.print("Enter your First Name : ");
        String input = sc.next();
        IValidation firstNameValidate = (pattern, firstName) -> "The input provided is " + Pattern.matches(pattern, firstName);
        System.out.println(firstNameValidate.validate("([A-Z][a-z]{2,})", input));
    }

    public static void lastNameValidation() {
        System.out.print("Enter your Last Name : ");
        String input = sc.next();
        IValidation lastNameValidate = (pattern, lastName) -> "The input provided is " + Pattern.matches(pattern, lastName);
        System.out.println(lastNameValidate.validate("([A-Z][a-z]{2,})", input));
    }

    public static void emailValidation() {
        System.out.print("Enter your Email ID : ");
        String input = sc.next();
        IValidation emailValidate = (pattern, email) -> "The input provided is " + Pattern.matches(pattern, email);
        System.out.println(emailValidate.validate("[a-zA-Z1-9]+([.]xyz|)+@bl+[.]co([.]in|)", input));
    }

    public static void phoneNumberValidation() {
        System.out.print("Enter your Phone Number : ");
        String input = sc.useDelimiter("\n").next();
        IValidation phoneNumberValidate = (pattern, phoneNumber) -> "The input provided is " + Pattern.matches(pattern, phoneNumber);
        System.out.println(phoneNumberValidate.validate("[0-9]{2}(\s)[6-9][0-9]{9}", input));
    }

    public static void passwordValidation() {
        System.out.print("Enter your Password : ");
        String input = sc.next();
        IValidation passwordValidate = (pattern, password) -> "The input provided is " + Pattern.matches(pattern, password);
        System.out.println(passwordValidate.validate("(?=.*?[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*", input));
    }

    public static void main(String[] args) {
        while (true) {
            System.out.print("1.FirstName Validation, 2.LastName Validation, 3.Email Validation, 4.PhoneNumber Validation, 5.Password Validation, 6.Exit.\nEnter input : ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    firstNameValidation();
                    break;
                case 2:
                    lastNameValidation();
                    break;
                case 3:
                    emailValidation();
                    break;
                case 4:
                    phoneNumberValidation();
                    break;
                case 5:
                    passwordValidation();
                    break;
                case 6:
                    System.out.println("Exit.");
                    return;
                default:
                    System.out.println("Wrong input.");
                    break;

            }
        }
    }

}