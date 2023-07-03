package Add_job_in_contact_module;

import java.awt.AWTException;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;

import javax.swing.Action;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_Appointment_contactmodule.Add_Appointment_from_contactmodule;
import Add_Task_in_Contact_module.Add_Task;
import Add_Task_in_Contact_module.Add_task_pageobject;
import Add_customer_scenario.Add_Customer_pageobject;
import Add_customer_scenario.Add_customer_info;
import Initilaizer.login_the_page;

public class Add_Job extends login_the_page {
	
	public static void open_the_Creat_job_page_from_contact_module() throws InterruptedException, IOException {

		
		PageFactory.initElements(driver, Add_job_pageobject.class);
		
		
		Thread.sleep(8000);
		Actions action5=new Actions(driver);
		action5.moveToElement(Add_job_pageobject.holder).click(Add_job_pageobject.holder).build().perform();
		
//		Add_job_pageobject.holder.click();
		Thread.sleep(1000);
		Actions action4=new Actions(driver);
		action4.moveToElement(Add_job_pageobject.addjobbtn).click(Add_job_pageobject.addjobbtn).perform();
		Thread.sleep(8000);
	
//		Select selectlayout=new Select(Add_job_pageobject.chooselayout);
//		selectlayout.selectByVisibleText("Test");
		Thread.sleep(2000);
		Select select =new Select(Add_job_pageobject.jobstatus);
		select.selectByVisibleText("Invoiced");
		
		Select select2 =new Select(Add_job_pageobject.orderstatus);
		select2.selectByIndex(2);;
		
		Thread.sleep(2000);
		PageFactory.initElements(driver, Create_job_pageobject.class);
		Create_job_pageobject.source.click();
		Create_job_pageobject.selectsource.click();
		
		Select select3=new Select(Create_job_pageobject.salutation);
		select3.selectByIndex(3);
		
//		String s= Create_job_pageobject.lastname.getAttribute("value");
//		System.out.println(s);
		
		if( Create_job_pageobject.firstname.getAttribute("value").isEmpty()) {
			Create_job_pageobject.firstname.sendKeys("santhosh");
		}else {

		}
		
		if( Create_job_pageobject.lastname.getAttribute("value").isEmpty()) {

			Create_job_pageobject.lastname.sendKeys("santhosh");
		}else {

		}
		
		if( Create_job_pageobject.website.getAttribute("value").isEmpty()) {
			Create_job_pageobject.website.sendKeys("ww.goo.com");
		}else {
		}
		if( Create_job_pageobject.address1.getAttribute("value").isEmpty()) {
			Create_job_pageobject.address1.sendKeys("sanfransic");
		}else {
		}
		
		if( Create_job_pageobject.phone.getAttribute("value").isEmpty()) {
			Create_job_pageobject.phone.sendKeys("00101010");
		}else {
		}
		
		if( Create_job_pageobject.address2.getAttribute("value").isEmpty()) {
			Create_job_pageobject.address2.sendKeys("united kingdom");
		}else {
		}
		if( Create_job_pageobject.mobile.getAttribute("value").isEmpty()) {
			Create_job_pageobject.mobile.sendKeys("97868");
		}else {
		}
		
		
		if( Create_job_pageobject.email.getAttribute("value").isEmpty()) {
			Create_job_pageobject.email.sendKeys("santy@gmila.com");
		}else {
		}
		
		if( Create_job_pageobject.city.getAttribute("value").isEmpty()) {
			Create_job_pageobject.city.sendKeys("dertr");
		}else {
		}
		
		if( Create_job_pageobject.zipcode.getAttribute("value").isEmpty()) {
			Create_job_pageobject.zipcode.sendKeys("Gu16 7h4");
			Thread.sleep(1000);
//			Create_job_pageobject.zipcodesearch.click();
			Thread.sleep(2000);
		}else {
		}
		
		if( Create_job_pageobject.customerref.getAttribute("value").isEmpty()) {
			Create_job_pageobject.customerref.sendKeys("tn5656");
		}else {
		}
//		
//		if( Create_job_pageobject.additionalref.getAttribute("value").isEmpty()) {
//			Create_job_pageobject.additionalref.sendKeys("sir123");
//		}else {
//		}
//		
//		if( Create_job_pageobject.statusnotes.getAttribute("value").isEmpty()) {
//			Create_job_pageobject.statusnotes.sendKeys("sirtmhtty");
//		}else {
//		}
//		
		
//		if( Create_job_pageobject.checkbox5.isSelected()) {
//		}else {
//			Create_job_pageobject.checkbox5.click();
//			
//		}
//		
//		if( Create_job_pageobject.checkbox4.isSelected()) {
//		}else {
//			Create_job_pageobject.checkbox4.click();
//			
//		}
//		
//		Select selct2=new Select(Create_job_pageobject.organisation);
//		String actualString=selct2.getFirstSelectedOption().getText();
//		List<WebElement> defaul=selct2.getOptions();
//		String deString=defaul.get(0).getText();
//		
//		
//		if(actualString.equals(deString)) {
//			selct2.selectByIndex(0);
//		}
//		
//		Select selct3=new Select(Create_job_pageobject.createdby);
//		String actualString1=selct3.getFirstSelectedOption().getText();
//		List<WebElement> default1=selct3.getOptions();
//		String deString1=default1.get(0).getText();
//		
//		if(actualString1.equals(deString1)) {
//			selct3.selectByIndex(0);
//		}
//		
//		
//		
		
		
		
		
		Add_job_pageobject.savebtn.click();
		Thread.sleep(5000);
	
		
		
	
		
		String jobrefno=Add_job_pageobject.jobrefno.getAttribute("value");
		if(jobrefno.isEmpty()) {
		}else {
		}
		
		String invoiceno=Add_job_pageobject.invoiceno.getAttribute("value");
		if(invoiceno.isEmpty()) {
		}else {
		}
	
//		Add_job_pageobject.contactinfobtn.click();
//		Thread.sleep(2000);
//		Add_job_pageobject.contactinfobtn.click();
	}
	
	

