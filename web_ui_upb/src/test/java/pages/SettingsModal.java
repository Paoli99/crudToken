package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class SettingsModal {
    public TextBox nameTxtBox = new TextBox(By.id("FullNameInput"));
    public Button okBtn = new Button(By.xpath("//html/body/div[9]/div[2]/div/button[1]"));
}
