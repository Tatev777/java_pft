package Models;

import helpers.TestBase;

import static org.testng.Assert.assertTrue;

public class TimelineModels extends TestBase {

  public void iSeeWidgetAboutMe(){
    visibilityOfElement(timelinePage.widgetAboutMe);
    assertTrue(timelinePage.widgetAboutMe.isDisplayed(), "It'not timeline page");
  }
}
