import java.util.Scanner;

public class UserValidationMain {
    public static void main(String[] args) {
        UserRegistration ur = new UserRegistration();
        ur.sc = new Scanner(System.in);
        boolean loop = true;
        while(loop) {
            System.out.println("Welcome to validation program");
            System.out.println("1. Name\t2. Email\t3. PhoneNumber\t4. Password\t5. Email From List\t9.Exit");
            System.out.print("Enter Choice from list to validate : ");
            int choice = ur.sc.nextInt();
            switch (choice) {
                case 1 -> ur.nameValidation();
                case 2 -> ur.eMailValidation();
                case 3 -> ur.phoneNumberValidation();
                case 4 -> ur.passwordValidation();
                case 5 -> ur.listOfEmailValidation();
                case 9 -> loop = false;
            }
        }

    }
}
