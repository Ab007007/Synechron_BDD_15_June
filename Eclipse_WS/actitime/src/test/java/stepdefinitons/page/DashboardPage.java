package stepdefinitons.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage 
{
	@FindBy(id = "logoutLink")
	WebElement logoutlink;
	
	
	public void logout()
	{
		logoutlink.click();
	}

	
	
	public DashboardPage(WebDriver driver) {

		PageFactory.initElements(driver, this);
	
	}
}
