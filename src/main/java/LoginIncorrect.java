import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginIncorrect {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.saucedemo.com";
        String incorrectUserName = "standard_use";
        String incorrectPassword = "secret_sauc";
        String correctErrorMessage = "Epic sadface: Username and password do not match any user in this service";

        driver.get(url);

        WebElement inputUserName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
        inputUserName.sendKeys(incorrectUserName);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        inputPassword.sendKeys(incorrectPassword);

        WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
        loginButton.click();
        Thread.sleep(500);

        WebElement error = driver.findElement(By.xpath("//h3[@data-test='error']"));
        String errorText = error.getText();

        if (errorText.equals(correctErrorMessage)) {
            System.out.println("Error message correct!");
        } else {
            throw new AssertionError("Error message incorrect!");
        }

        driver.quit();
        System.out.println("\nTesting \"LoginIncorrect\" was SUCCESS.");
    }
}
