import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class New {

	public static void main(String[] args) {
		WebDriver driver;
		ChromeOptions option = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://www.ryanscomputers.com");
	//	driver.get("https://www.amamzon.com");
				
			WebElement searchBox = driver.findElement(By.xpath("//input[@id='search']"));
				searchBox.sendKeys("lenovo laptop"+Keys.ENTER);
				List<WebElement> pens=driver.findElements(By.xpath("//div[@id='hits']/div/div"));
				System.out.println(pens.size());
//				for(WebElement pen:pens) {
//					String penName=pen.findElement(By.xpath(".//div[@class='product-content-info']/a")).getText();
//					System.out.println(penName);
//				}
//				
//				List<WebElement> items = driver.findElements(By.xpath("//div[@class='product-content-info']"));
//				System.out.println(items.size());
////				
//				for (WebElement  item : items) {
//					String itemName = item.findElement(By.xpath(".//div[@class='product-content-info']/a")).getText();
//					System.out.println(itemName);
//				}
////div[@class='ais-hits--item']/div/div[2]/div/a

	}

}
