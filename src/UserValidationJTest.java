import org.junit.Assert;
import org.junit.Test;

public class UserValidationJTest {
    UserRegistration ur = new UserRegistration();
    @Test
    public void firstNameErrorTest() {
        String firstName = ur.firstNameValidation("surya");
        Assert.assertEquals("Happy", firstName);
    }
    @Test
    public void firstNameSuccessTest() {
        String firstName = ur.firstNameValidation("Surya");
        Assert.assertEquals("Happy", firstName);
    }

    @Test
    public void lastNameErrorTest() {
        String lastName = ur.lastNameValidation("vishwakarma");
        Assert.assertEquals("Happy", lastName);
    }
    @Test
    public void lastNameSuccessTest() {
        String lastName = ur.lastNameValidation("Vishwakarma");
        Assert.assertEquals("Happy", lastName);
    }

    @Test
    public void eMailFailTest() {
        String eMail = ur.eMailValidation("abc.x@yzbl.co.in");
        Assert.assertEquals("Happy", eMail);
    }
    @Test
    public void eMailSuccessTest() {
        String eMail = ur.eMailValidation("abc.xyz@bl.co.in");
        Assert.assertEquals("Happy", eMail);
    }

    @Test
    public void phoneNumberFailTest() {
        String phoneNumber = ur.phoneNumberValidation("8793187950");
        Assert.assertEquals("Happy", phoneNumber);
    }
    @Test
    public void phoneNumberSuccessTest() {
        String phoneNumber = ur.phoneNumberValidation("91 8793187950");
        Assert.assertEquals("Happy", phoneNumber);
    }

    @Test
    public void passwordRuleOneFailTest() {
        String password = ur.passwordValidation("Sury@12");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleTwoFailTest() {
        String password = ur.passwordValidation("surya@123");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleThreeFailTest() {
        String password = ur.passwordValidation("Surya@Saurabh");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordRuleFourFailTest() {
        String password = ur.passwordValidation("Surya1234");
        Assert.assertEquals("Happy", password);
    }
    @Test
    public void passwordAllRulePassTest() {
        String password = ur.passwordValidation("suRYa@1234");
        Assert.assertEquals("Happy", password);
    }
}
