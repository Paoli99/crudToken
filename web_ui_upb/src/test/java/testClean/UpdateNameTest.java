package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.UpdateName;
import singleton.Session;

public class UpdateNameTest extends  BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    UpdateName updateName = new UpdateName();
    String update = "New Name";

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("paola_api@api.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo hacer el login");

        Thread.sleep(1000);

        menuSection.settingsButton.click();
        Thread.sleep(2000);

        updateName.nameTxtBox.clearSetText(update);

        updateName.okBtn.click();
        Thread.sleep(1000);
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo actualizar el nombre");

    }
}
