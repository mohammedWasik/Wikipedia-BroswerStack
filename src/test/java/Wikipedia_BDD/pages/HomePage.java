package Wikipedia_BDD.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.elements.interfaces.ITextBox;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

public class HomePage  extends Form {


    private final ITextBox InputTextBox = AqualityServices.getElementFactory().getTextBox(By.id("searchInput"),"Input Field");

    private final By SubmitButtonXpath = By.xpath("//button[@type='submit']");
    private  final IButton SubmitButton= AqualityServices.getElementFactory().getButton(SubmitButtonXpath,"submit button");

    public HomePage() {
        super(By.id("www-wikipedia-org"),"Wikipedia Home Page");
    }


    public void TypeInInputBox(String name){
        InputTextBox.clearAndType(name);
    }

    public  void SubmitInputBox(){
        SubmitButton.click();
    }
    public void selectLanguage(String language){
        By languageSelectorXpath = By.xpath("//*[@id='searchLanguage']/option[text()='" + language + "']");
        ILabel languageSelector = AqualityServices.getElementFactory().getLabel(languageSelectorXpath,"selection language");
        languageSelector.click();
    }

}
