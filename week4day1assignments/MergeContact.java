package week4day1assignments;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class MergeContact {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000) );
	driver.findElement(By.id("username")).sendKeys("demoSalesManager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	Thread.sleep(1000);
	driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
	Thread.sleep(1000);
	Set<String> windowHandles = driver.getWindowHandles();
	List<String>window=new ArrayList<String>(windowHandles);
	driver.switchTo().window(window.get(1));
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]/a")).click();
	//driver.findElement(By.xpath("//table[@class='x-grid3-row-table']")).click();
	Thread.sleep(2000);
	driver.switchTo().window(window.get(0));	
	driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
	Thread.sleep(1000);
	Set<String> windowHandles2 = driver.getWindowHandles();
	List<String>window1=new ArrayList<String>(windowHandles2);
	driver.switchTo().window(window1.get(1));
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[2]/a")).click();
	Thread.sleep(1000);
	driver.switchTo().window(window.get(0));
	driver.findElement(By.xpath("//a[@class='buttonDangerous']")).click();
	driver.switchTo().alert().dismiss();
	System.out.println("Title of the page is:"+driver.getTitle());
	
	}
	

}
