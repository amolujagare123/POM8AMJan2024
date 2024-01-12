package pages.clients;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddClient {

    @FindBy(xpath = "//input[@id='client_name']")
    WebElement clientName;
    @FindBy (xpath = "//input[@id='client_surname']") WebElement clientSurname;
    @FindBy (xpath = "//input[@id='client_address_1']") WebElement streetAddress1;
    @FindBy (xpath = "//input[@id='client_address_2']") WebElement streetAddress2;
    @FindBy (xpath = "//input[@id='client_city']") WebElement city;
    @FindBy (xpath = "//input[@id='client_state']") WebElement state;
    @FindBy (xpath = "//input[@id='client_zip']") WebElement zipCode;
    @FindBy (xpath = "//input[@id='client_phone']") WebElement phoneNumber;
    @FindBy (xpath = "//input[@id='client_fax']") WebElement faxNumber;
    @FindBy (xpath = "//input[@id='client_mobile']") WebElement mobileNumber;
    @FindBy (xpath = "//input[@id='client_email']") WebElement emailAddress;
    @FindBy (xpath = "//input[@id='client_web']") WebElement webAddress;
    @FindBy (xpath = "//input[@id='client_vat_id']") WebElement vATID;
    @FindBy (xpath = "//input[@id='client_tax_code']") WebElement taxesCode;

    @FindBy (id = "select2-client_language-container")
    WebElement containerLanguage;
    @FindBy (xpath = "//input[@role='searchbox']")
    WebElement searchBox;

    //li[normalize-space()='English']

    WebDriver driver;
    public void setLanguage(String language)
    {
        containerLanguage.click();
        searchBox.sendKeys(language);
        System.out.println("//li[normalize-space()='"+language+"']");
        driver.findElement(By.xpath("//li[normalize-space()='"+language+"']")).click();
    }
    @FindBy (xpath = "//span[@id='select2-client_country-container']")
    WebElement containerCountry;

    public void setCountry(String country)
    {
        containerCountry.click();
        searchBox.sendKeys(country);
        System.out.println("//li[normalize-space()='"+country+"']");
        driver.findElement(By.xpath("//li[normalize-space()='"+country+"']")).click();
    }

    @FindBy (xpath = "//span[@id='select2-client_gender-container']")
    WebElement containerGender;

    public void setGender(String gender)
    {
        containerGender.click();

        System.out.println("//li[normalize-space()='"+gender+"']");
        driver.findElement(By.xpath("//li[normalize-space()='"+gender+"']")).click();
    }

    @FindBy (xpath = "//button[@id='btn-submit']")
    WebElement btnSave;

    public void clickBtnSave()
    {
        btnSave.click();
    }

    @FindBy (xpath = "//input[@id='client_birthdate']")
    WebElement birthdate;

    public void setDate(String bDate)
    {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].setAttribute('value','"+bDate+"')",birthdate);
    }

    public AddClient(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // Action methods to interact with the WebElements
    public void enterClientName(String name) {
        clientName.clear();
        clientName.sendKeys(name);
    }

    public void enterClientSurname(String surname) {
        clientSurname.clear();
        clientSurname.sendKeys(surname);
    }

    public void enterStreetAddress1(String address) {
        streetAddress1.clear();
        streetAddress1.sendKeys(address);
    }

    public void enterStreetAddress2(String address) {
        streetAddress2.clear();
        streetAddress2.sendKeys(address);
    }

    public void enterCity(String cityName) {
        city.clear();
        city.sendKeys(cityName);
    }

    public void enterState(String stateName) {
        state.clear();
        state.sendKeys(stateName);
    }

    public void enterZipCode(String zip) {
        zipCode.clear();
        zipCode.sendKeys(zip);
    }

    public void enterPhoneNumber(String phone) {
        phoneNumber.clear();
        phoneNumber.sendKeys(phone);
    }

    public void enterFaxNumber(String fax) {
        faxNumber.clear();
        faxNumber.sendKeys(fax);
    }

    public void enterMobileNumber(String mobile) {
        mobileNumber.clear();
        mobileNumber.sendKeys(mobile);
    }

    public void enterEmailAddress(String email) {
        emailAddress.clear();
        emailAddress.sendKeys(email);
    }

    public void enterWebAddress(String web) {
        webAddress.clear();
        webAddress.sendKeys(web);
    }

    public void enterVATID(String vat) {
        vATID.clear();
        vATID.sendKeys(vat);
    }

    public void enterTaxesCode(String taxCode) {
        taxesCode.clear();
        taxesCode.sendKeys(taxCode);
    }
}
