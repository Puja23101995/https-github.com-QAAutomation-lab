package selenium22422DropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ASS01RedBus {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d3=new ChromeDriver();
		d3.get("https://www.redbus.in/");
		d3.manage().window().maximize();
		d3.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
	
		// from pune 
		d3.findElement(By.id("src")).sendKeys("Pune");
		d3.findElement(By.cssSelector(".autoFill>*:nth-child(3)")).click();
		// to Goa
		d3.findElement(By.id("dest")).sendKeys("Goa");
		d3.findElement(By.cssSelector(".homeSearch>*:nth-child(2)")).click();
		// date in future 
	d3.findElement(By.cssSelector("#onward_cal")).click();
	d3.findElement(By.cssSelector(".next")).click();
	d3.findElement(By.cssSelector("tbody>*:nth-child(5)>*:first-child")).click();
	d3.findElement(By.id("search_btn")).click();
	d3.findElement(By.cssSelector(".dept-time>*:nth-child(4) label")).click();
	d3.findElement(By.cssSelector("div[class='w-25 fr']")).click();
	d3.findElement(By.xpath("//label[@class='custom-checkbox']")).click();
	List<WebElement>buslist=d3.findElements(By.xpath("//div[@class='travels lh-24 f-bold d-color']"));
	List<WebElement>busprise=d3.findElements(By.xpath("//div[@class='fare d-block']/span']"));
	for(int i=0;i<buslist.size();i++) {
		System.out.println("buslist"+buslist.get(i).getText()+"busprise"+busprise.get(i).getText());
	}
		
	}
		
	}


	


