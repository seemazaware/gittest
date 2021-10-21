package Selenium;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert {

	public static void main(String[] args) throws InterruptedException, IOException {
	
		System.setProperty("webdriver.chrome.driver","/home/seema/selenium setup/chromedriver");
		WebDriver driver =new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);

        driver.get("https://www.demoqa.com/alerts");
 	    driver.manage().window().maximize();
        Thread.sleep(2000);
        
       driver.findElement(By.cssSelector("#promtButton")).click();
       System.out.println("click on Prompt");
       Thread.sleep(2000);

       driver.switchTo().alert().sendKeys("Selenium");
       Thread.sleep(2000);
      
       
       driver.switchTo().alert().accept();
       
       
       
       TakesScreenshot ts= (TakesScreenshot)driver;
	     File source =ts.getScreenshotAs(OutputType.FILE);
	     FileUtils.copyFile(source, new File("/home/seema/Documents/Eclipse workspace new/Selenium Practice/src/Selenium/SS File/Imageforalert2.png"));
	     System.out.println("Screen shot taken");
	
              
       Thread.sleep(2000);
       driver.findElement(By.cssSelector("#promtButton")).click();
       System.out.println("click on Prompt");
       Thread.sleep(2000);

       driver.switchTo().alert().accept(); 
       
       
       
      // driver.quit();
       

	}

}
