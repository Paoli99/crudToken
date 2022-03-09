package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.LoginModal;
import pages.MainPage;
import pages.MenuSection;
import pages.SettingsModal;
import singleton.Session;

public class SettingsModalTest extends  BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    SettingsModal settingsModal = new SettingsModal();
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

        settingsModal.nameTxtBox.clearSetText(update);

        settingsModal.okBtn.click();
        Thread.sleep(1000);

        menuSection.settingsButton.click();
        String currentName=Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"FullNameInput\"]")).getAttribute("value");
        Assertions.assertTrue(currentName.equals(update));
        Thread.sleep(1000);
        //Assertions.assertTrue( Session.getInstance().getDriver().findElement(By.xpath("//*[@id=\"FullNameInput\"]").isDisplayed(),"ERROR! no se pudo actualizar el nombre");
        //Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(), "ERROR no se pudo actualizar el nombre");

    }
}
