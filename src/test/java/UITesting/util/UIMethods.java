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

    public static String getElementText(WebElement element)
    {
        String result = "";
        try {
            result = element.getText();
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static String getWaterMarkText(WebElement element)
    {
        String result = "";
        try {
            result = element.getAttribute("placeholder");
        }
        catch (Exception e)
        {

        }

        return result;
    }

    public static String getStyle(WebElement element,String style)
    {
        String result = "";
        try {
            result = element.getCssValue(style);
        }
        catch (Exception e)
        {

        }

        return result;
    }


}
