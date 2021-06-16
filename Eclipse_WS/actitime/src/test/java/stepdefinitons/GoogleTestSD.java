package stepdefinitons;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTestSD extends BaseClass
{

	@Before
	public void beforeScenario()
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	@Before("@google")
	public void launchGooglePage()
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	@Before("@actitime")
	public void launchActitime()
	{
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
	}
	
	
	@After
	public void afterScenario(Scenario sc)
	{
		System.out.println("################################################################");
		
	}
	
	@After("@google and @development")
	public void afterScenarioForGoogle(Scenario sc)
	{
		System.out.println("################################################################");
		System.out.println(sc.getName());
		System.out.println(sc.getStatus());
		System.out.println(sc.getId());
		System.out.println("################################################################");
	}
	
	
	@BeforeStep
	public void beforeStep()
	{
		System.out.println("----------------------------------------------");
	}
	
	@AfterStep
	public void afterStep()
	{
		System.out.println(".....................................................");
	}
	
	@Given("user is on google page")
	public void user_is_on_google_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@When("user enter(s) {} in serach box")
	public void user_enter_in_serach_box(String companyName) {
		driver.findElement(By.name("q")).sendKeys(companyName);
	}

	@Then("user will verify {int} suggestions dispalyed")
	public void user_will_verify_suggestions_dispalyed(Integer int1) {
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']"));
		System.out.println("Total suggestions " + suggestions.size());
		Assert.assertEquals(int1.intValue(), suggestions.size());
	}

	@Then("user will print all the  autosuggestion(s)")
	public void user_will_print_all_the_autosuggestions() {
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@class='erkvQe']/li[@role='presentation']"));
		for (WebElement suggestion : suggestions) {
			System.out.println(suggestion.getText());
		}
	}

	@When("click on search button")
	public void click_on_search_button() {
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.name("btnK"))));
		searchButton.click();
	}

	@Then("application should display no/more result(s)")
	public void application_should_display_no_result() {
		List<WebElement> searchResults = driver.findElements(By.tagName("h3"));
		
		if(searchResults.size() > 0)
		{
			for (WebElement result : searchResults) 
			{
				System.out.println(result.getText());
				
			}
		}
		else
		{
			System.out.println("No results found!!!");
		}
	}

	@Then("close the browser")
	public void close_the_browser() {
		driver.close();
	}
}
