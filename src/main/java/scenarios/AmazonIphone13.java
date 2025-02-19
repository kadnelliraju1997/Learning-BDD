package scenarios;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonIphone13 {
	public static void main(String[] args) {
		String s = "Apple iPhone 15 (128 GB) - Blue";
		String iphone15 = "Apple iPhone 15 (128 GB) - Blue"; 
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 15",Keys.ENTER);
		WebElement iphone13 = driver.findElement(By.xpath("//h2[@aria-label='Sponsored Ad - "+iphone15+"']//span[contains(text(),'"+iphone15+"')]"));
		System.out.println(iphone13.getText());
		driver.quit();
	}
}
 