package project1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeClass {

    public static void main(String[] args) {
        String baseUrl = "https://opensource-demo.orangehrmlive.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);

        //Maximize window
        driver.manage().window().maximize();
        //Timeset for window
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //Resource of the page
        System.out.println("Resource of the page " + driver.getPageSource());
        //current url
        System.out.println("Current url of the page "+ driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("txtUsername"));
        userName.sendKeys("Hardik");
        WebElement password = driver.findElement(By.id("txtPassword"));
        password.sendKeys("abc123");
        driver.close();
    }
}
