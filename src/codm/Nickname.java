//package codm;
//
////package com.coda.testcases.customCommerce;
////
////import com.coda.enums.Denomination;
////import com.coda.enums.PaymentChannel;
////import com.coda.enums.customCommerce.ProductDetails;
////import com.coda.object.GlobalVariables;
////import com.coda.object.customCommerce.CountryHomePage;
////import com.coda.object.pay.AirtimePage;
////import com.coda.object.pay.EPCSimulator;
////import com.coda.object.pay.PaypalObjects;
////import com.coda.object.shop.commonObjects.CommonObjects;
////import com.coda.object.shop.productPage.GameDetailsSection;
////import com.coda.object.shop.productPage.ProductPage;
////import com.coda.testcases.BaseSetup;
////import com.coda.utils.Log;
////import org.testng.annotations.BeforeMethod;
////import org.testng.annotations.Test;
////
////import static com.coda.object.GlobalVariables.*;
////import static org.testng.Assert.assertEquals;
////import static org.testng.Assert.assertTrue;
////
////public class ProductPageTest extends BaseSetup {
////    AirtimePage airtimePage;
////    CountryHomePage countryHomePage;
////    com.coda.object.customCommerce.ProductPage customCommerceProductPage;
////    EPCSimulator simulator;
////    PaypalObjects paypal;
////    com.coda.object.shop.productPage.ProductPage productPage;
////
////    @BeforeMethod
////    void beforeMethod() {
////        airtimePage = new AirtimePage(driver);
////        countryHomePage = new CountryHomePage(driver);
////        customCommerceProductPage = new com.coda.object.customCommerce.ProductPage(driver);
////        simulator = new EPCSimulator(driver);
////        paypal = new PaypalObjects(driver);
////        productPage = new ProductPage(driver);
////    }
////
////    @Test(description = "Verify geo popup when clicking 'Choose Another Region' CTA button")
////    void verifyGeoPopupChooseAnotherRegionButton() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_BR);
////        commonObjects.waitUntilVisible(CommonObjects.VISITING_COUNTRY_CHOOSE_ANOTHER_REGION_BUTTON);
////        commonObjects.clickChooseVisitAnotherRegionButton();
////        customCommerceProductPage.waitUntilUrlContains("international");
////    }
////
////    @Test(description = "Verify nickname search with valid user ID & complete transaction should success with payment channel backend flow")
////    void verifySearchValidNicknameAndCompleteTransaction() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_BR);
////        customCommerceProductPage.addExperimentCookie();
////        commonObjects.clickVisitingCountryButton();
////        customCommerceProductPage.searchNickname(ProductDetails.CODM_BR.getUserId());
////        report.success("Verify nickname search");
////
////        customCommerceProductPage.verifyNicknameValidationSuccess();
////        customCommerceProductPage.selectDenomination(Denomination.DENOMINATION_CODMSTORE_30_0);
////        productPage.selectPaymentChannel(PaymentChannel.BOLETO);
////        productPage.enterCPFDetail(boletoFirstName, boletoLastName, "1991-01-01", boletoCPFNumber);
////        productPage.enterPhoneNumber(GlobalVariables.boletoPhoneNumber);
////        productPage.enterEmail(GlobalVariables.email);
////        productPage.acceptEmailConsent();
////        customCommerceProductPage.acceptCustomCommerceEmailConsent();
////        customCommerceProductPage.acceptTermsAndConditions();
////        productPage.clickBuyNow();
////        try {
////            productPage.waitOrderSummaryPopup();
////            productPage.clickConfirmOrderSummaryButton();
////        } catch (Exception e) {
////            Log.info("Order Summary popup is not displayed");
////        }
////        String transactionId = airtimePage.getTransactionId();
////        report.verifyTrue(!transactionId.isEmpty(), "Verify initiate transaction with valid nickname");
////
////        airtimePage.switchToTab(0);
////        simulator.newSimulator(null, "300", newSimulatorEnv, null, boletoMnoId, null, null, boletoPaymentMode, paidStatus, transactionId);
////        assertTrue(airtimePage.verifyTransactionSuccess(), "Verify transaction success");
////    }
////
////    @Test(description = "Verify initiate and complete transaction")
////    void verifyCompleteTransaction() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        commonObjects.clickVisitingCountryButton();
////        customCommerceProductPage.selectDenomination(Denomination.DENOMINATION_CODMSTORE_30_0);
////        productPage.selectPaymentChannel(PaymentChannel.PAYPAL_UNITED_STATES);
////        productPage.enterZipCode(GlobalVariables.zipCodeUS);
////        productPage.enterEmail(GlobalVariables.email);
////        productPage.acceptEmailConsent();
////        customCommerceProductPage.acceptCustomCommerceEmailConsent();
////        customCommerceProductPage.acceptTermsAndConditions();
////        productPage.clickBuyNowAndConfirm();
////
////        airtimePage.getTransactionId();
////        paypal.clickPayWithPaypalButton();
////        paypal.switchToTab(1);
////        paypal.paypalLogin(GlobalVariables.paypalEmaiId, GlobalVariables.paypalPassword);
////        paypal.switchToTab(0);
////        boolean isTransactionSuccess = airtimePage.verifyTransactionSuccess();
////        assertTrue(isTransactionSuccess, "Transaction is successful");
////    }
////
////    @Test(description = "Verify marketing email consent are unchecked by default and should not be displayed in Product page once marketing consent is given")
////    void verifyMarketingEmailConsentShouldNotBeDisplayedInProductPageOnceMarketingConsentIsGiven() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        commonObjects.clickVisitingCountryButton();
////        boolean isEmailConsentChecked = customCommerceProductPage.isEmailConsentChecked();
////        boolean isCustomCommerceEmailConsentChecked = customCommerceProductPage.isCustomCommerceEmailConsentChecked();
////        report.verifyTrue( !isEmailConsentChecked & !isCustomCommerceEmailConsentChecked, "Verify marketing consent checkboxes are unchecked by default", sc.takeScreenshot());
////
////        productPage.enterUserId(ProductDetails.CODM_US.getUserId());
////        productPage.enterEmail(GlobalVariables.email);
////        productPage.sleepInSeconds(5);
////        productPage.switchToDefaultContent();
////        boolean isEmailConsentDisplayed = customCommerceProductPage.isElementPresent(productPage.MARKETING_CONSENT_CHECKBOX);
////        boolean isCustomCommerceEmailConsentDisplayed = customCommerceProductPage.isElementPresent(customCommerceProductPage.CUSTOM_COMMERCE_EMAIL_CONSENT_CHECKBOX);
////        assertTrue(!isEmailConsentDisplayed & !isCustomCommerceEmailConsentDisplayed, "Verify Marketing Email Consent checkboxes are displayed once consent given");
////    }
////
////    @Test(description = "Verify nickname is displayed below user id field when user revisit the page")
////    void verifyNicknameIsDisplayedBelowUserIdFieldWhenRevisit() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        customCommerceProductPage.addExperimentCookie();
////        commonObjects.clickVisitingCountryButton();
////        customCommerceProductPage.searchNickname(ProductDetails.CODM_US.getUserId());
////        customCommerceProductPage.verifyNicknameValidationSuccess();
////        countryHomePage.navigateToCountryHomePage(ProductDetails.CODM_BR.getCountryUrl());
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        customCommerceProductPage.verifyNicknameValidationSuccess();
////    }
////
////    @Test(description = "Verify user cannot enter special characters in search nickname field | , ' \" [ ]")
////    void verifyUserCannotEnterSpecialCharactersInSearchNicknameField() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        customCommerceProductPage.addExperimentCookie();
////        commonObjects.clickAcceptCookiesButton();
////        customCommerceProductPage.searchNickname("test| , ' \" [ ]");
////        String nicknameFieldValue = productPage.getAttribute(GameDetailsSection.USER_ID_INPUT, "value").trim();
////        assertEquals(nicknameFieldValue, "test", "Special characters are removed from nickname field");
////    }
////
////    @Test(description = "Verify nickname search & initiate transaction should fail when entering invalid user id")
////    void verifySearchInvalidNicknameAndInitiateTransaction() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        customCommerceProductPage.addExperimentCookie();
////        commonObjects.clickVisitingCountryButton();
////        customCommerceProductPage.searchNickname("G8ZV81");
////        String errorMessage = customCommerceProductPage.getNicknameValidationError();
////        report.verifyTrue(errorMessage.contains("We could not find User ID of : G8ZV81"), "Verify error message displayed when entering invalid nickname");
////
////        productPage.selectPaymentChannel(PaymentChannel.PAYPAL_UNITED_STATES);
////        productPage.enterZipCode(GlobalVariables.zipCodeUS);
////        productPage.enterEmail(GlobalVariables.email);
////        customCommerceProductPage.acceptTermsAndConditions();
////        productPage.clickBuyNow();
////
////        productPage.waitUntilPresent(CommonObjects.ERROR_MESSAGE);
////        errorMessage = productPage.getText(CommonObjects.ERROR_MESSAGE);
////        assertTrue(errorMessage.contains("We could not find User ID of : "), "Error message is displayed");
////    }
////
////    @Test(description = "Verify not able to initiate transaction without filling the details in user Details section when Payment Channel Boleto (Brazil)")
////    void verifyNotAbleToInitiateTransactionWithoutFillingDetailsInUserDetailsSection() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_BR);
////        commonObjects.clickVisitingCountryButton();
////        productPage.selectPaymentChannel(PaymentChannel.BOLETO);
////        productPage.enterUserId(ProductDetails.CODM_BR.getUserId());
////        customCommerceProductPage.acceptTermsAndConditions();
////        productPage.clickBuyNow();
////
////        productPage.switchToDefaultContent();
////        int displayedErrors = productPage.getUserDetailsInputFieldError().size();
////        assertEquals(displayedErrors, 6, "Error messages are displayed");
////    }
////
////    @Test(description = "Verify email is required to initiate transaction in EU region")
////    void verifyEmailIsRequiredToInitiateTransactionInEURegion() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_GB);
////        commonObjects.clickAcceptAgeRestrictionButton();
////        productPage.enterUserId(ProductDetails.CODM_GB.getUserId());
////        productPage.selectAnyActivePaymentChannel();
////        productPage.clickBuyNow();
////        assertTrue(productPage.isInputFieldErrorDisplayed(), "Email is required error message is displayed");
////    }
////
////    @Test(description = "Verify email is required to initiate transaction in US region")
////    void verifyEmailIsRequiredToInitiateTransactionInUSRegion() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        productPage.enterUserId(ProductDetails.CODM_US.getUserId());
////        productPage.selectAnyActivePaymentChannel();
////        productPage.clickBuyNow();
////        assertTrue(productPage.isInputFieldErrorDisplayed(), "Email is required error message is displayed");
////    }
////
////    @Test(description = "Verify should not allow to initiate transaction when Terms and condition & Privacy policy check box is unchecked")
////    void verifyShouldNotAllowToInitTxnWhenTermsAndConditionAndPrivacyPolicyPageCheckBoxIsUnchecked() {
////        customCommerceProductPage.navigateToProductPage(ProductDetails.CODM_US);
////        productPage.enterUserId(ProductDetails.CODM_US.getUserId());
////        productPage.selectAnyActivePaymentChannel();
////        productPage.enterZipCode(GlobalVariables.zipCodeUS);
////        productPage.enterEmail(GlobalVariables.email);
////        productPage.clickBuyNow();
////        softAssert.assertTrue(customCommerceProductPage.isTermsAndConditionsErrorDisplayed(), "Terms and Conditions error message is displayed");
////        softAssert.assertTrue(customCommerceProductPage.isPrivacyPolicyErrorDisplayed(), "Privacy Policy error message is displayed");
////        softAssert.assertAll();
////    }
//}