package stepdefinitons.test;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import stepdefinitons.BaseClass;
import stepdefinitons.page.DashboardPage;
import stepdefinitons.page.LoginPage;

public class LoginTest extends BaseClass {
	
	LoginPage lp = null;
	DashboardPage dp = null;

	@Given("pom user has all page objects")
	public void pom_user_has_all_page_objects() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		lp = new LoginPage(driver);
		dp = new DashboardPage(driver);
	    
	}

	
	@Given("pomuser is on login page")
	public void pomuser_is_on_login_page() {
		driver.get("http://localhost/login.do");
	}
	@When("pomuser enter valid {string} and {string}")
	public void pomuser_enter_valid_admin_and_manager(String un, String pwd)
	{
		lp.enterUserName(un);
		lp.enterPassword(pwd);
	}
	@When("pomuser click on login button")
	public void pomuser_click_on_login_button() {

		lp.clickonLoginButton();
	}
	@Then("pom user should be able to see Dashboard page")
	public void pom_user_should_be_able_to_see_dashboard_page() {
		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
		
	}
	@Then("pomuser logout of the application")
	public void pomuser_logout_of_the_application() {
		dp.logout();
	}
}
