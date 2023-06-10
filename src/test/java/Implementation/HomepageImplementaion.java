package Implementation;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;


public class HomepageImplementaion extends BaseImplementation {

    @Step("<Second> Second Wait")
    public void waitElement(int Second) throws InterruptedException {
        Thread.sleep(Second + 1000);
    }

    @Step("Hover <id> Element And Wait <time> Seconds")
    public void hoverAccount(String id, int time) {
        actions = new Actions(webDriver);
        element = webDriver.findElement(By.id(id));
        actions.moveToElement(element).build().perform();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Find Element <key> Check <text>")
    public void checkAccountName(String key, String text) {
        expectedText = webDriver.findElement(By.id(key)).getText();
        Assert.assertEquals(expectedText, text);
    }

    @Step("Click On <id> On Hover")
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

    @Step("Find Element <css> on SignIn Page And Check <text>")
    public void checkTextSignIn(String css, String text) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(text, expectedText);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    @Step("Find Element <id> on Homepage And Click on")
    public void clickOnReturnOrders(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Find Location Section Element <id> on Homepage And Click On")
    public void clickOnLocationSection(String id) {
        element = webDriver.findElement(By.id(id));
        actions.moveToElement(element).build().perform();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        webDriver.findElement(By.id(id)).click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Find Element <Css> on SignIn Page And Check <text> On PopUp")
    public void checkTextOnPopUp(String Css, String text) {
        expectedText = webDriver.findElement(By.cssSelector(Css)).getText();
        Assert.assertEquals(expectedText, text);
    }

    @Step("Click On <css> Button To View Your Adress")
    public void clickOnToViewAddress(String css) {
        webDriver.findElement(By.cssSelector(css)).click();
    }

    @Step("Click <id> Element On Categories")
    public void clickOnCategories(String id) {
        webDriver.findElement(By.id(id)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Click On <css> Element Baby Categories")
    public void selectBabyCategory(String css) {
        webDriver.findElement(By.cssSelector(css)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Get Text in <css> Element And Check <text> Text as Category Selected")
    public void checkSelectedCategory(String css, String text) {
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText, text);
    }

    @Step("Find <id> Element Write <ASIN> On Searh Tab")
    public void writeASINOnSearch(String id, String ASIN) {
        webDriver.findElement(By.id(id)).sendKeys(ASIN);
    }

    @Step("Click On <id> Element Search Button")
    public void clickOnSearch(String id) {
        webDriver.findElement(By.id(id)).click();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Accept Cookies By Clicking On <id> Element")
    public void acceptCookies(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Find Element <css> Product Page And Check <text> Product Description")
    public void checkProductName(String css, String text) {
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText, text);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Click On <id> Element Amazon Logo And Return HomePage")
    public void returnHomepageByClickOnAmazonLogo(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Find Element <css> Click On Product Description")
    public void clickOnProductDescription(String css) {
        webDriver.findElement(By.cssSelector(css)).click();
    }

    @Step("Click on <css> Element Buy Box Button And Wait <time> Seconds")
    public void clickOnBBButton(String css, int time) {
        webDriver.findElement(By.cssSelector(css)).click();
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    @Step("Find Element <css> Product Page And Check <text> Product Added To Cart And Wait For <time> Seconds")
    public void checkProductAddCart(String css, String text, int time) {
        expectedText = webDriver.findElement(By.cssSelector(css)).getText();
        Assert.assertEquals(expectedText, text);
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
    @Step("Click On <css> Element Empty Cart")
    public void emptyCart(String css){
        webDriver.findElement(By.cssSelector(css)).click();
    }

    @Step("Click On <id> Element Go To Cart")
    public void goToCart(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Click On <id> Element To View Cart")
    public void clickOnCartIcon(String id) {
        webDriver.findElement(By.id(id)).click();
    }

    @Step("Find <xpath> Element And Check <text> Cart Empty")
    public void checkForEmptyCart(String xpath  , String text) {
        expectedText = webDriver.findElement(By.xpath(xpath)).getText();
        Assert.assertEquals(expectedText, text);
    }


}



