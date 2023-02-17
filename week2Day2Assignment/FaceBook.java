package week2Day2Assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.linkText("Create new account")).click();
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Yathis");
		driver.findElement(By.name("lastname")).sendKeys("Aadhitya");
		driver.findElement(By.name("reg_email__")).sendKeys("8012380335");
		driver.findElement(By.id("password_step_input")).sendKeys("Joshna@123");
		WebElement dropdown=driver.findElement(By.id("day"));
		Select op=new Select(dropdown);
		op.selectByIndex(7);
		WebElement month=driver.findElement(By.xpath("//select[@name='birthday_month']"));
		Select op1=new Select(month);
		op1.selectByValue("11");
		WebElement year=driver.findElement(By.id("year"));
		Select op2=new Select(year);
		op2.selectByVisibleText("2010");
		driver.findElement(By.className("_58mt")).click();
		driver.close();
		
		
	}

}
