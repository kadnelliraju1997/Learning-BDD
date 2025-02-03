package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SSLogin {
	public WebDriver driver;
	@Given("Browser is Opened Url Navigated")
	public void browser_is_opened_url_navigated() {
	    driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	    driver.get("https://www.shoppersstack.com/");
	}

	@Given("login page is displayed")
	public void login_page_is_displayed() {
		 driver.findElement(By.id("loginBtn")).click();
	}

	@Given("Shopper Login page is displayed")
	public void shopper_login_page_is_displayed() {
	  Assert.assertTrue(driver.findElement(By.xpath("//strong[text()='Shopper' and text()=' Login']")).isDisplayed());
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String userName, String password) {
	    driver.findElement(By.id("Email")).sendKeys(userName);
	    driver.findElement(By.id("Password")).sendKeys(password);
	}

	@When("clicks on login button")
	public void clicks_on_login_button() {
	   driver.findElement(By.xpath("//span[normalize-space()='Login']")).click();
	}

	@Then("Shopper is successfully logged in")
	public void shopper_is_successfully_logged_in() {
	   Assert.assertTrue(driver.findElement(By.xpath("//h3[normalize-space()='Hello, Test']")).isDisplayed());
	}

	@Then("Browser is closed")
	public void browser_is_closed() {
	    driver.quit();
	}

	@Given("Merchat Login page is displayed")
	public void merchat_login_page_is_displayed() {
		driver.findElement(By.xpath("//button[@id='vertical-tab-1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//strong[normalize-space()='Merchant Login']")).isDisplayed());
	}

	@When("Merchat enters {string} and {string}")
	public void merchat_enters_and(String userName, String password) {
		 driver.findElement(By.id("Email")).sendKeys(userName);
		    driver.findElement(By.id("Password")).sendKeys(password);
	}

	@Then("Merchant is successfully logged in")
	public void merchant_is_successfully_logged_in() {
	    Assert.assertTrue(driver.findElement(By.xpath("//small[normalize-space()='-  Merchant']")).isDisplayed());
	}

	@Given("Admin Login page is displayed")
	public void admin_login_page_is_displayed() {
		driver.findElement(By.xpath("//button[@id='vertical-tab-2']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//strong[normalize-space()='Admin Login']")).isDisplayed());
	}

	@When("Admin enters {string} and {string}")
	public void admin_enters_and(String userName, String password) {
		 driver.findElement(By.id("Email")).sendKeys(userName);
		    driver.findElement(By.id("Password")).sendKeys(password);
	}

	@Then("Admin is successfully logged in")
	public void admin_is_successfully_logged_in() {
		Assert.assertTrue(driver.findElement(By.xpath("//h6[text()='Approved Merchants']")).isDisplayed());
	}
	

	
}
