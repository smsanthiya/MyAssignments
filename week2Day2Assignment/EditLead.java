package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();	
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
	    driver.findElement(By.xpath("//a[text()='Find Leads']")).click();   
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Joshna");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//a[text()='Joshna']")).click();
		WebElement title = driver.findElement(By.xpath("//div[text()='View Lead']"));
		String text=title.getText();
		driver.getTitle();
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		WebElement findElement = driver.findElement(By.id("updateLeadForm_companyName"));
		findElement.clear();
		findElement.sendKeys("CTS");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.close();
		
	
}
}
