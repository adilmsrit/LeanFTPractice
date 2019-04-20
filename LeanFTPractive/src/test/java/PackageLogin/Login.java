package PackageLogin;

import ObjectRepository.Login_Repo;
import com.hp.lft.sdk.GeneralLeanFtException;
import org.testng.annotations.*;
import unittesting.UnitTestClassBase;

public class Login extends UnitTestClassBase {

    public Login_Repo login_repo;

    @BeforeClass
    public void beforeClass() throws Exception {
        login_repo = new Login_Repo(browser);
    }

    @AfterClass
    public void afterClass() throws Exception {
    }

    @BeforeMethod
    public void beforeMethod() throws Exception {
    }

    @AfterMethod
    public void afterMethod() throws Exception {
    }

    @Test
    public void test() throws GeneralLeanFtException {


        login_repo.NoqodiPage_Login().UsernameEditField().setValue("DW178654");
        login_repo.NoqodiPage_Login().PasswordEditField().setValue("P@ss1234");
        login_repo.NoqodiPage_Login().LoginButton().click();

    }

}