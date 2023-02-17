package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonLeafground {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    WebElement clickbutton = driver.findElement(By.xpath("//span[text()='Click']"));
	    clickbutton.click();
	    driver.getTitle();
	    if(driver.getTitle().contains("leafground")) {
			System.out.println("The Title is Leafground");}
		 driver.get("http://www.leafground.com/button.xhtml");
	    WebElement enable = driver.findElement(By.xpath("//span[text()='Disabled']/parent::button"));
	    enable.isEnabled();
	    System.out.println("The element is"+enable.isEnabled());
	    WebElement position = driver.findElement(By.xpath("//span[text()='Submit']"));
	    position.getLocation();
	    System.out.println("the position is " +position.getLocation());
	    
	   
}
}
