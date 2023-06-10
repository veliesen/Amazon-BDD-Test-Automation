package Implementation;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.nio.charset.Charset;
import java.util.Random;

public class AccountImplementation extends BaseImplementation {

    @Step("Find <css> Element Click On Create Account Link")
    public void clickOnCreateAccountLink(String css){
        webDriver.findElement(By.cssSelector(css)).click();
    }
    @Step("Find <css> Element Check <text> on Account Creation Page")
    public void checkAccountCreationPageText(String css,String text){
        expectedText=webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText,text);
    }
    @Step("Find <css> Element And Clear Email Tab On Account Create Page")
    public void clearEmailTabOnAccountPage(String css){
        webDriver.findElement(By.cssSelector(css)).clear();
    }
    @Step("Find <css> Element And Clear Password Tab On Account Create Page")
    public void clearPasswordTabOnAccountPage(String css){
        webDriver.findElement(By.cssSelector(css)).clear();
    }
    @Step("Find <css> Element And Send Generated Text")
    public void sendRandomGeneratedUsername(String css){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedText = new String(array, Charset.forName("UTF-8"));
        int generatedInteger= (int) Math.floor(Math.random()*1000);
        webDriver.findElement(By.cssSelector(css)).sendKeys(generatedText+generatedInteger);
    }
    @Step("Find <css> Element And Send Generated Email")
    public void sendRandomGeneratedEmail(String css){
        byte[] array = new byte[7]; // length is bounded by 7
        new Random().nextBytes(array);
        String generatedText = new String(array, Charset.forName("UTF-8"));
        webDriver.findElement(By.cssSelector(css)).sendKeys(generatedText+"@gmail.com");
    }
    @Step("Find <css> Element Click On Create Account Submit Button ")
    public void clickOnAccountSubmit(String css){
        webDriver.findElement(By.cssSelector(css)).click();
    }
    @Step("Find <css> Element And Check Warning <text> On Password Section")
    public void checkWarningTextOnPasswordTab(String css,String text) {
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText, text);
    }
    @Step("Find <css> Element Click On Navigate Homepage")
    public void navigateHomepageFrAccountCreation(String css){
        webDriver.findElement(By.cssSelector(css)).click();
    }
    @Step("Find <css> Element Click On Submit To Confirm Email")
    public void clickOnSubmitConfirmEmail(String css){
        webDriver.findElement(By.cssSelector(css)).click();
    }

}
