package Add_new_product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_new_Metials_pageobject {


@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
public static WebElement Addnewfabric;

@FindBy(xpath = "//input[@placeholder='Fabric Name']")
public static WebElement FabricName;

@FindBy(xpath = "//input[@placeholder='Fabric Code']")
public static WebElement FabricCode;

@FindBy(xpath = "//*[@id='fabricDynamicform']/textarea")
public static WebElement Description;

@FindBy(xpath = "//*[@name='SelectPrices']/div")
public static WebElement SupplierDropdown;

@FindBy(xpath = "//span[@class='mat-option-text'][normalize-space()='Arena']")
public static WebElement selectsupplier;

@FindBy(xpath = "//*[@id='materialFabric-modal']/div/div/form/div[1]/div[2]/div/button")
public static WebElement Addcolour;


@FindBy(xpath = "//input[@placeholder='Color Name']")
public static WebElement ColorName;

@FindBy(xpath = "//input[@placeholder='Color Code']")
public static WebElement ColorCode;

@FindBy(xpath = "//textarea[@placeholder='Customer Notes']")
public static WebElement CustomerNotes;

@FindBy(xpath = "//*[@id='colorDynamicform']/div/label")
public static WebElement  ColorImage ;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/button")
public static WebElement MetrialThreedot;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[1]/ul/li[1]/label/div")
public static WebElement JobItemONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[1]/ul/li[2]/label/div")
public static WebElement OnlinePortalONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[1]/ul/li[3]/label/div")
public static WebElement EcommerceONOFF;


@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[1]/label/div")
public static WebElement DomesticONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[2]/label/div")
public static WebElement ContractONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[3]/label/div")
public static WebElement TradeONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[4]/label/div")
public static WebElement ECommerceONOFFCT;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[5]/label/div")
public static WebElement TestONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[6]/label/div")
public static WebElement ContactType6ONOFF;

@FindBy(xpath = "//*[@id='materialColor-modal']/div/div/div/div/form/div/div/div/div/div[2]/ul/li[7]/label/div")
public static WebElement TestingONOFF;


@FindBy(xpath = "(//p[text()='No'])[22]")
public static WebElement  ColorhasPriceyesno ;

@FindBy(xpath = "//*[@id='unit_type']")
public static WebElement  unittype ;

@FindBy(xpath = "//input[@placeholder='Landed Cost']")
public static WebElement LandedCost;


@FindBy(xpath = "//input[@placeholder='Supplier Discount (%)']")
public static WebElement SupplierDiscount;


@FindBy(xpath = "//input[@placeholder='Unit Cost']")
public static WebElement UnitCost;

@FindBy(xpath = "//input[@placeholder='Minimum Discount (%)']")
public static WebElement MinimumDiscount;


@FindBy(xpath = "//input[@placeholder='Maximum Discount (%)']")
public static WebElement MaximumDiscount;

@FindBy(xpath = "//input[@placeholder='Domestic Markup']")
public static WebElement DomesticMarkup;


@FindBy(xpath = "//input[@placeholder='Contract Markup']")
public static WebElement ContractMarkup;

@FindBy(xpath = "//input[@placeholder='Trade Markup']")
public static WebElement TradeMarkup;

@FindBy(xpath = "//input[@placeholder='ECommerce Markup']")
public static WebElement ECommerceMarkup;

@FindBy(xpath = "(//p[text()='No'])[23]")
public static WebElement ColorhasStock;

@FindBy(xpath = "//*[@id='unit_type (sku)']")
public static WebElement UnitTypeSKU;

@FindBy(xpath = "//*[@id='preferred_order by']")
public static WebElement preferred_orderby;

@FindBy(xpath = "//input[@placeholder='No of Rolls']")
public static WebElement NoofRolls;


@FindBy(xpath = "//input[@placeholder='Re-Order Level']")
public static WebElement ReOrderLevel;


@FindBy(xpath = "//input[@placeholder='Purchase Order Point_Min']")
public static WebElement PurchaseOrderPoint_Min;

@FindBy(xpath = "//input[@placeholder='Purchase Order Point_Max']")
public static WebElement PurchaseOrderPoint_Max;

@FindBy(xpath = "//*[@id='generate_purchase order']")
public static WebElement GeneratePurchaseOrder;
@FindBy(xpath = "//*[@id='generate_purchase order']/option[1]")
public static WebElement GeneratePurchaseOrderAutomatic;
@FindBy(xpath = "//*[@id='generate_purchase order']/option[2]")
public static WebElement GeneratePurchaseOrderManual;


@FindBy(xpath = "//*[@id='turnable']/option[1]")
public static WebElement Turnable;

@FindBy(xpath = "//*[@id='joined']/option[1]")
public static WebElement Joined;

@FindBy(xpath = "//input[@placeholder='Width of Fabric']")
public static WebElement WidthofFabric;

@FindBy(xpath = "//input[@placeholder='Drop of Fabric']")
public static WebElement DropofFabric;

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

@FindBy(xpath ="//*[@id='materialidform']/div[2]/div/button")
public static WebElement colourSave;

@FindBy(xpath ="//*[@id='materialFabric-modal']/div/div/form/div[2]/div/button[1]")
public static WebElement FabricSave;

@FindBy(xpath ="//*[@id='materialFabric-modal']/div/div/form/div[2]/div/button[2]")
public static WebElement FabricSaveDropdown;

@FindBy(xpath ="//*[@id='materialFabric-modal']/div/div/form/div[2]/div/div/a")
public static WebElement FabricSaveandlink;


@FindBy(xpath = "//input[@aria-label='Press Space to toggle all rows selection (checked)']")
public static WebElement Colourcheckboxall;

@FindBy(xpath = "//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[3]/div[2]/span/a")
public static WebElement Editmatrial;


}
