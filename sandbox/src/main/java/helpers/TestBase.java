package helpers;

import Models.TimelineModels;
import Pages.FeedPages;
import Models.FeedModels;
import Pages.TimelinePages;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.assertEquals;
import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

public class TestBase {

  static WebDriver driver;
  protected static String baseUrl;

  //pages
  protected static FeedPages feedPage;
  protected static TimelinePages timelinePage;

  //methods
  protected static FeedModels feed;
  protected static TimelineModels timeline;

//  protected final HelpersBase app = new HelpersBase(BrowserType.CHROME);

  @BeforeClass
  public static void setUp() {
    String browser = BrowserType.CHROME;
    switch (browser) {
      case BrowserType.CHROME:
        driver = new ChromeDriver();
        break;
      case BrowserType.FIREFOX:
        driver = new FirefoxDriver();
        break;
      case BrowserType.IE:
        driver = new InternetExplorerDriver();
        break;
    }


    driver.manage().window().maximize();


    feedPage = PageFactory.initElements(driver, FeedPages.class);
    timelinePage = PageFactory.initElements(driver, TimelinePages.class);

    feed = PageFactory.initElements(driver, FeedModels.class);
    timeline = PageFactory.initElements(driver, TimelineModels.class);

  }

  public void switchWindow() {
    for (String winHandle : driver.getWindowHandles()) {
      driver.switchTo().window(winHandle);
    }
  }

  protected void closeWindow() {
    driver.close();
  }

  public void openPage(String link) {
    driver.get(link);
  }

  public String getCurrentUrl() {
    return driver.getCurrentUrl();
  }

  public void iAmOnPage(String url){
    System.out.println(getCurrentUrl());
    assertEquals("Wrong page", getCurrentUrl(), url);
  }

  protected void visibilityOfElement(WebElement element){
    WebDriverWait wait = new WebDriverWait(driver, 20);
    wait.until(visibilityOf(element));
  }

  @After
  public void tearDownAfterTest() {
    driver.manage().deleteAllCookies();
  }

  @AfterClass
  public static void tearDown() throws Exception {
    driver.quit();
  }
}
