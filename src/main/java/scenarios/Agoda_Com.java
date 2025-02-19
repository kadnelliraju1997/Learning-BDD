package scenarios;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agoda_Com {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.get(
				"https://www.agoda.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.findElement(By.xpath("//input[@placeholder='Enter a destination or property']")).sendKeys("Ban");
		driver.findElement(By.xpath("//li[contains(@aria-label,'Top destination Bangalore, India (City)')]")).click();
		driver.findElement(By.xpath(
				"//div[@class='PriceSurgePicker-Day__container PriceSurgePicker-Day__container--checkIn PriceSurgePicker-Day__container--selected PriceSurgePicker-Day__container--wide']//div[@class='PriceSurgePicker-Day__circle PriceSurgePicker-Day__circle--filled PriceSurgePicker-Day__circle--selected PriceSurgePicker-Day__circle--wide']"))
				.click();
		driver.findElement(By.xpath(
				"//div[@class='PriceSurgePicker-Day__container PriceSurgePicker-Day__container--checkOut PriceSurgePicker-Day__container--selected PriceSurgePicker-Day__container--wide']//div[@class='PriceSurgePicker-Day__circle PriceSurgePicker-Day__circle--filled PriceSurgePicker-Day__circle--selected PriceSurgePicker-Day__circle--wide']"))
				.click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='SEARCH']")).click();
		driver.findElement(By.xpath("//button[contains(@data-element-name,'search-sort-price')]")).click();
		List<WebElement> hotelName = driver.findElements(By.xpath("//div[@id='searchPageRightColumn']//header[@data-element-name='property-info-header']//h3"));
		List<WebElement> hotelPrice = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(
				((By.xpath("//li[@data-selenium='hotel-item']//div[@data-element-name='final-price']")))));

		for (int i = 0; i < hotelName.size(); i++) {
			Thread.sleep(2000);
			System.out.println(hotelName.get(i).getText().trim() );
		}
	}
}
