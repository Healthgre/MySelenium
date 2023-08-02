import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Screenshot {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        String url = "https://www.selenium.dev/selenium/web/web-form.html";

        driver.get(url);
        Thread.sleep(1000);

        SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy HH-mm-ss");
        Date date = new Date();
        String currentDate = formatter.format(date);

        File file = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\IntelliJ IDEA\\MySelenium\\src\\main\\screenshots\\"
                + currentDate + " screenshots.png"));

        driver.quit();
        System.out.println("\nTesting \"Screenshot\" was SUCCESS.");
    }
}
