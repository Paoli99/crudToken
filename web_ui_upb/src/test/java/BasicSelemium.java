import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicSelemium {

    ChromeDriver chromeDriver;
    @BeforeEach
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        chromeDriver = new ChromeDriver();
        chromeDriver.get("https://todo.ly/");
    }

    @Test
    public void goToGoogle() throws InterruptedException {
        // img login
        chromeDriver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img")).click();
        // set text email
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxEmail")).sendKeys("paola_api@api.com");
        // set test pwd
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_TextBoxPassword")).sendKeys("12345");
        // click boton login
        chromeDriver.findElement(By.id("ctl00_MainContent_LoginControl1_ButtonLogin")).click();
        Thread.sleep(5000);
        Thread.sleep(5000);
    }

    @AfterEach
    public void closeBrowser(){
        chromeDriver.quit();
    }
}
