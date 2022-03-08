package pages;

import control.Button;
import org.openqa.selenium.By;

public class DeleteProject {
    String projectName = "UPB";
    String update = "Updated";

    public Button projectEdit = new Button(By.xpath("//li[last()]//td[text()='"+projectName+update+"']"));
    public Button options = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button delete = new Button(By.id("ProjShareMenuDel"));
}
