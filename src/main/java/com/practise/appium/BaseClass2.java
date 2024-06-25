package com.practise.appium;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;

public class BaseClass2 {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {

		DesiredCapabilities capabilties= new DesiredCapabilities();
		capabilties.setCapability("appium:deviceName", "AndroidEmulator1");
		capabilties.setCapability("platformName", "Android");
		capabilties.setCapability("appium:automationName", "UiAutomator2");
		capabilties.setCapability("appium:app","D:\\Projects\\ApkFiles\\Android.SauceLabs.Mobile.Sample.app.2.7.1.apk");     
		URL url=URI.create("http://127.0.0.1:4723/wd/hub").toURL();
        AndroidDriver driver = new AndroidDriver(url, capabilties);
        Thread.sleep(5000);
//        driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
//        Thread.sleep(2000);
//        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
		System.out.println("Test pass");
		driver.quit();
	}

}
