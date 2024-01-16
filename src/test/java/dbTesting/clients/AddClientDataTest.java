package dbTesting.clients;


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
import java.sql.*;
import java.text.ParseException;
import java.time.Duration;
import java.util.ArrayList;

import static util.ConfigReader.*;
import static util.Conversion.*;
import static util.ForDataProvider.getMyData;

public class AddClientDataTest extends DoLogin {
/*
    WebDriver driver;

    @BeforeClass
    public void doLogin() throws IOException {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(getUrl());

        Login login = new Login(driver);
        login.setTxtUsername(getUsername());
        login.setTxtPassword(getPassword());
        login.clickLogin();

    }
*/

    @Test (dataProvider = "getData")
    public void addClientTest(String name, String surname, String language, String address1, String address2,
                              String city, String state, String zip, String country, String gender, String bdate, String phone,
                              String fax, String mobile, String email, String website, String vat, String tax) throws ClassNotFoundException, SQLException, ParseException {


        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        ArrayList<String> expected = new ArrayList<>();
        expected.add(name);
        expected.add(surname);
        expected.add(language.toLowerCase());
        expected.add(address1);
        expected.add(address2);
        expected.add(city);
        expected.add(state);
        expected.add(zip);
        expected.add(country);
        expected.add(gender);
        expected.add(bdate);
        expected.add(phone);
        expected.add(fax);
        expected.add(mobile);
        expected.add(email);
        expected.add(website);
        expected.add(vat);
        expected.add(tax);

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


        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ip","root","root");
        Statement st = con.createStatement();

        String sql = "SELECT * FROM ip_clients where client_name='"+name+"'";

        ResultSet rs = st.executeQuery(sql);

        ArrayList<String> actual = new ArrayList();

        while (rs.next())
        {
            actual.add(rs.getString("client_name"));
            actual.add(rs.getString("client_surname"));
            actual.add(rs.getString("client_language"));
            actual.add(rs.getString("client_address_1"));
            actual.add(rs.getString("client_address_2"));
            actual.add(rs.getString("client_city"));
            actual.add(rs.getString("client_state"));
            actual.add(rs.getString("client_zip"));

            String shortCountry = rs.getString("client_country");
            String countryValue = getFullformCountry(shortCountry);

            actual.add(countryValue);


            actual.add(getGender(rs.getString("client_gender")));


            actual.add(getDate(rs.getString("client_birthdate")));


            actual.add(rs.getString("client_phone"));
            actual.add(rs.getString("client_fax"));
            actual.add(rs.getString("client_mobile"));
            actual.add(rs.getString("client_email"));
            actual.add(rs.getString("client_web"));
            actual.add(rs.getString("client_vat_id"));
            actual.add(rs.getString("client_tax_code"));

        }

        System.out.println("expected="+expected);
        System.out.println("actual="+actual);

        Assert.assertEquals(actual,expected,"Data mismatch");

    }


    @DataProvider
    public Object[][] getData() throws IOException {
        return getMyData("Data/ip.xlsx","dbTesting");
    }

}
