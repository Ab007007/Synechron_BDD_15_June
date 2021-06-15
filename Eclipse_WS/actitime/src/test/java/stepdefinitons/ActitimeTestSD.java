package stepdefinitons;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class ActitimeTestSD extends BaseClass {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://localhost/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	@When("user enter (in)valid {} and {}")
	public void user_enter_valid_username_and_password(String un, String pwd) {
		driver.findElement(By.id("username")).sendKeys(un);
		driver.findElement(By.name("pwd")).sendKeys(pwd);
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
	}

	@Then("user should be able to see Dashboard page")
	public void user_should_be_able_to_see_dashboard_page() {

		Assert.assertEquals("actiTIME - Enter Time-Track", driver.getTitle());
	}

	@Then("user should see error message")
	public void user_should_see_error_message() {

		String errrMsg = driver.findElement(By.className("errormsg")).getText();
		System.out.println(errrMsg);
	}

	@Then("user stay back on login page")
	public void user_stay_back_on_login_page() {

		Assert.assertEquals("actiTIME - Login", driver.getTitle());

	}

	@Then("user logout of the application")
	public void user_logout_of_the_application() {
		driver.findElement(By.id("logoutLink")).click();
		driver.close();
	}

	@When("user search for task")
	public void user_search_for_task() {
		driver.findElement(By.id("taskSearchControl_field")).sendKeys("Tas");
	}

	@Then("user will print all the autosuggestions")
	public void user_will_print_all_the_autosuggestions() {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='taskList']"))));
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//span[@class='taskName']"));
		for (WebElement suggestion : autoSuggestions) {
			System.out.println(suggestion.getText());
		}

	}

	// create customer steps started
	@When("user click on tasks and validate the task page")
	public void user_click_on_tasks_and_validate_the_task_page() {
		driver.findElement(By.xpath("//div[text()='TASKS']/parent::a")).click();
		Assert.assertEquals("actiTIME - Task List", driver.getTitle());
	}

	@Then("user click on create customer button")
	public void user_click_on_create_customer_button() {
		driver.findElement(By.xpath("//div[text()='Add New']")).click();
		driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
	}

	@Then("Enter {} and {}")
	public void enter_and_and_click_on_create_customer_button(String cn, String cd) {
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
		driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
	}

	@Then("click on create customer button to validate the success message")
	public void user_validate_the_success_message() {
		driver.findElement(By.id("customerLightBox_commitBtn")).click();

		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement toastEle = wait
				.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
		System.out.println("**********************************************" + toastEle.getText());
		wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
	}

	// create customer steps ended

	// Data table using MAPS
	@Then("click create customer by entering customer details from datatable")
	public void click_create_customer_by_entering_customer_details_from_datatable(DataTable dataTable) 
	{
		List<Map<String, String>> data = dataTable.asMaps();
		System.out.println("Total elements in the List " + data.size());
		String cn, cd;
		for(int i =0; i< data.size(); i++)
		{
			cn = data.get(i).get("customername");
			cd = data.get(i).get("customerdesc");
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
			driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
			driver.findElement(By.id("customerLightBox_commitBtn")).click();

			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement toastEle = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			System.out.println("**********************************************" + toastEle.getText());
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			
		}
		
	}
	
	// Data table using LISTS
	@Then("click create customer by entering customer details from list datatable")
	public void click_create_customer_by_entering_customer_details_from_list_datatable(DataTable dataTable) {
		 List<List<String>> data = dataTable.asLists();
		System.out.println("Total elements in the List " + data.size());
		String cn, cd;
		for(int i =0; i< data.size(); i++)
		{
			cn = data.get(i).get(0);
			cd = data.get(i).get(1);
			driver.findElement(By.xpath("//div[text()='Add New']")).click();
			driver.findElement(By.xpath("//div[contains(text(),'New Customer')]")).click();
			driver.findElement(By.id("customerLightBox_nameField")).sendKeys(cn);
			driver.findElement(By.id("customerLightBox_descriptionField")).sendKeys(cd);
			driver.findElement(By.id("customerLightBox_commitBtn")).click();

			WebDriverWait wait = new WebDriverWait(driver, 30);
			WebElement toastEle = wait
					.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			System.out.println("**********************************************" + toastEle.getText());
			wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.xpath("//div[@class='toast']"))));
			
		}
	}



	

}























