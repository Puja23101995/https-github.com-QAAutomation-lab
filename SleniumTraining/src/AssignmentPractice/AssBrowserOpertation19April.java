package AssignmentPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssBrowserOpertation19April {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d2=new ChromeDriver();
		d2.get("https://www.amazon.in/");
		d2.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		d2.manage().window().maximize();
	    System.out.println("Page Title:"+d2.getTitle());
	   d2.findElement(By.linkText("Best Sellers")).click();;
       d2.navigate().back();
       System.out.println("PageHome Return Title:"+d2.getTitle());
       if(d2.getTitle().equals(d2.getTitle())) {
    	   System.out.println("page sucessfully open");
    	   }
       else {
    	   System.out.println("page not sucessfully open");
    	   
    	   
    	   
       }

}
}

