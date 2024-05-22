package pages;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.AriaRole;

public class signupPage {


    private final Page page;


    public signupPage(Page page) {
        this.page = page;
    }

    public Locator name() {

        return page.getByPlaceholder("Name");

    }
    public Locator email() {

        return page.getByPlaceholder("Email Address").nth(1);

    }
    public Locator signupButton() {

        return page.locator("//*[@class='btn btn-default']").nth(1);

    }
    public Locator selectGenderMale() {

        return page.locator("//*[@id='id_gender1']");
    }

    public Locator password() {

        return page.locator("//*[@id='password']");
    }
    public Locator selectDay() {

        return page.locator("//*[@id='days']");
    }
    public Locator selectMonth() {

        return page.locator("//*[@id='months']");
    }

    public Locator selectYear() {

        return page.locator("//*[@id='years']");
    }
    public Locator newsletter() {

        return page.getByText("Sign up for our newsletter!");
    }

    public Locator firstName() {

        return page.locator("//*[@id='first_name']");
    }

    public Locator lastName() {

        return page.locator("//*[@id='last_name']");
    }

    public Locator address() {

        return page.locator("//*[@id='address1']");
    }

    public Locator country() {

        return page.locator("//*[@id='country']");
    }

    public Locator state() {

        return page.locator("//*[@id='state']");
    }

    public Locator city() {

        return page.locator("//*[@id='city']");
    }
    public Locator zipCode() {

        return page.locator("//*[@id='zipcode']");
    }

    public Locator phoneNumber() {

        return page.locator("//*[@id='mobile_number']");
    }

    public Locator createAccount() {

        return page.getByText("Create Account");
    }
    public Locator accountCreatedText() {

        return page.getByText("Account Created!");
    }
    public Locator continueButton() {

        return page.locator("//*[@class='btn btn-primary']");
    }



}
