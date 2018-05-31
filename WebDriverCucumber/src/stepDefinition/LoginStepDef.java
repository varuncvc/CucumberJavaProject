package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStepDef extends AbstractMain{
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
	public static By ACTUAL_INVALID_LOGIN=By.cssSelector(".information_message.negative");
	public static By FORGOTPASSWORD_INVALIDDATA=By.cssSelector(".form_field_error-message");
	public static By LOGIN_EMPTY=By.cssSelector(".form_field_error-message");
	
	@When("^I click on the login page$")
	public void i_click_on_the_login_page() throws Throwable {
		driver.findElement(LOGIN_REGISTER).click();
	}

	@When("^I enter the username and passwod$")
	public void i_enter_the_username_and_passwod() throws Throwable {
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("varuncvc@gmail.com");
		driver.findElement(PASSWORD).clear();
		driver.findElement(PASSWORD).sendKeys("tester123"); 
	}

	@When("^I click the login button$")
	public void i_click_the_login_button() throws Throwable {
		driver.findElement(LOGIN_BUTTON).click();
		 
	}

	@Then("^I should see username on top righthand corner$")
	public void i_should_see_username_on_top_righthand_corner() throws Throwable {
		Assert.assertEquals("Hello Varun Chandrabalan", driver.findElement(VALID_LOGIN).getText());  
	}
	@When("^I enter the Invalid username and passwod$")
	public void i_enter_the_Invalid_username_and_passwod() throws Throwable {
		driver.findElement(USER_NAME).clear();
		driver.findElement(USER_NAME).sendKeys("varuncvcgmail.com");
		driver.findElement(PASSWORD).clear();
		driver.findElement(PASSWORD).sendKeys("tester123");
	}

	@Then("^I should get a message to check the field and try again$")
	public void i_should_get_a_message_to_check_the_field_and_try_again() throws Throwable {
		Assert.assertEquals("Please check the fields below and try again", driver.findElement(ACTUAL_INVALID_LOGIN).getText());
	}

}
