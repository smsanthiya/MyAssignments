package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeafGround {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/input.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//input[contains(@placeholder,'Babu Manickam')]")).clear();
		driver.findElement(By.xpath("//input[contains(@placeholder,'Babu Manickam')]")).sendKeys("Nathiya");
		driver.findElement(By.xpath("//input[contains(@value,'Chennai')]")).sendKeys("Porur");
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='col-12'])[3]"));
		Thread.sleep(2000);
		findElement.isEnabled();
		System.out.println("the text box is enabled  "+findElement.isEnabled());
		WebElement element = driver.findElement(By.xpath("//input[contains(@value,'Can you clear me, please?')]"));
		element.clear();
		WebElement retrieve = driver.findElement(By.xpath("//input[@name='j_idt88:j_idt97']"));
		String text=retrieve.getText();
		System.out.println("The text is"+text);
		//System.out.println("The text is:"+retrieve.getText());
		driver.findElement(By.xpath("//input[@placeholder='Your email and tab']")).sendKeys("smsanthiya@gmail.com  ");
		driver.findElement(By.xpath("//textarea[@placeholder='About yourself']")).sendKeys("Hi all");
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Nathiya");
		driver.findElement(By.xpath("//li[@data-item-value='Nathiya3']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).click();
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).sendKeys("01/18/2023");
		driver.findElement(By.xpath("//input[@name='j_idt106:j_idt116_input']")).click();
		
		
}
}