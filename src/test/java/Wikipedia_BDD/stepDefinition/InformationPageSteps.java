package Wikipedia_BDD.stepDefinition;
import Wikipedia_BDD.pages.InformationPage;
import Wikipedia_BDD.utils.JsonToObjectBDD;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import static io.qameta.allure.Allure.step;

public class InformationPageSteps {
    InformationPage informationPage = new InformationPage();

    @Then("the Information page for the {string} article is displayed")
    public void checkArticleInfoIsShown(String name){
        step("getting page information for"+name);
        String actualName = informationPage.getPageInformationHeaderText();
        Assert.assertEquals(actualName,name,"not equal");

    }
}
