package assignment;

import java.time.Duration;
import java.util.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		//enter url
		driver.get("https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/");
		driver.manage().window().maximize();
		//enter username
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("gravity13@gmail.com");
		//enter password
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("Sid12345#");
		driver.findElement(By.xpath("//fieldset[@class='fieldset login']//span[contains(text(),'Sign In')]")).click();
		System.out.println("login completed");
		Thread.sleep(2000);
		
		    
		//Search for product
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("watch");
		
		driver.findElement(By.xpath("//button[@title='Search']")).click();
		//Select the product
		driver.findElement(By.xpath("//img[@alt='Didi Sport Watch']")).click();
		System.out.println("product selected");
		
	    //logout
	    driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
	    driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='Sign Out']")).click();
	    System.out.println("logout completed");
	    Thread.sleep(2000);
	 
    
        
        driver.quit(); 
        System.out.println("Browser closed.");
    }
	   
		

	}


