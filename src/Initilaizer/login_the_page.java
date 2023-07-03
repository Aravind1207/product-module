package Initilaizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import Add_new_product.Add_new_product_pageobject;

//import Exits_Customer_page.Exits_customer_pageobject;

public class login_the_page {

	public static WebDriver driver;


	public static void login_the_application() {
		PageFactory.initElements(driver, login_pageobject.class);
		login_pageobject.companyname.sendKeys("ARAVINDDB");

		login_pageobject.username.sendKeys("Aravind");

		login_pageobject.password.sendKeys("1212");

		login_pageobject.loginbutton.click();
	}

	public static void Move_to_setings() throws InterruptedException {
		PageFactory.initElements(driver, login_pageobject.class);

		Thread.sleep(3000);
		login_pageobject.userdropdown.click();

		Thread.sleep(2000);
		Actions setingsaction1 = new Actions(driver);
		setingsaction1.moveToElement(login_pageobject.Settings).click(login_pageobject.Settings).build().perform();
		
		PageFactory.initElements(driver, Add_new_product_pageobject.class);	
		Thread.sleep(8000);
		Add_new_product_pageobject.Prducts.click();

	}

	public static void Move_To_Contact_module() throws InterruptedException {
		PageFactory.initElements(driver, login_pageobject.class);

		Thread.sleep(12000);
		login_pageobject.contactbtn.click();
	}

	public static void closecustomerpage() throws InterruptedException {
		PageFactory.initElements(driver, login_pageobject.class);
		Thread.sleep(2000);
		login_pageobject.leadscustomers.click();
		Thread.sleep(1000);
	}
}
