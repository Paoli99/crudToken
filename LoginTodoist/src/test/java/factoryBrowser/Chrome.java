package factoryBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Chrome implements  IBrowser{

    @Override
    public WebDriver createBrowser() {
        System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chromedriver.exe");
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        chromeDriver.manage().window().maximize();
        return chromeDriver;
    }

}
