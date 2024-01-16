package regression.clients;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;
import util.DoLogin;

import java.io.IOException;
import java.time.Duration;

import static util.ConfigReader.*;
import static util.ForDataProvider.getMyData;

public class AddClientDataProviderTest  extends DoLogin {
 /*   WebDriver driver;

    @BeforeClass
    public void doLogin() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);
        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();

    }*/

    @Test (dataProvider = "getData")
    public void addClientTest(String name, String surname, String language, String address1, String address2,
                              String city, String state, String zip, String country, String gender, String bdate, String phone,
                              String fax, String mobile, String email, String website, String vat, String tax
            ,String expected,String xpathActual) {


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.enterClientName(name);
        addClient.enterClientSurname(surname);
        addClient.setLanguage(language);
        addClient.enterStreetAddress1(address1);
        addClient.enterStreetAddress2(address2);
        addClient.enterCity(city);
        addClient.enterState(state);
        addClient.enterZipCode(zip);
        addClient.setCountry(country);
        addClient.setGender(gender);
        addClient.setDate(bdate);
        addClient.enterPhoneNumber(phone);
        addClient.enterFaxNumber(fax);
        addClient.enterMobileNumber(mobile);
        addClient.enterEmailAddress(email);
        addClient.enterWebAddress(website);
        addClient.enterVATID(vat);
        addClient.enterTaxesCode(tax);
        addClient.clickBtnSave();


        String actual = "";
        try {
            actual = driver.findElement(By.xpath(xpathActual)).getText();
        }
        catch (Exception e)
        {

        }

        System.out.println("expected:"+expected);
        System.out.println("actual:"+actual);

        Assert.assertEquals(actual,expected,"wrong message");
    }


    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("Data/ip.xlsx","Sheet1");
    }

}
