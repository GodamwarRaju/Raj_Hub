
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    @Test
    public void verifyTheValidCredential(){
        loginPage.doLogin("sump1","techfin@12");
    }
    @Test
    public void verifyLoginPageHeader(){
        String actual=loginPage.loginPageHeader();
        Assert.assertEquals(actual,"TDIT Solutions");
    }
}
