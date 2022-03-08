package pages;

import control.Alert;
import control.Button;
import control.TextBox;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Date;


public class MenuSection {

    public Button logoutButton = new Button(By.id("ctl00_HeaderTopControl1_LinkButtonLogout"));

    public Button settingsButton = new Button(By.xpath("//html/body/form/div[3]/table/tbody/tr[1]/td/div[1]/div/div/div/a[1]"));
}