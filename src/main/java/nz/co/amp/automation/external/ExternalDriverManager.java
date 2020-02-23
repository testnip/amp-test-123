package nz.co.amp.automation.external;

import org.openqa.selenium.remote.RemoteWebDriver;

public interface ExternalDriverManager {
  RemoteWebDriver getDriver();
  RemoteWebDriver getChromeDriver();
}
