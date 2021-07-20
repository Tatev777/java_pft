package Pages;

import helpers.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FeedPages extends TestBase {

  @FindBy(css = ".autotest__feed-context")
  public WebElement contextWidget;

  @FindBy(css = ".autotest__feed-context-author-avatar")
  public WebElement contextWidgetAvatar;

  @FindBy(css = ".autotest__feed-context-author-name")
  public WebElement contextWidgetAuthorName;

  @FindBy(css = ".autotest__feed-context-author-status")
  public WebElement contextWidgetAuthorStatus;

  @FindBy(css = ".autotest__widget_WatchList")
  public WebElement widgetWatchList;

}
