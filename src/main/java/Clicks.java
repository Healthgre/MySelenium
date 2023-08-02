import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Clicks {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";
        driver.get(url);

        WebElement textarea = driver.findElement(By.xpath("//textarea[@class='form-control']"));
        Actions actions = new Actions(driver);
        actions.contextClick(textarea).perform();
        Thread.sleep(1000);

        driver.quit();
        System.out.println("\nTesting \"Clicks\" was SUCCESS.");
    }
}
