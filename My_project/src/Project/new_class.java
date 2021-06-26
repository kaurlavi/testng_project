package Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class new_class {
	  @Test
	    public void testlogo() throws Exception{
	        System.setProperty("webdriver.chrome.driver", "C://Users//localadmin//Downloads//chromedriver_win32//chromedriver.exe");
	        ChromeDriver driver = new ChromeDriver();

	        driver.get("http://www.way2automation.com/demo.html");
	        // for the site
	        String actualTitle = "Welcome";
	        //title on the site
	        Assert.assertEquals(driver.getTitle(), actualTitle);
	        System.out.println("actual title is same as expexted title");
	        WebElement logo = driver.findElement(By.xpath("//*[@id=\"wrapper\"]/header/div/div[1]/div/a/img")  );
	        Assert.assertEquals(true, logo.isDisplayed());
	        //checking if the logo is displayed or not
	        System.out.println("logo is displayed");
	        //statement if it is correct


	        driver.close(); //to close the driver
	    }
}
