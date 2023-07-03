package Add_new_product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_new_pricetable_pageobject {

	@FindBy(xpath = "//*[@id='pricegroupModal']/div/div/div[2]/app-price-table/div[1]/div/div/div[2]/div[2]/ul/li[1]/i")
	public static WebElement zoompricetable;
	
	@FindBy(xpath = "//*[@id='pricegroupModal']/div/div/div[1]/li/img")
	public static WebElement zoomoutpricetable;
	
	@FindBy(xpath = "//*[@id='pricegroupModal']/div/div/div[2]/app-price-table/div[1]/div/div/div[2]/div[2]/ul/li[2]/i")
	public static WebElement copypricetable;

	
	@FindBy(xpath = "//*[@id='pricegroupModal']/div/div/div[2]/app-price-table/div[1]/div/div/div[2]/div[2]/ul/li[3]/i")
	public static WebElement Pastepricetable;
	
	@FindBy(xpath = "//*[@id='mat-tab-content-2-0']/div/div[1]/div[1]/div/div/button/i")
	public static WebElement addcolumn;
	
	@FindBy(xpath = "//*[@id='mat-tab-content-2-0']/div/div[1]/div[1]/div/button/i")
	public static WebElement addrow;
	
	@FindBy(xpath = "//*[@id='pricegroup0']/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div")
	public static WebElement Drop1;
	@FindBy(xpath = "//*[@id='pricegroup0']/div/div[2]/div[2]/div[3]/div[1]/div[2]/div[2]/div")
	public static WebElement Drop2;
	
	@FindBy(xpath = "//*[@id='pricegroup0']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div/div")
	public static WebElement Width1;
	@FindBy(xpath = "//*[@id='pricegroup0']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div/div")
	public static WebElement Width2;
	
	
	@FindBy(xpath = "//*[@id='pricegroup0']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[1]/div")
	public static WebElement Price1;
	@FindBy(xpath = "//*[@id=\"pricegroup0\"]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[2]/div[2]")
	public static WebElement Price2;
	@FindBy(xpath = "//*[@id=\"pricegroup0\"]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[1]")
	public static WebElement Price3;
	@FindBy(xpath = "//*[@id=\"pricegroup0\"]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[1]")
	public static WebElement Price4;
	
	@FindBy(xpath = "//*[@id='mat-tab-content-2-0']/div/div[2]/button")
	public static WebElement Save;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
