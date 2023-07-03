package Add_new_product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import graphql.PublicApi;

public class Add_new_Options_pageobject {

	// Option Details

	@FindBy(xpath = "//*[@placeholder='Option Name']")
	public static WebElement OptionName;
	@FindBy(xpath = "//*[@placeholder='Description']")
	public static WebElement Description;
	@FindBy(xpath = "//label[text()=' Upload Image ']")
	public static WebElement OptionImage;
	@FindBy(xpath = "//*[@placeholder='Option Qty']")
	public static WebElement OptionQuantity;
	@FindBy(xpath = "//*[@placeholder='Option Code']")
	public static WebElement OptionCode;
	@FindBy(xpath = "//*[@name='SelectPrices']/div")
	public static WebElement SupplierDropdown;
	@FindBy(xpath = "(//mat-option[@role='option']//span)[3]")
	public static WebElement SelectSupplier;
	@FindBy(xpath = "//label[text()=' Upload Image ']/following::input)[1]")
	public static WebElement ExclPricetablediscountforOption;

	// Three dot

	@FindBy(xpath = "//*[@id='optionsdatafrom']/div/div/button")
	public static WebElement OptionThreedot;

	@FindBy(xpath = "(//*[text()='Job Item'])[3]/following::div[1]")
	public static WebElement JobItemONOFF1;

	@FindBy(xpath = "(//*[text()='Online Portal'])[3]/following::div[1]")
	public static WebElement OnlinePortalONOFF1;

	@FindBy(xpath = "//*[@id=\"optionsdatafrom\"]/div/div/div/div/div[1]/ul/li[3]/label/div")
	public static WebElement EcommerceONOFF1;

	@FindBy(xpath = "(//*[text()='Contact Type'])[2]/following::div[1]")
	public static WebElement ContactTypeONOFF;

	@FindBy(xpath = "(//*[text()='Price Group'])[1]/following::div[1]")
	public static WebElement PriceGroupONOFF;
	
	@FindBy(xpath = "(//*[text()='Price Table Supplier'])[1]/following::div[1]")
	public static WebElement PriceTableSupplierONOFF;
	
	@FindBy(xpath = "(//*[text()='Min, Max'])[1]/following::div[1]")
	public static WebElement MinMaxONOFF;
	
	@FindBy(xpath = "//*[@id='optionsdatafrom']/div/div/div/div/div[3]/ul/li[1]/label/div")
	public static WebElement DomesticONOFF;
	
	@FindBy(xpath = "//*[@id=\"optionsdatafrom\"]/div/div/div/div/div[3]/ul/li[2]/label/div")
	public static WebElement ContractONOFF;
	
	@FindBy(xpath = "//*[@id=\"optionsdatafrom\"]/div/div/div/div/div[3]/ul/li[3]/label/div")
	public static WebElement TradeONOFF;
	
	
	@FindBy(xpath = "//*[@id=\"optionsdatafrom\"]/div/div/div/div/div[3]/ul/li[4]/label/div")
	public static WebElement ECommerceONOFF2;
	
	


	// OptionhasPriceONOFF

	@FindBy(xpath = "(//p[text()='No'])[21]")
	public static WebElement OptionhasPriceONOFF;
	// @FindBy(xpath = "//*[@id='unit_type']")
	// public static WebElement UnitType;
	@FindBy(xpath = "//*[@placeholder='Unit Cost']")
	public static WebElement UnitCost;
	@FindBy(xpath = "//*[@id='pricing_type']")
	public static WebElement PricingType;

	// PricingType

	@FindBy(xpath = "//*[@id='pricing_type']/option[1]")
	public static WebElement PricingTypefixed;
	@FindBy(xpath = "//*[@id='pricing_type']/option[2]")
	public static WebElement PricingTypePercentage;
	@FindBy(xpath = "//*[@id='pricing_type']/option[3]")
	public static WebElement PricingTypeWidthPrices;
	@FindBy(xpath = "//*[@id='pricing_type']/option[4]")
	public static WebElement PricingTypeDropPrices;
	@FindBy(xpath = "//*[@id='pricing_type']/option[5]")
	public static WebElement PricingTypePriceTable;
	@FindBy(xpath = "//*[@id='pricing_type']/option[6]")
	public static WebElement PricingTypePricePerMeterWidth;
	@FindBy(xpath = "//*[@id='pricing_type']/option[7]")
	public static WebElement PricingTypePricePerMeterDrop;
	@FindBy(xpath = "//*[@id='pricing_type']/option[8]")
	public static WebElement PricingTypePricePerinchWidth;
	@FindBy(xpath = "//*[@id='pricing_type']/option[9]")
	public static WebElement PricingTypePricePerinchDrop;
	@FindBy(xpath = "//*[@id='pricing_type']/option[10]")
	public static WebElement PricingTypePricePerCurtainDrop;
	@FindBy(xpath = "//*[@id='pricing_type']/option[11]")
	public static WebElement PricingTypeMeterSquare;
	@FindBy(xpath = "//*[@id='pricing_type']/option[12]")
	public static WebElement PricingTypePerimeter;
	@FindBy(xpath = "//*[@id='pricing_type']/option[13]")
	public static WebElement PricingTypeAllowance;
	@FindBy(xpath = "//*[@id='pricing_type']/option[14]")
	public static WebElement PricingTypeSquarefootage;
	@FindBy(xpath = "//*[@id='pricing_type']/option[15]")
	public static WebElement PricingTypeSquareyard;

