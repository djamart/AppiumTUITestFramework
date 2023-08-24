package pages;

import io.appium.java_client.android.AndroidDriver;

public class PageObjectManager {
    public AndroidDriver driver;
    public LoginPage loginPage;
    public NativeViewPage nativeViewPage;
    public SamplesListPage samplesListPage;
    public PageObjectManager(AndroidDriver driver) {
        this.driver = driver;
    }

    public LoginPage getLoginPage() {
        loginPage = new LoginPage(driver);
        return loginPage;
    }
    public NativeViewPage getNativeViewPage() {
        nativeViewPage = new NativeViewPage(driver);
        return nativeViewPage;
    }
    public SamplesListPage getSamplesListPage() {
        samplesListPage = new SamplesListPage(driver);
        return samplesListPage;
    }
}
