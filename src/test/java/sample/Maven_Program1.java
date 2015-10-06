package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Maven_Program1 {
	public WebDriver driver;
  @Test
  public void f() {
	  driver.get("http://www.google.com");
  }
  @BeforeClass
  public void beforeClass() {
	  driver = new FirefoxDriver();
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
