package Add_new_product;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Add_new_product_pageobject {

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/main[1]/section[1]/app-settings[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/a[1]")
	public static WebElement Prducts;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/main[1]/section[1]/app-product[1]/div[1]/div[1]/button[1]")

	public static WebElement AddNewProduct;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/main[1]/section[1]/app-product-new[1]/div[2]/div[1]/div[1]/app-general-info[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")

	public static WebElement ProductName;

	@FindBy(xpath = "//*[@id='pcode']")

	public static WebElement ProductCode;

	@FindBy(xpath = "//*[@id='productdescription']")

	public static WebElement ProductDescription;

	@FindBy(xpath = "/html[1]/body[1]/app-root[1]/main[1]/section[1]/app-product-new[1]/div[2]/div[1]/div[1]/app-general-info[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[4]/div[1]/mat-select[1]")

	public static WebElement SelectProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Blinds Fabrics']")

	public static WebElement BlindProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Blinds Slats']")

	public static WebElement SlatProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Awnings']")

	public static WebElement AwningsProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Velux']")

	public static WebElement VeluxProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Soft Furnishings']")

	public static WebElement SoftFurnishingsProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Shutter']")

	public static WebElement ShutterProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Accessories / Specials']")

	public static WebElement AccessoriesSpecialsProductCategory;

	@FindBy(xpath = "//span[normalize-space()='Others']")

	public static WebElement OthersProductCategory;

	@FindBy(xpath = "//*[@id='generalinfoform']/div[1]/div/div/div/div[5]/div/select")

	public static WebElement CostPriceComesFrom;

	@FindBy(xpath = "//*[@id='generalinfoform']/div[1]/div/div/div/div[6]/div/select")

	public static WebElement SellingPriceComesFrom;

	@FindBy(xpath = "//*[@id='savegeneralinfoButton']")

	public static WebElement SaveandNext;

	@FindBy(xpath = "//*[@id='generalinfoform']/div[2]/button[2]")

	public static WebElement Cancel;

	@FindBy(xpath = "//*[@id=\"fieldtype\"]/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[2]")
	public static WebElement Editproduct;

	@FindBy(xpath = "//a[text()=' General Info ']/following-sibling::a")

	public static WebElement Formsetup;

	@FindBy(xpath = "//button[text()='Add New Field']")

	public static WebElement Addnewfield;

	@FindBy(xpath = "//*[@id='feildName_id']")

	public static WebElement feildName;

	@FindBy(xpath = "//*[@id=\"fieldModal\"]/div/div/form/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")

	public static WebElement feildtype;
	
	@FindBy(xpath = "// *[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[2]/div[2]/div/div[1]/select")

	public static WebElement feildtypealllist;
	

	@FindBy(xpath = "(//label[text()='Field Code']/following::input)[1]")
	public static WebElement feliedcode;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[1]/label")
	public static WebElement List;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[2]/label")
	public static WebElement Numeric;

	@FindBy(xpath = "//*[@id='checkboxes']div/div[3]/label")
	public static WebElement Qty;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[4]/label")
	public static WebElement PricingGroup;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[5]/label")
	public static WebElement Supplier;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[6]/label")
	public static WebElement BlindsFabricsMaterials;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[7]/label")
	public static WebElement NumericX;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[8]/label")
	public static WebElement NumericY;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[9]/label")
	public static WebElement Location_List;
	
	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
	public static WebElement AddLocation_List;
	
	@FindBy(xpath = "//input[@placeholder='Location Name']")
	public static WebElement Locationname;
	
	@FindBy(xpath = "//*[@id='optionPopupSave']")
	public static WebElement Locationnamesave;
	
	
	

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[10]/label")
	public static WebElement Location_Text;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[11]/label")
	public static WebElement Text;

	@FindBy(xpath = "//*[@id='checkboxes']/div/div[12]/label")
	public static WebElement BlindsOpeningWidth;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/button")
	public static WebElement filedaddoption;
	
	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[3]/div[2]/div/div[1]/div")
	public static WebElement filedaddoption2;
	
	@FindBy(xpath = "//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[4]/div[1]/span/a")
	public static WebElement filedaddoptionedit;
	
	@FindBy(xpath = "//a[contains(text(),'Blinds Fabrics Materials')]")
	public static WebElement filedfabricedit;
	
	@FindBy(xpath = "//a[contains(text(),'Location_List')]")
	public static WebElement filedlocationlistedit;
	
	@FindBy(xpath = "(//a[contains(text(),'List')])[2]")
	public static WebElement filedlistedit;
	
	
	@FindBy(xpath = "//button[text()='Add/Link Supplier']")
	public static WebElement SupplierAddorLink;
	
	
	@FindBy(xpath = "//button[text()='Link To Product']")
	public static WebElement SupplierLinkToProduct;
	
	
	
	@FindBy(xpath = "//*[@id='supplierlinkGrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[8]/div[1]/div/div/div")
	public static WebElement Suppliercheckboxlink;


	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
	public static WebElement Addnewprice;

	@FindBy(xpath = "//*[@id='optionmyGrids']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[1]/div/div/div/div[2]/input")
	public static WebElement ExistingOptionscheckbox;

	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[2]")
	public static WebElement Linkexisting;

	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[2]/p/label")
	public static WebElement TotalRecord;

	@FindBy(xpath = "//*[@id='existingOptions']/div/div/div[3]/button[1]")
	public static WebElement AddNewOption;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[2]/div[1]/div[2]/label/div")
	public static WebElement JobItemOnoff;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[2]/div[2]/div[2]/label/div")
	public static WebElement OnlinePortalOnoff;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[2]/div[3]/div[2]/label/div")
	public static WebElement EcommerceOnoff;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[2]/div[4]/div[2]/label/div")
	public static WebElement MandatoryOnoff;

	@FindBy(xpath = "//*[@id='single']")
	public static WebElement singleSelect;

	@FindBy(xpath = "//*[@id='single_1']")
	public static WebElement MultipleSelect;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[4]/div[2]/div/ng-multiselect-dropdown/div/div[1]/span")
	public static WebElement Default;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[2]/div/div[1]/div[4]/div[2]/div/ng-multiselect-dropdown/div/div[2]/ul[2]/li/div")
	public static WebElement DefaultMultipleSelect;

	@FindBy(xpath = "//*[@id=\"fieldModal\"]/div/div/form/div[3]/button[1]")
	public static WebElement Filedsave;

	@FindBy(xpath = "//*[@id='fieldModal']/div/div/form/div[3]/button[2]")
	public static WebElement fieldCancel;

	@FindBy(xpath = "(//button[contains(@class,'btn p-0')])[3]")
	public static WebElement Threedot;

//	@FindBy(xpath = "(//button[contains(@class,'btn p-0')])[4]")
//	public static WebElement NumericTestThreedot;
//	
//	@FindBy(xpath = "(//button[contains(@class,'btn p-0')])[4]")
//	public static WebElement PGThreedot;

	@FindBy(xpath = "(//button[text()=' Delete'])[3]")
	public static WebElement ThreedotDelect;

//	@FindBy(xpath = "(//button[text()=' Delete'])[4]")
//	public static WebElement NumericTestThreedotDelect;
//	
//	@FindBy(xpath = "(//button[text()=' Delete'])[4]")
//	public static WebElement PGThreedotDelect;

	@FindBy(xpath = "//*[@id='deletecomomnotfication']/div/div/div/div/div/button[1]")
	public static WebElement Warningok;

	@FindBy(xpath = "//*[@id='mat-select-value-3']/span")
	public static WebElement SelectPricingGroup;

	@FindBy(xpath = "//*[@id='materialPriceGroup']/div/div/div[2]/div/div/div/button")
	public static WebElement Addsupplier;

//	@FindBy(xpath = "//*[@id='mat-select-value-17']")
//	public static WebElement ChooseSupplier;
//	
	@FindBy(xpath = "//*[@id='mat-select-16-panel']/footer/button")
	public static WebElement Addorlinksupplier;

	@FindBy(xpath = "((//*[@id=\"supplierlinkGrid\"]/div/div[2]/div[2]/div[3])[2]//following::input)[1]")
	public static WebElement Suppliercheckbox;

	@FindBy(xpath = "//*[@id='linkPriceSupplierpopup']/div/div/div[3]/button[2]")
	public static WebElement Linksupplier;

	
	@FindBy(xpath = "//*[@id='priceForm']/div[1]/div[1]/div/mat-form-field")
	public static WebElement ChooseSupplier;

	@FindBy(xpath = "//*[@id='materialPriceGroup']/div/div/div[2]/div/div/div/mat-form-field")
	public static WebElement SelectPG;

	@FindBy(xpath = "//*[@name='selectall']/following::span[1]")

	public static WebElement SelectPGcheckbox;

	@FindBy(xpath = "//*[@id='materialPriceGroup']/div/div/div[3]/button[1]")
	public static WebElement materialPGassign;

	@FindBy(xpath = "(//mat-option[@role='option'])[2]")
	public static WebElement Selectsupplierlist;

	@FindBy(xpath = "//*[@id='priceForm']/div[1]/div[2]/div/input[1]")
	public static WebElement Pricegroupname;

	@FindBy(xpath = "//*[@id='priceForm']/div[2]/button[1]")
	public static WebElement Pricegroupsave;

	@FindBy(xpath = "//*[@id='priceForm']/div[2]/button[2]")
	public static WebElement Pricegroupcancel;

	@FindBy(xpath = "//*[@id='myGrid']/div/div[2]/div[2]/div[3]/div[1]/div[3]/div[2]/span/span[2]/span")
	public static WebElement FiledDropdown;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/span/span[2]/span")
	public static WebElement FiledDropdown1;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div[1]/div[3]/span/i")
	public static WebElement optionthreedot1;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[1]/div[3]/div/div[1]/div[3]/span/i")
	public static WebElement optionthreedot2;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[1]/div/div[2]/span/span[2]/span")
	public static WebElement optiondropdown1;

	@FindBy(xpath = "//*[@id='field1']")
	public static WebElement Fieldthreedot1;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[6]/div/div[2]/div/app-fieldglobaldelete/div/div[1]/span")
	public static WebElement AddFieldthreedot1;

	@FindBy(xpath = "//span[text()=' Add New Option']")
	public static WebElement optionthreedot1addnewoptins;

	@FindBy(xpath = "//span[text()=' Use Existing Option']")
	public static WebElement optionthreedot1UseExistingOption;

	@FindBy(xpath = "//span[text()=' Create Recipe']")
	public static WebElement optionthreedot1CreateRecipe;

	@FindBy(xpath = "//*[@id=\"myGrid\"]/div/div[2]/div[2]/div[3]/div[4]/div/div/div/div/div[2]/div[2]/div[1]/div[1]/div/div[1]/div[2]/div[2]/input")
	public static WebElement optioncheckbox;

	@FindBy(xpath = "(//button[text()='No'])[3]")
	public static WebElement RecipewarningpoupNo;

	@FindBy(xpath = "(//button[text()='Yes'])[2]")
	public static WebElement Recipewarningpoupyes;

	@FindBy(xpath = "(//button[contains(@class,'Newcancelbtn mt-1')])[3]")
	public static WebElement Recipewarningpoupcancel;

	@FindBy(xpath = "//input[@placeholder='Please Enter Recipe Name']")
	public static WebElement Recipename;

	@FindBy(xpath = "//button[text()=' Done ']")
	public static WebElement RecipeDone;

}
