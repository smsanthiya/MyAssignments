package week4day1assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Amazon {
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 pro");
		System.out.println("Oneplus 9 Pro");
		driver.findElement(By.xpath("//div[text()='oneplus 9 pro']")).click();
		String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("The Price of first Product is:"+text);
		String text2 = driver.findElement(By.xpath("//span[@class='a-size-base']")).getText();
		System.out.println("The customer rating is :"+text2);
		Thread.sleep(1000);
	 driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
	 
	  Set<String> windowHandles = driver.getWindowHandles();
	  List<String> windowHandle=new ArrayList<String>(windowHandles);
	  driver.switchTo().window(windowHandle.get(1));
	// System.out.println(windowHandles);
	 Thread.sleep(1000);
	 File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
	File dest=new File("snap/shot.png");
	 FileUtils.copyFile(screenshotAs, dest);
	 driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
	// driver.findElement(By.xpath("//span[@id='nav-cart-count']")).click();
	 driver.findElement(By.xpath("//span[@id='attach-sidesheet-view-cart-button']")).click();
	  String total=driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base sc-price sc-white-space-nowrap'])[2]")).getText();
		System.out.println("The total amount in cart is:"+total);
		if(text.equals(total))
		{
			System.out.println("The price is same");
		}
		driver.close();
		driver.switchTo().window(windowHandle.get(0));
		

}}
