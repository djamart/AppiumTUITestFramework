package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class TestBase {
     public AndroidDriver driver;

     public AndroidDriver AndroidDriverManager() throws IOException {

         FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\resources\\global.properties");
         Properties prop = new Properties();
         prop.load(fis);
         String platformName = prop.getProperty("platformName");
         String platformVersion = prop.getProperty("platformVersion");
         String automationName = prop.getProperty("automationName");
         String appPackage = prop.getProperty("appPackage");
         String appActivity = prop.getProperty("appActivity");
         String deviceName = prop.getProperty("deviceName");
         String appiumServerURL = prop.getProperty("appiumServerURL");

         // UiAutomator driver options
         UiAutomator2Options options = new UiAutomator2Options();
         options.setPlatformName(platformName);
         options.setPlatformVersion(platformVersion);
         options.setAutomationName(automationName);
         options.setAppPackage(appPackage);
         options.setAppActivity(appActivity);
         options.setDeviceName(deviceName);
         options.setNoReset(true); // Prevents permission screen and old app warnings

         // Initialize the driver
         if(driver == null) {
             driver = new AndroidDriver(new URL(appiumServerURL), options);
         }

         return driver;
     }
}
