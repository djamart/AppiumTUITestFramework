package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class NativeViewPage {
    public AndroidDriver driver;
    public NativeViewPage(AndroidDriver driver) {
        this.driver = driver;
    }
    By nativeViewOne = By.xpath("//android.view.ViewGroup[@content-desc=\"viewgroup2\"]");
    By nativeViewTwo = By.xpath("//android.view.ViewGroup[@content-desc=\"viewgroup2\"]");
    By nativeViewTree = By.xpath("//android.view.ViewGroup[@content-desc=\"viewgroup3\"]");

    public void checkViewOne() {
        driver.findElements(nativeViewOne);
    }
    public void checkViewTwo() {
        driver.findElements(nativeViewTwo);
    }
    public void checkViewTree() {
        driver.findElements(nativeViewTree);
    }
}

