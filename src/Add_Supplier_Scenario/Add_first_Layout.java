package Add_Supplier_Scenario;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_Task_in_Contact_module.Add_Task;
import Initilaizer.login_the_page;

public class Add_first_Layout extends login_the_page {

	
	public static void Selectsupplierlayout() throws InterruptedException {

		PageFactory.initElements(driver, Add_First_layout_pageobject.class);
		Thread.sleep(3000);
		Add_First_layout_pageobject.addbtn.click();
		Add_First_layout_pageobject.supplierbtn.click();
		
		
		
	
		Thread.sleep(5000);

		if(Add_First_layout_pageobject.supplierpage.isDisplayed()) {
		}else {
		}
		Select selectlayout=new Select(Add_First_layout_pageobject.layout);
//		List<WebElement> list1=selectlayout.getOptions();
//		int size1=list1.size();
//		for(int i=0;i<=size1-1;i++) {
//		
//		
//			selectlayout.selectByIndex(i);
//			
//		
//		
//		}
		selectlayout.selectByVisibleText("Test Test");
		
	}
	
	public static void Add_supplier_info() throws AWTException, InterruptedException, IOException {

		PageFactory.initElements(driver, Add_First_layout_pageobject.class);
		
		Add_First_layout_pageobject.image.click();
		Thread.sleep(3000);
		Robot rb=new Robot();
		
		 StringSelection str = new StringSelection("E:\\1624277123242 (1).png");
		    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
		 
		     
		     rb.keyPress(KeyEvent.VK_CONTROL);
		     rb.keyPress(KeyEvent.VK_V);
		 
		    
		    rb.keyRelease(KeyEvent.VK_CONTROL);
		    rb.keyRelease(KeyEvent.VK_V);
		 
		   
		    rb.keyPress(KeyEvent.VK_ENTER);
		    rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(3000);
		Add_First_layout_pageobject.suppliername.sendKeys("asssess");          //supplier name**
		Add_First_layout_pageobject.assignto.click();
//		Add_First_layout_pageobject.assigntosearch.click();
//		Add_First_layout_pageobject.assigntosearch.sendKeys("auto");
//		Add_First_layout_pageobject.assigntoselect.click();
		
//		Add_First_layout_pageobject.assigntosearch.click();
//		Add_First_layout_pageobject.assigntosearch.sendKeys("modify");
		Add_First_layout_pageobject.assigntoselect1.click();
		Add_First_layout_pageobject.assigntoselect2.click();
		Add_First_layout_pageobject.assigntoselect3.click();
		Thread.sleep(1000);
		Add_First_layout_pageobject.assigntoselectdelete.click();
		
		//Add_First_layout_pageobject.deleteassinto.click();
		
		Add_First_layout_pageobject.supplierno.sendKeys	("00101");
		
		Add_First_layout_pageobject.accountnumber.sendKeys("1243578");
		Add_First_layout_pageobject.expecteddate.click();
		Thread.sleep(1000);
		Add_First_layout_pageobject.selectdate.click();
		Thread.sleep(2000);
//		Add_First_layout_pageobject.number.sendKeys("5454");
//		log.info("Enter the number field");
//		Add_First_layout_pageobject.radiobtn2yes.click();
//		log.info("Click the radio button2");
//		Add_First_layout_pageobject.radiobtn3.click();
//		log.info("Click the Radio button3");
//		Add_First_layout_pageobject.checkbox2.click();
//		log.info("Click the Checkbox2");
		
		Add_First_layout_pageobject.address1.sendKeys("chennai");
		Add_First_layout_pageobject.address2.sendKeys("india");
		Add_First_layout_pageobject.city.sendKeys("tamilnadu");
		Add_First_layout_pageobject.radiobtn1.click();
	
	
		Add_First_layout_pageobject.state.click();
		Add_First_layout_pageobject.selectstate.click();
		
		Select selectcountry=new Select(Add_First_layout_pageobject.country);
		selectcountry.selectByIndex(4);
		
		Add_First_layout_pageobject.zipcode.sendKeys("MK3 6FB");
		Thread.sleep(1000);
		Add_First_layout_pageobject.zipcodesearch.click();
		Thread.sleep(2000);
		Add_First_layout_pageobject.website.sendKeys("ww.ddd.com");
		Add_First_layout_pageobject.singleline.sendKeys("######");
//		Add_First_layout_pageobject.date1.click();
//		log.info("Click date1 Icon");
//		Add_First_layout_pageobject.selectdate1.click();
//		log.info("Select the desierd date");
	
	}
	
	public static void Save_the_Info() {

		PageFactory.initElements(driver, Add_First_layout_pageobject.class);
		
		
			Add_First_layout_pageobject.savebtn.click();
		try {
			Add_First_layout_pageobject.cancelbtn.click();
		} catch (Throwable e) {
		}

	}
}
