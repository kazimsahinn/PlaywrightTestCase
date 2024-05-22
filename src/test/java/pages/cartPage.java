package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class cartPage {
    private final Page page;


    public cartPage(Page page) {
        this.page = page;
    }

    public Locator shoppingCartText() {

        return page.getByText("Shopping Cart");

    }
    public Locator proceedCheckout() {

        return page.getByText("Proceed To Checkout");

    }
    public Locator addressDetails() {

        return page.getByText("Address Details");

    }
    public Locator placeOrder() {

        return page.getByText("Place Order");

    }
    public Locator nameOnCard() {

        return page.locator("//*[@class='form-control']");

    }
    public Locator cardNumber() {

        return page.locator("//*[@class='form-control card-number']");

    }

    public Locator cvc() {

        return page.locator("//*[@class='form-control card-cvc']");

    }

    public Locator expirationMM() {

        return page.locator("//*[@class='form-control card-expiry-month']");

    }

    public Locator expirationYY() {

        return page.locator("//*[@class='form-control card-expiry-year']");

    }
    public Locator PayandConfirmOrder() {

        return page.getByText("Pay and Confirm Order");

    }

    public Locator continueButton() {

        return page.locator("//*[@class='btn btn-primary']");

    }

    public Locator deleteAccount() {

        return page.getByText(" Delete Account");

    }
    public Locator accountTeleted() {

        return page.getByText("Account Deleted!");

    }

}
