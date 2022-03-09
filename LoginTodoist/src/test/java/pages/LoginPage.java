package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class LoginPage {
    public TextBox emailTxtBox = new TextBox(By.xpath("//*[@id=\"email\"]"));
    public TextBox pwdTxtBox = new TextBox(By.xpath("//*[@id=\"password\"]"));
    public Button loginBtn = new Button(By.xpath("//*[@id=\"login_form\"]/button"));
}
