package UITesting;

import org.openqa.selenium.support.Color;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenURL;

import static UITesting.util.UIMethods.*;

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
          actual = false;
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

    @Test
    public void lblPasswordSpellCheck()
    {
        String expected = "Password";
        String actual = "";
        try {
             actual = login.lblPassword.getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblPasswordSpellCheck2()
    {
        String expected = "Password";
        String actual = getElementText(login.lblPassword);

    /*    System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/
        Assert.assertEquals(actual,expected);
    }

    @Test

    public void txtUsernameWaterMarkCheck()
    {
        String expected = "Email";
        String actual = getWaterMarkText(login.txtUsername);

    /*    System.out.println("expected="+expected);
        System.out.println("actual="+actual);*/
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblPasswordFontSizeCheck()
    {
        String expected = "14px";
        String actual = getStyle(login.lblPassword,"font-size");

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void lblPasswordFontFamilyCheck()
    {
        String expected = "-apple-system, system-ui, BlinkMacSystemFont, \"Segoe UI\", Roboto, \"Helvetica Neue\", Arial, sans-serif";
        String actual = getStyle(login.lblPassword,"font-family");

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void btnLoginColorCheck()
    {
        String expected = "#2C8EDD";
        String rgbColor = getStyle(login.btnLogin,"background-color");

        String actual = Color.fromString(rgbColor).asHex().toUpperCase();

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);
        Assert.assertEquals(actual,expected);
    }
}
