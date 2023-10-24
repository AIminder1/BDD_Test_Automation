package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    private WebDriver driver;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    @FindBy(xpath = "//button[text()='Add Money to Checking']")
    public WebElement addMoney;
    @FindBy(id = "logOut")
    public WebElement logOut;

    @FindBy (xpath = "//button[text()='Product']")
    public WebElement HoverOverProduct;

    @FindBy(xpath = "//a[text()='Auto']")
    public WebElement autoLink;



}
