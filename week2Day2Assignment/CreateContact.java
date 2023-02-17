package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Nathiya");
		driver.findElement(By.id("lastNameField")).sendKeys("Sankar");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Nathi");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("san");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("db2 admin");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("Create contact in leads");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("smnathiya@gmail.com");
		WebElement source=driver.findElement(By.name("generalStateProvinceGeoId"));
		Select op=new Select(source);
		op.selectByVisibleText("New York");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("The system is down");
		driver.findElement(By.xpath("//input[@value='Update']")).click();
		String title=driver.getTitle();
		System.out.println(title);
		driver.close();
		
		
		
				
		
}
}
