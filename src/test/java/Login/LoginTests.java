package Login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginTests {

    private WebDriver driver;

    public void setUp() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        Thread.wait(5000);

        //1.maximize the window
        driver.manage().window().maximize();

        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.id("email")).sendKeys("princefamous01@yahoo.com");
        driver.findElement(By.id("pass")).sendKeys("Lord@0573");
        driver.findElement(by.id("loginbutton")).click();
    }
    public static void main(String args[]) throws InterruptedException {
        Logintests = new Logintests();
        test.setUp();

    }
}