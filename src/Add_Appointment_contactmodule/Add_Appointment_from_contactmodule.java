package Add_Appointment_contactmodule;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_Task_in_Contact_module.Add_task_pageobject;
import Add_job_in_contact_module.Add_Job;
import Add_job_in_contact_module.Add_job_pageobject;
//import Add_job_in_contact_module.Add_job_pageobject;
//import Initilaizer.login_pageobject;
import Initilaizer.login_the_page;

public class Add_Appointment_from_contactmodule extends Add_Job{
	public static void Add_appointment() throws InterruptedException, IOException, AWTException {

		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
		
		
		
	
		
		
		Thread.sleep(5000);
		
		Actions action5=new Actions(driver);
		action5.moveToElement(Add_Appointment_pageobject.holder).click(Add_Appointment_pageobject.holder).build().perform();
		Thread.sleep(1000);
		Actions action4=new Actions(driver);
		action4.moveToElement(Add_Appointment_pageobject.addappointment).click(Add_Appointment_pageobject.addappointment).perform();
		Thread.sleep(6000);
		


	}
	
	public static void add_appointment_fields() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
		Add_Appointment_pageobject.confirmbtn.click();
		Thread.sleep(1000);
		
		try {
			Thread.sleep(1000);
	
			Add_Appointment_pageobject.editbtn.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
		Add_Appointment_pageobject.startdate.click();
		Thread.sleep(1000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_RIGHT);
		robot1.keyRelease(KeyEvent.VK_RIGHT);
		robot1.keyPress(KeyEvent.VK_RIGHT);
		robot1.keyRelease(KeyEvent.VK_RIGHT);
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String startdate=Add_Appointment_pageobject.startdate.getAttribute("value");
		String enddate=Add_Appointment_pageobject.enddate.getAttribute("value");
		
		if(startdate.equalsIgnoreCase(enddate)) {
		}else {
		}
		
		
		Add_Appointment_pageobject.starttime.click();
		Thread.sleep(1000);
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyRelease(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyRelease(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyRelease(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String starttime=Add_Appointment_pageobject.starttime.getAttribute("value");
		String endtime=Add_Appointment_pageobject.endtime.getAttribute("value");
		
		if(starttime!=endtime) {
		}else {
		}
		Add_Appointment_pageobject.enddate.click();
		Thread.sleep(1000);
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_RIGHT);
		robot3.keyRelease(KeyEvent.VK_RIGHT);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Add_Appointment_pageobject.endtime.click();
		Thread.sleep(1000);
		Robot robot4 = new Robot();
		robot4.keyPress(KeyEvent.VK_DOWN);
		robot4.keyRelease(KeyEvent.VK_DOWN);
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		Add_Appointment_pageobject.alldaycheckbox.click();
		Add_Appointment_pageobject.alldaycheckbox.click();
		
		Add_Appointment_pageobject.repeatonoff.click();
		Thread.sleep(1000);
		
		Add_Appointment_pageobject.selectrepeat.click();
Thread.sleep(1000);
		Robot robot5 = new Robot();
		robot5.keyPress(KeyEvent.VK_DOWN);
		robot5.keyRelease(KeyEvent.VK_DOWN);
		robot5.keyPress(KeyEvent.VK_ENTER);
		robot5.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		

		Actions actions = new Actions(driver);

		actions.click(Add_Appointment_pageobject.dayrepeatincerment).perform();

		Add_Appointment_pageobject.dayrepeatdecrement.click();
		
		Add_Appointment_pageobject.repeatevery.clear();
		
		
		Add_Appointment_pageobject.repeatevery.sendKeys("2");
		Thread.sleep(1000);
		Add_Appointment_pageobject.endday.click();

		Robot robot6 = new Robot();
		robot6.keyPress(KeyEvent.VK_DOWN);
		robot6.keyRelease(KeyEvent.VK_DOWN);
		robot6.keyPress(KeyEvent.VK_ENTER);
		robot6.keyRelease(KeyEvent.VK_ENTER);

		Add_Appointment_pageobject.endday.click();

		Robot robot7 = new Robot();
		robot7.keyPress(KeyEvent.VK_UP);
		robot7.keyRelease(KeyEvent.VK_UP);
		robot7.keyPress(KeyEvent.VK_ENTER);
		robot7.keyRelease(KeyEvent.VK_ENTER);
		
		String before=Add_Appointment_pageobject.enddayinput.getAttribute("value");
		//System.out.println(before);
		Add_Appointment_pageobject.enddayset.click();
		Robot robot8 = new Robot();
		robot8.keyPress(KeyEvent.VK_RIGHT);
		robot8.keyRelease(KeyEvent.VK_RIGHT);
		robot8.keyPress(KeyEvent.VK_RIGHT);
		robot8.keyRelease(KeyEvent.VK_RIGHT);
		robot8.keyPress(KeyEvent.VK_RIGHT);
		robot8.keyRelease(KeyEvent.VK_RIGHT);
		robot8.keyPress(KeyEvent.VK_ENTER);
		robot8.keyRelease(KeyEvent.VK_ENTER);
		
		String after=Add_Appointment_pageobject.enddayinput.getAttribute("value");
		//System.out.println(after);
		if(before==after) {
		}else {
			//System.out.println(after);
		}

		Add_Appointment_pageobject.repeatok.click();
		try {
			Add_Appointment_pageobject.repeatcancel.click();
		} catch (Throwable e) {

		}
		
		Thread.sleep(2000);
		
		Select select=new Select(Add_Appointment_pageobject.appointmenttype);
	select.selectByIndex(1);
	Thread.sleep(1000);
	try {
		Add_Appointment_pageobject.staffdrop.click();
		Add_Appointment_pageobject.selectstaffdrop.click();
		Thread.sleep(1000);
	} catch (Throwable e) {
	}

	try {
		Select select1=new Select(Add_Appointment_pageobject.staffdrop);
		select1.selectByIndex(1);
		Thread.sleep(1000);
	} catch (Throwable e) {
	}


	Thread.sleep(1000);
	Add_Appointment_pageobject.traveltimehrs.sendKeys("04");
	Add_Appointment_pageobject.traveltimemins.sendKeys("49");
	Thread.sleep(1000); 
	
	Add_Appointment_pageobject.notificationaddbtn.click();
	Select selectradio=new Select(Add_Appointment_pageobject.notificationradio);
	selectradio.selectByVisibleText("Email");
	
	Add_Appointment_pageobject.notificationhrs.sendKeys("01");
	
	Add_Appointment_pageobject.notificationmins.sendKeys("25");
	
	Select selecttemplate=new Select(Add_Appointment_pageobject.notificationtemplate);
	selecttemplate.selectByIndex(1);
	
	Add_Appointment_pageobject.notificationaddbtn.click();

	
	Add_Appointment_pageobject.notificationdelete.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.notificationdelete.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.appointmentstatus.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.selectappstatus.click();
	Add_Appointment_pageobject.upload.click();
	Thread.sleep(2000);
	Robot rb = new Robot();

	StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png");              //SCREENSHOT
	Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);

	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);

	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(2000);
	

	
	Add_Appointment_pageobject.descriptionbox.sendKeys("go to hell");
	Thread.sleep(3000);
	

	
	Add_Appointment_pageobject.savebtn.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.savebtn.click();
	//Add_Appointment_pageobject.cancelbtn.click();
	
	try {
		Thread.sleep(1000);
		Add_Appointment_pageobject.cancelbtn.click();
	} catch (Throwable e) {
		// TODO: handle exception
	}
	
	

	
	
	
	}
	
