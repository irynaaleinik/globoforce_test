package com.globoforce.autotest.mentoring;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class GloboforceTitleTestGetParamFromJob {

    @Test
    public void testTitle() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        String browserName = System.getProperty("browserName");
        cap.setBrowserName(browserName);
        cap.setPlatform(Platform.fromString("WINDOWS"));
        URL url = new URL("http://10.9.126.5:4444/wd/hub");
        WebDriver driver = new RemoteWebDriver(url, cap);
        driver.get("https://www.globoforce.com/");
        Assert.assertEquals(driver.getTitle(), "Globoforce | Elevate Workplace Culture and Performance | Globoforce");
        driver.quit();
    }
}
