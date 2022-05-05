package AssignmentPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apr22CalenderActiTime {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d6 = new ChromeDriver();
		d6.get("https://online.actitime.com/qoner/login.do");
		d6.manage().window().maximize();
		d6.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d6.findElement(By.id("username")).sendKeys("puja1912022@gmail.com");
		d6.findElement(By.cssSelector("input[name='pwd']")).sendKeys("Puja@123");
		d6.findElement(By.cssSelector("#loginButton")).click();
		d6.findElement(By.cssSelector(".tasks")).click();
		d6.findElement(By.cssSelector("div[class='addNewButton']>*:nth-child(3)")).click();
		
		d6.findElement(By.cssSelector("div[class='title ellipsis']")).click();
		d6.findElement(By.cssSelector("div[class='item createNewTasks']")).click();
	//	d6.findElement(By.cssSelector("")).click();
		//d6.findElement(By.xpath("//input[@class='inputFieldWithPlaceholder']")).sendKeys("Testing");
		
		
		
		
	}}
