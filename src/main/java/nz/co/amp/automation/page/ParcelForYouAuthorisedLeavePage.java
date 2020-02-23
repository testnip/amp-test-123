package nz.co.amp.automation.page;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import nz.co.amp.automation.annotations.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

@Page
public class ParcelForYouAuthorisedLeavePage {

  private final String host;

  @Autowired
  public ParcelForYouAuthorisedLeavePage(@Value("${host}") String host) {
    this.host = host;
  }
  
  public void selectFromLeaveMyParcelOptions(String leaveOptions) {
    $$(".redelivery-atl").find(Condition.matchesText(leaveOptions)).click();
  }

  public void clickNext() {
    $(".redelivery-atl-selection-submit").click();
  }

  public void enterInstructions(String otherInstructions) {
    SelenideElement instructionsTextField = $(".autotest-redelivery-atl-textfield");
    instructionsTextField.sendKeys(otherInstructions);
  }

  public String getSummaryHeading() {
    return $(".title-color-red-nz-post.title-size-lg").getText();
  }
}
