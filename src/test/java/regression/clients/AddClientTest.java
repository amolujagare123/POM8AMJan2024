package regression.clients;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.Login;
import pages.Menu;
import pages.clients.AddClient;
import util.DoLogin;

import java.io.IOException;

import static util.ConfigReader.*;

public class AddClientTest extends DoLogin {
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

    @Test
    public void addClientTest()
    {
        Menu menu = new Menu(driver);
        menu.clickAddClient();

        AddClient addClient = new AddClient(driver);

        addClient.enterClientName("John");
        addClient.enterClientSurname("Doe");
        addClient.setLanguage("Thai");
        addClient.enterStreetAddress1("123 Main St");
        addClient.enterStreetAddress2("Apt 101");
        addClient.enterCity("Anytown");
        addClient.enterState("CA");
        addClient.enterZipCode("12345");
        addClient.setCountry("Nepal");
        addClient.setGender("Female");
        addClient.setDate("24/04/2020");
        addClient.enterPhoneNumber("123-456-7890");
        addClient.enterFaxNumber("123-456-7891");
        addClient.enterMobileNumber("987-654-3210");
        addClient.enterEmailAddress("john.doe@example.com");
        addClient.enterWebAddress("http://www.example.com");
        addClient.enterVATID("VAT123");
        addClient.enterTaxesCode("TC456");
        addClient.clickBtnSave();
    }



}
