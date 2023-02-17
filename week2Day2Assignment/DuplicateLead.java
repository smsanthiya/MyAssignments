package week2Day2Assignment;

import java.time.Duration;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateLead {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.findElement(By.id("username")).sendKeys("demoSalesManager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.linkText("Email")).click();
		driver.findElement(By.name("emailAddress")).sendKeys("smsanthiya@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	    WebElement leadname = driver.findElement(By.xpath("//a[text()='Joshna']"));
	    String text = leadname.getText();
	    leadname.click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		WebElement title = driver.findElement(By.xpath("//div[text()='Duplicate Lead']"));
		String text1=driver.getTitle();
			if(driver.getTitle().contains("Duplicate Lead")) {
			System.out.println("The Title is Duplicate Lead");}
		else
			System.out.println("The Title doesnot have Duplicate Lead ");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		WebElement duplicatelead = driver.findElement(By.xpath("//span[text()='Joshna']"));
		String text2=duplicatelead.getText();
		if(text.equals(text2)) {
			System.out.println("The duplicated name is same");
		}
		else
			System.out.println("The duplicated name is not same");
		driver.close();
				}
			}


