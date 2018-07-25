import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice {

	public static void main(String[] args) {
		//System.setProperty("webdriver.gecko.driver", "D:\\New folder\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https//wherehab.com");
		WebElement wb = driver.findElement(By.xpath("//select[@name='distance']"));
		Select sl = new Select(wb);
		sl.selectByVisibleText("100 Miles");

	}

}
