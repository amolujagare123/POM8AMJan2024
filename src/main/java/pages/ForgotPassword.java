package pages;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ForgotPassword {
    public ForgotPassword( WebDriver driver)
    {
        PageFactory.initElements(driver,this);
    }
    @FindBy (id="email")
    WebElement txtEmail;
    public void setTxtEmail(String email)
    {
        txtEmail.sendKeys(email);
    }
    @FindBy(xpath = "//button")
    WebElement btnReset;




    public void clickBtnReset()
    {
        btnReset.click();
    }
}
