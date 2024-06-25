package com.practise.appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
       
		AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("AndroidEmulator1");
		options.setApp("D:\\Projects\\ApkFiles\\ApiDemos-debug.apk");
//		DesiredCapabilities capabilties= new DesiredCapabilities();
//		capabilties.setCapability("appium:deviceName", "AndroidEmulator1");
//		capabilties.setCapability("platformName", "Android");
//		capabilties.setCapability("appium:automationName", "UiAutomator2");
//		capabilties.setCapability("appium:app", "D:\\Projects\\ApkFiles\\ApiDemos-debug.apk");     
		URL url=URI.create("http://127.0.0.1:4723").toURL();
        AndroidDriver driver = new AndroidDriver(url, options);
        Thread.sleep(5000);
        driver.findElement(AppiumBy.accessibilityId("Access'ibility")).click();
        Thread.sleep(2000);
        driver.findElement(AppiumBy.accessibilityId("Accessibility Node Querying")).click();
		System.out.println("Test pass");
		driver.quit();
		service.stop();
	}

}
