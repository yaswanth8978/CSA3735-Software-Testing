package blackbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class mozilla firefox
{
	public static void main(String[] args)
	{
		System.out.println("");
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\yashy\\\\OneDrive\\\\Desktop\\\\software_testing_lab\\\\Sellinium and junit\\\\selenium jar\\\\chromedriver_win32.zip\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mozilla.org/en-US/firefox/new/");
	}
}                                                                        
