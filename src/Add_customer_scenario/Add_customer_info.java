package Add_customer_scenario;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

//import Add_Supplier_Scenario.Add_Customer_pageobject;
import Initilaizer.login_the_page;

public class Add_customer_info extends login_the_page {
	
	public static void Check_new_contacttype() throws InterruptedException, IOException {
		
		PageFactory.initElements(driver, Add_Customer_pageobject.class);

	
		
		Thread.sleep(10000);
		Add_Customer_pageobject.addbtn.click();

		

		Add_Customer_pageobject.customerbtn.click();
		Thread.sleep(3000);
		Add_Customer_pageobject.contacttype.click();
		Add_Customer_pageobject.selectcontacttrade.click();
		
		
		Add_Customer_pageobject.nextbtn.click();

	}

	public static void Add_New_Customer_info() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_Customer_pageobject.class);
		Thread.sleep(4000);
//		Select select = new Select(Add_Customer_pageobject.chooselayout);
//		select.selectByVisibleText("Automation");
		Thread.sleep(2000);
		
		Select seselect = new Select(Add_Customer_pageobject.salutation);
		List<WebElement> list1 = seselect.getOptions();
		int size1 = list1.size();
		for (int i = 0; i <= size1 - 1; i++) {
			seselect.selectByIndex(i);
		}
		seselect.selectByValue("3");

		Add_Customer_pageobject.firstname.sendKeys("dada");
		
		String firstname = Add_Customer_pageobject.firstname.getAttribute("value");
		if(firstname.toUpperCase().charAt(0)==firstname.charAt(0)) {
		}else {
		}
		
		


		
		Add_Customer_pageobject.lastname.sendKeys("father");

		String lastname = Add_Customer_pageobject.lastname.getAttribute("value");
		if(lastname.toUpperCase().charAt(0)==lastname.charAt(0)) {
		}else {
		}
		
		
		
		Add_Customer_pageobject.email.sendKeys("shalini");

		if (Add_Customer_pageobject.emailerr.isDisplayed()) {
			String actualemailerror = Add_Customer_pageobject.emailerr.getText();
			Add_Customer_pageobject.email.clear();
			Add_Customer_pageobject.email.sendKeys("abcd@gmail");
		} else {
		}
	

		Add_Customer_pageobject.accountref.sendKeys("good");

		Add_Customer_pageobject.phone.sendKeys("sds");

		if (Add_Customer_pageobject.phoneerrormsg.isDisplayed()) {
			String text = Add_Customer_pageobject.phoneerrormsg.getText();
			Add_Customer_pageobject.phone.clear();
			Add_Customer_pageobject.phone.sendKeys("12345");
		} else {
		}

		          //error occurs thats why phone&email cleared
		
		Add_Customer_pageobject.mobile.sendKeys("4611124");

		
		
		Add_Customer_pageobject.role.sendKeys("worker");


		Add_Customer_pageobject.defcontact.click();

		
		if(Add_Customer_pageobject.defcontact.isSelected())
		{
		}else {
		}
		
	
//		Add_Customer_pageobject.companyname.click();
//		Thread.sleep(5000);
//		Add_Customer_pageobject.selectcompany.click();

		Add_Customer_pageobject.companyname.sendKeys("santhosh0028");               //***company name
		Thread.sleep(1000);
//	String s=	Add_Customer_pageobject.newcompanytoast.getAttribute("value");
//		System.out.println(s);
//		if (Add_Customer_pageobject.newcompanytoast.isDisplayed()) {
//			System.out.println("new");
//		}else {
//			System.out.println("alredy");
//		}
//		Thread.sleep(1000);
//		log.info("Enter the company name");
		
		
		
		
		
		
		
		
//		try {
//			if(Add_Customer_pageobject.companysuggetion.isDisplayed()) {
//				Thread.sleep(1000);
//				Add_Customer_pageobject.companysuggselect.click();
//				System.out.println("selected");
//				log.info("Company name already exits");
//			}else if (Add_Customer_pageobject.newcompanytoast.isDisplayed()) {
//				System.out.println("already");
//			}
//		
		
		Thread.sleep(3000);
		Add_Customer_pageobject.address1.sendKeys("adad");

		Select addressselect = new Select(Add_Customer_pageobject.addresstype);
		List<WebElement> list2 = addressselect.getOptions();
		int size2 = list2.size();
		for (int i = 0; i <= size2 - 1; i++) {
			addressselect.selectByIndex(i);
		}

		Add_Customer_pageobject.address2.sendKeys("chennai");
		
		Add_Customer_pageobject.city.sendKeys("chennai");
		
		Add_Customer_pageobject.source.click();
		
		Add_Customer_pageobject.selectsource.click();
		
		Thread.sleep(2000);
