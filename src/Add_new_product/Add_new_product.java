package Add_new_product;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import Add_Appointment_contactmodule.Add_Appointment_pageobject;
import Initilaizer.login_pageobject;
import Initilaizer.login_the_page;

public class Add_new_product extends login_the_page {

	public static void add_product() throws InterruptedException, IOException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);
		
		
		
		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\productfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		
		
		
		Thread.sleep(2000);
		Add_new_product_pageobject.AddNewProduct.click();
		
	
		
		//Productfile01
		Thread.sleep(2000);
		Add_new_product_pageobject.ProductName.sendKeys(properties.getProperty("ProductName"));
		
		
		String productnamenumber =properties.getProperty("ProductName").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(productnamenumber);
		nameInt++; 
		String nameplus = properties.getProperty("ProductName").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		
		properties.setProperty("ProductName", nameplus);
		
		
		Add_new_product_pageobject.ProductCode.sendKeys(properties.getProperty("ProductCode"));
		Thread.sleep(2000);
		
		String productcodenumber =properties.getProperty("ProductCode").replaceAll("[^0-9]", ""); 
		int codeInt = Integer.parseInt(productcodenumber);
		codeInt++; 
		String codeplus = properties.getProperty("ProductCode").replaceAll("[0-9]", "") + String.format("%02d", codeInt); 
		System.out.println(codeplus);
		
		properties.setProperty("ProductCode", codeplus);
		
		
		Add_new_product_pageobject.ProductDescription.sendKeys(properties.getProperty("ProductDescription"));
		Thread.sleep(4000);
		Add_new_product_pageobject.SelectProductCategory.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.BlindProductCategory.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.CostPriceComesFrom.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.SellingPriceComesFrom.click();
		Thread.sleep(5000);
		Add_new_product_pageobject.SaveandNext.click();
		Thread.sleep(2000);
		
		FileOutputStream output=new FileOutputStream(f);
		properties.store(output, properties.getProperty(""));
		output.close();
		
		//Add_new_product_pageobject.Cancel.click();

	}

	public static void Edit_product() throws InterruptedException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(10000);
		Add_new_product_pageobject.Prducts.click();
		Thread.sleep(10000);

		String productswindow = driver.getWindowHandle();

		Add_new_product_pageobject.Editproduct.click();
		Thread.sleep(10000);

		Set<String> twowindows = driver.getWindowHandles();
		for (String newwwindow : twowindows) {
			driver.switchTo().window(newwwindow);
		}
		Thread.sleep(2000);
		Add_new_product_pageobject.Formsetup.click();

	}

	public static void Add_Main_filed() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);
		
		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		Thread.sleep(2000);
		Add_new_product_pageobject.Formsetup.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys(properties.getProperty("feildName"));

		Thread.sleep(2000);
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("List");
		
		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.filedlistedit.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.filedaddoption.click();

		Thread.sleep(3000);
		Add_new_product_pageobject.TotalRecord.click();
		Thread.sleep(2000);
		System.out.println(Add_new_product_pageobject.TotalRecord.getText());

		Thread.sleep(3000);
		Add_new_product_pageobject.AddNewOption.click();

	}

	public static void Add_Main_Option_Details_1() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_new_Options_pageobject.class);
		// Option Details

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		

		Thread.sleep(3000);
		Add_new_Options_pageobject.OptionName.sendKeys(properties.getProperty("AddMainOptionName"));
		String Optionnamenumber =properties.getProperty("AddMainOptionName").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(Optionnamenumber);
		nameInt++; 
		String nameplus = properties.getProperty("AddMainOptionName").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		
		properties.setProperty("AddMainOptionName", nameplus);
		
		
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionCode.sendKeys(properties.getProperty("OptionCode"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Description.sendKeys(properties.getProperty("Description"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.SelectSupplier.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		//Add_new_Options_pageobject.ExclPricetablediscountforOption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionQuantity.click();

		Actions new1 = new Actions(driver);
		new1.sendKeys(Keys.BACK_SPACE).perform();
		Add_new_Options_pageobject.OptionQuantity.sendKeys(properties.getProperty("OptionQuantity"));

		// Add option three dot
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionThreedot.click();
		Thread.sleep(2000);

		// Show this option on
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		// Filter by
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		// Customer Types
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();
		Add_new_Options_pageobject.ECommerceONOFF2.click();
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();

		// Option has Price
		Add_new_Options_pageobject.OptionhasPriceONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.LandedCost.sendKeys(properties.getProperty("LandedCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitCost.sendKeys(properties.getProperty("UnitCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDiscount.sendKeys(properties.getProperty("SupplierDiscount"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingType.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingTypefixed.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.DomesticMarkup.sendKeys(properties.getProperty("DomesticMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.ContractMarkup.sendKeys(properties.getProperty("ContractMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.TradeMarkup.sendKeys(properties.getProperty("TradeMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.ECommerceMarkup.sendKeys(properties.getProperty("ECommerceMarkup"));

		// Option has Stock

		Add_new_Options_pageobject.OptionhasStockONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.preferred_orderbyBoxes.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.ReOrderLevel.sendKeys(properties.getProperty("ReOrderLevel"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitsperBox.sendKeys(properties.getProperty("UnitsperBox"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Boxestoorder.sendKeys(properties.getProperty("Boxestoorder"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Max.sendKeys(properties.getProperty("PurchaseOrderPoint_Max"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Min.sendKeys(properties.getProperty("PurchaseOrderPoint_Min"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrderAutomatic.click();
//		Thread.sleep(2000);
//		Add_new_Options_pageobject.StockConsumption.click();
//		Thread.sleep(2000);
//		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdationManual.click();

		// Other Attributes

		Add_new_Options_pageobject.MinWidth.sendKeys(properties.getProperty("MinWidth"));
		Add_new_Options_pageobject.MaxWidth.sendKeys(properties.getProperty("MaxWidth"));
		Add_new_Options_pageobject.MinDrop.sendKeys(properties.getProperty("MinDrop"));
		Add_new_Options_pageobject.MaxDrop.sendKeys(properties.getProperty("MaxDrop"));
		Add_new_Options_pageobject.PriceTableSupplier.click();
		Add_new_Options_pageobject.PriceTableSupplierDecora.click();
		// Add_new_Options_pageobject.selectPriceGroups.click();
		// Add_new_Options_pageobject.selectAllPriceGroups.click();

		Thread.sleep(2000);
		Add_new_Options_pageobject.Save.click();

//		Actions action1 = new Actions(driver);
//		action1.moveToElement(Add_new_product_pageobject.ExistingOptionscheckbox)
//				.click(Add_new_product_pageobject.ExistingOptionscheckbox).build().perform();

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(2000);
		Add_new_product_pageobject.TotalRecord.click();

		Thread.sleep(3000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();
		Thread.sleep(3000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.singleSelect.click();
		Add_new_product_pageobject.MultipleSelect.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Default.click();
		Add_new_product_pageobject.DefaultMultipleSelect.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();
		
		FileOutputStream output=new FileOutputStream(f);
		properties.store(output, properties.getProperty(""));
		output.close();

	}

	public static void Three_dot_Add_Main_Option_Details_2() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(4000);
		Add_new_product_pageobject.FiledDropdown.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1addnewoptins.click();

		PageFactory.initElements(driver, Add_new_Options_pageobject.class);
		// Option Details

		
		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		
		
		
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionName.sendKeys(properties.getProperty("OptionName"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionCode.sendKeys(properties.getProperty("OptionCode"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Description.sendKeys(properties.getProperty("Description"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.SelectSupplier.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Add_new_Options_pageobject.ExclPricetablediscountforOption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionQuantity.click();

		Actions new1 = new Actions(driver);
		new1.sendKeys(Keys.BACK_SPACE).perform();
		Add_new_Options_pageobject.OptionQuantity.sendKeys(properties.getProperty("OptionQuantity"));

		// Add option three dot
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionThreedot.click();
		Thread.sleep(2000);

		// Show this option on
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		// Filter by
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		// Customer Types
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();
		Add_new_Options_pageobject.ECommerceONOFF2.click();
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();

		// Option has Price
		Add_new_Options_pageobject.OptionhasPriceONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.LandedCost.sendKeys(properties.getProperty("LandedCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitCost.sendKeys(properties.getProperty("UnitCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDiscount.sendKeys(properties.getProperty("SupplierDiscount"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingType.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingTypefixed.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.DomesticMarkup.sendKeys(properties.getProperty("DomesticMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.ContractMarkup.sendKeys(properties.getProperty("ContractMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.TradeMarkup.sendKeys(properties.getProperty("TradeMarkup"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.ECommerceMarkup.sendKeys(properties.getProperty("ECommerceMarkup"));


		// Option has Stock

		Add_new_Options_pageobject.OptionhasStockONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.preferred_orderbyBoxes.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.ReOrderLevel.sendKeys(properties.getProperty("ReOrderLevel"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitsperBox.sendKeys(properties.getProperty("UnitsperBox"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Boxestoorder.sendKeys(properties.getProperty("Boxestoorder"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Max.sendKeys(properties.getProperty("PurchaseOrderPoint_Max"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Min.sendKeys(properties.getProperty("PurchaseOrderPoint_Min"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrderAutomatic.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdationManual.click();

		// Other Attributes

		Add_new_Options_pageobject.MinWidth.sendKeys(properties.getProperty("MinWidth"));
		Add_new_Options_pageobject.MaxWidth.sendKeys(properties.getProperty("MaxWidth"));
		Add_new_Options_pageobject.MinDrop.sendKeys(properties.getProperty("MinDrop"));
		Add_new_Options_pageobject.MaxDrop.sendKeys(properties.getProperty("MaxDrop"));
		Add_new_Options_pageobject.PriceTableSupplier.click();
		Add_new_Options_pageobject.PriceTableSupplierDecora.click();
		// Add_new_Options_pageobject.selectPriceGroups.click();
		// Add_new_Options_pageobject.selectAllPriceGroups.click();

		Thread.sleep(3000);
		Add_new_Options_pageobject.Save.click();
	}

//		Actions action1 = new Actions(driver);
//		action1.moveToElement(Add_new_product_pageobject.ExistingOptionscheckbox)
//				.click(Add_new_product_pageobject.ExistingOptionscheckbox).build().perform();

	public static void Add_sub_filed_1() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, Add_new_product_pageobject.class);
		Thread.sleep(4000);
		Add_new_product_pageobject.FiledDropdown.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optiondropdown1.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Fieldthreedot1.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.AddFieldthreedot1.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.feildName.sendKeys("Extras 2");
		Thread.sleep(2000);
		Add_new_product_pageobject.feildtype.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.List.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.filedaddoption.click();

		Thread.sleep(5000);
		Add_new_product_pageobject.TotalRecord.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.AddNewOption.click();
	}

	public static void Add_Sub_Option_Detail_1() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_new_Options_pageobject.class);
		// Option Details

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		
		
		
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionName.sendKeys(properties.getProperty("OptionName"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionCode.sendKeys(properties.getProperty("OptionCode"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Description.sendKeys(properties.getProperty("Description"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.SelectSupplier.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Add_new_Options_pageobject.ExclPricetablediscountforOption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionQuantity.click();

		Actions new1 = new Actions(driver);
		new1.sendKeys(Keys.BACK_SPACE).perform();
		Add_new_Options_pageobject.OptionQuantity.sendKeys(properties.getProperty("OptionQuantity"));
		
		// Add option three dot
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionThreedot.click();
		Thread.sleep(2000);

		// Show this option on
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		// Filter by
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		// Customer Types
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();
		Add_new_Options_pageobject.ECommerceONOFF2.click();
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();

		// Option has Price
		Add_new_Options_pageobject.OptionhasPriceONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.LandedCost.sendKeys(properties.getProperty("LandedCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitCost.sendKeys(properties.getProperty("UnitCost"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDiscount.sendKeys(properties.getProperty("SupplierDiscount"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingType.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingTypefixed.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.DomesticMarkup.sendKeys(properties.getProperty("DomesticMarkup"));
		// Option has Stock

		Add_new_Options_pageobject.OptionhasStockONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.preferred_orderbyBoxes.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.ReOrderLevel.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitsperBox.sendKeys("100");
		Thread.sleep(2000);
		Add_new_Options_pageobject.Boxestoorder.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Max.sendKeys("200");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Min.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrderAutomatic.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdationManual.click();

		// Other Attributes

		Add_new_Options_pageobject.MinWidth.sendKeys("100");
		Add_new_Options_pageobject.MaxWidth.sendKeys("5000");
		Add_new_Options_pageobject.MinDrop.sendKeys("200");
		Add_new_Options_pageobject.MaxDrop.sendKeys("4000");
		Add_new_Options_pageobject.PriceTableSupplier.click();
		Add_new_Options_pageobject.PriceTableSupplierDecora.click();
		// Add_new_Options_pageobject.selectPriceGroups.click();
		// Add_new_Options_pageobject.selectAllPriceGroups.click();

		Thread.sleep(2000);
		Add_new_Options_pageobject.Save.click();

//			Actions action1 = new Actions(driver);
//			action1.moveToElement(Add_new_product_pageobject.ExistingOptionscheckbox)
//					.click(Add_new_product_pageobject.ExistingOptionscheckbox).build().perform();

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(2000);
		Add_new_product_pageobject.TotalRecord.click();

		Thread.sleep(3000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();
		Thread.sleep(3000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.singleSelect.click();
		Add_new_product_pageobject.MultipleSelect.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Default.click();
		Add_new_product_pageobject.DefaultMultipleSelect.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();

	}

	public static void Three_dot_Add_Sub_Option_Details_2() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(4000);
		Add_new_product_pageobject.FiledDropdown1.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot2.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1addnewoptins.click();

		PageFactory.initElements(driver, Add_new_Options_pageobject.class);
		// Option Details

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		
		
		
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionName.sendKeys(properties.getProperty("OptionName"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionCode.sendKeys(properties.getProperty("OptionCode"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Description.sendKeys(properties.getProperty("Description"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.SelectSupplier.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Add_new_Options_pageobject.ExclPricetablediscountforOption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionQuantity.click();

		Actions new1 = new Actions(driver);
		new1.sendKeys(Keys.BACK_SPACE).perform();
		Add_new_Options_pageobject.OptionQuantity.sendKeys("2");

		// Add option three dot
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionThreedot.click();
		Thread.sleep(2000);

		// Show this option on
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		// Filter by
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		// Customer Types
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();
		Add_new_Options_pageobject.ECommerceONOFF2.click();
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();

		// Option has Price
		Add_new_Options_pageobject.OptionhasPriceONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.LandedCost.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitCost.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDiscount.sendKeys("5");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingType.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingTypefixed.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.DomesticMarkup.sendKeys("1");
		Thread.sleep(2000);
		Add_new_Options_pageobject.ContractMarkup.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Options_pageobject.TradeMarkup.sendKeys("3");
		Thread.sleep(2000);
		Add_new_Options_pageobject.ECommerceMarkup.sendKeys("4");

		// Option has Stock

		Add_new_Options_pageobject.OptionhasStockONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.preferred_orderbyBoxes.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.ReOrderLevel.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitsperBox.sendKeys("100");
		Thread.sleep(2000);
		Add_new_Options_pageobject.Boxestoorder.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Max.sendKeys("200");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Min.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrderAutomatic.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdationManual.click();

		// Other Attributes

		Add_new_Options_pageobject.MinWidth.sendKeys("100");
		Add_new_Options_pageobject.MaxWidth.sendKeys("5000");
		Add_new_Options_pageobject.MinDrop.sendKeys("200");
		Add_new_Options_pageobject.MaxDrop.sendKeys("4000");
		Add_new_Options_pageobject.PriceTableSupplier.click();
		Add_new_Options_pageobject.PriceTableSupplierDecora.click();
		// Add_new_Options_pageobject.selectPriceGroups.click();
		// Add_new_Options_pageobject.selectAllPriceGroups.click();

		Thread.sleep(3000);
		Add_new_Options_pageobject.Save.click();

		Thread.sleep(3000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.singleSelect.click();
		Add_new_product_pageobject.MultipleSelect.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Default.click();
		Add_new_product_pageobject.DefaultMultipleSelect.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.FiledDropdown1.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot2.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1addnewoptins.click();

	}

	public static void Three_dot_Add_Option_Details_3() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_new_Options_pageobject.class);
		// Option Details

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Optionfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		
		
		
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionName.sendKeys(properties.getProperty("OptionName"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionCode.sendKeys(properties.getProperty("OptionCode"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.Description.sendKeys(properties.getProperty("Description"));
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.SelectSupplier.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000);
		Add_new_Options_pageobject.ExclPricetablediscountforOption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionQuantity.click();

		Actions new1 = new Actions(driver);
		new1.sendKeys(Keys.BACK_SPACE).perform();
		Add_new_Options_pageobject.OptionQuantity.sendKeys("2");

		// Add option three dot
		Thread.sleep(2000);
		Add_new_Options_pageobject.OptionThreedot.click();
		Thread.sleep(2000);

		// Show this option on
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		Add_new_Options_pageobject.JobItemONOFF1.click();
		Add_new_Options_pageobject.OnlinePortalONOFF1.click();
		Add_new_Options_pageobject.EcommerceONOFF1.click();
		// Filter by
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		Add_new_Options_pageobject.ContactTypeONOFF.click();
		Add_new_Options_pageobject.PriceGroupONOFF.click();
		Add_new_Options_pageobject.PriceTableSupplierONOFF.click();
		Add_new_Options_pageobject.MinMaxONOFF.click();
		// Customer Types
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();
		Add_new_Options_pageobject.ECommerceONOFF2.click();
		Add_new_Options_pageobject.DomesticONOFF.click();
		Add_new_Options_pageobject.ContractONOFF.click();
		Add_new_Options_pageobject.TradeONOFF.click();

		// Option has Price
		Add_new_Options_pageobject.OptionhasPriceONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.LandedCost.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitCost.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Options_pageobject.SupplierDiscount.sendKeys("5");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingType.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.PricingTypefixed.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.DomesticMarkup.sendKeys("1");
		Thread.sleep(2000);
		Add_new_Options_pageobject.ContractMarkup.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Options_pageobject.TradeMarkup.sendKeys("3");
		Thread.sleep(2000);
		Add_new_Options_pageobject.ECommerceMarkup.sendKeys("4");

		// Option has Stock

		Add_new_Options_pageobject.OptionhasStockONOFF.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.preferred_orderbyBoxes.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.ReOrderLevel.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.UnitsperBox.sendKeys("100");
		Thread.sleep(2000);
		Add_new_Options_pageobject.Boxestoorder.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Max.sendKeys("200");
		Thread.sleep(2000);
		Add_new_Options_pageobject.PurchaseOrderPoint_Min.sendKeys("50");
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.GeneratePurchaseOrderAutomatic.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockConsumption.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Options_pageobject.StockUpdationManual.click();

		// Other Attributes

		Add_new_Options_pageobject.MinWidth.sendKeys("100");
		Add_new_Options_pageobject.MaxWidth.sendKeys("5000");
		Add_new_Options_pageobject.MinDrop.sendKeys("200");
		Add_new_Options_pageobject.MaxDrop.sendKeys("4000");
		Add_new_Options_pageobject.PriceTableSupplier.click();
		Add_new_Options_pageobject.PriceTableSupplierDecora.click();
		// Add_new_Options_pageobject.selectPriceGroups.click();
		// Add_new_Options_pageobject.selectAllPriceGroups.click();

		Thread.sleep(3000);
		Add_new_Options_pageobject.Save.click();

//		Actions action1 = new Actions(driver);
//		action1.moveToElement(Add_new_product_pageobject.ExistingOptionscheckbox)
//				.click(Add_new_product_pageobject.ExistingOptionscheckbox).build().perform();

	}

	public static void Three_dot_Use_Existing_Option() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1UseExistingOption.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.TotalRecord.click();

		Thread.sleep(3000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();

	}

	public static void Three_dot_Use_Add_Recipe() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(2000);
		Add_new_product_pageobject.optioncheckbox.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.optionthreedot1CreateRecipe.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.RecipewarningpoupNo.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Recipename.sendKeys("Recipe 1");

		Thread.sleep(2000);
		Add_new_product_pageobject.RecipeDone.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Formsetup.click();

//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions ExtrasThreedotDelectaction = new Actions(driver);
//		ExtrasThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Numeric() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		// Add Numeric
		Thread.sleep(4000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);

		Add_new_product_pageobject.feildName.sendKeys("Numeric Test");
		Thread.sleep(2000);
//		Add_new_product_pageobject.feildtypealllist.click();
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Numeric");
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Numeric.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.Filedsave.click();

//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions NumericTestThreedotDelectaction = new Actions(driver);
//		NumericTestThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Pricing_Group() throws InterruptedException, AWTException {

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		// Add Pricing Group
		Thread.sleep(2000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);

		Add_new_product_pageobject.feildName.sendKeys("Pricing Type");
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Pricing Group");
		Thread.sleep(2000);
		Add_new_product_pageobject.PricingGroup.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.filedaddoption.click();
		Thread.sleep(3000);
		Add_new_product_pageobject.Addnewprice.click();

		// PageFactory.initElements(driver, Add_new_pricetable_pageobject.class);
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.zoompricetable.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.zoomoutpricetable.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.addcolumn.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.addcolumn.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.addrow.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.addrow.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.Price1.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.Price2.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.Price3.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.Price4.click();
//		Thread.sleep(2000);
//		Add_new_pricetable_pageobject.Save.click();

		// PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Thread.sleep(3000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(3000);
		Add_new_product_pageobject.Linkexisting.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();

		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.Filedsave.click();

//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions PGThreedotDelectaction1 = new Actions(driver);
//		PGThreedotDelectaction1.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Blinds_Fabrics_Materials() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\Pricinggroup.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		// Add Blinds Fabrics Materials ;

		Thread.sleep(3000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys("Fabric");
		
		Thread.sleep(2000);
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Blinds Fabrics Materials");
		
		Thread.sleep(2000);
		
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();
		
		Thread.sleep(3000);
		Add_new_product_pageobject.filedfabricedit.click();
		
		Thread.sleep(4000);
//		Add_new_product_pageobject.filedaddoption2.click();
		Add_new_product_pageobject.filedaddoption.click();
		Thread.sleep(3000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Addsupplier.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.ChooseSupplier.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.SupplierAddorLink.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Suppliercheckboxlink.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.SupplierLinkToProduct.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.ChooseSupplier.click();
		
		Thread.sleep(4000);
		Add_new_product_pageobject.Selectsupplierlist.click();
		
		
		
		
		Thread.sleep(4000);
		Add_new_product_pageobject.Pricegroupname.sendKeys(properties.getProperty("Pricegroupname"));
		
		
		String pricinggroupnumber =properties.getProperty("Pricegroupname").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(pricinggroupnumber);
		nameInt++; 
		String nameplus = properties.getProperty("Pricegroupname").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		
		properties.setProperty("Pricegroupname", nameplus);
		
		Thread.sleep(2000);
		Add_new_product_pageobject.Pricegroupsave.click();
		
		FileOutputStream output=new FileOutputStream(f);
		properties.store(output, properties.getProperty(""));
		output.close();
		
		
		Thread.sleep(2000);
		Add_new_product_pageobject.SelectPG.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.SelectPGcheckbox.click();
		Thread.sleep(2000);
		Actions new2 = new Actions(driver);
		new2.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);
		Add_new_product_pageobject.materialPGassign.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();
	}
	// Edit Add Metials ;

	public static void Add_Blinds_Fabrics_Materials_edit() throws InterruptedException, AWTException, IOException {

		PageFactory.initElements(driver, Add_new_Metials_pageobject.class);
		
		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\fabric.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
	
		
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Editmatrial.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.filedaddoption.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Addnewfabric.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.FabricName.sendKeys(properties.getProperty("FabricName"));
		
		String fabriccodenumber =properties.getProperty("FabricName").replaceAll("[^0-9]", ""); 
		int codeInt = Integer.parseInt(fabriccodenumber);
		codeInt++; 
		String codeplus = properties.getProperty("FabricName").replaceAll("[0-9]", "") + String.format("%02d", codeInt); 
		System.out.println(codeplus);
		
		properties.setProperty("FabricName", codeplus);
		
		
		Thread.sleep(2000);
		Add_new_Metials_pageobject.FabricCode.sendKeys("1");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Description.sendKeys("Test 1");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.SupplierDropdown.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.selectsupplier.click();

		// Add Color
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Addcolour.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ColorName.sendKeys(properties.getProperty("ColorName"));
		
		String colournamenumber =properties.getProperty("ColorName").replaceAll("[^0-9]", ""); 
		int conameInt = Integer.parseInt(colournamenumber);
		conameInt++; 
		String nameplus = properties.getProperty("ColorName").replaceAll("[0-9]", "") + String.format("%02d", codeInt); 
		System.out.println(nameplus);
		
		properties.setProperty("ColorName", nameplus);
		
		
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ColorCode.sendKeys("1");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.CustomerNotes.sendKeys("New Info");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ColorImage.click();
		Thread.sleep(2000);
		Robot rb = new Robot();

		StringSelection str = new StringSelection("C:\\Users\\Shift 1\\Pictures\\Screenshots\\Screenshot (1).png"); // SCREENSHOT
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);

		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);

		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);

		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

		// Add option three dot
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MetrialThreedot.click();
		Add_new_Metials_pageobject.JobItemONOFF.click();
		Add_new_Metials_pageobject.JobItemONOFF.click();
		Add_new_Metials_pageobject.OnlinePortalONOFF.click();
		Add_new_Metials_pageobject.OnlinePortalONOFF.click();
		Add_new_Metials_pageobject.EcommerceONOFF.click();
		Add_new_Metials_pageobject.DomesticONOFF.click();
		Add_new_Metials_pageobject.DomesticONOFF.click();
		Add_new_Metials_pageobject.ContractONOFF.click();
		Add_new_Metials_pageobject.ContractONOFF.click();
		Add_new_Metials_pageobject.TradeONOFF.click();
		Add_new_Metials_pageobject.TradeONOFF.click();
		Add_new_Metials_pageobject.ECommerceONOFFCT.click();
		Add_new_Metials_pageobject.ECommerceONOFFCT.click();
		Add_new_Metials_pageobject.TestONOFF.click();
		Add_new_Metials_pageobject.TestONOFF.click();
		Add_new_Metials_pageobject.ContactType6ONOFF.click();
		Add_new_Metials_pageobject.ContactType6ONOFF.click();
		Add_new_Metials_pageobject.TestingONOFF.click();
		Add_new_Metials_pageobject.TestingONOFF.click();

		// Color has Price
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ColorhasPriceyesno.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.unittype.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.LandedCost.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.UnitCost.sendKeys("15");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.SupplierDiscount.sendKeys("5");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MinimumDiscount.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MaximumDiscount.sendKeys("20");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.DomesticMarkup.sendKeys("1");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ContractMarkup.sendKeys("2");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.TradeMarkup.sendKeys("3");
//		Thread.sleep(2000);
//		Add_new_Metials_pageobject.ECommerceMarkup.sendKeys("4");

		// Color has Stock

		Add_new_Metials_pageobject.ColorhasStock.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.UnitTypeSKU.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Turnable.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.Joined.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.PurchaseOrderPoint_Min.sendKeys("5");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.PurchaseOrderPoint_Max.sendKeys("10");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.preferred_orderby.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.ReOrderLevel.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.WidthofFabric.sendKeys("1500");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.DropofFabric.sendKeys("3000");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.GeneratePurchaseOrder.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.GeneratePurchaseOrderAutomatic.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.StockUpdation.click();
		Thread.sleep(2000);
		Add_new_Metials_pageobject.StockUpdationAutomatic.click();

		// Other Attributes
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MinWidth.sendKeys("100");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MaxWidth.sendKeys("5000");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MinDrop.sendKeys("200");
		Thread.sleep(2000);
		Add_new_Metials_pageobject.MaxDrop.sendKeys("5000");

		Thread.sleep(2000);
		Add_new_Metials_pageobject.colourSave.click();

		Thread.sleep(2000);
		Add_new_Metials_pageobject.Colourcheckboxall.click();

		Thread.sleep(2000);
		Add_new_Metials_pageobject.FabricSaveandlink.click();

		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Addsupplier.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.ChooseSupplier.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.Selectsupplierlist.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.Pricegroupname.sendKeys("Auto 30");
		Thread.sleep(2000);
		Add_new_product_pageobject.Pricegroupcancel.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.SelectPG.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.SelectPGcheckbox.click();
		Thread.sleep(2000);
		Actions new3 = new Actions(driver);
		new3.sendKeys(Keys.TAB).perform();

		Thread.sleep(2000);
		Add_new_product_pageobject.materialPGassign.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();

		
		FileOutputStream output=new FileOutputStream(f);
		properties.store(output, properties.getProperty(""));
		output.close();
		
		
		
		Thread.sleep(2000);

//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions matrialsThreedotDelectaction = new Actions(driver);
//		matrialsThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions PGThreedotDelectaction = new Actions(driver);
//		PGThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Numeric_X() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		// Add Numeric X

		Thread.sleep(4000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys("Width");
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Numeric X");
	

		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.Filedsave.click();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions NumericXThreedotDelectaction = new Actions(driver);
//		NumericXThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Numeric_Y() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		// Add Numeric Y

		Thread.sleep(4000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys("Drop");
		Thread.sleep(2000);
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Numeric Y");
		

		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.Filedsave.click();

//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions NumericYThreedotDelectaction = new Actions(driver);
//		NumericYThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_Location_List() throws InterruptedException, AWTException, IOException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		File f = new File(
				"E:\\Aravind\\selenium files\\Workplace\\Add_Product\\src\\Add_new_product\\productfile.properties");
		FileInputStream fis = new FileInputStream(f);
		Properties properties = new Properties();
		properties.load(fis);
		
		// Add Location List

		Thread.sleep(4000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys("Room");
		
		
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Location_List");
	
		Thread.sleep(1000);
		Add_new_product_pageobject.Filedsave.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.filedlocationlistedit.click();
		
		Thread.sleep(2000);
		Add_new_product_pageobject.filedaddoption.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.TotalRecord.click();
		Thread.sleep(2000);
		System.out.println(Add_new_product_pageobject.TotalRecord.getText());
		Thread.sleep(2000);
		Add_new_product_pageobject.AddLocation_List.click();
		Thread.sleep(2000);
		
		Add_new_product_pageobject.Locationname.sendKeys(properties.getProperty("LocationName"));
		
		
		String Locationnamenumber =properties.getProperty("LocationName").replaceAll("[^0-9]", ""); 
		int nameInt = Integer.parseInt(Locationnamenumber);
		nameInt++; 
		String nameplus = properties.getProperty("LocationName").replaceAll("[0-9]", "") + String.format("%02d", nameInt); 
		System.out.println(nameplus);
		
		properties.setProperty("LocationName", nameplus);
		
		
		Thread.sleep(2000);
		Add_new_product_pageobject.Locationnamesave.click();
		
		Thread.sleep(4000);
		Add_new_product_pageobject.ExistingOptionscheckbox.click();
		Thread.sleep(2000);
		Add_new_product_pageobject.Linkexisting.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.OnlinePortalOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Thread.sleep(2000);
		Add_new_product_pageobject.Filedsave.click();
		
		FileOutputStream output=new FileOutputStream(f);
		properties.store(output, properties.getProperty(""));
		output.close();
		
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions Location_ListThreedotDelectaction = new Actions(driver);
//		Location_ListThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();

	}

	public static void Add_location_Text() throws InterruptedException, AWTException {
		PageFactory.initElements(driver, Add_new_product_pageobject.class);

		// location_Text

		Thread.sleep(4000);
		Add_new_product_pageobject.Addnewfield.click();
		Thread.sleep(4000);
		Add_new_product_pageobject.feildName.sendKeys("Special Instructions");
		Thread.sleep(2000);
		
		Select select =new Select(Add_new_product_pageobject.feildtypealllist);
		select.selectByVisibleText("Location_Text");
		

		Thread.sleep(2000);
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.JobItemOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.EcommerceOnoff.click();
		Add_new_product_pageobject.MandatoryOnoff.click();

		Add_new_product_pageobject.Filedsave.click();

//		Thread.sleep(2000);
//		Add_new_product_pageobject.Threedot.click();
//		Thread.sleep(2000);
//		Actions LocationTextThreedotDelectaction = new Actions(driver);
//		LocationTextThreedotDelectaction.moveToElement(Add_new_product_pageobject.ThreedotDelect)
//				.click(Add_new_product_pageobject.ThreedotDelect).build().perform();
//
//		Thread.sleep(2000);
//		Add_new_product_pageobject.Warningok.click();
	}

	public static void  Add_Blinds_Opening_Width() throws InterruptedException, AWTException{

	Thread.sleep(2000);
	Add_new_product_pageobject.Addnewfield.click();
	Thread.sleep(4000);
	Add_new_product_pageobject.feildName.sendKeys("Blind OPW");
	Thread.sleep(2000);
	Select select =new Select(Add_new_product_pageobject.feildtypealllist);
	select.selectByVisibleText("Blinds Opening Width");
	
	
	Thread.sleep(2000);
	Add_new_product_pageobject.JobItemOnoff.click();
	Add_new_product_pageobject.JobItemOnoff.click();
	Add_new_product_pageobject.EcommerceOnoff.click();
	Add_new_product_pageobject.EcommerceOnoff.click();
	Add_new_product_pageobject.EcommerceOnoff.click();
	Add_new_product_pageobject.EcommerceOnoff.click();
	Add_new_product_pageobject.MandatoryOnoff.click();

	Add_new_product_pageobject.Filedsave.click();
	
	
	}
}
