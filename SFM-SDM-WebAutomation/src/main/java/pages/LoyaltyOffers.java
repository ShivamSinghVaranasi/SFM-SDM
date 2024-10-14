package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class LoyaltyOffers {

    WebDriver driver;
    Random random;
    WebDriverWait wait;
    String randomCode;
    String voucherTitle;
    int dollarSpendValue;
    int pointsOfferValue;
    int priorityPoints;
    String storeIdValue;

    public LoyaltyOffers(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        random = new Random();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    //Home Page
    @FindBy(xpath = "//li/a[text()='Promotions']")
    WebElement promotionsLink;
    @FindBy(xpath = "//li/a[text()='Loyalty Offers']")
    WebElement loyaltyOffersLink;

    //Home >> Promotions >> Loyalty offer
    @FindBy(css = "button.flex.items-center.align-middle.button-rounded")
    List<WebElement> storeChangeButtons;
    @FindBy(xpath = "//div/span[text()='Shoppers Drug Mart']")
    WebElement shoppersDrugMartButton;
    @FindBy(xpath = "//button[contains(@class, 'bg-black') and @type='button']")
    WebElement createLoyaltyOfferButton;

    // Offer types
    @FindBy(xpath = "//div[text()='Credit points']")
    WebElement creditPoints;
    @FindBy(xpath = "//div[text()='Points multiplier']")
    WebElement pointsMultiplier;
    @FindBy(xpath = "//div[text()='Redemption']")
    WebElement redemption;

    //Create loyalty offer
    //Credit points
    @FindBy(css = "input#loyalty_code")
    WebElement loyaltyCodeInput;
    @FindBy(css = "input#loyalty_title")
    WebElement loyaltyTitleInput;
    @FindBy(css = "textarea#loyalty_description")
    WebElement loyaltyDescriptionTextarea;

    //Offer applies
    @FindBy(css = "input#product-level-id[type='radio']")
    WebElement productOfferRadioButton;
    @FindBy(css = "input[type='radio'][value='NO_CONDITIONS']")
    WebElement noConditionRadioButton;
    @FindBy(css = "input[type='radio'][value='MINIMUM_QUANTITY_AMOUNT']")
    WebElement minimumQuantityAmountRadioButton;
    @FindBy(css = "input[type='radio'][value='MINIMUM_SPEND_AMOUNT']")
    WebElement minimumSpendAmountRadioButton;


    @FindBy(css = "input#basket-level-id[type='radio']")
    WebElement basketOfferRadioButton;
    @FindBy(css = "input[name='points_off']")
    WebElement pointsOfferInput;
    @FindBy(css = "input[name='dollar_spend']")
    WebElement dollarSpendInput;

    //Product inclusions
    @FindBy(xpath = "//button[text()='Add Manually']")
    WebElement addManuallyButton;
    @FindBy(css = "input#product_code")
    WebElement productCodeInput;
    @FindBy(xpath = "//button[text()='Include']")
    WebElement includeButton;

    @FindBy(xpath = "//button[contains(text(), 'Import by CSV')]")
    WebElement productInclusionsImportButton;
    @FindBy(xpath = "//button[contains(text(), 'Attach file')]")
    WebElement attachFileButton;
    @FindBy(css = "input[type='file']")
    WebElement fileInput;
    @FindBy(xpath = "//button[contains(text(), 'Upload')]")
    WebElement uploadButton;

    @FindBy(css = "input[name='always_badge'][type='checkbox']")
    WebElement alwaysBadgeCheckbox;

    //Priority points
    @FindBy(css = "input#priority_points")
    WebElement priorityPointsInput;

    //Customer eligibility
    @FindBy(css = "input#allCustomers[type='radio']")
    WebElement allCustomersRadioButton;
    @FindBy(css = "input#specificCustomerSegments[type='radio']")
    WebElement specificCustomerSegmentsRadioButton;
    @FindBy(css = "input#segment-1[type='checkbox']")
    WebElement employeeCheckbox;
    @FindBy(css = "input#segment-2[type='checkbox']")
    WebElement assistedCustomersCheckbox;
    @FindBy(css = "input#exclusions[type='radio']")
    WebElement exclusionsRadioButton;

   //Store eligibility
    @FindBy(css = "input[type='radio'][value='All stores']")
    WebElement allStoresRadioButton;
    @FindBy(css = "input[type='radio'][value='Specific stores ID(s)']")
    WebElement specificStoresRadioButton;
    @FindBy(css = "input[name='store_id']")
    WebElement storeIdInput;

    //Date In Effect
    @FindBy(css = "button[id=':ra:']")
    WebElement calendarButton;
    By dateButtonsLocator = By.cssSelector("button[name='day']");
    @FindBy(css = "select[id=':rc:']")
    WebElement timeBox;
    By timeOptionsLocator = By.cssSelector("select[id=':rc:'] option");

    @FindBy(xpath = "//button[text()='Create']")
    private WebElement createButton;

    @FindBy(xpath = "//button[text()='Save']")
    WebElement saveButton;



    // This method is to click on "Promotions" and then "Loyalty Offers"
    public void clickPromotionsThenLoyaltyOffers() {
        wait.until(ExpectedConditions.elementToBeClickable(promotionsLink));
        promotionsLink.click();

        wait.until(ExpectedConditions.elementToBeClickable(loyaltyOffersLink));
        loyaltyOffersLink.click();
    }

    public WebElement getFirstStoreChangeButton() {
        wait.until(ExpectedConditions.visibilityOfAllElements(storeChangeButtons));
        return storeChangeButtons.get(0);
    }
    public void selectShoppersDrugMartAsStore() {
        getFirstStoreChangeButton().click();
        wait.until(ExpectedConditions.elementToBeClickable(shoppersDrugMartButton));
        shoppersDrugMartButton.click();
    }

    /**This method is to create a loyalty offer and select a specific offer type
     * @param offerType The type of offer to select: "creditPoints" or "pointsMultiplier", or "redemption"
     */
    public void createLoyaltyOffer(String offerType) {
        wait.until(ExpectedConditions.elementToBeClickable(createLoyaltyOfferButton));
        createLoyaltyOfferButton.click();
        switch (offerType.toLowerCase()) {
            case "creditpoints":
                wait.until(ExpectedConditions.elementToBeClickable(creditPoints));
                creditPoints.click();
                break;
            case "pointsmultiplier":
                wait.until(ExpectedConditions.elementToBeClickable(pointsMultiplier));
                pointsMultiplier.click();
                break;
            case "redemption":
                wait.until(ExpectedConditions.elementToBeClickable(redemption));
                redemption.click();
                break;
            default:
                throw new IllegalArgumentException("Invalid offer type: " + offerType);
        }
    }

    /**
     * This method is to fill the input boxes for Credit Points, Points Multiplier, and Redemption
     * with a 4-digit alphanumeric random number.
     */
    public void fillLoyaltyOfferFields() {
        randomCode = generateRandomAlphanumeric(4);
        voucherTitle = generateRandomAlphanumeric(6);
        wait.until(ExpectedConditions.visibilityOf(loyaltyCodeInput));
        loyaltyCodeInput.sendKeys(randomCode);

        wait.until(ExpectedConditions.visibilityOf(loyaltyTitleInput));
        loyaltyTitleInput.sendKeys(voucherTitle);

        wait.until(ExpectedConditions.visibilityOf(loyaltyDescriptionTextarea));
        loyaltyDescriptionTextarea.sendKeys(String.format("Creating a voucher: %s, with code: %s", voucherTitle, randomCode));
    }

    /**This method generates a random alphanumeric string of specified length.
     * @param length Length of the desired random string.
     * @return A random alphanumeric string.
     */
    String generateRandomAlphanumeric(int length) {
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder randomStringBuilder = new StringBuilder(length);

        for (int index = 0; index < length; index++) {
            int charIndex = random.nextInt(characters.length());
            randomStringBuilder.append(characters.charAt(charIndex));
        }
        return randomStringBuilder.toString();
    }

    public void selectProductOfferAndSetNoConditions() {
        wait.until(ExpectedConditions.elementToBeClickable(productOfferRadioButton));
        if (!productOfferRadioButton.isSelected()) {
            productOfferRadioButton.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(noConditionRadioButton));
        if (!noConditionRadioButton.isSelected()) {
            noConditionRadioButton.click();
        }
        wait.until(ExpectedConditions.visibilityOf(pointsOfferInput));
        pointsOfferValue = random.nextInt(100) + 1;
        pointsOfferInput.sendKeys(String.valueOf(pointsOfferValue));
    }

    public void selectProductOfferAndSetMinimumQuantityCondition() {
        wait.until(ExpectedConditions.elementToBeClickable(productOfferRadioButton));
        if (!productOfferRadioButton.isSelected()) {
            productOfferRadioButton.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(minimumQuantityAmountRadioButton));
        if (!minimumQuantityAmountRadioButton.isSelected()) {
            minimumQuantityAmountRadioButton.click();
        }
        wait.until(ExpectedConditions.visibilityOf(pointsOfferInput));
        pointsOfferValue = random.nextInt(100) + 1;
        pointsOfferInput.sendKeys(String.valueOf(pointsOfferValue));
    }

    public void selectProductOfferAndSetMinimumSpendCondition() {
        wait.until(ExpectedConditions.elementToBeClickable(productOfferRadioButton));
        if (!productOfferRadioButton.isSelected()) {
            productOfferRadioButton.click();
        }
        wait.until(ExpectedConditions.elementToBeClickable(minimumSpendAmountRadioButton));
        if (!minimumSpendAmountRadioButton.isSelected()) {
            minimumSpendAmountRadioButton.click();
        }
        wait.until(ExpectedConditions.visibilityOf(dollarSpendInput));
        dollarSpendValue = random.nextInt(11) + 10;
        dollarSpendInput.sendKeys(String.valueOf(dollarSpendValue));
        wait.until(ExpectedConditions.visibilityOf(pointsOfferInput));
        pointsOfferValue = random.nextInt(100) + 1;
        pointsOfferInput.sendKeys(String.valueOf(pointsOfferValue));
    }


    public void selectBasketOfferAndSetValues() {
        wait.until(ExpectedConditions.elementToBeClickable(basketOfferRadioButton));
        if (!basketOfferRadioButton.isSelected()) {
            basketOfferRadioButton.click();
        }
        dollarSpendValue = random.nextInt(11) + 10;
        dollarSpendInput.sendKeys(String.valueOf(dollarSpendValue));
        pointsOfferValue = random.nextInt(100) + 1;
        pointsOfferInput.sendKeys(String.valueOf(pointsOfferValue));
    }

    public void importProductInclusionsFromCSV() {
        wait.until(ExpectedConditions.elementToBeClickable(productInclusionsImportButton));
        productInclusionsImportButton.click();

        wait.until(ExpectedConditions.elementToBeClickable(attachFileButton));
        attachFileButton.click();

        String filePath = System.getProperty("user.dir") + "/src/main/java/resources/externalData/exclusions.csv";

        wait.until(ExpectedConditions.visibilityOf(fileInput));
        fileInput.sendKeys(filePath);
        wait.until(ExpectedConditions.elementToBeClickable(uploadButton));
        uploadButton.click();
    }

    public void addProductManuallyAndInclude() {
        wait.until(ExpectedConditions.elementToBeClickable(addManuallyButton));
        addManuallyButton.click();
        wait.until(ExpectedConditions.visibilityOf(productCodeInput));
        productCodeInput.sendKeys("l1");
        wait.until(ExpectedConditions.elementToBeClickable(includeButton));
        includeButton.click();
    }


    public void toggleAlwaysBadgeCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(alwaysBadgeCheckbox));
        if (!alwaysBadgeCheckbox.isSelected()) {
            alwaysBadgeCheckbox.click();
        }
    }

    public void setPriorityPoints() {
        wait.until(ExpectedConditions.elementToBeClickable(priorityPointsInput));
        priorityPoints = random.nextInt(100) + 1;
        priorityPointsInput.sendKeys(String.valueOf(priorityPoints));
    }

    public void selectAllCustomers() {
        wait.until(ExpectedConditions.elementToBeClickable(allCustomersRadioButton));
        if (!allCustomersRadioButton.isSelected()) {
            allCustomersRadioButton.click();
        }
    }


    public void selectSpecificCustomerSegmentsAndAtLeastOneCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(specificCustomerSegmentsRadioButton));
        if (!specificCustomerSegmentsRadioButton.isSelected()) {
            specificCustomerSegmentsRadioButton.click();
        }
        selectRandomCustomerSegmentCheckbox();
    }

    public void selectExclusionsAndAtLeastOneCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(exclusionsRadioButton));
        if (!exclusionsRadioButton.isSelected()) {
            exclusionsRadioButton.click();
        }
        selectRandomCustomerSegmentCheckbox();
    }

    private void selectRandomCustomerSegmentCheckbox() {
        wait.until(ExpectedConditions.elementToBeClickable(employeeCheckbox));
        wait.until(ExpectedConditions.elementToBeClickable(assistedCustomersCheckbox));

        // Randomly decide to click each checkbox
        boolean selectEmployee = random.nextBoolean();
        boolean selectAssistedCustomers = random.nextBoolean();
        // Check at least one checkbox
        if (selectEmployee) {
            if (!employeeCheckbox.isSelected()) {
                employeeCheckbox.click();
            }
        }
        if (selectAssistedCustomers) {
            if (!assistedCustomersCheckbox.isSelected()) {
                assistedCustomersCheckbox.click();
            }
        }
        // If neither checkbox was selected, select the first one (Employees) by default
        if (!employeeCheckbox.isSelected() && !assistedCustomersCheckbox.isSelected()) {
            employeeCheckbox.click();
        }
    }

    public void selectAllStoresOption() {
        wait.until(ExpectedConditions.elementToBeClickable(allStoresRadioButton));
        if (!allStoresRadioButton.isSelected()) {
            allStoresRadioButton.click();
        }
    }
    public void selectSpecificStoreAndInclude() {
        storeIdValue = "4099s";
        wait.until(ExpectedConditions.elementToBeClickable(specificStoresRadioButton));
        if (!specificStoresRadioButton.isSelected()) {
            specificStoresRadioButton.click();
        }
        wait.until(ExpectedConditions.visibilityOf(storeIdInput));
        storeIdInput.sendKeys(storeIdValue);
        wait.until(ExpectedConditions.elementToBeClickable(includeButton));
        includeButton.click();
    }

    public void selectRandomDate() {
        wait.until(ExpectedConditions.elementToBeClickable(calendarButton));
        calendarButton.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(dateButtonsLocator));

        List<WebElement> dateButtons = driver.findElements(dateButtonsLocator);

        if (!dateButtons.isEmpty()) {
            dateButtons.get(random.nextInt(dateButtons.size())).click();
        } else {
            System.out.println("No date buttons available to select.");
        }
    }

    public void selectRandomTime() {
        wait.until(ExpectedConditions.elementToBeClickable(timeBox));
        timeBox.click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(timeOptionsLocator));

        List<WebElement> timeOptions = driver.findElements(timeOptionsLocator);

        if (timeOptions.size() > 1) {
            int randomIndex = random.nextInt(timeOptions.size() - 1) + 1; // +1 to skip placeholder
            timeOptions.get(randomIndex).click();
        } else {
            System.out.println("No available time options to select.");
        }
    }

    public void clickCreateButton() {
        wait.until(ExpectedConditions.elementToBeClickable(createButton));
        createButton.click();
    }

    public boolean isVoucherCreated() {
        wait.until(ExpectedConditions.visibilityOf(saveButton));
        return saveButton.isDisplayed();
    }

    public void clickSaveButton() {
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }


}
