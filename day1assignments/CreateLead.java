package week2.day1assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TCS");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Joshna");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sankar");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Josh");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Computer Science");
		driver.findElement(By.name("description")).sendKeys("Automation Testing");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("smsanthiya@gmail.com");
		WebElement source=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select op=new Select(source);
		op.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		String title=driver.getTitle();
		System.out.println(title);
		
}
}
