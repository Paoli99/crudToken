package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;
import org.w3c.dom.Text;

public class UpdateName {
    public TextBox nameTxtBox = new TextBox(By.id("FullNameInput"));
    public Button okBtn = new Button(By.xpath("//html/body/div[9]/div[2]/div/button[1]"));
}
