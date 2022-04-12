package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeClass {

    public static void main(String[] args) {
        String basicUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(basicUrl);
        //maximize window
        driver.manage().window().maximize();;
        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //Resource of the page
        System.out.println("Resource of the page " + driver.getPageSource());
        //Current url of the page
        System.out.println("Current url of the page " + driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Hardik");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("abc123");
        driver.close();


    }
}