package StepDef;

import Locators.AutoLoanPage;
import Locators.HomePage;
import Locators.LoginPage;
import Locators.VehicleInformation;
import Utils.Config;
import Utils.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class StepDef {
    Driver driver = new Driver();
    LoginPage loginPage = new LoginPage(driver.getDriver());
    HomePage page = new HomePage(driver.getDriver());
    AutoLoanPage autoPage = new AutoLoanPage(driver.getDriver());
    VehicleInformation VPage = new VehicleInformation(driver.getDriver());
    Set<String> setWindows;
    List<String> listWindows;
    Actions action;
    Select select;
    @Given("I Navigate To Login Page")
    public void i_navigate_to_login_page() {
        driver.getDriver().get(Config.getProperty("url"));
    }
    @When("I Enter Username as {string}")
    public void i_enter_username_as(String username) {
        loginPage.username.sendKeys(Config.getProperty("username"));
    }
    @When("I Enter Password as {string}")
    public void i_enter_password_as(String password) {
        loginPage.password.sendKeys(Config.getProperty("password"));
    }
    @When("I Click Login Button")
    public void i_click_login_button() {
        loginPage.LoginButton.click();
    }
    @Then("I Should Login Successfully")
    public void i_should_login_successfully() {
        Assert.assertEquals(driver.getDriver().getTitle(),Config.getProperty("homePageTitle"));
        driver.closeDriver();
    }

    //HomeStepDef
    @Given("I Login Into The TNB")
    public void i_login_into_the_tnb() {
        driver.getDriver().get(Config.getProperty("url"));
        loginPage.login(Config.getProperty("username"),Config.getProperty("password"));
    }
    @When("I Am On The Home Page")
    public void i_am_on_the_home_page() {
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
    }

    //Auto Loan Test
    @And("I Hover Over Product Button")
    public void iHoverOverProductButton() {
        action = new Actions(driver.getDriver());
        action.moveToElement(page.HoverOverProduct).perform();
    }

    @And("I Should See Auto Link")
    public void iShouldSeeAutoLink() {
        Assert.assertTrue(page.autoLink.isDisplayed());
    }

    @And("I Click Auto Loan")
    public void iClickAutoLoan() {
        page.autoLink.click();
    }

    @Then("I Am On Auto Loan Page")
    public void iAmOnAutoLoanPage() throws InterruptedException {
        setWindows = driver.getDriver().getWindowHandles();
        listWindows = new ArrayList<String>(setWindows);

        driver.getDriver().switchTo().window(listWindows.get(1));

        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("AutoTitle"));
    }

    @When("I Enter First Name as {string}")
    public void iEnterFirstNameAs(String firstname) {
        autoPage.firstName.sendKeys(Config.getProperty("firstname"));
    }

    @And("I Enter Last Name as {string}")
    public void iEnterLastNameAs(String lastname) {
        autoPage.lastName.sendKeys(Config.getProperty("lastname"));
    }

    @And("I Enter Address as {string}")
    public void iEnterAddressAs(String address) {
        autoPage.address.sendKeys(Config.getProperty("address"));
    }

    @And("I Enter Email as {string}")
    public void iEnterEmailAs(String email) {
        autoPage.email.sendKeys(Config.getProperty("email"));
    }

    @And("I Enter Phone as {string}")
    public void iEnterPhoneAs(String phone) {
        autoPage.phone.sendKeys(Config.getProperty("phone"));
    }

    @And("I Enter Social Security as {string}")
    public void iEnterSocialSecurityAs(String ssn) {
        autoPage.ssn.sendKeys(Config.getProperty("ssn"));
    }

    @And("I Enter Income as {string}")
    public void iEnterIncomeAs(String income) {
        autoPage.income.sendKeys(Config.getProperty("income"));
    }

    @And("I Enter Job Title as {string}")
    public void iEnterJobTitleAs(String jobTitle) {
        autoPage.jobTitle.sendKeys(Config.getProperty("jobTitle"));
    }

    @And("I Click Continue Button")
    public void iClickContinueButton() {
        autoPage.continueButton.click();
    }

    @Then("I Should be Into Vehicle Information")
    public void iShouldBeIntoVehicleInformation() {
        Assert.assertEquals(autoPage.VehicleInformation.getText(), "Vehicle Information*");
    }

    //vehicleInformation
    @And("I Select Vehicle Type as {string}")
    public void iSelectVehicleTypeAs(String type) {
        select = new Select(VPage.selectType);
        select.selectByVisibleText(Config.getProperty("selectType"));
    }

    @And("I Select Year as {string}")
    public void iSelectYearAs(String year) {
        select = new Select(VPage.selectYear);
        select.selectByVisibleText(Config.getProperty("selectYear"));
    }

    @And("I Select Make as {string}")
    public void iSelectMakeAs(String make) {
        select = new Select(VPage.selectMake);
        select.selectByVisibleText(Config.getProperty("selectMake"));
    }

    @And("I Select Model as {string}")
    public void iSelectModelAs(String model) {
        select = new Select(VPage.selectModel);
        select.selectByVisibleText(Config.getProperty("selectModel"));

    }

    @And("I Select Color as {string}")
    public void iSelectColorAs(String color) {
        select = new Select(VPage.selectColor);
        select.selectByVisibleText(Config.getProperty("selectColor"));

    }

    @And("I Enter VIN as {string}")
    public void iEnterVINAs(String VIN) {
        VPage.VIN.sendKeys(Config.getProperty("VIN"));
    }

    @And("I Enter Mileage as {string}")
    public void iEnterMileageAs(String mileage) {
        VPage.mileage.sendKeys(Config.getProperty("mileage"));
    }

    @And("I Click Submit Application")
    public void iClickSubmitApplication() {
        VPage.submitApp.click();
    }

    @And("I Should Be See Submitted Successfully And Accept")
    public void iShouldBeSeeSubmittedSuccessfullyAndAccept() throws InterruptedException {
        Alert alert = driver.getDriver().switchTo().alert();
        System.out.println(alert.getText());
        Assert.assertEquals(alert.getText(),Config.getProperty("Alert"));
        Thread.sleep(5000);
        alert.accept();
    }

    @Then("I Should be in Home Page")
    public void iShouldBeInHomePage() throws InterruptedException {
        setWindows = driver.getDriver().getWindowHandles();
        listWindows = new ArrayList<String>(setWindows);
        driver.getDriver().switchTo().window(listWindows.get(0));
        Assert.assertEquals(driver.getDriver().getTitle(), Config.getProperty("homePageTitle"));
        driver.getDriver().quit();
    }
}
