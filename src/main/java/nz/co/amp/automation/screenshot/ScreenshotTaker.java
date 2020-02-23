package nz.co.amp.automation.screenshot;

import org.openqa.selenium.WebElement;

import java.awt.image.BufferedImage;

public interface ScreenshotTaker {
  BufferedImage takeScreenShot(WebElement logoImage);
}
