package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class homePage {

    private final Page page;

    public homePage(Page page) {
        this.page = page;
    }

    public Locator logo() {

        return page.locator("//*[@class='logo pull-left']");

    }

    public Locator  SignupLogin() {

        return page.getByText(" Signup / Login");

    }


    public Locator  products() {

        return page.locator("//*[@class='productinfo text-center']");
    }
    public Locator  addProductsCard() {

        return page.locator("//*[@class='btn btn-default add-to-cart']");
    }
    public Locator  continueShopping() {

        return page.getByText("Continue Shopping");
    }
    public Locator  cartPage() {

        return page.locator("//*[@class='fa fa-shopping-cart']");
    }

}
