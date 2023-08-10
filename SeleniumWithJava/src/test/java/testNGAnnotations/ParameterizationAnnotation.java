package testNGAnnotations;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterizationAnnotation {

	@Parameters({"URL"})
	@Test(enabled=false)
	
	public void LaunchBrowser(String url) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
			driver.get(url);
		
	}
}

