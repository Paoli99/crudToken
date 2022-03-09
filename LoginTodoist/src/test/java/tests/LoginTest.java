package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.devtools.v85.cachestorage.model.Header;
import pages.HeaderSection;
import pages.LoginPage;
import pages.MainPage;

public class LoginTest extends BaseTodoist {
    MainPage mainPage = new MainPage();
    LoginPage loginPage = new LoginPage();
    HeaderSection headerSection = new HeaderSection();

    @Test
    public void verifyLoginTodoist() throws InterruptedException {
        mainPage.loginLink.click();
        Thread.sleep(1000);

        //login
        loginPage.emailTxtBox.setText("paola_api@api.com");
        loginPage.pwdTxtBox.setText("12345678");
        loginPage.loginBtn.click();

        Thread.sleep(5000);

        // verfication
        Assertions.assertTrue(headerSection.profileImage.isControlDisplayed(), "Error, no se pudo iniciar sesion");
    }

}
