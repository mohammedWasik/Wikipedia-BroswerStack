package Wikipedia_BDD.pages;

import aquality.selenium.browser.AqualityServices;
import aquality.selenium.elements.interfaces.IButton;
import aquality.selenium.elements.interfaces.ILabel;
import aquality.selenium.forms.Form;

import org.openqa.selenium.By;


public class DownloadPage  extends Form {

    private final By PDF_name_xpath = By.xpath( "//*[contains(@class,'mw-electronpdfservice-selection-label-desc')]");

    private final ILabel PdfName = AqualityServices.getElementFactory().getLabel(PDF_name_xpath,"Pdf Name");

    private  final By DownloadPdfXpath = By.xpath("//button[@type='submit']");
    private final IButton DownloadBtn = AqualityServices.getElementFactory().getButton(DownloadPdfXpath,"Download Btn");


    public DownloadPage() {
        super(By.xpath("//*[contains(@class,'mw-electronpdfservice-selection-body')]"), "Download Page");
    }
    public void ClickDownloadBtn(){
        DownloadBtn.click();

    }
    public String savePdfName2(){
        return PdfName.getText();

    }
}
