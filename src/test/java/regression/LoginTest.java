package regression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.Login;
import util.OpenURL;

import java.io.IOException;

import static util.ConfigReader.*;

public class LoginTest extends OpenURL {

    @Test
    public void loginTest() throws IOException {

        Login login = new Login(driver);
        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();
    }
}
