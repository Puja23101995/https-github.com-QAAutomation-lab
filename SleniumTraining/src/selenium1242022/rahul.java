package selenium1242022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class  rahul {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",".\\executables\\chromedriver.exe" );
	WebDriver D1=new ChromeDriver();
	D1.get("https://www.google.com");
	String sourcecode= D1.getPageSource();
	System.out.println("Application Title:"+D1.getTitle());
    System.out.println("Application Tiltle Length"+D1.getTitle().length());
	
		
		
		

	}

}
