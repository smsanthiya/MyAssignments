package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/radio.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//label[text()='Chrome']")).click();
		driver.findElement(By.xpath("//label[text()='Bengaluru']")).click();
	     //WebElement findElement = driver.findElement(By.xpath("(//label[text()='Safari'])[2]"));
		//findElement.isEnabled();
		WebElement findElement = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']"));
		findElement.isEnabled();
		System.out.println("the safari is enabled  "+findElement.isEnabled());
		WebElement findElement2 = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']"));
		findElement2.isEnabled();
		System.out.println("The age is selected:  "+findElement2.isEnabled());
	}
}
