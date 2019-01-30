package steps;

import com.appName.appiumDriver.InitDriver;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import io.appium.java_client.AppiumDriver;

import java.net.MalformedURLException;

public class StartingSteps {

    private AppiumDriver driver;

    @Before
    public void beforeSteps() throws MalformedURLException {
        System.out.println("Before steps");
        driver = new InitDriver().init();
    }

    @After
    public void destroyDriver(){
        driver.quit();
    }

}