	public static void add_payment() throws InterruptedException {
	

		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		
		
		Add_job_pageobject.payment.click();
		Thread.sleep(4000);
		
		try {
			Add_job_pageobject.paymentaddbtn.click();
		
		} catch (Throwable e) {
			Thread.sleep(2000);
			Add_job_pageobject.paymentaddplusbtn.click();
			
		}
		
		
		
		
		Thread.sleep(2000);
		
		if(Add_job_pageobject.paymentpage.isDisplayed()) {
		}else {
		}
		
		Thread.sleep(2000);
		
		Add_job_pageobject.amount.sendKeys("sasa@");
		String drop=Add_job_pageobject.amount.getAttribute("value");
	
		if(drop.isEmpty()){
			Add_job_pageobject.amount.sendKeys("06");
		}else {
		}
		
		
		
		
		Select select=new Select(Add_job_pageobject.paymentmethod);
		List<WebElement> list = select.getOptions();
		int size = list.size();
		for (int i = 0; i <= size - 1; i++) {
			select.selectByIndex(i);
		}
		select.selectByIndex(3);	
		
		
		
		Select select2=new Select(Add_job_pageobject.paymenttype);
		List<WebElement> list1 = select2.getOptions();
		int size1 = list1.size();
		for (int i = 0; i <= size1 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(1);
		
		
		
		Add_job_pageobject.paymentdate.click();
		Add_job_pageobject.selectpaymentdate.click();
		Thread.sleep(1000);
		Add_job_pageobject.notes.sendKeys("1st payment");
		Thread.sleep(1000);
		
		Add_job_pageobject.savepayment.click();
		
	}
	
	public static void move_account() throws InterruptedException {
		
		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		String oldwindow = driver.getWindowHandle();
		Add_job_pageobject.options.click();
		Thread.sleep(1000);
		Actions actions=new Actions(driver);
		actions.moveToElement(Add_job_pageobject.viewaccount).click(Add_job_pageobject.viewaccount).build().perform();
		Set<String> handle = driver.getWindowHandles();

		for (String newwindow : handle) {
			driver.switchTo().window(newwindow);
		}

		Thread.sleep(5000);
	}
	
	
	public static void add_appointment_from_jobpage() throws InterruptedException, AWTException, IOException {
		
		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(5000);
		Add_job_pageobject.appointment.click();
		
		Thread.sleep(2000);
		
		try {
			Add_job_pageobject.appointmentplusbtn.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		try {
			Add_job_pageobject.appointmentplusbtn2.click();
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		Thread.sleep(4000);
		
		

	}
	
	
	public static void add_task_from_jobpage() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_job_pageobject.class);
		Thread.sleep(3000);
Add_job_pageobject.task.click();
		
		Thread.sleep(2000);
		
		try {
			Add_job_pageobject.addtaskplus.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		try {
			Add_job_pageobject.addtaskplus2.click();
			
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
		Thread.sleep(5000);
		
		
		
	}
	
	
	
	}
	


