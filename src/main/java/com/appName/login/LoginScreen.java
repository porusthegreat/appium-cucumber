package com.appName.login;

import com.appName.BaseScreen;
import com.appName.appiumDriver.DriverProvider;

public class LoginScreen extends BaseScreen {

    public LoginScreen() {
        driver = DriverProvider.getDriver();
    }
}
