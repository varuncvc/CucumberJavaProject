package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SearchStepDef extends AbstractMain {
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
	
	@Given("^I am in the Home Page$")
	public void i_am_in_the_Home_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:/Users/VC/Documents/Automation/driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(BASE_URL);
		driver.manage().window().maximize();
		Assert.assertEquals("Tu clothing", driver.getTitle());
	}

	@When("^I enter the search term in search box$")
	public void i_enter_the_search_term_in_search_box() throws Throwable {
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys("shoes");  
	}

	@When("^I click the search button$")
	public void i_click_the_search_button() throws Throwable {
		driver.findElement(SEARCH_BUTTON).click();
	}

	@Then("^I should see the search results$")
	public void i_should_see_the_search_results() throws Throwable {
		Assert.assertEquals("Search results for 'shoes'", driver.findElement(PRODUCT_RESULT).getText()); 
	}

	@When("^I enter the Invalid search term in search box$")
	public void i_enter_the_Invalid_search_term_in_search_box() throws Throwable {
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_TEXTBOX).sendKeys("vkbk4611");    
	}

	@Then("^I should see Sorry, no results for product$")
	public void i_should_see_Sorry_no_results_for_product() throws Throwable {
		Assert.assertEquals("Sorry, no results for 'vkbk4611'", driver.findElement(TITLE_HOLDER).getText());   
	}
	@When("^I click the search button with empty field$")
	public void i_click_the_search_button_with_empty_field() throws Throwable {
		driver.findElement(SEARCH_TEXTBOX).clear();
		driver.findElement(SEARCH_BUTTON).click();
	}

	@Then("^I should see a message to complete the product search$")
	public void i_should_see_a_message_to_complete_the_product_search() throws Throwable {
		Assert.assertEquals("Please complete a product search", driver.findElement(SEARCH_EMPTY).getText());
	}
}
