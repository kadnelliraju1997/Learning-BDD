package stepDefinition;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Register {
	WebDriver driver;
	
	@Given("browser is open")
	public void browser_is_open() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	driver.get("https://demowebshop.tricentis.com/");
	}

	@Given("url is navigated to register page")
	public void url_is_navigated_to_register_page() {
		driver.get("https://demowebshop.tricentis.com/");
		driver.findElement(By.partialLinkText("Register")).click();
	}
	
	@When("user enters valid credentials")
	public void user_enters_valid_credentials(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
		driver.findElement(By.xpath("//input[@value='"+data.get(0).get(0)+"']")).click();
		System.out.println(data.get(0).get(1));
		driver.findElement(By.xpath("//input[@id='FirstName']")).sendKeys(data.get(1).get(1));
		driver.findElement(By.xpath("//input[@id='LastName']")).sendKeys(data.get(1).get(2));
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(data.get(1).get(3));
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(data.get(1).get(4));
		driver.findElement(By.xpath("//input[@id='ConfirmPassword']")).sendKeys(data.get(1).get(4));
				
	}
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
//	    throw new io.cucumber.java.PendingException();
	


//	@When("user enters valid credentials")
//	public void user_enters_valid_credentials() {
//	  driver.findElement(By.id("gender-male")).click();
//	  driver.findElement(By.id("FirstName")).sendKeys("Raju");
//	  driver.findElement(By.id("LastName")).sendKeys("Kadnelli");
//	  driver.findElement(By.id("Email")).sendKeys("raju123.h.gogi@gmail.com");
//	  driver.findElement(By.id("Password")).sendKeys("Password@123");
//	  driver.findElement(By.id("ConfirmPassword")).sendKeys("Password@123");
//	}

	@When("clicks on register button")
	public void clicks_on_register_button() {
	    driver.findElement(By.id("register-button")).click();
	}

	@Then("a new account should be created")
	public void a_new_account_should_be_created() {
	   driver.findElement(By.xpath("//div[ @class='result' and contains(.,'Your registration completed')]")).isDisplayed();
	}
	

	@Then("browser must be closed")
	public void browser_must_be_closed() {
	   driver.quit();
	}
}

