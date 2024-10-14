package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import resources.DataDriven;

import java.io.IOException;
import java.time.Duration;

public class Auth {
    WebDriver driver;
    WebDriverWait wait;

    public Auth(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
    }

    @FindBy(id = "identifierId") WebElement emailInputBox;
    @FindBy(xpath = "//button[.//span[text()='Next']]") WebElement nextButton;
    @FindBy(name = "Passwd") WebElement passwordInputBox;
    @FindBy(id = "countryList")  WebElement phoneCountryDropdown;
//    @FindBy(xpath = "//div[@id='countryList'][.//span[@class='VfPpkd-t08AT-Bz112c']]")  WebElement countryCodeDropdown;
    @FindBy(css = "ul[aria-label='Select a country']") WebElement countryList;
    @FindBy(id = "phoneNumberId") WebElement phoneNumberInputBox;
    @FindBy(xpath = "//li[span[contains(text(), 'India (+91')]]") WebElement indiaCountryOption;
    @FindBy(xpath = "//span[text()='Send']") WebElement sendButton;
    @FindBy(id = "idvPin") WebElement codeInputBox;


    public void signIn(String credentialData) throws IOException, InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(emailInputBox));
        emailInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(1));

        nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(passwordInputBox));
        passwordInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(2));
        wait.until(ExpectedConditions.elementToBeClickable(nextButton));
        nextButton.click();

        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputBox));
        Thread.sleep(15000);
////      Wait for the country code dropdown to be visible and click it
//        wait.until(ExpectedConditions.elementToBeClickable(phoneCountryDropdown));
//        phoneCountryDropdown.click();
////        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", countryCodeDropdown);


////       Scroll to find and select the country "India"
//        wait.until(ExpectedConditions.visibilityOf(countryList));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", indiaCountryOption);
//        indiaCountryOption.click();

//       Enter the phone number
        wait.until(ExpectedConditions.visibilityOf(phoneNumberInputBox));
        phoneNumberInputBox.sendKeys(DataDriven.getTestData("Accounts", credentialData).get(3));


//      Click the Send button
        wait.until(ExpectedConditions.elementToBeClickable(sendButton));
        sendButton.click();
//
//        wait.until(ExpectedConditions.visibilityOf(codeInputBox));

//      Optional: Wait for the verification code to arrive (you can implement a polling mechanism if needed)
        Thread.sleep(100000);

//      Enter the verification code

//      Click the Next button to complete the login
//      nextButton.click();
    }





}
