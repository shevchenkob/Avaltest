package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;


public class HomePageTest {

    private static WebDriver driver;
    @BeforeClass
    public void setUp() throws Exception {
        DesiredCapabilities capability = DesiredCapabilities.chrome();
        driver = new RemoteWebDriver(new URL("http://192.168.56.1:4444/wd/hub"),
                capability);
        //baseUrl = "http://phy05:8080";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.get("https://rozetka.com.ua");
    }

//    public void beforeMethod() {
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shevchenko_b\\IdeaProjects\\qaauto-05.02.2019\\chromedriver.exe");
//        driver = new ChromeDriver();
//        driver.get("https://rozetka.com.ua");
//
//    }

    @Test
    public void testHomePage() throws InterruptedException {
        WebElement catalogue = driver.findElement(By.xpath("//span[@class='menu-toggler__text']"));
        catalogue.click();
        Thread.sleep(3000);
        WebElement asus = driver.findElement(By.xpath("//a[contains(text(),'Asus')]"));
        asus.click();
        WebElement moreProcessors = driver.findElement(By.xpath(".//div[contains(@param, 'processor')]//a[@name='show_more_parameters']"));
        moreProcessors.click();
        WebElement inteli7 = driver.findElement(By.xpath("//a[@name='processor_6268']"));
        inteli7.click();
        Thread.sleep(3000);
        WebElement diagonal = driver.findElement(By.xpath("//a[@name='20861_6308']"));
        diagonal.click();
        Thread.sleep(3000);
        WebElement ram = driver.findElement(By.xpath("//a[@name='20863_48089']"));
        ram.click();
        Thread.sleep(3000);
        WebElement minPrice = driver.findElement(By.xpath("//input[@id='price[min]']"));
        minPrice.sendKeys("25000");
        WebElement maxPrice = driver.findElement(By.xpath("//input[@id='price[max]']"));
        maxPrice.sendKeys("55000");
        WebElement submitPrice = driver.findElement(By.xpath("//button[@id='submitprice']"));
        submitPrice.click();
        Thread.sleep(3000);
        WebElement product = driver.findElement(By.xpath("//div[@class='g-i-tile-i-title clearfix']"));
        product.click();
        WebElement buyButton = driver.findElement(By.xpath("//div[@class='toOrder ng-star-inserted']"));
        buyButton.click();

        //ExpandableFilter filter = new ExpandableFilterImpl(driver, "Процессор");
        //filter.expand();


    }

}