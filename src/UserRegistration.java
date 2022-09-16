import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc;

    public String firstNameValidation(String firstName) throws UserRegistrationException {
        final String FIRSTNAME = "([A-Z][a-z]{2,})";
        if(Pattern.matches(FIRSTNAME, firstName))
            return "Happy";
        else {
            throw new UserRegistrationException("Invalid First Name.");
        }
    }

    public String lastNameValidation(String lastName) throws UserRegistrationException {
        final String LASTNAME = "([A-Z][a-z]{2,})";
        if (Pattern.matches(LASTNAME, lastName))
            return "Happy";
        else {
            throw new UserRegistrationException("Invalid Last Name.");
        }
    }

    public String eMailValidation(String eMail) throws UserRegistrationException {
        final String emailPattern = "[a-zA-Z1-9]+([.]xyz|)+@bl+[.]co([.]in|)";
        if (Pattern.matches(emailPattern, eMail))
            return "Happy";
        else {
            throw new UserRegistrationException("Invalid Email ID.");
        }
    }

    public String phoneNumberValidation(String phoneNumber) throws UserRegistrationException {
        final String phoneNumberPattern = "[0-9]{2}+(\\s)+[6-9][0-9]{9}";
        if (Pattern.matches(phoneNumberPattern, phoneNumber))
            return "Happy";
        else {
            throw new UserRegistrationException("Invalid Phone Number.");
        }
    }

    public String passwordValidation(String password) throws UserRegistrationException {
        final String passwordPattern = "(?=.*?[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        if (Pattern.matches(passwordPattern, password))
            return "Happy";
        else {
            throw new UserRegistrationException("Invalid Password.");
        }
    }

    public boolean listOfEmailValidation(String emailFromList) throws UserRegistrationException {
        final String emailPattern = "^[a-zA-Z0-9]{1,}[.+-]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,}){1,2}$";
        if (Pattern.matches(emailPattern, emailFromList))
            return true;
        else
            throw new UserRegistrationException("Invalid Email from List.");
    }
}
