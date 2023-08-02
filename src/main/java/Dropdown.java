import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";

        driver.get(url);

        WebElement dropdown1 = driver.findElement(By.xpath("//select[@class='form-select']"));
        Thread.sleep(1000);

        WebElement value1 = driver.findElement(By.xpath("//option[@value='1']"));
        value1.click();


        driver.quit();
        System.out.println("\nTesting \"Dropdown\" was SUCCESS.");
    }
}
