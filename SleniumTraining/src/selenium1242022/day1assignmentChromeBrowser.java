package selenium1242022;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class day1assignmentChromeBrowser {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","executables\\chromedriver.exe");
	ChromeDriver driver= new ChromeDriver();
	driver.get("https:demo.actitime.com");
	String sourceCode=driver.getPageSource();
	System.out.println("Application source code: "+sourceCode);
	System.out.println("Application source code: "+sourceCode.length());
	System.out.println("get title" +driver.getTitle());
	System.out.println("get title" +driver.getTitle().length());
	System.out.println("URl"+driver.getCurrentUrl());
	if(driver.getTitle().equals("actiTIME - Login")) {
		System.out.println(" actiTIME search page opened successfully...");
	}else {
		System.out.println("Eithe actiTIME search page not opened or its title got changed");
	}

}
}

	
	/*	Scenario to Automate:
		Launch a new Chrome browser.
		Open https://demo.actitime.com/
		Get Page Title name and Title length
		Print Page Title and Title length on the Eclipse Console.
		Get Page URL and verify if it is a correct page opened
		Get Page Source (HTML Source code) and Page Source length
		Close the Browser.
		Scenario to Automate:
		1. Launch the web browser.2. Open the URL https://www.facebook.com in the current browser.3. Fetching home page title.4. Verify actual tile of the home page with the
		5. Print home page title on the console.6. Close the browser */