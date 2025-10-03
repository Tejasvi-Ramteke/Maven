package Maven_Classwork.MavenProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Widgets_Accordian {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		////copied and pasted dependency in pom file from https://bonigarcia.dev/webdrivermanager/
		WebDriverManager.chromedriver().setup();

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		
		d.get("https://www.tutorialspoint.com/selenium/practice/accordion.php");
		d.findElement(By.xpath("//*[@id=\"headingTwentyOne\"]/button")).click();//open
		
		d.findElement(By.xpath("//*[@id=\"headingTwentyTwo\"]/button")).click();//open
		
		
		Thread.sleep(2000);
		d.close();

	}

}
