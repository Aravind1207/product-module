package Add_job_in_contact_module;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Initilaizer.login_pageobject;
import Initilaizer.login_the_page;

public class Ordering_page extends Add_Job {

	
	
	public static void Roller() throws InterruptedException {
		
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(6000);
		Order_page_pageobject.selectproduct.click();
		Thread.sleep(2000);
Order_page_pageobject.searchfield.sendKeys("Curtains");
		Thread.sleep(2000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(6000);
		
		String heading=Order_page_pageobject.heading.getText()	;
		System.out.println(heading);
		Thread.sleep(1000);
		Select select2 = new Select(Order_page_pageobject.unittype);
		List<WebElement> list3 = select2.getOptions();
		int size3 = list3.size();
		for (int i = 0; i <= size3 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(3);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");

		Order_page_pageobject.room.sendKeys("10");

		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("sasa");
		String width = Order_page_pageobject.width.getAttribute("value");
		if (width.isEmpty()) {
			Order_page_pageobject.width.sendKeys("1000");
		} else {
		}

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}

//		for (int i = 1; i <= 3; i++) {
//
//			Select select3 = new Select(Add_job_pageobject.supplier);
//			select3.selectByIndex(i);
//			log.info("select the supplier");
//			Thread.sleep(2000);
//			for (int j = 1; j < 2; j++) {
//				try {
//					Select select4 = new Select(Add_job_pageobject.pricinggroup);
//					select4.selectByIndex(j);
//					Thread.sleep(2000);
//				}
//				 catch (Throwable e) {
//					// TODO: handle exception
//				}
//			}	
//
//		}
		
		try {
			Thread.sleep(2000);
			Select select3 = new Select(Order_page_pageobject.supplier);
			select3.selectByIndex(1);
			Thread.sleep(2000);
			Select select4 = new Select(Order_page_pageobject.pricinggroup);
			select4.selectByIndex(1);

			Thread.sleep(2000);
		} catch (Throwable e) {
		}
		

		Thread.sleep(1000);
		Order_page_pageobject.fabric.click();
		Thread.sleep(4000);
//		Order_page_pageobject.fabric.click();
//		Thread.sleep(2000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(6000);	
	
		
	
		
				Order_page_pageobject.colour.click();
				Thread.sleep(2000);
				try {
					Order_page_pageobject.singleselect1.click();
				} catch (Throwable e) {
					Order_page_pageobject.cancel.click();
				}
			
				
	


		Thread.sleep(5000);
		try {
			Order_page_pageobject.defaultlist.click();
			Thread.sleep(1000);
			Order_page_pageobject.multiselect1.click();
			Thread.sleep(1000);
			Order_page_pageobject.multiselect2.click();
			Order_page_pageobject.save.click();
			Thread.sleep(2000);

		} catch (Throwable e) {
			Order_page_pageobject.cancel.click();
		}
		
		
//		Add_job_pageobject.singlelist.click();
//		Thread.sleep(1000);
//		log.info("Click the single list field to open the popup");
//		
//		String s=Add_job_pageobject.singleselect1.getAttribute("value");
//		System.out.println(s);
//		
//		
//		Add_job_pageobject.singleselect1.click();
//		Thread.sleep(1000);
//		
		
		

		Thread.sleep(1000);
		Order_page_pageobject.specialinst.click();
		Order_page_pageobject.specialinst.sendKeys("12121");
		Thread.sleep(1000);

		Order_page_pageobject.productsave.click();
	}
	
	
	public static void Order_item() throws InterruptedException {
		
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(6000);
		Order_page_pageobject.selectproduct.click();
		Thread.sleep(2000);

		Order_page_pageobject.searchfield.sendKeys("order");
		Thread.sleep(2000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(5000);
		
	
		
		try {
			Select select2 = new Select(Order_page_pageobject.unittype);
			List<WebElement> list3 = select2.getOptions();
			int size3 = list3.size();
			for (int i = 0; i <= size3 - 1; i++) {
				select2.selectByIndex(i);
			}
		} catch (Throwable e) {
			Thread.sleep(3000);
			Select select2 = new Select(Order_page_pageobject.unittype);
			select2.selectByIndex(0);
		}
		
		
		
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		Thread.sleep(1000);
		
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		
		Order_page_pageobject.room.sendKeys("25");
		
		Thread.sleep(2000);
		Order_page_pageobject.singlelist.click();
		Thread.sleep(1000);
		Order_page_pageobject.singleselect2.click();
		Thread.sleep(1000);
		
		
		//Order_page_pageobject.width.sendKeys("1000");
		
		

	
		
	Thread.sleep(2000);
		Order_page_pageobject.width.sendKeys("sasa");
		String width = Order_page_pageobject.width.getAttribute("value");
		if (width.isEmpty()) {
			Order_page_pageobject.width.sendKeys("1000");
		} else {
		}
	
		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
//		
//		try {
//			Select select=new Select(Order_page_pageobject.pricinggroup);
//			select.selectByIndex(0);
//		} catch (Throwable e) {
//			// TODO: handle exception
//		}
		
		
	
	
		Thread.sleep(1000);
		Order_page_pageobject.fabric.click();
		Thread.sleep(4000);
		Order_page_pageobject.fabric.click();
		Thread.sleep(2000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(5000);	
	
		
	
		
				Order_page_pageobject.colour.click();
				Thread.sleep(2000);
				try {
					Order_page_pageobject.singleselect1.click();
				} catch (Throwable e) {
					Order_page_pageobject.cancel.click();
				}
				Thread.sleep(5000);
				
				
				
				Order_page_pageobject.extra.click();
				Thread.sleep(3000);
				Order_page_pageobject.multiselect1.click();
				Thread.sleep(1000);
				Order_page_pageobject.multiselect2.click();
				Order_page_pageobject.save.click();
				Thread.sleep(7000);
				
				Order_page_pageobject.specialinst.sendKeys("australia");
				
				Select select5 = new Select(Order_page_pageobject.locationlist);
				select5.selectByIndex(1);
			
			
				Thread.sleep(2000);
	
		
		Order_page_pageobject.productsave.click();
		
	}
	
	
	public static void venetains_product() throws InterruptedException {
		
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(7000);
		try {
			Order_page_pageobject.selectproduct.click();
			Thread.sleep(2000);

		} catch (Throwable e) {
			Thread.sleep(2000);
			Order_page_pageobject.selectproduct.click();
			Thread.sleep(2000);

		}
	
		Order_page_pageobject.searchfield.sendKeys("venitians");
		Thread.sleep(1000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(7000);
		Select select2 = new Select(Order_page_pageobject.unittype);
		List<WebElement> list3 = select2.getOptions();
		int size3 = list3.size();
		for (int i = 0; i <= size3 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(3);
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		Thread.sleep(1000);
		
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("1000");
		Thread.sleep(2000);

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
		
		Thread.sleep(1000);
		
		try {
			Select select4= new Select(Order_page_pageobject.producttype);
			select4.selectByIndex(1);
		} catch (Throwable e) {
			// TODO: handle exception
		}
	
		
		Thread.sleep(4000);
		
		

		Order_page_pageobject.recess.click();
		
		//Order_page_pageobject.recess.click();
		Thread.sleep(3000);
		Order_page_pageobject.singleselect1.click();
		
		
		
		Thread.sleep(2000);
		Order_page_pageobject.multiselect.click();
		Thread.sleep(2000);
		Order_page_pageobject.multiselect1.click();
		Thread.sleep(1000);
		Order_page_pageobject.multiselect2.click();
		Thread.sleep(1000);
		Order_page_pageobject.save.click();
		Thread.sleep(2000);
		

		
		
		Order_page_pageobject.colour.click();
		Thread.sleep(2000);
		try {
			Order_page_pageobject.singleselect1.click();
		} catch (Throwable e) {
			Order_page_pageobject.cancel.click();
		}
		Thread.sleep(2000);
		
//		Thread.sleep(3000);
//		Order_page_pageobject.controlside.click();
//		Thread.sleep(2000);
//		
//		Order_page_pageobject.singleselect1.click();
//		
//		Thread.sleep(2000);
		
		Order_page_pageobject.location2.sendKeys("santh");
		Thread.sleep(1000);
		

		Thread.sleep(2000);
		
		Order_page_pageobject.locationtext.sendKeys("go away");
		Thread.sleep(1000);
		
		
		
		
		Order_page_pageobject.productsave.click();
		Thread.sleep(5000);
		
		try {
			Order_page_pageobject.productcancel.click();
		} catch (Throwable e) {
			// TODO: handle exception
		}
	}
	
	
	public static void Awnings() throws InterruptedException {
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(5000);
		Order_page_pageobject.selectproduct.click();
		Thread.sleep(2000);

		Order_page_pageobject.searchfield.sendKeys("awnings");
		Thread.sleep(1000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(5000);
		Select select2 = new Select(Order_page_pageobject.unittype);
		List<WebElement> list3 = select2.getOptions();
		int size3 = list3.size();
		for (int i = 0; i <= size3 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(3);
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		Thread.sleep(1000);
		
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("1000");
		Thread.sleep(2000);

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
		
		Thread.sleep(1000);

		Thread.sleep(1000);
		Order_page_pageobject.fabric.click();
		Thread.sleep(6000);
		Order_page_pageobject.fabric.click();
		Thread.sleep(4000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(5000);	
	
		
	
		
				try {
					Order_page_pageobject.colour.click();
					Thread.sleep(2000);
					Order_page_pageobject.singleselect1.click();
				} catch (Throwable e) {
					Order_page_pageobject.cancel.click();
				}
				Thread.sleep(2000);
				
				try {
					Select select4= new Select(Order_page_pageobject.producttype);
					select4.selectByIndex(1);
				} catch (Throwable e) {
					// TODO: handle exception
				}
				
				Thread.sleep(3000);
				Order_page_pageobject.multiselect.click();
				Thread.sleep(2000);
				Order_page_pageobject.multiselect1.click();
				Order_page_pageobject.multiselect2.click();
				Order_page_pageobject.save.click();
				Thread.sleep(5000);
				Select select4= new Select(Order_page_pageobject.locationlist);
				select4.selectByIndex(1);
				Thread.sleep(2000);
				Order_page_pageobject.location.sendKeys("australia");
				
			
				Order_page_pageobject.productsave.click();
		
	}
	public static void Shutter() throws InterruptedException {
		
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(7000);
		
		try {
			Order_page_pageobject.selectproduct.click();
			
		} catch (Exception e) {
			Thread.sleep(5000);
			Order_page_pageobject.selectproduct.click();
			Thread.sleep(2000);
			
		}
		

		Order_page_pageobject.searchfield.sendKeys("shutter");
		Thread.sleep(1000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(6000);
		Select select2 = new Select(Order_page_pageobject.unittype);
		List<WebElement> list3 = select2.getOptions();
		int size3 = list3.size();
		for (int i = 0; i <= size3 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(3);
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("2");
		Thread.sleep(1000);
		
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Select select4 = new Select(Order_page_pageobject.producttype);
		select4.selectByIndex(1);
		Thread.sleep(1000);
		Order_page_pageobject.xsqure.sendKeys("1000");
		Thread.sleep(1000);
		Order_page_pageobject.ysqure.sendKeys("sasa");
		String ysqure = Order_page_pageobject.ysqure.getAttribute("value");
	
		if (ysqure.isEmpty()) {
			Order_page_pageobject.ysqure.sendKeys("1000");
		} else {
		}
		
		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("1000");
		Thread.sleep(2000);

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
		
		Thread.sleep(2000);
	
		Order_page_pageobject.specialinst.sendKeys("blindtrade");
		Thread.sleep(2000);

//		Order_page_pageobject.location.sendKeys("sasa");
		
		Order_page_pageobject.shuttertype.click();
		Thread.sleep(2000);
//		Order_page_pageobject.shuttertype.click();
//		Thread.sleep(2000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(2000);


		Order_page_pageobject.colour.click();
		Thread.sleep(2000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(2000);
		
//		Order_page_pageobject.extra.click();
//		Thread.sleep(2000);
//		Order_page_pageobject.singleselect1.click();
//		Thread.sleep(2000);
		
	
		Order_page_pageobject.multiselect.click();
		Thread.sleep(2000);
		Order_page_pageobject.multiselect1.click();
		Order_page_pageobject.multiselect2.click();
		Order_page_pageobject.save.click();
		Thread.sleep(2000);
		
		Order_page_pageobject.productsave.click();
		
		
		Thread.sleep(4000);
		
	}
	
	public static void curtains() throws InterruptedException {
		
		
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(5000);
		Order_page_pageobject.selectproduct.click();
		Thread.sleep(2000);

		Order_page_pageobject.searchfield.sendKeys("curtain");
		Thread.sleep(1000);
		Order_page_pageobject.selectnewproduct.click();
		Thread.sleep(5000);
		Select select2 = new Select(Order_page_pageobject.unittype);
		List<WebElement> list3 = select2.getOptions();
		int size3 = list3.size();
		for (int i = 0; i <= size3 - 1; i++) {
			select2.selectByIndex(i);
		}
		select2.selectByIndex(3);
		Thread.sleep(1000);
		Order_page_pageobject.quantity.clear();
		Order_page_pageobject.quantity.sendKeys("6");
		Thread.sleep(1000);
		
		
		Select select3 = new Select(Order_page_pageobject.supplier);
		select3.selectByIndex(1);
		Thread.sleep(1000);
		Order_page_pageobject.width.sendKeys("1000");
		Thread.sleep(2000);

		Order_page_pageobject.drop.sendKeys("sasa");
		String drop = Order_page_pageobject.drop.getAttribute("value");
		if (drop.isEmpty()) {
			Order_page_pageobject.drop.sendKeys("1000");
		} else {
		}
		Thread.sleep(1000);
		try {
			Select select4= new Select(Order_page_pageobject.pairsingle);
			select4.selectByIndex(2);
		} catch (Throwable e) {
			// TODO: handle exception
		}
		
		
		Thread.sleep(1000);
		try {
			Select select4= new Select(Order_page_pageobject.producttype);
			select4.selectByIndex(1);
		} catch (Throwable e) {
			// TODO: handle exception
		}
		Thread.sleep(1000);

		Thread.sleep(3000);
		Order_page_pageobject.softfurnishing.click();
//		Thread.sleep(6000);
//		Order_page_pageobject.fabric.click();
		Thread.sleep(4000);
		Order_page_pageobject.singleselect1.click();
		Thread.sleep(5000);	
	
		
	
		
				try {
					Order_page_pageobject.colour.click();
					Thread.sleep(2000);
					Order_page_pageobject.singleselect1.click();
				} catch (Throwable e) {
					Order_page_pageobject.cancel.click();
				}
				Thread.sleep(2000);
				Order_page_pageobject.liningtype.click();
				Thread.sleep(2000);
				Order_page_pageobject.singleselect1.click();
				
				
				Thread.sleep(2000);
				Order_page_pageobject.defaultlist.click();
				Thread.sleep(2000);
				Order_page_pageobject.multiselect1.click();
				Thread.sleep(1000);
				Order_page_pageobject.multiselect2.click();
				Order_page_pageobject.save.click();
				Thread.sleep(2000);
				
//				Thread.sleep(2000);
//				Order_page_pageobject.blackoutline.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.singleselect1.click();
//				Thread.sleep(2000);
//				
//				Order_page_pageobject.singlelist.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.singleselect1.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.sub.click();
//				Thread.sleep(2000);
//				Order_page_pageobject.multiselect1.click();
//				Order_page_pageobject.save.click();
//				Thread.sleep(2000);
//				
			
				
				Thread.sleep(2000);
				Order_page_pageobject.productsave.click();
				Thread.sleep(4000);
				try {
					Order_page_pageobject.productcancel.click();
				} catch (Throwable e) {
					// TODO: handle exception
				}
				
	}
	
	
	public static void Order_edit() throws InterruptedException {
		PageFactory.initElements(driver, Order_page_pageobject.class);
		Thread.sleep(5000);
		
		Actions actions =new Actions(driver);
		actions.clickAndHold(Order_page_pageobject.pp1).moveToElement(Order_page_pageobject.pp3).release().perform();
		
		Thread.sleep(3000);
		Order_page_pageobject.option1.click();
		Thread.sleep(1000);
		Actions actions2=new Actions(driver);
		actions2.moveToElement(Order_page_pageobject.copy).click(Order_page_pageobject.copy).build().perform();
		Thread.sleep(6000);
		try {
			Order_page_pageobject.productsave.click();
			Thread.sleep(3000);
		} catch (Exception e) {
			Thread.sleep(8000);
			Order_page_pageobject.productsave.click();
			Thread.sleep(3000);
		}
		
		
	
	Order_page_pageobject.option1.click();
	Thread.sleep(1000);
	Actions actions3=new Actions(driver);
	actions3.moveToElement(Order_page_pageobject.hold).click(Order_page_pageobject.hold).build().perform();
	Thread.sleep(3000);
	
	Order_page_pageobject.option2.click();
	Thread.sleep(1000);
	Actions actions4=new Actions(driver);
	actions4.moveToElement(Order_page_pageobject.delete2).click(Order_page_pageobject.delete2).build().perform();
	Thread.sleep(2000);
	Order_page_pageobject.deleteok.click();
	
	}
	
	
	

}
