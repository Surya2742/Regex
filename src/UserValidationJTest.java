import org.junit.Assert;
import org.junit.Test;

public class UserValidationJTest {
    UserRegistration ur = new UserRegistration();
    @Test
    public void firstNameErrorTest() throws UserRegistrationException {
        String firstName = ur.firstNameValidation("surya");
        Assert.assertEquals("Happy", firstName);
    }

    @Test
    public void firstNameSuccessTest() throws UserRegistrationException {
        String firstName = ur.firstNameValidation("Surya");
        Assert.assertEquals("Happy", firstName);
    }

    @Test
    public void lastNameErrorTest() throws UserRegistrationException {
        String lastName = ur.lastNameValidation("vishwakarma");
        Assert.assertEquals("Happy", lastName);
    }
    @Test
    public void lastNameSuccessTest() throws UserRegistrationException {
        String lastName = ur.lastNameValidation("Vishwakarma");
        Assert.assertEquals("Happy", lastName);
    }

    @Test
    public void eMailFailTest() throws UserRegistrationException {
        String eMail = ur.eMailValidation("abc.x@yzbl.co.in");
        Assert.assertEquals("Happy", eMail);
    }
    @Test
    public void eMailSuccessTest() throws UserRegistrationException {
        String eMail = ur.eMailValidation("abc.xyz@bl.co.in");
        Assert.assertEquals("Happy", eMail);
    }

    @Test
    public void phoneNumberFailTest() throws UserRegistrationException {
        String phoneNumber = ur.phoneNumberValidation("8793187950");
        Assert.assertEquals("Happy", phoneNumber);
    }
    @Test
    public void phoneNumberSuccessTest() throws UserRegistrationException {
        String phoneNumber = ur.phoneNumberValidation("91 8793187950");
        Assert.assertEquals("Happy", phoneNumber);
    }

    @Test
    public void passwordRuleOneFailTest() throws UserRegistrationException {
        String password = ur.passwordValidation("Sury@12");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleTwoFailTest() throws UserRegistrationException {
        String password = ur.passwordValidation("surya@123");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleThreeFailTest() throws UserRegistrationException {
        String password = ur.passwordValidation("Surya@Saurabh");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleFourFailTest() throws UserRegistrationException {
        String password = ur.passwordValidation("Surya1234");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordAllRulePassTest() throws UserRegistrationException {
        String password = ur.passwordValidation("suRYa@1234");
        Assert.assertEquals("Happy", password);
    }
}
