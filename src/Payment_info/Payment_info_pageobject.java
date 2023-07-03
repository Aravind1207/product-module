package Payment_info;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Payment_info_pageobject {

	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[2]/div[4]")
	public static WebElement paymentinfo;
	
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[3]/div[2]")
	public static WebElement accountinfo;
	
	
	@FindBy(xpath = "//*[text()='Add Credit']/following::input[1]")
	public static WebElement addcredit;
	
	
	@FindBy(xpath = "//*[text()='Credit Limit']/following::input[1]")
	public static WebElement creditlimit;
	
	
	@FindBy(xpath = "//*[text()='Credit Available']/following::input[1]")
	public static WebElement creditavailable;
	
	
	@FindBy(xpath = "//*[text()='Over Due']/following::input[1]")
	public static WebElement overdue;
	
	@FindBy(xpath = "(//*[@class='radiomark'])[1]")
	public static WebElement dayradiobtn;
	
	@FindBy(xpath = "(//*[@class='radiomark'])[1]/following::input[1]")
	public static WebElement dayterm;
	
	@FindBy(xpath = "(//*[@class='radiomark'])[2]")
	public static WebElement monthradiobtn;
	
	@FindBy(xpath = "(//*[@class='radiomark'])[2]/following::select[1]")
	public static WebElement monthterm;
	
	@FindBy(xpath = "//*[text()=' Payment Terms Description ']/following::input[1]")
	public static WebElement description;
	
	@FindBy(xpath = "//*[@class='checkmark']")
	public static WebElement onholdradiobtn;
	
	@FindBy(xpath = "(//*[@class='mat-tab-labels'])[3]/div[1]")
	public static WebElement paymentinfosub;
	
	
	@FindBy(xpath = "(//*[@class='radiomark'])[2]")
	public static WebElement paidradiobtn;
	
	
	@FindBy(xpath = "(//*[@class='radiomark'])[1]")
	public static WebElement awaitingradiobtn;
	

	@FindBy(xpath = "(//*[@class='radiomark'])[2]/following::select[1]")
	public static WebElement datefilter;
	
	
	@FindBy(xpath = "//*[@id='accountonfogrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[8]")
	public static WebElement amount;
	
	@FindBy(xpath = "//*[@id='accountonfogrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div[1]/div[8]/div/div/div[2]/input")
	public static WebElement amountsend;
	
	
	@FindBy(xpath = "//*[@id='accountonfogrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[9]")
	public static WebElement paymentmethod;
	
	@FindBy(xpath = "//*[@id='accountonfogrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[10]")
	public static WebElement paymenttype;
	
	@FindBy(xpath = "//*[@id='accountonfogrid']/div/div[2]/div[2]/div[3]/div[2]/div/div/div/div[13]")
	public static WebElement paiddate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[3]/span")
	public static WebElement selectdate;
	
	
	@FindBy(xpath = "//*[text()='Bulk Payments']")
	public static WebElement bulkpay;
	
	@FindBy(xpath = "//*[@id='payment_method']")
	public static WebElement bpaymentmethod;
	
	
	@FindBy(xpath = "//*[@name='paymenttype']")
	public static WebElement bpaymenttype;
	
	@FindBy(xpath = "//*[@id='igx-date-picker-1']/igx-input-group/div[1]/igx-prefix/igx-icon")
	public static WebElement bpaymentdate;
	
	@FindBy(xpath = "//*[@class='igx-calendar__body-row']/following::div[1]/following::igx-day-item[25]/span")
	public static WebElement bselectdate;
	
	@FindBy(xpath = "//*[@name='jobStatus']")
	public static WebElement jobstatus;
	
	@FindBy(xpath = "//*[@id='BulkUpdateModal']/div/div/form/div[2]/div[3]/ag-grid-angular/div/div[2]/div[2]/div[1]/div[2]/div/div[1]/div[1]/div[2]/div[2]/input")
	public static WebElement selectalljob;
	
	
	@FindBy(xpath = "//*[@name='selecteactualamount']")
	public static WebElement actualamount;
	

	@FindBy(xpath = "//*[@name='amount']")
	public static WebElement paymentamount;

	@FindBy(xpath = "//*[@id='BulkUpdateModal']/div/div/form/div[3]/button[1]")
	public static WebElement paymentsave;
	
	
	

}
