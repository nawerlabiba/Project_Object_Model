package step_definitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import base.Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Employee_Subscription_Form_Heading_Validation extends Base {
	@Given("I am in Emplyee Subscription Page")
	public void i_am_in_emplyee_subscription_page() {
		navigateURL("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
		String expectedTile = "Employee Subscription Form";
		String actualTitle = browser.getTitle();
		//Assert.assertEquals(false, false);      // TestNG

		assertEquals(actualTitle, expectedTile);  // Cucumber
	}

	@When("I load the page in browser")
	public void i_load_the_page_in_browser()  {
		String text = getText( By.linkText("Visit My Linkedin Account") );
		
	    assertEquals(text, "Visit My Linkedin Account");
	}

	@Then("verify the page Title is {string}")
	public void verify_the_page_title_is(String s) throws InterruptedException {
		String headingText = getText(By.tagName("h2"));

	    assertEquals(headingText, s);
	}
	
	
	@Then("I can see the link of my Linkedin Link")
	public void i_can_see_the_link_of_my_linkedin_link()  {
	    boolean displayed = isDisplayed(By.xpath("//a[@href='https://linkedin.com/in/mbcsdet']"));

	    assertEquals(displayed, true);
	}

	
	
}


//navigateURL("https://sit.skyschooling.com//sdet//selenium//xpath//index.html");
//

//Assert.assertEquals(headingText, "Employee Subscription Form");
