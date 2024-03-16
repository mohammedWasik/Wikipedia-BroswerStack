package Wikipedia_BDD.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.core.elements.interfaces.IElement;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.forms.Form;
import org.openqa.selenium.By;


public class PersonPage extends Form {
    private final By ToolMenuId = By.xpath("//*[@id='vector-page-tools-dropdown']");
    private final IButton ToolMenu = AqualityServices.getElementFactory().getButton(ToolMenuId, "Tool Menu Button");
    private final By DownloadId = By.id("coll-download-as-rl");
    private final By pageInformationXpath = By.xpath("//*[@id='t-info']");
    private final IButton pageInformationBtn = AqualityServices.getElementFactory().getButton(pageInformationXpath,"page information");
    private final IButton DownloadBtn = AqualityServices.getElementFactory().getButton(DownloadId, "Download As PDF button");
    public PersonPage() {
        super(By.xpath("//span[contains(@class,'mw-page-title-main')]"), "Person Page ");
    }
    public void ToolMenuClick() {
        ToolMenu.click();
    }
    public void DownloadBtnClick() {
        DownloadBtn.click();
    }
    public void clickPageInformationBtn(){pageInformationBtn.click(); }

}
