package nz.co.nzpost.automation.page;

import com.codeborne.selenide.*;
import io.github.sukgu.Shadow;
import nz.co.nzpost.automation.annotations.Page;
import nz.co.nzpost.automation.browser.Browser;
import nz.co.nzpost.automation.domain.Address;
import nz.co.nzpost.automation.domain.AddressResult;
import nz.co.nzpost.automation.domain.AddressResultMessage;
import nz.co.nzpost.automation.domain.AddressResultType;
import nz.co.nzpost.automation.exception.ElementNotFoundException;
import nz.co.nzpost.automation.screenshot.ScreenshotTaker;
import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static com.codeborne.selenide.Selenide.$;


@Page
public class UserRegistrationPage {

    private final String host;

    @Autowired
    public UserRegistrationPage(@Value("${host}") String host) {
        this.host = host;
    }

    public void open() {
        Selenide.open(host + "/s/login/?startURL=%2Fmyamp%2Fs%2F&response_type=undefined&redirect_uri=undefined&ec=302");
    }

    public void clickLoginButton() throws InterruptedException {
        Thread.sleep(3000);
       // wait().(ExpectedConditions.presenceOfElementLocated(By.id("input-3")));
        //Enter User Email

        Shadow shadow = new Shadow(WebDriverRunner.getWebDriver());
        WebElement element = shadow.findElement("#input-3");
        element.sendKeys("troy.plamer");
        //String text = element.getText();
        $(By.cssSelector("#input-3")).sendKeys("troy.palmer@amp.co.nz");
        //Enter User Password
        $(By.cssSelector("#input-5")).sendKeys("P@ssw0rd25");
        //Click Login
        $(By.cssSelector("button.slds-button:nth-child(1)")).click();
        Thread.sleep(5000);

        $("button.slds-button:nth-child(1)").click();
    }

}
