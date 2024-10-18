Feature: Loyalty


  @LoyaltyOfferCreditPoints
  Scenario: Create a loyalty offer with Credit Points TC-1
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with no conditions
#    And I select the offer that applies at product level with a minimum quantity required condition
#    And I select the offer that applies at product level with a minimum spend amount condition
#    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
#    And I import product inclusions from a CSV file
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
#    And I select Customer eligibility as Specific customer segments
#    And I select Customer eligibility as Exclusions
    And I select Store eligibility as All Stores
#    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.0: Minimum Quantity Required, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer1.01
  Scenario: Create a loyalty offer with Credit Points TC-1.0
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.1: Minimum Spend Amount, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.1
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.2: Minimum Quantity Required, Import from CSV, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.2
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I import product inclusions from a CSV file
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.3: Minimum Quantity Required, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.3
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.4: Minimum Spend Amount, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.4
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.5: Minimum Quantity Required, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.5
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.6: Minimum Spend Amount, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.6
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.7: Minimum Quantity Required, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.7
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.8: Minimum Spend Amount, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.8
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.9: Basket Level Offer with Conditions, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.9
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

    # TC-1.10: Basket Level Offer with Conditions, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.10
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.11: Basket Level Offer with Conditions, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.11
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.12: Basket Level Offer with Conditions, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.12
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.13: Minimum Spend Amount, Add Product Manually, Customer eligibility as Exclusions, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.13
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Exclusions
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-1.14: Minimum Spend Amount, Add Product Manually, Customer eligibility as Exclusions, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-1.14
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "creditPoints"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Exclusions
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created














  @LoyaltyOfferPointsMultiplier
  Scenario: Create a loyalty offer with Points Multiplier TC-2.0
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with no conditions
#    And I select the offer that applies at product level with a minimum quantity required condition
#    And I select the offer that applies at product level with a minimum spend amount condition
#    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
#    And I import product inclusions from a CSV file
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
#    And I select Customer eligibility as Specific customer segments
#    And I select Customer eligibility as Exclusions
    And I select Store eligibility as All Stores
#    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.0: Minimum Quantity Required, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.0
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.1: Minimum Quantity Required, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.1
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.2: Minimum Quantity Required, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.2
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.3: Minimum Quantity Required, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.3
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum quantity required condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.4: Minimum Spend Amount, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.4
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.5: Minimum Spend Amount, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.5
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.6: Minimum Spend Amount, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.6
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.7: Minimum Spend Amount, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.7
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.8: Basket Level, Add Product Manually, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.8
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.9: Basket Level, Add Product Manually, All Customers, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.9
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.10: Basket Level, Add Product Manually, Specific Customer Segments, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.10
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.11: Basket Level, Add Product Manually, Specific Customer Segments, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.11
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Specific customer segments
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.12: Minimum Quantity Required, Importing Product from CSV, All Customers, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Points Multiplier TC-2.12
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And                                                                                                                                                                                                                                                                                                                                                               I select the offer that applies at product level with a minimum quantity required condition
    And I import product inclusions from a CSV file
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.13: Minimum Spend Amount, Add Product Manually, Customer eligibility as Exclusions, All Stores
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-2.13
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Exclusions
    And I select Store eligibility as All Stores
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created

# TC-2.14: Minimum Spend Amount, Add Product Manually, Customer eligibility as Exclusions, Specific Store ID
  @LoyaltyOffer
  Scenario: Create a loyalty offer with Credit Points TC-2.14
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "pointsMultiplier"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with a minimum spend amount condition
    And I add a product manually and include it in the offer
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as Exclusions
    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created










  @LoyaltyOfferRedemption
  Scenario: Create a loyalty offer with Redemption TC-3.0
    Given I am on the Promotions page and I click on Loyalty Offers
    When I select Shoppers Drug Mart as the store
    And I create a loyalty offer with "redemption"
    And I fill the loyalty offer input fields
    And I select the offer that applies at product level with no conditions
#    And I select the offer that applies at product level with a minimum quantity required condition
#    And I select the offer that applies at product level with a minimum spend amount condition
#    And I select the offer that applies as basket level and set Offer conditions
    And I add a product manually and include it in the offer
#    And I import product inclusions from a CSV file
    And I toggle the Always badge checkbox
    And I set the priority points for the offer
    And I select Customer eligibility as All Customers
#    And I select Customer eligibility as Specific customer segments
#    And I select Customer eligibility as Exclusions
    And I select Store eligibility as All Stores
#    And I select Store eligibility as Specific Store ID
    And I select a random date and time for the offer
    When I click the Create button
    Then I should see the voucher successfully created


