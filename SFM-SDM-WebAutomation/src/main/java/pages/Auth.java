package pages;

import org.jboss.aerogear.security.otp.Totp;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import resources.Base;
import resources.DataDriven;
import util.Common;
import util.Log;

import java.io.IOException;
import java.time.Duration;
import java.util.NoSuchElementException;

public class Auth {
    WebDriver driver;
    WebDriverWait wait;
    Base base;
    Common common;
    String twoFactorCode;


    public Auth(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(60));
        base = new Base();
        common = new Common(driver);
    }

    @FindBy(id = "identifierId") WebElement emailInputBox;
    @FindBy(xpath = "//button[.//span[text()='Next']]") WebElement nextButton;
    @FindBy(name = "Passwd") WebElement passwordInputBox;
    @FindBy(id = "countryList")  WebElement phoneCountryDropdown;
    @FindBy(css = "ul[aria-label='Select a country']") WebElement countryList;
    @FindBy(id = "phoneNumberId") WebElement phoneNumberInputBox;
    @FindBy(xpath = "//li[@role='option']//span[@jsname='K4r5Ff' and contains(text(), 'India (+91)')]") WebElement indiaCountryOption;
    @FindBy(xpath = "//span[text()='Send']") WebElement sendButton;
    @FindBy(id = "idvPin") WebElement codeInputBox;


    public void signIn(String credentialData) throws IOException, InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(emailInputBox));
        emailInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(1));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(2));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputBox));
        common.setImplicitWait(20);
        wait.until(ExpectedConditions.elementToBeClickable(phoneCountryDropdown));
        phoneCountryDropdown.click();

//       Scroll to find and select the country "India"
        wait.until(ExpectedConditions.visibilityOf(countryList));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", indiaCountryOption);

        common.setImplicitWait(20);
        wait.until(ExpectedConditions.elementToBeClickable(indiaCountryOption));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", indiaCountryOption);


        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputBox));
        phoneNumberInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(3));


        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        sendButton.click();

        common.setImplicitWait(30);
        wait.until(ExpectedConditions.visibilityOf(codeInputBox));

//      Optional: Wait for the verification code to arrive
//       common.setImplicitWait(120);

//      Fetch the 2FA code
        twoFactorCode = twoFAKey();
        codeInputBox.sendKeys(twoFactorCode);

        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();
        common.setImplicitWait(60);
    }

    public String twoFAKey() throws IOException {
        String otpKeyStr = base.loadProperties("2FA_Key");  // Load the 2FA secret key
        Totp totp = new Totp(otpKeyStr);
        String twoFactorCode = totp.now();
        Log.info("twoFactorCode : " + twoFactorCode);
        return twoFactorCode;
    }

}
