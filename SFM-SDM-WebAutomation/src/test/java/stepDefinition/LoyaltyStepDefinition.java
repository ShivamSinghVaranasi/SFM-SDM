package stepDefinition;

import ddt_config.DataReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import util.Common;
import util.TestContextSetup;



public class LoyaltyStepDefinition {

    TestContextSetup tcs;

    public LoyaltyStepDefinition(TestContextSetup tcs) {
        this.tcs = tcs;
    }


    @Given("I am on the Promotions page and I click on Loyalty Offers")
    public void iAmOnThePromotionsPageAndIClickOnLoyaltyOffers() {
        tcs.pom.getLoyaltyOffersPage().clickPromotionsThenLoyaltyOffers();
    }

    @When("I select Shoppers Drug Mart as the store")
    public void iSelectShoppersDrugMartAsTheStore() {
        tcs.pom.getLoyaltyOffersPage().selectShoppersDrugMartAsStore();
    }

    @And("I create a loyalty offer with {string}")
    public void iCreateALoyaltyOfferWith(String offerType) {
        tcs.pom.getLoyaltyOffersPage().createLoyaltyOffer(offerType);
    }

    @And("I fill the loyalty offer input fields")
    public void iFillTheLoyaltyOfferInputFields() {
        tcs.pom.getLoyaltyOffersPage().fillLoyaltyOfferFields();
    }

    @And("I select the offer that applies at product level with no conditions")
    public void iSelectTheOfferThatAppliesAtProductLevelWithNoConditions() {
        tcs.pom.getLoyaltyOffersPage().selectProductOfferAndSetNoConditions();
    }

    @And("I select the offer that applies at product level with a minimum quantity required condition")
    public void iSelectTheOfferThatAppliesAtProductLevelWithAMinimumQuantityRequiredCondition() {
        tcs.pom.getLoyaltyOffersPage().selectProductOfferAndSetMinimumQuantityCondition();
    }

    @And("I select the offer that applies at product level with a minimum spend amount condition")
    public void iSelectTheOfferThatAppliesAtProductLevelWithAMinimumSpendAmountCondition() {
        tcs.pom.getLoyaltyOffersPage().selectProductOfferAndSetMinimumSpendCondition();
    }

    @And("I select the offer that applies as basket level and set Offer conditions")
    public void iSelectTheOfferThatAppliesAsBasketLevelAndSetOfferConditions() {
        tcs.pom.getLoyaltyOffersPage().selectBasketOfferAndSetValues();
    }


    @And("I add a product manually and include it in the offer")
    public void iAddAProductManuallyAndIncludeItInTheOffer() {
        tcs.pom.getLoyaltyOffersPage().addProductManuallyAndInclude();
    }

    @And("I import product inclusions from a CSV file")
    public void iImportProductInclusionsFromACSVFile() {
        tcs.pom.getLoyaltyOffersPage().importProductInclusionsFromCSV();
    }

    @And("I toggle the Always badge checkbox")
    public void iToggleTheAlwaysBadgeCheckbox() {
        tcs.pom.getLoyaltyOffersPage().toggleAlwaysBadgeCheckbox();
    }

    @And("I set the priority points for the offer")
    public void iSetThePriorityPointsForTheOffer() {
        tcs.pom.getLoyaltyOffersPage().setPriorityPoints();
    }

    @And("I select Customer eligibility as All Customers")
    public void iSelectCustomerEligibilityAsAllCustomers() {
        tcs.pom.getLoyaltyOffersPage().selectAllCustomers();
    }

    @And("I select Customer eligibility as Specific customer segments")
    public void iSelectCustomerEligibilityAsSpecificCustomerSegments() {
        tcs.pom.getLoyaltyOffersPage().selectSpecificCustomerSegmentsAndAtLeastOneCheckbox();
    }

    @And("I select Customer eligibility as Exclusions")
    public void iSelectCustomerEligibilityAsExclusions() {
        tcs.pom.getLoyaltyOffersPage().selectExclusionsAndAtLeastOneCheckbox();
    }

    @And("I select Store eligibility as All Stores")
    public void iSelectStoreEligibilityAsAllStores() {
        tcs.pom.getLoyaltyOffersPage().selectAllStoresOption();
    }

    @And("I select Store eligibility as Specific Store ID")
    public void iSelectStoreEligibilityAsSpecificStoreID() {
        tcs.pom.getLoyaltyOffersPage().selectSpecificStoreAndInclude();
    }


    @And("I select a random date and time for the offer")
    public void iSelectARandomDateAndTimeForTheOffer() {
        tcs.pom.getLoyaltyOffersPage().selectRandomDate();
        tcs.pom.getLoyaltyOffersPage().selectRandomTime();
    }

    @When("I click the Create button")
    public void iClickTheCreateButton() {
        tcs.pom.getLoyaltyOffersPage().clickCreateButton();
    }

    @Then("I should see the voucher successfully created")
    public void iShouldSeeTheVoucherSuccessfullyCreated() {
        Assert.assertTrue(tcs.pom.getLoyaltyOffersPage().isVoucherCreated());
    }



}
