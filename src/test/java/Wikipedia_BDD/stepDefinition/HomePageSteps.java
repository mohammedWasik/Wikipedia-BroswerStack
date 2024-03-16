package Wikipedia_BDD.stepDefinition;


import Wikipedia_BDD.pages.HomePage;
import Wikipedia_BDD.utils.JsonToObjectBDD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

import static io.qameta.allure.Allure.step;

public class HomePageSteps {

    HomePage homePage = new HomePage();

    @Given("I am on the Main page of Wikipedia")
    @Then("I check if the main page is open")
    public void onMainPage(){
        step("checking home page is open");
        Assert.assertTrue(homePage.state().isDisplayed(),"Home page is not opened");
    }
    @When("I type {string} in the search field")
    public void typeNameAndSubmit(String name){
        step("typing "+name+"in the input box");
        homePage.TypeInInputBox(name);
    }
    @When("I click the submit button")
    public void submitBTN(){
        step("clicking the submit button");
        homePage.SubmitInputBox();
    }
    @And("I change the search language to {string}")
    public void changeLanguage(String language){
        step("changing the language to "+language);
        homePage.selectLanguage(language);
    }





}
