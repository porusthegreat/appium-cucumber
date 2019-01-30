package com.appName.appiumDriver;

import io.appium.java_client.AppiumDriver;

public class DriverProvider {

    private static AppiumDriver appiumDriver;

    public static AppiumDriver getDriver() {
        return appiumDriver;
    }

    static void setDriver(AppiumDriver driver) {
        appiumDriver = driver;
    }
}
