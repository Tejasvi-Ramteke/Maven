package Maven_Classwork.MavenProject;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser_window {
	WebDriver d;
  @Test
  public void funtion1() throws Exception {
	  d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[2]")).click();
	  Thread.sleep(1000);
	  Set<String> winId=d.getWindowHandles();
	  	System.out.println(winId);
	  
	  Iterator<String> it= winId.iterator();
	  	String parent=it.next();
	  	String child=it.next();
	  		System.out.println("Parent window id="+parent+"Child window id="+child);
	  d.switchTo().window(child);
	  		System.out.println(d.findElement(By.xpath("/html/body/main/div/div/h1")).getText());
	  
	  System.out.println("funtion1 successful.Main Function");
	  d.switchTo().window(parent);
	  d.findElement(By.xpath("/html/body/main/div/div/div[2]/button[1]")).click();
	  
  }
  
  @BeforeMethod
	public void launch() {
		WebDriverManager.chromedriver().setup();
		d=new ChromeDriver();
		d.get("https://www.tutorialspoint.com/selenium/practice/browser-windows.php");
		System.out.println("Url launch success.Before Method");
	}
  
  @AfterMethod
  public void closeURL() {
	  System.out.println("URL closed success. After Method");
	  d.close();
  }
}
