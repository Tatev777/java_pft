package Models;

import helpers.TestBase;
import org.junit.Assert;
import org.junit.Test;

import static org.testng.Assert.assertTrue;

public class FeedModels extends TestBase {

  @Test
  public void iSeeContextWidget(){
    visibilityOfElement(feedPage.contextWidget);
    Assert.assertTrue("I don't see context widget", feedPage.contextWidget.isDisplayed());
    Assert.assertTrue("I don't see avatar in context widget", feedPage.contextWidgetAvatar.isDisplayed());
    Assert.assertTrue("I don't see author name in context widget", feedPage.contextWidgetAuthorName.isDisplayed());
    Assert.assertTrue("I don't see online/offline status in context widget", feedPage.contextWidgetAuthorStatus.isDisplayed());
  }

  public void contextWidgetNameClick(){
    visibilityOfElement(feedPage.contextWidgetAuthorName);
    feedPage.contextWidgetAuthorName.click();
  }

  public void iAmOnFeedPage(){
    visibilityOfElement(feedPage.widgetWatchList);
    assertTrue(feedPage.widgetWatchList.isDisplayed(), "I am not on feed page");
  }

  public void goToPageFeed(){

  }


}
