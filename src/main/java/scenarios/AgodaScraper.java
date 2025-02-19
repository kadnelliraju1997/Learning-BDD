package scenarios;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AgodaScraper {
	public static void main(String[] args) {
		String month = "February 2025";
		String checkInDate = "12";
		String checkOutDate = "13";
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://www.agoda.com/");

		driver.findElement(By.id("textInput")).sendKeys("Bangalore");
		driver.findElement(By.xpath("//ul[@role='listbox']/li[@data-element-value='Bangalore']")).click();
		/*
		 * Enter the check in and check out date
		 */
		driver.findElement(
				By.xpath("//div[text()='February 2025']/ancestor::div[@role='grid']/descendant::span[text()='10']"))
				.click();
		driver.findElement(
				By.xpath("//div[text()='February 2025']/ancestor::div[@role='grid']/descendant::span[text()='12']"))
				.click();
		/*
		 * Click on search button
		 */
		driver.findElement(By.xpath("//button[@data-selenium='searchButton']")).click();
		/*
		 * Click on lowest price tab
		 */
		WebElement lowestPrice = driver.findElement(By.xpath("//button[@data-element-name='search-sort-price']"));
		lowestPrice.click();

		// Wait for results to load
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));

		// Fetch hotel names and prices
		List<WebElement> hotelCards = driver.findElements(By.cssSelector(".property-card"));
		for (WebElement hotelCard : hotelCards) {
			WebElement hotelNameElement = hotelCard.findElement(By.cssSelector(".property-card__name"));
			String hotelName = hotelNameElement.getText();

			WebElement hotelPriceElement = hotelCard.findElement(By.cssSelector(".property-card__price"));
			String hotelPrice = hotelPriceElement.getText();

			System.out.println(hotelName + ": " + hotelPrice);

			driver.quit();
		}

	}
}
