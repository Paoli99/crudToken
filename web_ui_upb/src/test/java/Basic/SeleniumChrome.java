package Basic;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class SeleniumChrome {

    ChromeDriver chromeDriver;
    String project = "newProject4";
    String update = "update";
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
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

        // verificacion : para saber si el login fue satisfactorio
        Assertions.assertTrue( chromeDriver.findElement(By.xpath("//a[text()='Logout']")).isDisplayed(),"ERROR! no se pudo hacer el login");

        chromeDriver.findElement(By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div")).click();
        chromeDriver.findElement(By.id("NewProjNameInput")).sendKeys(project);
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//*[@id=\"NewProjNameButton\"]")).click();
        Assertions.assertTrue( chromeDriver.findElement(By.xpath("//td[text()='"+project+"']")).isDisplayed(),"ERROR! no se pudo crear el proyecto");


        String itemidHTML = chromeDriver.findElement(By.xpath("//td[text()='"+project+"']")).getAttribute("itemid");
        System.out.println(itemidHTML);

        chromeDriver.findElement(By.xpath("//td[text()='"+project+"']")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"ItemId_"+itemidHTML+"\"]/table/tbody/tr/td[4]")).click();
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//*[@id=\"projectContextMenu\"]/li[1]/a")).click();
        chromeDriver.findElement(By.xpath("//*[@id=\"ItemEditTextbox\"]")).sendKeys(update);
        Thread.sleep(2000);
        chromeDriver.findElement(By.xpath("//*[@id=\"ItemEditSubmit\"]")).click();

        Assertions.assertTrue( chromeDriver.findElement(By.xpath("//td[text()='"+project+update+"']")).isDisplayed(),"ERROR! no se pudo actualizar el proyecto");
        Thread.sleep(5000);

    }

    @AfterEach
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
