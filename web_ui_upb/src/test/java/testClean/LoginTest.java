package testClean;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import singleton.Session;

public class LoginTest extends BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();

    @Test
    public void verifyLoginTodoLy(){
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("paola_api@api.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");
    }

}
