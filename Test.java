import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Test {
	public static void main(String args[]) throws InterruptedException {

        // Gecko Driver is the link between your tests in Selenium and the Firefox
        // browser.
		System.setProperty("webdriver.gecko.driver", "D:\\Gecko new\\geckodriver.exe");
		  

        WebDriver driver = new FirefoxDriver();

        driver.get("http://www.seleniummaster.com/seleniumformtest/registrationform.aspx");
        driver.findElement(By.id("firstNameTextBox")).clear();
        driver.findElement(By.id("firstNameTextBox")).sendKeys("abcd");
        driver.findElement(By.id("lastNameTextBox")).clear();
        driver.findElement(By.id("lastNameTextBox")).sendKeys("abcd");
        driver.findElement(By.id("emailTextBox")).clear();
        driver.findElement(By.id("emailTextBox")).sendKeys(" test@mail.com");
        driver.findElement(By.id("phoneTextBox")).clear();
        driver.findElement(By.id("phoneTextBox")).sendKeys("555-123-4567");
        new Select(driver.findElement(By.id("booksDropDownList"))).selectByVisibleText("Selenium RC");
        driver.findElement(By.id("osRadioButtonList_2")).click();
        driver.findElement(By.id("registerButton")).click();
     		
     }
     

}

