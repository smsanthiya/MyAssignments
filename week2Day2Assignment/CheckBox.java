package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/checkbox.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//span[@class='ui-chkbox-label']")).click();
		driver.findElement(By.xpath("(//span[@class='ui-chkbox-label'])[2]")).click();
		driver.findElement(By.xpath("//label[text()='Java']")).click();
		driver.findElement(By.xpath("//div[@class='ui-toggleswitch-slider']")).click();
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='ui-selectbooleancheckbox ui-chkbox ui-widget'])[3]"));
		findElement.isEnabled();
		System.out.println("The text box is enabled  :"+findElement.isEnabled());
		driver.close();
			}

}
