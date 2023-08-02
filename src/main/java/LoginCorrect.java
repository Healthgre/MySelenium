import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginCorrect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.saucedemo.com";
        String userName = "standard_user";
        String password = "secret_sauce";

        driver.get(url);

        WebElement inputUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        inputUserName.sendKeys(userName);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys(password);

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        Thread.sleep(500);

        driver.quit();
        System.out.println("\nTesting \"LoginCorrect\" was SUCCESS.");

    }
}
