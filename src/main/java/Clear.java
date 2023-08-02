import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        String url = "https://www.selenium.dev/selenium/web/web-form.html";
        driver.get(url);

        WebElement inputLine = driver.findElement(By.xpath("//input[@type='text']"));
        inputLine.sendKeys("password");
        Thread.sleep(1000);
        inputLine.clear();
        inputLine.sendKeys("password");

        for (int i = "password2".length(); i !=0; i-- ){
            inputLine.sendKeys(Keys.BACK_SPACE);
            Thread.sleep(500);
        }

        driver.quit();
        System.out.println("\nTesting \"Clear\" was SUCCESS.");
    }
}
