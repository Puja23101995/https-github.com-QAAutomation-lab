package selenium1242022;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day1AssFacebook {

public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","executables\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://web.facebook.com");
String sourcecode=driver.getPageSource();
System.out.println("Application Source Coad"+sourcecode);
System.out.println("Application Source Coad Lenghth"+sourcecode.length());
System.out.println("Application URL"+driver.getCurrentUrl());
System.out.println("Application Home page Title"+driver.getTitle());
System.out.println("Application Home page Title length"+driver.getTitle().length());
driver.close();
if(driver.getTitle().equals("log in or sign up")) {
	System.out.println(" Facebook page opened successfully...");
}else {
	System.out.println("Facebook page not opened or its title got changed");
}

}
}
