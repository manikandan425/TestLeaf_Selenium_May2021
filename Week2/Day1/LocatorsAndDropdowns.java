package week2.day1.assignments;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsAndDropdowns {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		System.out.println(driver.getTitle());
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Create Lead").click();
		
		
		driver.findElementById("createLeadForm_companyName").sendKeys("Cognizant");
		driver.findElementById("createLeadForm_firstName").sendKeys("Manikandan");
		driver.findElementById("createLeadForm_lastName").sendKeys("Nagarajan");
		WebElement source = driver.findElementById("createLeadForm_dataSourceId");
		Select sourceDropdown = new Select(source);
		sourceDropdown.selectByValue("LEAD_EMPLOYEE");
		WebElement markCamp = driver.findElementById("createLeadForm_marketingCampaignId");
		Select makeCampDropdown = new Select(markCamp);
		makeCampDropdown.selectByValue("CATRQ_CARNDRIVER");
		driver.findElementById("createLeadForm_firstNameLocal").sendKeys("Mani");
		driver.findElementById("createLeadForm_lastNameLocal").sendKeys("N");
		driver.findElementById("createLeadForm_personalTitle").sendKeys("Salutation");
		driver.findElementById("createLeadForm_birthDate").sendKeys("01/01/1981");
		driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mr");
		driver.findElementById("createLeadForm_departmentName").sendKeys("Department");
		driver.findElementById("createLeadForm_annualRevenue").sendKeys("100M");
		WebElement prefCurr = driver.findElementById("createLeadForm_currencyUomId");
		Select prefCurrDropdown = new Select(prefCurr);
		//prefCurrDropdown.selectByIndex(0);
		prefCurrDropdown.selectByValue("USD");		
		WebElement industry = driver.findElementById("createLeadForm_industryEnumId");
		Select industryDropdown = new Select(industry);
		industryDropdown.selectByValue("IND_HEALTH_CARE");	
		driver.findElementById("createLeadForm_numberEmployees").sendKeys("100");
		WebElement ownership = driver.findElementById("createLeadForm_ownershipEnumId");
		Select ownershipDropdown = new Select(ownership);
		ownershipDropdown.selectByValue("OWN_CCORP");		
		driver.findElementById("createLeadForm_sicCode").sendKeys("LCU065");
		driver.findElementById("createLeadForm_tickerSymbol").sendKeys("Spade");
		driver.findElementById("createLeadForm_description").sendKeys("Detailed Description for creating new lead");
		driver.findElementById("createLeadForm_importantNote").sendKeys("Important note for Leads");
		
		//Contact.................................
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
		driver.findElementById("createLeadForm_primaryPhoneCountryCode").sendKeys("2");
		driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("3660");
		driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("91");
		driver.findElementById("createLeadForm_primaryEmail").sendKeys("abc@mailinator.com");
		driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("6369865478");
		driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("Hari");
		driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("http://leaftaps.com/opentaps/control/login");
		
		//Address..................................
		driver.findElementById("createLeadForm_generalToName").sendKeys("Harii");
		driver.findElementById("createLeadForm_generalAddress1").sendKeys("41 Devendirar nagar");
		driver.findElementById("createLeadForm_generalCity").sendKeys("Vandalur");
		driver.findElementById("createLeadForm_generalPostalCode").sendKeys("600048");
		driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("412");
		driver.findElementById("createLeadForm_generalAttnName").sendKeys("TestLeaf");
		driver.findElementById("createLeadForm_generalAddress2").sendKeys("3rd Cross Street");
	    WebElement stateprov = driver.findElementById("createLeadForm_generalStateProvinceGeoId");
		Select stateprovDropdown = new Select(stateprov);
		stateprovDropdown.selectByValue("TX");		
		WebElement country = driver.findElementById("createLeadForm_generalCountryGeoId");
		Select countryDropdown = new Select(country);
		//countryDropdown.selectByIndex(0);
		countryDropdown.selectByValue("USA");	
		driver.findElementByClassName("smallSubmit").click();
		
		driver.findElementByLinkText("Duplicate Lead").click();
		driver.findElementById("createLeadForm_companyName").clear();
		driver.findElementById("createLeadForm_companyName").sendKeys("TestLeaf");
		String dupCompanyNameSent="TestLeaf";
		driver.findElementByClassName("smallSubmit").click();
		String dupCompanyNameRetrieved=driver.findElementById("viewLead_companyName_sp").getText();
		String dupCompanyNameRetrieved2=dupCompanyNameRetrieved.replaceAll("[0-9()\\s]","");
		if(dupCompanyNameSent.equalsIgnoreCase(dupCompanyNameRetrieved2))
		{
		System.out.println(dupCompanyNameSent +" entered is same as retrieved " +dupCompanyNameRetrieved2);
		}
		else {
			System.out.println(dupCompanyNameSent +" entered is not same as retrieved " +dupCompanyNameRetrieved2);
		}
		driver.close();		
	}

}
