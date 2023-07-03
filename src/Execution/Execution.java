package Execution;

import java.awt.AWTException;
import java.io.IOException;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Add_Appointment_contactmodule.Add_Appointment_from_contactmodule;
import Add_Appointment_contactmodule.Appointment_info;
import Add_Supplier_Scenario.Add_first_Layout;
import Add_Task_in_Contact_module.Add_Task;
import Add_customer_scenario.Add_customer_info;
import Add_job_in_contact_module.Add_Job;
import Add_job_in_contact_module.Ordering_page;
import Add_new_product.Add_new_product;
import Check_View_Modification_fun.View_modification;
import Comapny_Info.Add_company_info_in_contact_module;
import Commission_page.Commission;
import Grip_tag_layout.Grid_Layout_Elements;
import Initilaizer.login_the_page;
import Jobhistory_Task_Documents.Documents_Add;
import Jobhistory_Task_Documents.Task_add;
//import Jobhistory_Task_Documents.jobhistorry;
import Jobhistory_Task_Documents.jobhistory;
import Jobhistory_Task_Documents.search_fields;
import Onlineportal_And_FTP.Online_portal_details;
import Payment_info.Payment_info;
import Pricing_configure.Pricing_configure;
import Product_configure.Product_configure;
import Product_configure.Product_configure_pageobject;

public class Execution extends login_the_page {
	
	
	@BeforeTest
	public static void Open_The_browser() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver",
				"E:\\Aravind\\selenium files\\selenium files\\chromedriver_win32 (3)\\chromedriver.exe");
		driver = new ChromeDriver(option);

//			System.setProperty("webdriver.edge.driver",
//					"E:\\Selenium setups\\drivers\\msedgedriver.exe");
//			driver = new EdgeDriver();
//			

		driver.manage().window().maximize();
		driver.get("https://curtainmatrix.co.uk/productoptimization/contacts"); // https://curtainmatrix.co.uk/testingsource/contacts
	}

	@Test(priority = 1)
	public static void Login_The_Application() throws InterruptedException {
		login_the_page.login_the_application();
		login_the_page.Move_to_setings();

	}

	@Test(priority = 2)
	public static void Add_NeW_Product() throws InterruptedException, AWTException, IOException {
		
		Add_new_product.add_product();
		
//		for(int i=0;i<10;i++) {
//			Add_new_product.add_product();
//			Thread.sleep(3000);
//			driver.navigate().back();
//			Thread.sleep(2000);
//			driver.navigate().back();
			
//			}
				
		
		Add_new_product.Add_Blinds_Fabrics_Materials();
		Add_new_product.Add_Blinds_Fabrics_Materials_edit();
		Add_new_product.Add_Numeric();
		Add_new_product.Add_Numeric_X();
		Add_new_product.Add_Numeric_Y();
		Add_new_product.Add_Location_List();
		Add_new_product.Add_location_Text();
		Add_new_product.Add_Blinds_Opening_Width();
		Add_new_product.Add_Main_filed();
		Add_new_product.Add_Main_Option_Details_1();
		Add_new_product.Three_dot_Add_Main_Option_Details_2();
		Add_new_product.Add_sub_filed_1();
		Add_new_product.Add_Sub_Option_Detail_1();
		Add_new_product.Three_dot_Add_Sub_Option_Details_2();
		Add_new_product.Three_dot_Add_Option_Details_3();
		Add_new_product.Three_dot_Use_Existing_Option();
		Add_new_product.Three_dot_Use_Add_Recipe();
		Add_new_product.Add_Pricing_Group();

	}
	
//	@Test(priority = 3)
//	public static void Edit_Product() throws InterruptedException, AWTException, IOException {
//	
//		Add_new_product.Edit_product();
//		Add_new_product.Add_Blinds_Fabrics_Materials();
//		Add_new_product.Add_Blinds_Fabrics_Materials_edit();
//	
//	}
//		@Test(priority = 2)	
//			public static void Add_Customer_info() throws InterruptedException, IOException, AWTException{
//		
//			Add_customer_info.Check_new_contacttype();
//			Add_customer_info.Add_New_Customer_info();
//		}
////		
//
//	@Test(priority = 3)
//
//	public static void Add_job_in_contact_module() throws InterruptedException, AWTException, IOException {
//		Thread.sleep(5000);
//		Add_Job.open_the_Creat_job_page_from_contact_module();
//
//		Ordering_page.Roller();
//
//		Ordering_page.venetains_product();
//		Ordering_page.Awnings();
//		Ordering_page.Shutter();
//		Ordering_page.curtains();

