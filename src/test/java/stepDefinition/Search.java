package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Search {
	public WebDriver driver;
	public String searchItem;

	@Given("Browser is open and URL is navigated Welcome page is displayed")
	public void browser_is_open_and_url_is_navigated_welcome_page_is_displayed() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
	}

	@When("^user enters \"([^\"]*)\" in search text field$")
	public void user_enters_in_search_text_field(String searchItem) {
		this.searchItem=searchItem;
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys(searchItem);
		driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

	@Then("Search results must be displayed")
	public void search_results_must_be_displayed() {
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='Q' and @value='"+searchItem+"']")).isDisplayed());
		driver.quit();
	}
}
