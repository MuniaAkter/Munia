package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Excel.ReadExcel;

public class BaseTest {

	public static WebDriver dr;
	public static ReadExcel ex = new ReadExcel("/Users/muniaakter/Desktop/testdata.xlsx");

	@BeforeSuite
	public void name() {
		dr = new ChromeDriver();
		dr.manage().deleteAllCookies();
		//dr.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);

	}

	@AfterSuite
	public void teardown() throws InterruptedException {

		Thread.sleep(4000);

		dr.quit();
	}
}
