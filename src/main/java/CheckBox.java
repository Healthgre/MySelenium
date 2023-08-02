import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";

        driver.get(url);

        WebElement checkBox = driver.findElement(By.xpath("//input[@class='form-check-input']"));

        Thread.sleep(500);
        checkBox.click();
        Thread.sleep(500);
        checkBox.click();

        driver.quit();
        System.out.println("\nTesting \"CheckBox\" was SUCCESS.");

    }
}
