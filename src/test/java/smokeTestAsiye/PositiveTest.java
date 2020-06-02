package smokeTestAsiye;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.FhcLoginPage;
import utilities.TestBase;


public class PositiveTest extends TestBase {

    @Test
    public void positiveLoginTest1(){
        driver.get("http://www.fhctrip.com/Account/Logon");
        FhcLoginPage fhcLoginPage=new FhcLoginPage(driver);
        fhcLoginPage.username.sendKeys("manager2");
        fhcLoginPage.password.sendKeys("Man1ager2!");
        fhcLoginPage.login.click();
        Assert.assertTrue(false);
    }




}
