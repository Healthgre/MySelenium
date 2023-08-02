import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";

        driver.get(url);

        WebElement radioButton1 = driver.findElement(By.xpath("//input[@id='my-radio-1']"));
        WebElement radioButton2 = driver.findElement(By.xpath("//input[@id='my-radio-2']"));
        Thread.sleep(1000);
        radioButton2.click();
        Thread.sleep(1000);
        radioButton1.click();
        Thread.sleep(1000);

        driver.quit();
        System.out.println("\nTesting \"RadioButton\" was SUCCESS.");
    }
}
