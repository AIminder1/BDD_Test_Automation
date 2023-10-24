package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleInformation {
    private WebDriver driver;

    public VehicleInformation(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }


    @FindBy(xpath = "//select[@id='vehicle-type']")
    public WebElement selectType;

    @FindBy(xpath = "//select[@id='vehicle-year']")
    public WebElement selectYear;

    @FindBy(xpath = "//select[@id='make']")
    public WebElement selectMake;

    @FindBy(xpath = "//select[@id='model']")
    public WebElement selectModel;

    @FindBy(xpath = "//select[@id='color']")
    public WebElement selectColor;

    @FindBy(xpath = "//input[@id='vin-number']")
    public WebElement VIN;

    @FindBy(xpath = "//input[@id='mileage']")
    public WebElement mileage;

    @FindBy(id = "submit-btn")
    public WebElement submitApp;



}
