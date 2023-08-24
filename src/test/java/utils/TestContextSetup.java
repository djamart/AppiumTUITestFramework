package utils;

import io.appium.java_client.android.AndroidDriver;
import pages.LoginPage;
import pages.NativeViewPage;
import pages.PageObjectManager;
import pages.SamplesListPage;

import java.io.IOException;
import java.net.MalformedURLException;

public class TestContextSetup {

    public AndroidDriver driver;
    public LoginPage loginPage;
    public NativeViewPage nativeViewPage;
    public SamplesListPage samplesListPage;
    public PageObjectManager pageObjectManager;
    public TestBase testBase;
    public TestContextSetup() throws IOException {
        testBase = new TestBase();
        pageObjectManager = new PageObjectManager(testBase.AndroidDriverManager());
    }
}
