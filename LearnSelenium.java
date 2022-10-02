package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnSelenium {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		WebDriverManager.edgedriver().setup();
		EdgeDriver driver1= new EdgeDriver();
		
		driver1.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();

	}

}