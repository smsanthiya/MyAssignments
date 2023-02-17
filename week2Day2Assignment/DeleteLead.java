package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeleteLead {
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
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.linkText("Phone")).click();
	driver.findElement(By.name("phoneCountryCode")).sendKeys("0");
	driver.findElement(By.name("phoneAreaCode")).sendKeys("11");
	driver.findElement(By.name("phoneNumber")).sendKeys("33373902");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	WebElement leadid = driver.findElement(By.xpath("//a[text()='12145']"));
	String text=leadid.getText();
	leadid.click();
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.linkText("Name and ID")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys("12129");
	driver.close();	
	}

}
