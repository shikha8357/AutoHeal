package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginFieldHealing() {
        LoginPage loginPage = new LoginPage();
        loginPage.getUsernameField().sendKeys("testuser");
    }
}
