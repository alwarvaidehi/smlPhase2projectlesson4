package phase2lesson4Facebook;



import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import phase2lesson4Facebook.MyOwnAnnotation.MyTest;



public class Facebooklogin {
	@TestInstance(TestInstance.Lifecycle.PER_CLASS)
	public class FaceBook_Junit {
		WebDriver driver;
		
	    @BeforeAll
		public void OpenBrowser()
		{
			 driver = new ChromeDriver();
				
				driver.manage().window().maximize();
				
				driver.get("https://www.facebook.com/");
		}
	    @DisplayName("Junit test in facebook")
        @MyTest
		public void login() throws InterruptedException
		{
			  driver.findElement(By.cssSelector("input#email")).sendKeys("Vaidehi@gmail.com");
				
				driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("Harrystyles.01");
				driver.findElement(By.xpath("//button[@id='u_0_5_+8']")).click();
				Thread.sleep(1500);
		}
	    @MyTest
	    public void navigate() throws InterruptedException
	    {
	    	driver.navigate().to("https://en.wikipedia.org/w/index.php?title=Special:CreateAccount&returnto=Wikipedia%3ASign+up");
	         Thread.sleep(1500);
	         
	         driver.findElement(By.linkText("Log in")).click();
	         
	         
	    }
		@AfterAll
		public void closeBrowser()
		{
			driver.close();
		}
		
	}



}
