package Pages;

import helpers.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TimelinePages extends TestBase {

  @FindBy(css = ".autotest__widget_ProfileOwnSites")
  public WebElement widgetAboutMe;
}
