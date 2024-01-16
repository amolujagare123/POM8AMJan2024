package UITesting.util;

import org.openqa.selenium.WebElement;

public class UIMethods {

    public static boolean visibilityCheck(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isDisplayed();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static boolean enabilityCheck(WebElement element)
    {
        boolean result = false;
        try {
            result = element.isEnabled();
        }
        catch (Exception e)
        {

        }

        return result;
    }
}
