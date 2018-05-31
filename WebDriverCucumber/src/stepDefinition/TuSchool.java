package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TuSchool extends AbstractMain {
	public static By LINK_SCHOOL = By.linkText("School");
	@When("^I click on the tu School link$")
	public void i_click_on_the_tu_School_link() throws Throwable {
		driver.findElement(LINK_SCHOOL).click();
	}

	@Then("^I should see the tu School page$")
	public void i_should_see_the_tu_School_page() throws Throwable {
		Assert.assertEquals("School Clothes & Shoes | School Shop | Tu clothing", driver.getTitle()); 
	}

}
