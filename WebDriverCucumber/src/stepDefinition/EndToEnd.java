package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class EndToEnd extends AbstractMain {
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
	public static By STORE_QUERY=By.cssSelector(".text.required");
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
	public static By PAYMENT_BUTTON=By.cssSelector(".button.orange.center");
	@Given("^I select the product size and quantity and add to basket$")
	public void i_select_the_product_size_and_quantity_and_add_to_basket() throws Throwable {
		Thread.sleep(3000);
		Select dropdown = new Select(driver.findElement(PRODUCT_SIZE));
		dropdown.selectByIndex(05);
		Thread.sleep(3000);
		Select dropdowns = new Select(driver.findElement(PRODUCT_QTY));
		dropdowns.selectByIndex(01);
		driver.findElement(ADD_CART).click();
	}

	@When("^I click the checkout button I see my shopping bag$")
	public void i_click_the_checkout_button_I_see_my_shopping_bag() throws Throwable {
		driver.findElement(CHECKOUT_BUTTON).click();
		Assert.assertEquals("Your shopping bag | Tu clothing", driver.getTitle());
	}

	@When("^I click proceed to check out and I see all my delivery options$")
	public void i_click_proceed_to_check_out_and_I_see_all_my_delivery_options() throws Throwable {
		driver.findElement(BASKET_BUTTON).click();
		Assert.assertEquals("Delivery options", driver.findElement(By.cssSelector(".checkout-step-title")).getText());
	}

	@When("^I choose click & collect and click proceed button$")
	public void i_choose_click_collect_and_click_proceed_button() throws Throwable {
		driver.findElements(CUSTOMER_ITEM).get(0).click();
		
	}

	@Then("^it should ask my nearest participating Click & Collect store$")
	public void it_should_ask_my_nearest_participating_Click_Collect_store() throws Throwable {
		driver.findElement(BUTTON_ORANGE).click();
	}

	@When("^I enter my postcode and click on find store button$")
	public void i_enter_my_postcode_and_click_on_find_store_button() throws Throwable {
		driver.findElement(STORE_QUERY).clear();
		driver.findElement(STORE_QUERY).sendKeys("RG14 2BJ");
		driver.findElement(STORE_FINDER).click();
	}

	@When("^I select my nearest store and I see the order summary page$")
	public void i_select_my_nearest_store_and_I_see_the_order_summary_page() throws Throwable {
		Thread.sleep(3000);
		driver.findElements(CUSTOMER_OPTIONS).get(0).click();
	}

	@Then("^I click on continue payment I see the order Total page$")
	public void i_click_on_continue_payment_I_see_the_order_Total_page() throws Throwable {
		driver.findElements(PAYMENT_BUTTON).get(1).click();
		Assert.assertEquals("Checkout | Tu clothing", driver.getTitle());
	}


}
