package week2.day1;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Leadtestcase {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();	
		driver.manage().window().maximize();	
		driver.get("http://leaftaps.com/opentaps/control/main");
        String Title=driver.getTitle(); 
        System.out.println("Title");
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        WebElement username =driver.findElement(By.id("username"));
        username.sendKeys("demosalesmanager");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("crmsfa");
        WebElement LoginButton = driver.findElement(By.className("decorativeSubmit"));
        LoginButton.click();
        WebElement linktext = driver.findElement(By.linkText("CRM/SFA"));
        linktext.click();
        driver.findElement(By.linkText("Leads")).click(); 
        driver.findElementByLinkText("Create Lead").click();
        driver.findElementById("createLeadForm_companyName").sendKeys("Testleaf");
        driver.findElementById("createLeadForm_firstName").sendKeys("RAMYAA");
        driver.findElementById("createLeadForm_firstNameLocal").sendKeys("ramyaa");
        driver.findElementById("createLeadForm_lastName").sendKeys("Ganesh");
        driver.findElementById("createLeadForm_lastName").sendKeys("Ganesan");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Mrs");
        driver.findElementById("createLeadForm_birthDate").sendKeys("18/10/2021");
        driver.findElementById("createLeadForm_generalProfTitle").sendKeys("Tester");
        driver.findElementById("createLeadForm_departmentName").sendKeys("Testing");
        driver.findElementById("createLeadForm_annualRevenue").sendKeys("5000000000");
        driver.findElementById("createLeadForm_numberEmployees").sendKeys("400");
        driver.findElementById("createLeadForm_sicCode").sendKeys("SIPASS");
        driver.findElementById("createLeadForm_tickerSymbol").sendKeys("tc");
        driver.findElementById("createLeadForm_description").sendKeys("no comments");
        driver.findElementById("createLeadForm_importantNote").sendKeys("Selenium testing");
        driver.findElementById("createLeadForm_primaryPhoneCountryCode").clear();
        driver.findElementById("createLeadForm_primaryPhoneAreaCode").sendKeys("435");
        driver.findElementById("createLeadForm_primaryPhoneExtension").sendKeys("211");
        driver.findElementById("createLeadForm_primaryEmail").sendKeys("ramyaa541@gmail.com");
        driver.findElementById("createLeadForm_primaryPhoneNumber").sendKeys("8870901075");
        driver.findElementById("createLeadForm_primaryPhoneAskForName").sendKeys("nethraa");
        driver.findElementById("createLeadForm_primaryWebUrl").sendKeys("www.testleaf.com");
        driver.findElementById("createLeadForm_generalToName").sendKeys("Ramyaa");
        driver.findElementById("createLeadForm_generalAttnName").sendKeys("Lalitha");
        driver.findElementById("createLeadForm_generalAddress1").sendKeys("Gandhi nagar");
        driver.findElementById("createLeadForm_generalAddress2").sendKeys("Tambaram");
        driver.findElementById("createLeadForm_generalCity").sendKeys("chennai");
        driver.findElementById("createLeadForm_generalPostalCode").sendKeys("63");
        driver.findElementById("createLeadForm_generalPostalCodeExt").sendKeys("600063");
        driver.findElementByName("submitButton").click();
        
        	
        			
        	
        
        
        }	
	
	
	
	

}
