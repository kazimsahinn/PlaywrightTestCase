package tests;

import BaseTest.baseTest;
import com.microsoft.playwright.options.SelectOption;
import org.junit.jupiter.api.Test;
import com.microsoft.playwright.*;
import pages.cartPage;
import pages.homePage;
import pages.signupPage;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class testCase16 extends baseTest {

    @Test
    void testCase16(){

        baseTest.setUp();


        homePage homePage = new homePage(page);
        signupPage signUpPage = new signupPage(page);
        cartPage cartPage = new cartPage(page);


        assertThat(page).hasTitle("Automation Exercise");

        assertThat(homePage.logo()).isVisible();
        homePage.SignupLogin().click();
        signUpPage.name().fill("Kazım");
        signUpPage.email().fill("kazmshn@gmail.com");
        signUpPage.signupButton().click();
        signUpPage.selectGenderMale().click();
        signUpPage.password().fill("123456789");
        signUpPage.selectDay().selectOption("29");
        signUpPage.selectMonth().selectOption("July");
        signUpPage.selectYear().selectOption("1994");
        signUpPage.newsletter().click();
        signUpPage.firstName().fill("Kazım");
        signUpPage.lastName().fill("Şahin");
        signUpPage.address().fill("İstanbul");
        signUpPage.country().selectOption("United States");
        signUpPage.state().fill("Florida");
        signUpPage.city().fill("Miami");
        signUpPage.zipCode().fill("33101");
        signUpPage.phoneNumber().fill("+13216549832");
        signUpPage.createAccount().click();
        assertThat(signUpPage.accountCreatedText()).isVisible();
        signUpPage.continueButton().click();

        homePage.products().nth(1).hover();
        homePage.addProductsCard().nth(3).click();
        assertThat(homePage.continueShopping()).isVisible();
        homePage.continueShopping().click();
        homePage.cartPage().first().click();

        assertThat(cartPage.shoppingCartText()).isVisible();
        cartPage.proceedCheckout().click();
        assertThat(cartPage.addressDetails()).isVisible();
        cartPage.placeOrder().click();
        cartPage.nameOnCard().fill("Kazım Şahin");
        cartPage.cardNumber().fill("1165463216");
        cartPage.cvc().fill("321");
        cartPage.expirationMM().fill("05");
        cartPage.expirationYY().fill("2028");
        cartPage.PayandConfirmOrder().click();
        cartPage.continueButton().click();
        cartPage.deleteAccount().click();
        assertThat(cartPage.accountTeleted()).isVisible();



        baseTest.tearDown();


    }
}
