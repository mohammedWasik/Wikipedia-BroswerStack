package Wikipedia_BDD.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InformationPage extends Form {
    private final By headerXpath = By.xpath("//*[@id='firstHeading']");
    private final ILabel header = AqualityServices.getElementFactory().getLabel(headerXpath, "Page Information Header");


    public InformationPage() {
        super(By.xpath("//*[@id='firstHeading']"), "Information Page");
    }

    public String getPageInformationHeaderText() {
        String input = header.getText();
        Pattern pattern = Pattern.compile("\"(.*?)\"");
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            return  matcher.group(1).trim();
        }
        return "";
    }
}
