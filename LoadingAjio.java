package OOPSAssignment4;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoadingAjio {
	
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();//label[contains(text(),'Men')] 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Search AJIO']")).sendKeys("bags",Keys.ENTER);
		driver.findElement(By.xpath("//label[contains(text(),'Men')] ")).click();
		List<WebElement> allbrandname = driver.findElements(By.xpath("//div[@class='brand']"));
		for(WebElement each:allbrandname) {
			String text = each.getText();
			System.out.println(text);
			
		}
		
		
		 
	}

}
