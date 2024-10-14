package pages;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    WebDriver driver;
    LoyaltyOffers loyaltyOffersPage;
    Auth auth;

    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public Auth getAuth(){
        auth=new Auth(driver);
        return auth;
    }
    public LoyaltyOffers getLoyaltyOffersPage() {
        loyaltyOffersPage = new LoyaltyOffers(driver);
        return loyaltyOffersPage;
    }

}