	@FindBy(xpath = "//*[@placeholder='Landed Cost']")
	public static WebElement LandedCost;
	@FindBy(xpath = "//*[@placeholder='Supplier Discount (%)']")
	public static WebElement SupplierDiscount;

	@FindBy(xpath = "//*[@placeholder='Domestic Markup']")
	public static WebElement DomesticMarkup;
	@FindBy(xpath = "//*[@placeholder='Contract Markup']")
	public static WebElement ContractMarkup;
	@FindBy(xpath = "//*[@placeholder='Trade Markup']")
	public static WebElement TradeMarkup;
	@FindBy(xpath = "//*[@placeholder='ECommerce Markup']")
	public static WebElement ECommerceMarkup;

	// Option has Stock;

	@FindBy(xpath = "(//p[text()='No'])[22]")
	public static WebElement OptionhasStockONOFF;

	@FindBy(xpath = "//*[@id='unit_type (sku)']")
	public static WebElement UnitTypeSKU;

	@FindBy(xpath = "//*[@id='preferred_order by']/option[1]")
	public static WebElement preferred_orderbyBoxes;
	
	@FindBy(xpath = "//*[@id='preferred_order by']/option[2]")
	public static WebElement preferred_orderbyDirect;

	@FindBy(xpath = "//*[@placeholder='Re-Order Level']")
	public static WebElement ReOrderLevel;

	@FindBy(xpath = "//*[@placeholder='Units per Box']")
	public static WebElement UnitsperBox;

	@FindBy(xpath = "//*[@placeholder='Boxes to order']")
	public static WebElement Boxestoorder;

	@FindBy(xpath = "//*[@placeholder='Purchase Order Point_Min']")
	public static WebElement PurchaseOrderPoint_Min;

	@FindBy(xpath = "//*[@placeholder='Purchase Order Point_Max']")
	public static WebElement PurchaseOrderPoint_Max;
	
	@FindBy(xpath = "//*[@id='generate_purchase order']")
	public static WebElement GeneratePurchaseOrder;
	@FindBy(xpath = "//*[@id='generate_purchase order']/option[1]")
	public static WebElement GeneratePurchaseOrderAutomatic;
	@FindBy(xpath = "//*[@id='generate_purchase order']/option[2]")
	public static WebElement GeneratePurchaseOrderManual;
	
	
	@FindBy(xpath = "(//span[text()=' Stock Consumption ']/following::input)[1]")
	public static WebElement StockConsumption;

	@FindBy(xpath = "//*[@id='stock_updation']")
	public static WebElement StockUpdation;

	@FindBy(xpath = "//*[@id='stock_updation']/option[1]")
	public static WebElement StockUpdationManual;
	@FindBy(xpath = "//*[@id='stock_updation']/option[2]")
	public static WebElement StockUpdationAutomatic;
//Other Attributes

	@FindBy(xpath = "//input[@placeholder='Min Width']")
	public static WebElement MinWidth;

	@FindBy(xpath = "//input[@placeholder='Max Width']")
	public static WebElement MaxWidth;

	@FindBy(xpath = "//input[@placeholder='Min Drop']")
	public static WebElement MinDrop;

	@FindBy(xpath = "//input[@placeholder='Max Drop']")
	public static WebElement MaxDrop;

	@FindBy(xpath = "//*[@id='price_table supplier']")
	public static WebElement PriceTableSupplier;
	
	
	@FindBy(xpath ="//*[@id='price_table supplier']/option[2]")
	public static WebElement PriceTableSupplierDecora;
	

	@FindBy(xpath = "(//span[@class='dropdown-btn'])[3]")
	public static WebElement selectPriceGroups;
	
	@FindBy(xpath = "//*[@id='mat-tab-content-1-0']/div/div[4]/div[2]/div/div[6]/div/div[2]/app-dynamic-field/ng-multiselect-dropdown/div/div[2]/ul[1]/li[1]/div")
	public static WebElement selectAllPriceGroups;
	@FindBy(xpath = "//*[@id='optionPopupSave']")
	public static WebElement Save;

	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[2]/p/label")
	public static WebElement TotalRecord;
	
}
