package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HomePageTest {

    private static WebDriver driver;
    @BeforeClass
    public void beforeMethod() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\shevchenko_b\\IdeaProjects\\qaauto-05.02.2019\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void testHomePage() {
        driver.get("https://rozetka.com.ua/ua/notebooks/c80004/filter/producer=asus/");
        ExpandableFilter filter = new ExpandableFilterImpl(driver, "Процесор");
        filter.expand();
        System.out.println("12321321");
    }

}