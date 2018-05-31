package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TuMen extends AbstractMain {
	public static String BASE_URL = "https://tuclothing.sainsburys.co.uk/";
	public static By LINK_MEN = By.linkText("Men");
	@When("^I click on the tu men link$")
	public void i_click_on_the_tu_men_link() throws Throwable {
		driver.findElement(LINK_MEN).click();
		driver.manage().window().fullscreen();
	}

	@Then("^I should see the tu men page$")
	public void i_should_see_the_tu_men_page() throws Throwable {
		Assert.assertEquals("Mens Clothing | Jeans, T-Shirts, Shirts | Tu Clothing", driver.getTitle());
	}
}
