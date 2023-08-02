import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/documentation/webdriver/actions_api/wheel/";

        driver.get(url);
        Thread.sleep(2000);

        Actions actions = new Actions(driver);
        actions.scrollByAmount(50, 50).perform();

        driver.quit();
        System.out.println("\nTesting \"Scrolling\" was SUCCESS.");

    }
}