//		Ordering_page.Order_edit();
////
//			Add_Job.add_appointment_from_jobpage();
//			Add_Appointment_from_contactmodule.add_appointment_fields();
//			Add_Appointment_from_contactmodule.appointment_edit();
//			Add_Job.add_task_from_jobpage();
//			Add_Task.add_task_fields();
//			
//			Add_Job.add_payment();
//			Add_Job.move_account();
}
//
//		@Test(priority = 4)
//		public static void company_info() throws InterruptedException, AWTException, IOException {
//			
//			
//			Add_company_info_in_contact_module.company_info();
//		}
//		

//		@Test(priority = 5)
//		public static void pricing_add() throws InterruptedException, IOException {
//			
//			Pricing_configure.Add_Pricing_Configuration();
//		}

//
//		@Test(priority = 6)
//		public static void Payment_Info() throws InterruptedException, AWTException, IOException {
//			
//			Payment_info.Payment_info();
//			Payment_info.bulk_payment();
//			
//			
//		}
//		
//
//		
//		@Test(priority = 7)
//		public static void commision_add() throws InterruptedException, AWTException, IOException {
//			
//			Commission.commission_page();
//		}
//		
//		@Test(priority = 8)
//		public static void job_history() throws InterruptedException, AWTException {
//			
//			
//			jobhistory.jobhistory();
//			
//		}
//		
//		@Test(priority = 9)
//		public static void addtask() throws InterruptedException, AWTException, IOException {
//			Task_add.add_task();
//			Add_Task.Switchto_add_task();
//			Add_Task.add_task_fields();
//		}
//		
//		@Test(priority = 10)
//		public static void adddocument()throws InterruptedException, AWTException {
//			
//			Documents_Add.add_document();
//		}
//	
//		@Test(priority = 11)
//		public static void online_poratl()throws InterruptedException, AWTException {
//			
//			Online_portal_details.online_portal();
//			
//		}
//		
//		@Test(priority = 12)
//		public static void FTP_configure()throws InterruptedException, AWTException {
//			Onlineportal_And_FTP.FTP_configure.Add_FTP_configure();
//	
//		}
//		
//
//
//		@Test(priority = 13)
//		public static void product_configure() throws InterruptedException, AWTException {
//			
//			Product_configure.product_Enabledisable();
//			Product_configure.Pricing_group_material_discount();
//		}
//		
//		
//		
//		
//		@Test(priority = 14)
//		public static void customerpageclose() throws InterruptedException, AWTException {
//			
//			login_the_page.closecustomerpage();
//			search_fields.Searc_field_in_Customers_list();
//		}
//		
//		@Test(priority = 15)
//		public static void Add_Supplier_info() throws AWTException, InterruptedException, IOException {
//			Add_first_Layout.Selectsupplierlayout();
//			Add_first_Layout.Add_supplier_info();
//			Add_first_Layout.Save_the_Info();	
//		}
//		
//		
//		@Test(priority = 16)
//		public static void Add_View_Page_Check() throws InterruptedException, IOException {
//			View_modification.Add_View_Page();
//			View_modification.check_lock_the_view_flow();
//			View_modification.Add_View_Page_duplicat_check();
//		}
//		
//		@Test(priority = 17)
//		public static void Add_task_in_contact_module() throws InterruptedException, AWTException, IOException {
//			Add_Task.Switchto_add_task();
//			Add_Task.add_task_fields();
//		
//		}
//		
//		@Test(priority = 18)
//		public static void Add_Appointment() throws InterruptedException, AWTException, IOException {
//		
//			
//		
//		Add_Appointment_from_contactmodule.Add_appointment();
//		Add_Appointment_from_contactmodule.add_appointment_fields();
//		}
//
//		@Test(priority = 19)
//		public static void Grid_layout() throws InterruptedException {
//			Grid_Layout_Elements.move_to_grid_layout();
//		}

// @AfterTest
//		public static void Close_The_Browser() throws InterruptedException {
//			driver.quit();
//		}

//}
