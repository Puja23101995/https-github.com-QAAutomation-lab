package selenium20422CSSelector;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConceptCssSelector {

	public static void main(String[] args) {
 System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
 WebDriver p1=new ChromeDriver();
 p1.get("https://www.amazon.in/");
 //<input type="text" id="twotabsearchtextbox" value="" name="field-keywords" autocomplete="off" placeholder="" class="nav-input nav-progressive-attribute" dir="auto" tabindex="0" aria-label="Search">
 //<input type="text" name="username" value="" id="username" class="textField" placeholder="Username">
//WebElement element=driver.findElement(By.cssSelector("#username"));  //or
 //WebElement element=driver.findElement(By.cssSelector("input#username")
 WebElement element =p1.findElement(By.cssSelector("#username"));
 //or
 WebElement elemet =p1.findElement(By.cssSelector("input#username"));
 
 
		 
	}

}