	public static void appointment_edit() throws InterruptedException, IOException, AWTException {
		PageFactory.initElements(driver, Add_Appointment_pageobject.class);
		
		Add_Appointment_pageobject.appointmentedit.click();
		Thread.sleep(10000);
		
		Add_Appointment_pageobject.confirmbtn.click();
		Thread.sleep(1000);
		
		try {
			Thread.sleep(1000);
	
			Add_Appointment_pageobject.editbtn.click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		Add_Appointment_pageobject.startdate.click();
		Thread.sleep(1000);
		Robot robot1 = new Robot();
		robot1.keyPress(KeyEvent.VK_RIGHT);
		robot1.keyRelease(KeyEvent.VK_RIGHT);
		
		robot1.keyPress(KeyEvent.VK_ENTER);
		robot1.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		Thread.sleep(1000);
		String startdate=Add_Appointment_pageobject.startdate.getAttribute("value");
		String enddate=Add_Appointment_pageobject.enddate.getAttribute("value");
		
		if(startdate.equalsIgnoreCase(enddate)) {
		}else {
		}
		
		
		Add_Appointment_pageobject.starttime.click();
		Thread.sleep(1000);
		Robot robot2 = new Robot();
		robot2.keyPress(KeyEvent.VK_DOWN);
		robot2.keyRelease(KeyEvent.VK_DOWN);
		
		robot2.keyRelease(KeyEvent.VK_DOWN);
		robot2.keyPress(KeyEvent.VK_ENTER);
		robot2.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		String starttime=Add_Appointment_pageobject.starttime.getAttribute("value");
		String endtime=Add_Appointment_pageobject.endtime.getAttribute("value");
		
		if(starttime!=endtime) {
		}else {
		}
		Add_Appointment_pageobject.enddate.click();
		Thread.sleep(1000);
		Robot robot3 = new Robot();
		robot3.keyPress(KeyEvent.VK_RIGHT);
		robot3.keyRelease(KeyEvent.VK_RIGHT);
		robot3.keyPress(KeyEvent.VK_ENTER);
		robot3.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		Add_Appointment_pageobject.endtime.click();
		Thread.sleep(1000);
		Robot robot4 = new Robot();
		robot4.keyPress(KeyEvent.VK_DOWN);
		robot4.keyRelease(KeyEvent.VK_DOWN);
		robot4.keyPress(KeyEvent.VK_ENTER);
		robot4.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		
		Add_Appointment_pageobject.alldaycheckbox.click();
		Add_Appointment_pageobject.alldaycheckbox.click();
		
		Add_Appointment_pageobject.repeatonoff.click();
		Thread.sleep(1000);
		
		Add_Appointment_pageobject.selectrepeat.click();
Thread.sleep(1000);
		Robot robot5 = new Robot();
		robot5.keyPress(KeyEvent.VK_DOWN);
		robot5.keyRelease(KeyEvent.VK_DOWN);
		robot5.keyPress(KeyEvent.VK_ENTER);
		robot5.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000);
		

		Actions actions = new Actions(driver);

		actions.click(Add_Appointment_pageobject.dayrepeatincerment).perform();

		Add_Appointment_pageobject.dayrepeatdecrement.click();
		
		Add_Appointment_pageobject.repeatevery.clear();
		
		
		Add_Appointment_pageobject.repeatevery.sendKeys("3");
		Thread.sleep(1000);
		Add_Appointment_pageobject.endday.click();

		Robot robot6 = new Robot();
		robot6.keyPress(KeyEvent.VK_DOWN);
		robot6.keyRelease(KeyEvent.VK_DOWN);
		robot6.keyPress(KeyEvent.VK_ENTER);
		robot6.keyRelease(KeyEvent.VK_ENTER);

		Add_Appointment_pageobject.endday.click();

		Robot robot7 = new Robot();
		robot7.keyPress(KeyEvent.VK_UP);
		robot7.keyRelease(KeyEvent.VK_UP);
		robot7.keyPress(KeyEvent.VK_ENTER);
		robot7.keyRelease(KeyEvent.VK_ENTER);
		
		String before=Add_Appointment_pageobject.enddayinput.getAttribute("value");
		//System.out.println(before);
		Add_Appointment_pageobject.enddayset.click();
		Robot robot8 = new Robot();
		robot8.keyPress(KeyEvent.VK_RIGHT);
		robot8.keyRelease(KeyEvent.VK_RIGHT);
		
		robot8.keyPress(KeyEvent.VK_RIGHT);
		robot8.keyRelease(KeyEvent.VK_RIGHT);
		robot8.keyPress(KeyEvent.VK_ENTER);
		robot8.keyRelease(KeyEvent.VK_ENTER);
		
		String after=Add_Appointment_pageobject.enddayinput.getAttribute("value");
		//System.out.println(after);
		if(before==after) {
		}else {
			//System.out.println(after);
		}

		Add_Appointment_pageobject.repeatok.click();
		try {
			Add_Appointment_pageobject.repeatcancel.click();
		} catch (Throwable e) {

		}
		
		Thread.sleep(2000);
		
		Select select=new Select(Add_Appointment_pageobject.appointmenttype);
	select.selectByIndex(2);
	Thread.sleep(1000);
	try {
		Add_Appointment_pageobject.staffdrop.click();
		Add_Appointment_pageobject.selectstaffdropedit.click();
		Thread.sleep(1000);
	} catch (Throwable e) {
	}

	try {
		Select select1=new Select(Add_Appointment_pageobject.staffdrop);
		select1.selectByIndex(1);
		Thread.sleep(1000);
	} catch (Throwable e) {
	}


	Thread.sleep(1000);
	
	Add_Appointment_pageobject.traveltimehrs.clear();
	Add_Appointment_pageobject.traveltimehrs.sendKeys("04");
	Add_Appointment_pageobject.traveltimemins.clear();
	Add_Appointment_pageobject.traveltimemins.sendKeys("49");
	Thread.sleep(1000); 
	
	Add_Appointment_pageobject.notificationaddbtn.click();
	Select selectradio=new Select(Add_Appointment_pageobject.notificationradio);
	selectradio.selectByVisibleText("Email");
	
	Add_Appointment_pageobject.notificationhrs.sendKeys("01");
	
	Add_Appointment_pageobject.notificationmins.sendKeys("25");
	
	Select selecttemplate=new Select(Add_Appointment_pageobject.notificationtemplate);
	selecttemplate.selectByIndex(1);
	
	Add_Appointment_pageobject.notificationaddbtn.click();

	
	Add_Appointment_pageobject.notificationdelete.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.notificationdelete.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.appointmentstatus.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.selectappstatus.click();
	Add_Appointment_pageobject.upload.click();
	Thread.sleep(2000);
	Robot rb = new Robot();

	


	rb.keyPress(KeyEvent.VK_CONTROL);
	rb.keyPress(KeyEvent.VK_V);

	rb.keyRelease(KeyEvent.VK_CONTROL);
	rb.keyRelease(KeyEvent.VK_V);

	rb.keyPress(KeyEvent.VK_ENTER);
	rb.keyRelease(KeyEvent.VK_ENTER);

	Thread.sleep(2000);
	

	Add_Appointment_pageobject.descriptionbox.clear();
	Add_Appointment_pageobject.descriptionbox.sendKeys("go to hell");
	Thread.sleep(3000);
	
	
	Add_Appointment_pageobject.savebtn.click();
	Thread.sleep(1000);
	Add_Appointment_pageobject.savebtn.click();
	//Add_Appointment_pageobject.cancelbtn.click();
	
	try {
		Thread.sleep(1000);
		Add_Appointment_pageobject.cancelbtn.click();
	} catch (Throwable e) {
		// TODO: handle exception
	}
	
	

		
	}
	

	

}
