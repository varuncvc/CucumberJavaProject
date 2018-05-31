package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegisterStepDef extends AbstractMain{
	public static String BASE_URL = "https://tuclothing.sainsburys.co.uk/";
	public static By SEARCH_TEXTBOX = By.cssSelector("#search");
	public static By SEARCH_BUTTON = By.cssSelector(".searchButton");
	public static By STORE_LOCATOR = By.linkText("Tu Store Locator");
	public static By LOCATOR_TEXT = By.cssSelector(".required");
	public static By SEARCH_LOCATION = By.cssSelector(".form.search");
	public static By LOGIN_REGISTER = By.linkText("Tu Log In / Register");
	public static By USER_NAME = By.cssSelector("#j_username");
	public static By PASSWORD = By.cssSelector("#j_password");
	public static By LOGIN_BUTTON = By.cssSelector(".tuButton.loginButtonMain");
	public static By PASSWORD_FORGOTTEN = By.cssSelector(".password-forgotten");
	public static By TEXT_REQUIRED = By.cssSelector(".text.required");
	public static By TU_BUTTONORANGE = By.cssSelector(".tuButton.button.orange");
	public static By TU_BUTTON = By.cssSelector(".tuButton.regToggle");
	public static By LINK_TEXT = By.linkText("Twitter");
	public static By SAINSBURYS_LINK = (By.cssSelector(".sainsburyLink"));
	public static By FBLINK_TEXT = (By.linkText("Facebook"));
	public static By ARGOS_LINK = By.linkText("Argos");
	public static By LINK_HOLIDAYS = By.linkText("Holiday");
	public static By LINK_MEN = By.linkText("Men");
	public static By LINK_SHOES = By.linkText("Shoes");
	public static By LINK_SALE = By.linkText("Sale");
	public static By LINK_SCHOOL = By.linkText("School");
	public static By PRODUCT_DETAIL = By.cssSelector(".details");
	public static By PRODUCT_SIZE = By.cssSelector("#productVariantSize");
	public static By PRODUCT_QTY = By.cssSelector("#productVariantQty");
	public static By ADD_CART = By.cssSelector("#AddToCart");
	public static By CHECKOUT_BUTTON = By.cssSelector(".doCheckoutBut.tuButton");
	public static By BASKET_BUTTON = By.cssSelector("#basketButtonBottom");
	public static By CUSTOMER_ITEM = By.cssSelector(".customer-options--item");
	public static By BUTTON_ORANGE = By.cssSelector(".center.button.orange");
	public static By CUSTOMER_OPTIONS = By.cssSelector(".customer-options--cta");
	public static By STORE_FINDER = By.cssSelector("#storeFinder");
	public static By STORE_QUERY=By.cssSelector("#storelocator-query");
	public static By REGISTER_EMAIL = By.cssSelector("#register_email");
	public static By REGISTER_TITLE = By.id("register_title");
	public static By REGISTER_FIRSTNAME = By.cssSelector("#register_firstName");
	public static By REGISTER_LASTNAME = By.cssSelector("#register_lastName");
	public static By REGISTER_PASSWORD = By.cssSelector("#password");
	public static By CHECK_PASSWORD = By.cssSelector("#register_checkPwd");
	public static By NECTAR_POINTS = By.cssSelector("#regNectarPointsOne");
	public static By CONTACT_PREFERENCES = By.cssSelector("#contactPreferencesId");
	public static By TERMS_CONDITIONS = By.name("termsAndConditions");
	public static By REGISTER_BUTTON = By.cssSelector(".tuButton.registerButton");
	public static By PRODUCT_RESULT=By.cssSelector(".productResultsContainer h1");
	public static By TITLE_HOLDER=By.cssSelector(".title_holder h1");
	public static By SEARCH_EMPTY=By.cssSelector("#search-empty-errors");
	public static By VALID_LOGIN=By.cssSelector(".logged_in");
	public static By ACTUAL_INVALID_LOGIN=By.cssSelector("#globalMessages");
	public static By FORGOTPASSWORD_INVALIDDATA=By.cssSelector(".form_field_error-message");
	public static By LOGIN_EMPTY=By.cssSelector(".form_field_error-message");
	
	
	@When("^I click on the Login or register main button$")
	public void i_click_on_the_Login_or_register_main_button() throws Throwable {
		driver.findElement(LOGIN_REGISTER).click();
		Assert.assertEquals("Register with Tu", driver.findElement(By.cssSelector(".registerFormHolder h2")).getText());  
	}

	@When("^I click on the register button$")
	public void i_click_on_the_register_button() throws Throwable {
		driver.findElement(TU_BUTTON).click();
	}

	@Then("^I enter valid details on the register page$")
	public void i_enter_valid_details_on_the_register_page() throws Throwable {
		driver.findElement(REGISTER_EMAIL).click();
		driver.findElement(REGISTER_EMAIL).sendKeys("arun15kcbbjv@gmail.com");
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mr");
		driver.findElement(REGISTER_FIRSTNAME).clear();
		driver.findElement(REGISTER_FIRSTNAME).sendKeys("Varun");
		driver.findElement(REGISTER_LASTNAME).clear();
		driver.findElement(REGISTER_LASTNAME).sendKeys("Chandrabala");
		driver.findElement(REGISTER_PASSWORD).clear();
		driver.findElement(REGISTER_PASSWORD).sendKeys("tester123");
		driver.findElement(CHECK_PASSWORD).clear();
		driver.findElement(CHECK_PASSWORD).sendKeys("tester123");
		driver.findElement(NECTAR_POINTS).clear();   
	}

	@Then("^I click the terms & conditions check box$")
	public void i_click_the_terms_conditions_check_box() throws Throwable {
		driver.findElement(TERMS_CONDITIONS).click();   
	}

	@Then("^I click on the complete registration button$")
	public void i_click_on_the_complete_registration_button() throws Throwable {
		driver.findElement(REGISTER_BUTTON).click();
		  
	}

	@Then("^I should see a Thank you for registering message$")
	public void i_should_see_a_Thank_you_for_registering_message() throws Throwable {
		Assert.assertEquals("Thank you for registering with Tu", driver.findElement(By.cssSelector(".content-container h2")).getText());   
	}

	@Then("^I enter invalid details on the register page$")
	public void i_enter_invalid_details_on_the_register_page() throws Throwable {
		driver.findElement(REGISTER_EMAIL).click();
		driver.findElement(REGISTER_EMAIL).sendKeys("varuncgmail.com");
		Select dropdown = new Select(driver.findElement(REGISTER_TITLE));
		dropdown.selectByVisibleText("Mr");
		driver.findElement(REGISTER_FIRSTNAME).clear();
		driver.findElement(REGISTER_FIRSTNAME).sendKeys("Varun");
		driver.findElement(REGISTER_LASTNAME).clear();
		driver.findElement(REGISTER_LASTNAME).sendKeys("Chandrabalan");
		driver.findElement(REGISTER_PASSWORD).clear();
		driver.findElement(REGISTER_PASSWORD).sendKeys("tester123");
		driver.findElement(CHECK_PASSWORD).clear();
		driver.findElement(CHECK_PASSWORD).sendKeys("tester123");
		driver.findElement(NECTAR_POINTS).clear();  
	}

	@Then("^I should see a message to enter correct details$")
	public void i_should_see_a_message_to_enter_correct_details() throws Throwable {
		Assert.assertEquals("Please enter a valid email", driver.findElements(By.cssSelector(".error")).get(2).getText()); 
	}


}
