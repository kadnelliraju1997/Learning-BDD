package scenarios;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class BrowserStack_Com {

	public static void main(String[] args) throws MalformedURLException {
		String username="rajukadnelli_w9mvtZ";
		String password="JiX6sdRTQPkub568ykmV";
		MutableCapabilities capabilities = new MutableCapabilities();
		HashMap<String, Object> bstackOptions = new HashMap<String, Object>();
		capabilities.setCapability("browserName", "Chrome");
		bstackOptions.put("os", "Windows");
		bstackOptions.put("osVersion", "10");
		bstackOptions.put("browserVersion", "130.0");
//		bstackOptions.put("userName", "rajukadnelli_w9mvtZ");
//		bstackOptions.put("accessKey", "JiX6sdRTQPkub568ykmV");
		bstackOptions.put("consoleLogs", "info");
		capabilities.setCapability("bstack:options", bstackOptions);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("https://"+username+":"+password+"@hub-cloud.browserstack.com/wd/hub"),capabilities);
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		}
}
