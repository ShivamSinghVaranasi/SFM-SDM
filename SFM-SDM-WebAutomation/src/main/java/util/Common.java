package util;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.PageObjectManager;
import resources.Base;
import ddt_config.DataReader;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;


public class Common extends Base{
    PageObjectManager pom;
    public WebDriver driver;
    public Properties properties;

    public Common(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        pom=new PageObjectManager(driver);
    }

    public void ExcelPageExtractor(DataReader dataReader, String pageName) {
        List<Map<String, String>> excelRows = dataReader.getAllRows();
        for (Map<String, String> excelRow : excelRows) {
            String productPage = excelRow.get(pageName);
            driver.get(driver.getCurrentUrl()+productPage);
        }
    }

    public static String dataExtractorFromSheet(DataReader dataReader, String ColumnName) {
        List<Map<String, String>> excelRows = dataReader.getAllRows();
        String brandName = null;
        for (Map<String, String> excelRow : excelRows) {
            brandName = excelRow.get(ColumnName);

        }
        return brandName;
    }




    public boolean clickOn(WebElement element) {

        WebDriverWait webWait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //webWait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
        return true;
    }



    public void elementCLick(String xpath){
        //System.out.println("driver="+driver);
        driver.findElement(By.xpath(xpath)).click();

    }
    public boolean addExplicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
        wait.until(ExpectedConditions.visibilityOf(element));
        return true;
    }
    public String isTextVisible(String xpath, String ExpectedText) {
        List<WebElement> l = driver.findElements(By.xpath(xpath));
        if (l.size() > 0) {
            Log.info("Text: " + ExpectedText + " is present. ");
        } else {
            Log.info("Text: " + ExpectedText + " is not present. ");
        }
        return ExpectedText;
    }
    public String getTitle() {
        String cd = driver.getTitle();
        return cd;
    }
    public void Back(){
        driver.navigate().back();
    }
    public void implicitlyWait(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));
    }
    public void enter(WebElement element){
        element.sendKeys(Keys.ENTER);
    }
    public boolean elementdisplayed(WebElement element){
        element.isDisplayed();
        return true;
    }
    public String getPrice(){
        List<WebElement> Productvalues = driver.findElements(By.cssSelector("div.ProductDetails_price__yHkc0"));

        for (WebElement productprice:Productvalues){
            String text = productprice.getText();
            System.out.println(text);
        } return getPrice();

    }
    public void addImplicitWait(){
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }

    public boolean isElementVisibleCss(String cssLocator){
        try {
            return driver.findElement(By.cssSelector(cssLocator)).isDisplayed();
        }catch (org.openqa.selenium.NoSuchElementException e){
            return false;
        }
    }
    public boolean isDisplayedAndIsVisible(WebElement element) {
        WebElement webelement = element;
        if (webelement.isDisplayed() && webelement.isEnabled()) {
            element.click();
        }return true;
    }
    public String getVisibleText() throws IOException {
        return driver.findElement(By.xpath(loadProperties("xpathToGetTextProduct1"))).getText();
    }


}
