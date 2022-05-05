package selenium1242022;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Day1googleHomePage {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",".\\executables\\geckodriver.exe");
		FirefoxDriver d2=new FirefoxDriver();
		d2.get("https:www.Facebook.com");
		String sourcecode=d2.getPageSource();
		System.out.println("Application page Title"+d2.getTitle());
		System.out.println("Application page Title Length"+d2.getTitle().length());
		System.out.println("Application page URL"+d2.getCurrentUrl());
		

	}

}
