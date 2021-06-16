package stepdefinitons.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	@FindBy(id = "username")
	WebElement usernameTxtBox;
	
	@FindBy(name = "pwd")
	WebElement passwordTxtBox;
	
	
	@FindBy(id = "loginButton")
	WebElement loginButton;
	
	
	
	public void enterUserName(String name) 
	{
		usernameTxtBox.sendKeys(name);
	}
	
	
	public void enterPassword(String name)
	{
		passwordTxtBox.sendKeys(name);
	}
	
	public void clickonLoginButton()
	{
		loginButton.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void login(String un, String pwd)
	{
		enterUserName(un);
		enterPassword(pwd);
		clickonLoginButton();
	}
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
