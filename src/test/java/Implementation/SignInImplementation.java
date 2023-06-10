package Implementation;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class SignInImplementation extends BaseImplementation {

    String decryptedEmail;


    @Step("Hover on <id> Element Account Section For <time> Seconds")
    public void hoverAccountSect(String id, int time) {
        actions = new Actions(webDriver);
        element = webDriver.findElement(By.id(id));
        actions.moveToElement(element).build().perform();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }

    @Step("Click On <id> Element SignIn Button")
    public void hoverClickOnSign(String id) {

        element = webDriver.findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(element).build().perform();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Find Element <css> Check Welcoming Page <text> And Wait <time> MiliSeconds")
    public void checkTextSignInPage(String css, String text, int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(text, expectedText);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Step("Navigate to Homepage")
    public void navigateHomepage() {
        webDriver.navigate().back();
    }
    @Step("Find <css> Element And Clear Email Tab")
    public void clearEmailTab(String css){
        webDriver.findElement(By.cssSelector(css)).clear();
    }
    @Step("Click On <id> Element To Continue")
    public void clickOnContinueSignIn(String id){
        webDriver.findElement(By.id(id)).click();
    }
    @Step("Find <css> Element Check <text> As Warning Message")
    public void clickOnContinueSignIn(String css,String text){
        expectedText=webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText,text);
    }
    @Step("Find <css> Element And Enter Valid <encyrptedEmail>")
    public void enterValidMail(String css,String encyrptedEmail){
        byte[] decryptedEmailInBytes= Base64.getDecoder().decode(encyrptedEmail.getBytes(StandardCharsets.UTF_8));
        decryptedEmail =new String(decryptedEmailInBytes);
        webDriver.findElement(By.cssSelector(css)).sendKeys(decryptedEmail);
    }
    @Step("Find Element <css> Product Page And Check <text> Password Page")
    public void checkPasswordPageText(String css,String text){
        expectedText=webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText,text);
    }
    @Step("Enter <encryptedPassword> in <css> Tab")
    public void enterVailPassword(String enryptedPassword, String css){
        byte[] decryptedPasswordInBytes= Base64.getDecoder().decode(enryptedPassword.getBytes(StandardCharsets.UTF_8));
        String decryptedPassword =new String((decryptedPasswordInBytes));
        webDriver.findElement(By.cssSelector(css)).sendKeys(decryptedPassword);
    }
    @Step("Find <id> Element Click On SignIn Button")
    public void clickOnSignInToAccountButton(String id){
        webDriver.findElement(By.id(id)).click();
    }
    @Step("Find <id> Element Check <text> Account Name")
    public void checkNameAccount(String id, String text){
        expectedText=webDriver.findElement(By.id(id)).getText();
        Assert.assertEquals(expectedText,text);
    }
    @Step("Find <css> Element Click On SignOut Link")
    public void signOut(String css){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.cssSelector(css)).click();
    }

}

