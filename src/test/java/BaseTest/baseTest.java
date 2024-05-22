package BaseTest;

import com.microsoft.playwright.*;
import org.junit.*;

import java.awt.*;
import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class baseTest {
   protected static  Playwright playwright;
   protected static Browser browser;
   protected static Page page;

    @BeforeClass
    public static void setUp() {
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int width = (int) dimension.getWidth();
        int height = (int) dimension.getHeight();

        playwright = Playwright.create();
        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        page = browser.newPage();
        page.setViewportSize(width, height);

        page.navigate("https://automationexercise.com/");





    }


    @AfterClass
    public static void tearDown() {

        page.close();
        browser.close();
        playwright.close();

    }
}
