package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoLoanPage {
    private WebDriver driver;

    public AutoLoanPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }


    @FindBy(xpath = "//input[@id='first-name']")
    public WebElement firstName;

    @FindBy(xpath = "//input[@id='last-name']")
    public WebElement lastName;

    @FindBy(xpath = "//input[@id='address']")
    public WebElement address;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement email;

    @FindBy(xpath = "//input[@id='phone']")
    public WebElement phone;

    @FindBy(xpath = "//input[@id='social-security']")
    public WebElement ssn;

    @FindBy(xpath = "//input[@id='income']")
    public WebElement income;

    @FindBy(xpath = "//input[@id='job-title']")
    public WebElement jobTitle;

    @FindBy(xpath = "//button[text()='Continue']")
    public WebElement continueButton;

    @FindBy(tagName = "h2")
    public WebElement VehicleInformation;



}
