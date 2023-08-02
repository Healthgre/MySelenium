import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";
        driver.get(url);

        WebElement slider = driver.findElement(By.xpath("//input[@name='my-range']"));

        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        actions.dragAndDropBy(slider, 100, 0).perform();

        driver.quit();
        System.out.println("\nTesting \"Slider\" was SUCCESS.");


    }
}
