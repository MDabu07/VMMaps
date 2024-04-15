package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_Page  {
	
	@FindBy(id = "email")
	WebElement Email;
	
	@FindBy(id = "password")
	WebElement Password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement SignInBtn;
	
	@FindBy(xpath="/html/body/app-root/app-login/div/div/div[1]/div[2]/form/ngb-alert")
	WebElement L_ErrMessage;
	
	@FindBy(xpath="/html/body/app-root/app-login")
	WebElement Login_Page;
	
	@FindBy(xpath="/html/body/app-root")
	WebElement DBTitle;
	
	
	
	public WebElement getEmail() {
		return Email;
	}
	
	public WebElement getPassword() {
		return Password;
	}	
	
    public WebElement getSignUpBtn() {
    	return SignInBtn;
    }
	
    public WebElement getL_ErrMessage() {
    	return L_ErrMessage;
    }
    
    public WebElement getLogin_Page() {
    	return Login_Page;
    }
    
    public WebElement getDBTitle() {
    	return DBTitle;
    }
	

}
