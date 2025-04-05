package Com.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom {

@FindBy(how=How.ID,using="mat-input-0") private WebElement Text_EMail;
	
	@FindBy(how=How.ID,using="mat-input-1") private WebElement Text_Pass;

	@FindBy(how=How.ID,using="kt_login_signin_submit") private WebElement Button_Sign;

	
	public WebElement getText_EMail() {
		return Text_EMail;
	}

	
	public WebElement getText_Pass() {
		return Text_Pass;
	}

	
	public WebElement getButton_Sign() {
		return Button_Sign;
	}

	
	
	
}