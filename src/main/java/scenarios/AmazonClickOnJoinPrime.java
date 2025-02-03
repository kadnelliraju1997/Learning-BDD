package scenarios;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonClickOnJoinPrime {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in");
//		driver.switchTo().alert().sendKeys("");

		WebElement prime = driver.findElement(By.xpath("//span[text()='Prime']"));
		Actions action = new Actions(driver);
		action.moveToElement(prime).perform();
		driver.findElement(By.xpath("//img[@id='multiasins-img-link']")).click();

	}

}
