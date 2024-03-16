package Wikipedia_BDD.stepDefinition;

import Wikipedia_BDD.utils.JsonToObjectBDD;
import Wikipedia_BDD.pages.DownloadPage;
import Wikipedia_BDD.utils.FileUtil;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.testng.Assert;

import java.io.File;

import static io.qameta.allure.Allure.step;

public class DownloadPageSteps {
    DownloadPage downloadPage = new DownloadPage();
    private File file;

    @And("I download the file from the Download as PDF page")
    public void downloadPdf() {
        step("clicking download button");
        downloadPage.ClickDownloadBtn();
    }
    @Then("the file with the provided name on the Download as PDF page is downloaded")
    public void checkDownloadpage(){
        step("getting pdf name");
        String pdf = downloadPage.savePdfName2();
        step("finding file with the pdf name");
        file = new File(JsonToObjectBDD.RESOURCE_FILE_PATH + pdf);
        step("checking if file exists");
        Assert.assertTrue(FileUtil.isFileExist(file),"file doesn't exist");
        step("deleting file");
        FileUtil.deleteFileIfExist(file);
    }

}
