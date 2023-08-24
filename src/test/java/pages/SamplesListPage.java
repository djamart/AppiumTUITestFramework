package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class SamplesListPage {
    public AndroidDriver driver;
    public SamplesListPage(AndroidDriver driver) {
        this.driver = driver;
    }
    By nativeViewButton = By.xpath("//android.view.ViewGroup[@content-desc=\"chainedView\"]/android.view.ViewGroup");
    public void clickNativeViewButton() {
        driver.findElement(nativeViewButton).click();
    }
    public void checkNativeViewButton() {
        driver.findElement(nativeViewButton);
    }
}