//		
//		Add_Customer_pageobject.source.click();
//		log.info("Click the Source field");
//		Thread.sleep(4000);
//		Add_Customer_pageobject.addnewsource.click();
//		Thread.sleep(6000);
//		Add_Customer_pageobject.addplusbtn.click();
//		Thread.sleep(4000);
//		Add_Customer_pageobject.addnewtext.sendKeys("automation");
//		Thread.sleep(1000);
//		Add_Customer_pageobject.savenewsourcebtn.click();
//		Actions action=new Actions(driver);
//		
//		action.clickAndHold(Add_Customer_pageobject.option5)
//		.moveToElement(Add_Customer_pageobject.option6)
//		.release(Add_Customer_pageobject.option6).perform();
//		
		
		
		Select coselect = new Select(Add_Customer_pageobject.country);
		coselect.selectByVisibleText("USA");
		
		Thread.sleep(1000);
		
		Add_Customer_pageobject.state.click();
		
		Add_Customer_pageobject.selectstate.click();
		
		Add_Customer_pageobject.zipcode.sendKeys("GU16 7HF");
		
		Thread.sleep(2000);
		Add_Customer_pageobject.zipcodesearch.click();
		
//		List<WebElement> list3 = coselect.getOptions();
//		int size3 = list3.size();
//
//		for (int i = 0; i <= size3 - 1; i++) {
//
//			coselect.selectByIndex(i);
//
//		}
		

		String verify = Add_Customer_pageobject.currency.getAttribute("value");
		
		
		
		//Add_Customer_pageobject.emailaddress.sendKeys("san@gmail");
		
		
		Thread.sleep(1000);
//		
//		Add_Customer_pageobject.radiobtn.click();
//		
//		
//		Add_Customer_pageobject.radiobtn1.click();
//		
//		Add_Customer_pageobject.checkbox1.click();
//		
//		
//		
////		Add_Customer_pageobject.date.click();
////		Thread.sleep(1000);
////		Add_Customer_pageobject.selectdate.click();
////		Thread.sleep(1000);
//
////		Add_Customer_pageobject.date1.click();
////		Thread.sleep(1000);
////		Add_Customer_pageobject.selectdate1.click();
////		Thread.sleep(1000);
//		
//		Add_Customer_pageobject.datetime.click();
//		Robot robot1 = new Robot();
//		robot1.keyPress(KeyEvent.VK_RIGHT);
//		robot1.keyRelease(KeyEvent.VK_RIGHT);
//		robot1.keyPress(KeyEvent.VK_ENTER);
//		robot1.keyRelease(KeyEvent.VK_ENTER);
//		
//		
//		Add_Customer_pageobject.time.click();
//		Robot robot2 = new Robot();
//		robot2.keyPress(KeyEvent.VK_DOWN);
//		robot2.keyRelease(KeyEvent.VK_DOWN);
//		robot2.keyPress(KeyEvent.VK_ENTER);
//		robot2.keyRelease(KeyEvent.VK_ENTER);
//		
//		Thread.sleep(2000);
//		File file2=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		FileUtils.copyFile(file2, new File("E:\\Testing Screenshots\\customer_add2.PNG"));
//		
//		Add_Customer_pageobject.singleline.sendKeys("@#S#3");
//		
//		Add_Customer_pageobject.multipleline.sendKeys("S#8887");
//		
//		Select select3=new Select(Add_Customer_pageobject.dropdown);
//		select3.selectByIndex(1);
//		
//		Add_Customer_pageobject.multipleselect.click();
//		Thread.sleep(1000);
//		Add_Customer_pageobject.selectmultipleselect.click();
		
		Add_Customer_pageobject.mailcheckboxyes.click();
		

		Add_Customer_pageobject.documentcheckbox.click();

		Add_Customer_pageobject.documentsetting.click();
Thread.sleep(3000);
		Actions action1 = new Actions(driver);
		action1.moveToElement(Add_Customer_pageobject.setting3).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting2).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting1).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting4).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting5).click().perform();
		action1.moveToElement(Add_Customer_pageobject.setting6).click().release().perform();
		
		Thread.sleep(3000);
		Add_Customer_pageobject.onlinecheckbox.click();
		action1.moveToElement(Add_Customer_pageobject.setconfigure).click().perform();
		action1.moveToElement(Add_Customer_pageobject.username).click().sendKeys("santhosh").perform();
		action1.moveToElement(Add_Customer_pageobject.password).click().sendKeys("12345").perform();
		action1.moveToElement(Add_Customer_pageobject.confirmpassword).click().sendKeys("12345").perform();
		Thread.sleep(2000);
	
		
		
		Add_Customer_pageobject.savebtn.click();
		try {
			Add_Customer_pageobject.cancelbtn.click();
		} catch (Throwable e) {
			System.out.println("Already saved" + e.getMessage());
		}
		Thread.sleep(2000);
		
		Thread.sleep(1000);
//		String msg=Pricing_configure_pageobject.popup.getText();
//		System.out.println(msg);
		
	}

	}
