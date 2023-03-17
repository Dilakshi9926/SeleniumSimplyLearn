package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","E:\\QAE\\Selenium\\simpliLearnTest\\src\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
    }

    public void searchProduct(){
        driver.findElement(By.id("gh-ac")).sendKeys("JBL Speakers ");
        driver.findElement(By.id("gh-btn")).click();
        driver.findElement(By.linkText("Daily Deals")).click();
    }

    public void closeBrowser(){
        driver.close();
    }

    public  void navigate() throws InterruptedException {
        driver.navigate().to("https://www.simplilearn.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(2000);
        System.out.println("The title of the page is : "+driver.getTitle());
    }

    public static void main(String[] args) throws InterruptedException {
        Main obj = new Main();
        obj.launchBrowser();
        obj.searchProduct();
        obj.navigate();
        obj.closeBrowser();
    }
}