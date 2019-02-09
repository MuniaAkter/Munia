package Test;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

	@Test(dataProvider= "login" )
	public void runtest(String username, String password) {
		dr.get("http://www.facebook.com");
		dr.findElement(By.id("email")).sendKeys(username);
		dr.findElement(By.id("pass")).sendKeys(password);
		dr.findElement(By.id("u_0_2")).click();
		
	}
	
	@DataProvider(name= "login")
	public Object[][] getData() {
		
		return ex.getExcelData();
		
	}

}

