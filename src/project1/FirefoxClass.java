package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxClass {
    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //Maximize window
        driver.manage().window().maximize();
        //set time duration
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //Get resource of the page
        System.out.println(("Resource of the page " + driver.getPageSource()));
        //Get current url
        System.out.println("Current URL of the page " + driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Hardik");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("abc123");
    }
}
