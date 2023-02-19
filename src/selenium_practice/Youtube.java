package selenium_practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class Youtube {

    public static void main(String[] args) throws InterruptedException {

        String projectPath = System.getProperty("user.dir");
        String chromeDriverPath = projectPath + File.separator + "drivers" + File.separator + "chromedriver.exe";

        System.setProperty("webdriver.chrome.driver", chromeDriverPath);

        ChromeDriver driver = new ChromeDriver();

        String url = "https://www.youtube.com/watch?v=dQw4w9WgXcQ";

        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();


        WebElement playButton = driver.findElement(By.xpath("//button[@class='ytp-play-button ytp-button']"));
        playButton.click();

        Thread.sleep(10000);
        driver.close();
        driver.quit();

    }

}
