package Wikipedia_BDD.stepDefinition;

import Wikipedia_BDD.pages.PersonPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;


import static io.qameta.allure.Allure.step;

public class PersonPageSteps {
    PersonPage personPage = new PersonPage();

    @And("I click the Tool menu button")
    public void clickToolMenu() {
        step("clicking tool menu button");
        personPage.ToolMenuClick();
    }

    @And("I click Download as PDF button")
    public void clickDownloadBTN() {
        step("clicking download button");
        personPage.DownloadBtnClick();
    }

    @And("I click Page Information on the Article page")
    public void clickPageInformationBTN() {
        step("clicking information button");
        personPage.clickPageInformationBtn();
    }

    @Then("the Article page for {string} in Español is opened")
    public void checkArticleIsOpened(String name) {
        step("getting page information for" + name);
        Assert.assertTrue(personPage.state().isDisplayed(),"page is not open");
    }


}
