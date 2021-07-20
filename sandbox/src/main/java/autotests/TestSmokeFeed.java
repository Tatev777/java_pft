package autotests;

import helpers.TestBase;
import org.junit.Test;

public class TestSmokeFeed extends TestBase {
  @Test
  public void smokeContextWidget(){
    String url = "https://whotrades.tst.whotrades.net/feed";

    System.out.println("Hello");
    openPage(url);
    iAmOnPage(url);
    feed.iAmOnFeedPage();

    feed.iSeeContextWidget();
    feed.contextWidgetNameClick();

    switchWindow();
    timeline.iSeeWidgetAboutMe();
    closeWindow();
    feed.iAmOnFeedPage();
  }
}
