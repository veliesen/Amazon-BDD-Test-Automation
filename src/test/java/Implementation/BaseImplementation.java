package Implementation;

import com.thoughtworks.gauge.AfterSuite;
import com.thoughtworks.gauge.BeforeSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseImplementation {
    public static WebDriver webDriver;
    public static Actions actions;
    public static WebElement element;
    public static String expectedText;



    @BeforeSuite
    public void setUp(){

        String osName = System.getProperty("os.name");
        String browser = System.getProperty("browser");
        if (browser == null) {
            browser = "Firefox";
        }

        System.out.println("Initialising Automated Test Runs ");
        System.out.println( osName+" / "+browser);

        if(browser=="Chrome"){
            if(osName=="Mac OS X"){
                System.setProperty("Webdriver.chrome.driver","drivers/chromdriver");
                webDriver=new ChromeDriver();
            }else{
                System.setProperty("webdriver.chrom.drive","drivers/chromdrive");;
                ChromeOptions chromeOptions=new ChromeOptions();
                chromeOptions.addArguments("--remote-allow-origins=*");
                webDriver=new ChromeDriver(chromeOptions);
            }
        }
        if(browser=="Firefox"){
            if(osName=="Mac OS X"){
                System.setProperty("Webdriver.gecko.drive","drivers/geckodriver");
                webDriver=new FirefoxDriver();
            }else{
                System.setProperty("Webdriver.geck.drive","drivers/geckdriver");
                webDriver=new FirefoxDriver();
            }
        }
        String URL="https://www.amazon.com.tr/";
        webDriver.manage().window().maximize();
        webDriver.get(URL);
    }
    @AfterSuite
    public void quit(){
        webDriver.quit();
    }

}
