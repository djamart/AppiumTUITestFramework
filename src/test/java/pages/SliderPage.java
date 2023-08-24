package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SliderPage {
    public AndroidDriver driver;
    public SliderPage(AndroidDriver driver) {
        this.driver = driver;
    }
    By slider = AppiumBy.accessibilityId("slider");
    public void slideRight() {

    }
    public void slideLeft() {

    }
}

