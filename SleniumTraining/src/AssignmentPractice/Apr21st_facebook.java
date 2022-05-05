package AssignmentPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

class Apr21st_facebook {



	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d6=new ChromeDriver();
		d6.get("https://www.facebook.com/");
		d6.manage().window().maximize();
		d6.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//WebDriverWait wait=new WebDriverWait(d6,20);
		d6.findElement(By.cssSelector("a[class='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']")).click();
		d6.findElement(By.cssSelector("#fullname_field>div>div>div>input")).sendKeys("pooja");
		d6.findElement(By.name("lastname")).sendKeys("Salgar");
	d6.findElement(By.name("reg_email__")).sendKeys("poojasalgar231107@gmail.com");
	d6.findElement(By.name("reg_email_confirmation__")).sendKeys("poojasalgar231107@gmail.com");
	d6.findElement(By.name("reg_passwd__")).sendKeys("Pooja@123");
	WebElement Element=d6.findElement(By.cssSelector("#day"));
	Select date1=new Select(Element);
	date1.selectByValue("23");
	//month
	WebElement month= d6.findElement(By.name("birthday_month"));
	Select month1= new Select(Element);
	month1.selectByValue("Oct");;
	//year
	WebElement year=d6.findElement(By.name("birthday_year"));
	Select year1=new Select(Element);
	year1.selectByValue("1995");
	//female
	d6.findElement(By.name("sex")).click();
	//sign up
	d6.findElement(By.name("websubmit")).click();
	
	}}
	
	
