package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;
    @FindBy(xpath = "//span[@class='menu-toggler__text']")
    private WebElement catalogue;
    @FindBy(xpath = "//a[@href='https://rozetka.com.ua/ua/notebooks/asus/c80004/v004/']")
    private WebElement asusFolder;
    @FindBy(xpath = "//a[href='https://rozetka.com.ua/ua/notebooks/dell/c80004/v007/']")
    private WebElement dellFolder;

    public WebElement getProducerFilter() {
        return producerFilter;
    }

    @FindBy(xpath = ".//div[@param='producer']")
    private WebElement producerFilter;

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
public void notebooks () {
    driver.get("https://rozetka.com.ua");
    catalogue.click();
    asusFolder.click();

}

}
