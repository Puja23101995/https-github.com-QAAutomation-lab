package AssignmentPractice;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;



public class flipkart20april {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d5 =new ChromeDriver();
		d5.get("https://www.flipkart.com/");
		d5.manage().window().maximize();
		d5.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS );
		d5.findElement(By.cssSelector("._2doB4z")).click();
		d5.getTitle();
		WebElement valid =d5.findElement(By.cssSelector("._37M3Pb>*"));
		System.out.println("validation"+valid.isDisplayed());
		System.out.println("validation"+valid.isSelected());
		System.out.println("validation"+valid.isEnabled());
		List<WebElement> alloptions=d5.findElements(By.cssSelector("._37M3Pb>*"));
      System.out.println("Elements Count:- "+alloptions.size());
		for(int i=0;i<alloptions.size();i++) {

		System.out.println("Alloptions "+alloptions.get(i).getText());
		
		
		
	}

}
}