package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommunityPoll extends Login {

	@When("user enters valid email id and clicks on subscribe button")
	public void user_enters_valid_email_id_and_clicks_on_subscribe_button(DataTable dataTable) {
		List<List<String>> data = dataTable.asLists();
	   System.out.println("Hello");
	   driver.findElement(By.id("newsletter-email")).sendKeys(data.get(0).get(0));
	   driver.findElement(By.id("newsletter-subscribe-button")).click();
	   
	}
	@Then("user should be able to successfully subscribe")
	public void user_should_be_able_to_successfully_subscribe() {
		  System.out.println("Hi");
	}
}
