package Test_Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;

public class AddCustomerTest extends BaseClass {

	
	@Test
	public void addCustomer() throws InterruptedException {
		
LoginPom pom=PageFactory.initElements(driver, LoginPom.class);
		
		pom.getText_EMail().sendKeys("9284499643");
		pom.getText_Pass().sendKeys("JtN3bpb5Gb9QLQN");
		pom.getButton_Sign().click();
		
		 // 📁 Open "My Customer" section
        driver.findElement(By.xpath("//*[@id='kt_aside_menu']/ul/li[2]/a/span")).click();
        Thread.sleep(2000);

        // ➕ Click on "New Customer"
        driver.findElement(By.xpath("//button//span[text()='New Customer']")).click();
        Thread.sleep(2000);

        // 🧾 Fill customer form
        driver.findElement(By.xpath("//input[@formcontrolname='LeadName']")).sendKeys("Atul Borade");
        driver.findElement(By.xpath("//input[@formcontrolname='RefNo']")).sendKeys("8806887017");
        driver.findElement(By.xpath("//input[@formcontrolname='PersonName']")).sendKeys("Sushant Waghmare");
        driver.findElement(By.xpath("//input[@formcontrolname='MobileNo']")).sendKeys("8888888888");
        driver.findElement(By.xpath("//input[@formcontrolname='ContactNo']")).sendKeys("451234768");
        driver.findElement(By.xpath("//input[@formcontrolname='Email']")).sendKeys("demo@123");
        driver.findElement(By.xpath("//input[@formcontrolname='PersonDesignation']")).sendKeys("soft eg");

        // 🏠 Address selection
        driver.findElement(By.xpath("//input[@formcontrolname='Address']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[.//span[text()='Done']]")).click();
        Thread.sleep(1000);

        // 📍 Select state (example)
        driver.findElement(By.xpath("(//mat-select[@formcontrolname='StateId'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//span[contains(text(),'Maharashtra')]")).click(); // Adjust as needed

        // 📌 Pin, website & others
        driver.findElement(By.xpath("//input[@formcontrolname='PinCode']")).sendKeys("4315132");
        driver.findElement(By.xpath("//input[@formcontrolname='Website']")).sendKeys("https://testffc.nimapinfotech.com/");
        driver.findElement(By.xpath("//input[@formcontrolname='OtherInfo']")).sendKeys("https://testffc.nimapinfotech.com/");

        // Checkbox for visibility
        WebElement checkbox = driver.findElement(By.xpath("//input[@formcontrolname='IsVisibleToAll']"));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }

        // Save customer
        driver.findElement(By.xpath("//button//span[text()='Save']")).click();
        Thread.sleep(2000);

        //  Validate success message (toast/snackbar)
        WebElement toast = driver.findElement(By.xpath("//div[contains(text(),'Customer Created Successfully')]"));
        String toastText = toast.getText();
        System.out.println("Toast Message: " + toastText);

		
	}
	
}
