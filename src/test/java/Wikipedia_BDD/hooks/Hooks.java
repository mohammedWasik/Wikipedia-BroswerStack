package Wikipedia_BDD.hooks;

import Wikipedia_BDD.utils.JsonToObjectBDD;
import aquality.selenium.browser.AqualityServices;
import aquality.selenium.browser.Browser;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import static io.qameta.allure.Allure.step;

public class Hooks {


    protected Browser browser = AqualityServices.getBrowser();


    @Before
    public void setup(){
        step("get browser");
        browser = AqualityServices.getBrowser();
        step("maximize browser");
        browser.maximize();
        step("go to main page");
        browser.goTo(JsonToObjectBDD.getEnvData().getHost());
    }

    @After
    public void teardown(){
        step("close browser");
        browser.quit();
    }
    }

