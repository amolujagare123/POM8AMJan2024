package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

      static Properties getPropertiesObject() throws IOException {
        // 1. read the file
        FileInputStream fis = new FileInputStream("Config/config.properties");

        // 2. crate the object of Properties class
        Properties prop = new Properties();

        // 3. load the file object using prop object
        prop.load(fis);

        return prop;
    }

   public static String getUrl() throws IOException {

        return  getPropertiesObject().getProperty("url");
    }

    public static String getUsername() throws IOException {
        return  getPropertiesObject().getProperty("username");
    }

    public static String getPassword() throws IOException {

        return  getPropertiesObject().getProperty("password");
    }

}
