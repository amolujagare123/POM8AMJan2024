package util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {

    public static String getFullformCountry(String shortCountry)
    {

        String convertedCountry = "";

        switch (shortCountry)
        {
            case "US": convertedCountry = "United States"; break;
            case "IN": convertedCountry = "India"; break;
            case "CN": convertedCountry = "China"; break;
            case "BR": convertedCountry = "Brazil"; break;
            case "JP": convertedCountry = "Japan"; break;
            case "RU": convertedCountry = "Russia"; break;
            case "DE": convertedCountry = "Germany"; break;
            case "FR": convertedCountry = "France"; break;
            case "GB": convertedCountry = "United Kingdom"; break;
            case "IT": convertedCountry = "Italy"; break;
            case "CA": convertedCountry = "Canada"; break;
            case "AU": convertedCountry = "Australia"; break;
            case "MX": convertedCountry = "Mexico"; break;
            case "ES": convertedCountry = "Spain"; break;
            case "KR": convertedCountry = "South Korea"; break;
            case "SA": convertedCountry = "Saudi Arabia"; break;
            case "AR": convertedCountry = "Argentina"; break;
            case "NG": convertedCountry = "Nigeria"; break;
            case "ZA": convertedCountry = "South Africa"; break;
            case "ID": convertedCountry = "Indonesia"; break;
            case "TR": convertedCountry = "Turkey"; break;
            case "EG": convertedCountry = "Egypt"; break;
            case "TH": convertedCountry = "Thailand"; break;
            case "CL": convertedCountry = "Chile"; break;
            case "PL": convertedCountry = "Poland"; break;
        }


        return convertedCountry;

    }

    public static String getGender(String genderID)
    {
        String gender="";


        switch (genderID)
        {
            case "0" : gender = "Male";break;
            case "1" : gender = "Female";break;
            case "2" : gender = "Other";break;
        }

        return gender;
    }

    public static String getDate(String dbDate) throws ParseException //yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDate);

        return  new SimpleDateFormat("dd/MM/yyyy").format(date);
    }
}
