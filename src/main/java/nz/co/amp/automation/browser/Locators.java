package nz.co.amp.automation.browser;

import com.codeborne.selenide.WebDriverRunner;
import io.github.sukgu.Shadow;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.springframework.stereotype.Component;

@Component
public class Locators {

    public Shadow shadowDOM() {

       /* ChromeOptions options = new ChromeOptions();
        options.addArguments("test-type");
        options.addArguments("start-maximized");
        options.addArguments("--js-flags=--expose-gc");
        options.addArguments("--enable-precise-memory-info");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-default-apps");
        options.addArguments("--enable-automation");
        options.addArguments("test-type=browser");
        options.addArguments("disable-infobars");
        options.addArguments("disable-extensions");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().fullscreen(); */

        //options.addArguments("test-type");
        //options.addArguments("start-maximized");


        WebDriver driver = WebDriverRunner.getWebDriver();

       driver.manage().window().maximize();
       WebDriverRunner.setWebDriver(driver);

        Shadow shadow = new Shadow(driver);
        return  shadow;
        }
}
