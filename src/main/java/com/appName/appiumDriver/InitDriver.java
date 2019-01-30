package com.appName.appiumDriver;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class InitDriver {

    public AppiumDriver init() throws MalformedURLException {

        AppiumDriver driver;

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium-version", "1.7.1");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("deviceName", "Google_Nexus_5X");
        capabilities.setCapability("newCommandTimeout", 120);
        capabilities.setCapability("app", "path_to_apk");
        capabilities.setCapability("clearSystemFiles", true);

        driver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        DriverProvider.setDriver(driver);
        return driver;
    }

}
