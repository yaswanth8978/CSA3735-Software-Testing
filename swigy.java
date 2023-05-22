package blackbox;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testing.Assert;
//import org.testing.annotations.Test;
public class swigy{
	public static void main(String[] args) {
		
		System.out.println("Code check!");
		System.setProperty("webdriver.chrome.driver","C:\\\\Sellinium and junit\\\\selenium jar\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
						
		driver.get("https://www.swiggy.com/");
		
		WebElement x4bK8=driver.findElement(By.className("x4bK8"));
		System.out.println(x4bK8);
		x4bK8.click();
		
		WebElement mobile=driver.findElement(By.id("mobile"));		
		System.out.println(mobile);
		
		WebElement aayg=driver.findElement(By.className("a-ayg"));
		System.out.println(aayg);
		
		mobile.sendKeys("8978110769");
		aayg.click();
	}
}
