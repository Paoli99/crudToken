package Basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Date;

public class UpdateProject {
    /* Login

             Create
   - click AddNewProject button ------> //td[text()='Add New Project']
             - set newProject = NAME_PROJ -----> NewProjNameInput
   - click Add button ----> NewProjNameButton
   - verificar
     NAME_PROJ este en la list de projectos --

     si es unico --> //td[text()='NAME_PROJ'] ***
     el ultima loista---> //li[last()]//td[text()='NAME_PROJ']

     NAME_PROJ sea el que esta en el centro ---> CurrentProjectTitle
             Update
   - click NAME_PROJ en la lista de projectos ---> //td[text()='NAME_PROJ'] OR //li[last()]//td[text()='NAME_PROJ']

             - click icono de menu ----> //div[@style="display: block;"]/img
             - click Edit option ---> //ul[contains(@style,'block')]/li/a[text()='Edit']
             - set updateProject TxtBox NEW_NAME_PROJ  ---> //td/div/input[@id='ItemEditTextbox']
             - click save button ----> //td/div/img[@id="ItemEditSubmit"]
             - verificar
     NAME_PROJ_NEW este en la list de projectos --

     si es unico --> //td[text()='NAME_PROJ_NEW'] ***
     el ultima loista---> //li[last()]//td[text()='NAME_PROJ_NEW']

     */
    ChromeDriver chromeDriver;
    String project = "newProject4";
    String update = "update";

    @BeforeEach
    public void openBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        // implicit wait
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeDriver.manage().window().maximize();
        chromeDriver.get("http://todo.ly/");
    }

    @Test
    public void verifyLoginTodoLyu() throws InterruptedException {

        // click img login
        chromeDriver.findElement(By.xpath("//img[@src='/Images/design/pagelogin.png']")).click();
        // set text email
        chromeDriver.findElement(By.xpath("//input[@name='ctl00$MainContent$LoginControl1$TextBoxEmail']")).sendKeys("paola_api@api.com");
        // set test pwd
        chromeDriver.findElement(By.xpath("//input[contains(@name,'LoginControl1$TextBoxPassword')]")).sendKeys("12345");
        // click boton login
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();

        //creacion

        String nameProj="UPB"+new Date().getTime();
        chromeDriver.findElement(By.xpath("//td[text()='Add New Project']")).click();
        chromeDriver.findElement(By.id("NewProjNameInput")).sendKeys(nameProj);
        chromeDriver.findElement(By.id("NewProjNameButton")).click();
        Thread.sleep(2000);
        Assertions.assertEquals(nameProj,chromeDriver.findElement(By.id("CurrentProjectTitle")).getText(),"ERROR no se creo el projecto");
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//li[last()]//td[text()='"+nameProj+"']")).isDisplayed(),"ERROR no creo el projecto");

        // Actualizacion

        chromeDriver.findElement(By.xpath("//li[last()]//td[text()='"+nameProj+"']")).click();
        chromeDriver.findElement(By.xpath("//div[@style=\"display: block;\"]/img")).click();
        chromeDriver.findElement(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']")).click();
        chromeDriver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).clear();

        String newNameProj="upb"+new Date().getTime();
        chromeDriver.findElement(By.xpath("//td/div/input[@id='ItemEditTextbox']")).sendKeys(newNameProj);
        chromeDriver.findElement(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]")).click();

        Thread.sleep(2000);
        Assertions.assertEquals(newNameProj,chromeDriver.findElement(By.id("CurrentProjectTitle")).getText(),"ERROR no se creo el projecto");
        Assertions.assertTrue(chromeDriver.findElement(By.xpath("//li[last()]//td[text()='"+newNameProj+"']")).isDisplayed(),"ERROR no creo el projecto");

        // delete
        chromeDriver.findElement(By.xpath("//li[last()]//td[text()='"+newNameProj+"']")).click();
        chromeDriver.findElement(By.xpath("//div[@style='display: block;']/img")).click();
        chromeDriver.findElement(By.id("ProjShareMenuDel")).click();
        // alerta
        chromeDriver.switchTo().alert().accept();
        Thread.sleep(2000);
        String currentName=chromeDriver.findElement(By.id("CurrentProjectTitle")).getText();
        Assertions.assertTrue(!currentName.equals(newNameProj),"ERROR el projecto no se Elimino");

    }
}