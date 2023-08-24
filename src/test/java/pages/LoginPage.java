package pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class LoginPage {
    public AndroidDriver driver;
    public LoginPage(AndroidDriver driver) {
        this.driver = driver;
    }
    By username = By.xpath("//android.widget.EditText[@content-desc=\"username\"]");
    By password = By.xpath("//android.widget.EditText[@content-desc=\"password\"]");
    By loginButton = By.xpath("//android.view.ViewGroup[@content-desc=\"login\"]/android.widget.Button/android.widget.TextView");
    By backButton = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[1]");
    By loginTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]");
    By samplesListTitle = By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[2]");

    public void checkLoginPageTitle() {
        driver.findElement(loginTitle);
    }
    public void enterUsername() {
        driver.findElement(username).sendKeys("admin");
    }
    public void enterPassword() {
        driver.findElement(password).sendKeys("admin");
    }
    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }
    public void clickBackButton() {
        driver.findElement(backButton).click();
    }
    public void checkSamplesListPageTitle() {
        driver.findElement(samplesListTitle);
    }
}

