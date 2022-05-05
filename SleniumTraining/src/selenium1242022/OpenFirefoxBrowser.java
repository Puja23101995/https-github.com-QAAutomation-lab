package selenium1242022;

import org.openqa.selenium.firefox.FirefoxDriver;
public class OpenFirefoxBrowser {
	public static void main(String[] args) {	
		String driverPath1 ="F:\\JavaWorkspace\\SeleniumPractice\\executables\\geckodriver.exe";
		String driverPath2=".\\executables\\geckodriver.exe";
		String driverPath3=System.getProperty("user.dir")+"\\executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverPath3);
		FirefoxDriver cdriver=new FirefoxDriver();
		cdriver.close();
	}
}