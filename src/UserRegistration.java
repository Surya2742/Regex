import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
    Scanner sc;

    public String firstNameValidation(String firstName) {
        final String FIRSTNAME = "([A-Z][a-z]{2,})";
        if(Pattern.matches(FIRSTNAME, firstName))
            return "Happy";
        return "Sad";
    }

    public String lastNameValidation(String lastName) {
        final String LASTNAME = "([A-Z][a-z]{2,})";
        if (Pattern.matches(LASTNAME, lastName))
            return "Happy";
        return "Sad";
    }

    public String eMailValidation(String eMail) {
        final String emailPattern = "[a-zA-Z1-9]+([.]xyz|)+@bl+[.]co([.]in|)";
        if (Pattern.matches(emailPattern, eMail))
            return "Happy";
        return "Sad";
    }

    public String phoneNumberValidation(String phoneNumber) {
        final String phoneNumberPattern = "[0-9]{2}+(\\s)+[6-9][0-9]{9}";
        if (Pattern.matches(phoneNumberPattern, phoneNumber))
            return "Happy";
        return "Sad";
    }

    public String passwordValidation(String password) {
        final String passwordPattern = "(?=.*?[A-Z])(?=.*[0-9])(?=.{8,})[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
        if (Pattern.matches(passwordPattern, password))
            return "Happy";
        return "Sad";
    }

    public boolean listOfEmailValidation(String emailFromList) {
        final String emailPattern = "^[a-zA-Z0-9]{1,}[.+-]?[a-zA-Z0-9]{1,}?[@][a-zA-Z0-9]{1,}([.][a-zA-Z]{2,}){1,2}$";
        return Pattern.matches(emailPattern, emailFromList);
    }
}
