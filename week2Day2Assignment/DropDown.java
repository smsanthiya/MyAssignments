package week2Day2Assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.leafground.com/select.xhtml");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	WebElement dropdown = driver.findElement(By.className("ui-selectonemenu"));
	Select dd=new Select(dropdown);
	List<WebElement> options = dd.getOptions();
	int size=options.size();
	System.out.println(size);
	for(int i=0;i<=size;i++)	{
		//options.get(i).click();
		if(i==1||i==2)
		{options.get(i).click();
	}
	}
	driver.findElement(By.xpath("//label[text()='Select Country']")).click();
	driver.findElement(By.xpath("//li[text()='India']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Select City']")).click();
	driver.findElement(By.xpath("//li[text()='Chennai']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@placeholder='Choose Course']")).click();
	//driver.findElement(By.xpath("//span[@class='ui-button-text']")).click();
	//Thread.sleep(2000);
	//driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();
	driver.findElement(By.xpath("//label[text()='Select Language']")).click();
	driver.findElement(By.xpath("//li[text()='English']")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//label[text()='Select Values']")).click();
	driver.findElement(By.xpath("//li[text()='Two']")).click();	
	
}
}



