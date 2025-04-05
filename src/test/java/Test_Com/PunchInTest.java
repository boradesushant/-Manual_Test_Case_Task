package Test_Com;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;

public class PunchInTest extends BaseClass {

	@Test 
	
	public void PuncinTest() {
		
LoginPom pom=PageFactory.initElements(driver, LoginPom.class);
		
		pom.getText_EMail().sendKeys("9284499643");
		pom.getText_Pass().sendKeys("JtN3bpb5Gb9QLQN");
		pom.getButton_Sign().click();
		
		
	}
	
}
