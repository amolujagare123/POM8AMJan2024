package UITesting;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenURL;

import static UITesting.util.UIMethods.enabilityCheck;
import static UITesting.util.UIMethods.visibilityCheck;

public class LoginTest extends OpenURL {
    Login login;
    @BeforeClass
    public void initLogin()
    {
        login = new Login(driver);
    }

    @Test
    public void txtUsernameVisibilityCheck()
    {
        boolean expected = true;
        boolean actual = false;
        try {
             actual = login.txtUsername.isDisplayed();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUsernameVisibilityCheck2()
    {
        boolean expected = true;
        boolean actual = visibilityCheck(login.txtUsername);
     /*   System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtPasswordVisibilityCheck2()
    {
        boolean expected = true;
        boolean actual = visibilityCheck(login.txtPassword);
     /*   System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUsernameEnabilityCheck()
    {
        boolean expected = true;
        boolean actual = false;
        try {
            actual = login.txtUsername.isEnabled();
        }
        catch (Exception e)
        {

        }
        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void txtUsernameEnabilityCheck2()
    {
        boolean expected = true;
        boolean actual = enabilityCheck(login.txtUsername);

        /*System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/

        Assert.assertEquals(actual,expected);
    }


}
