package seleniumday2527Apr2022;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Apr22CalenderRedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d7 = new ChromeDriver();
		d7.get("https://www.redbus.in/");
		d7.manage().window().maximize();
	//	d7.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d7.findElement(By.cssSelector("#src")).sendKeys("pune");
		d7.findElement(By.cssSelector(".autoFill >*:nth-child(3)")).click();
		d7.findElement(By.cssSelector("#dest")).sendKeys("goa");
		d7.findElement(By.cssSelector(".autoFill>*:nth-child(3)")).click();
		d7.findElement(By.cssSelector(".next")).click();
		d7.findElement(By.cssSelector("tbody>*:nth-child(5)>*:first-child")).click();;
		d7.findElement(By.id("search_btn")).click();
		d7.findElement(By.cssSelector(".dept-time>*:nth-child(4) label")).click();
	    d7.findElement(By.cssSelector("ul[class='list-chkbox']>*:nth-child(3)>label")).click();
		//d7.findElement(By.cssSelector("div[class='w-25 fr']")).click();
		
		List<WebElement> allbuslist= d7.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
		List<WebElement> allbusprise=d7.findElements(By.xpath("//div[@class='fare d-block']/span"));
		for(int i=0; i<allbuslist.size();i++) {
			System.out.println("All BusesList "   +allbuslist.get(i).getText()    +  "allbusprise"   +allbusprise.get(i).getText());
		}
	}

}
