package sampleTests;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SampleTest {
	@Test
	public void setUp() throws MalformedURLException
	{
		AppiumDriverLocalService service= new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\Admin\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js")).withIPAddress("127.0.0.1").usingPort(4723).build();
		service.start();
		UiAutomator2Options options= new UiAutomator2Options();
		options.setDeviceName("AndroidEmulator1");
		options.setApp("D:\\Projects\\ApkFiles\\ApiDemos-debug.apk"); 
		URL url=URI.create("http://127.0.0.1:4723").toURL();
        AndroidDriver driver = new AndroidDriver(url, options);
		System.out.println("Test pass");
		driver.quit();
		service.stop();
		System.out.println("Service Stopped suscessfully");

	}
}