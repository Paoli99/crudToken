package testClean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import pages.*;
import singleton.Session;

import java.util.Date;

public class UpdateTest extends BaseTodoLy{
    MainPage mainPage= new MainPage();
    LoginModal loginModal= new LoginModal();
    MenuSection menuSection = new MenuSection();
    UpdateProject updateProject = new UpdateProject();
    DeleteProject deleteProject = new DeleteProject();
    String projectName = "UPB";
    String update = "Updated";

    @Test
    public void verifyLoginTodoLy() throws InterruptedException {
        mainPage.loginImage.click();
        loginModal.emailTxtBox.setText("paola_api@api.com");
        loginModal.pwdTxtBox.setText("12345");
        loginModal.loginButton.click();
        Assertions.assertTrue(menuSection.logoutButton.isControlDisplayed(),"ERROR no se pudo hacer el login");

        Thread.sleep(1000);

        //String nameProj="UPB"+new Date().getTime();

        //create
        updateProject.newProject.click();
        updateProject.addProjectName.setText(projectName);
        updateProject.addProject.click();
        Thread.sleep(1000);

        //update
        updateProject.project.click();
        updateProject.options.click();
        updateProject.edit.click();
        updateProject.editProjectText.clearSetText(projectName+update);
        updateProject.save.click();

        Assertions.assertTrue(Session.getInstance().getDriver().findElement(By.xpath("//li[last()]//td[text()='"+projectName+update+"']")).isDisplayed(),"ERROR no creo el projecto");
        Thread.sleep(2000);

        //delete
        deleteProject.projectEdit.click();
        deleteProject.options.click();
        deleteProject.delete.click();

        Thread.sleep(1000);

        Session.getInstance().getDriver().switchTo().alert().accept();
        String currentName=Session.getInstance().getDriver().findElement(By.id("CurrentProjectTitle")).getText();
        Assertions.assertTrue(currentName.equals(projectName+update),"ERROR el projecto no se Elimino");
        Thread.sleep(1000);
    }
}
