package pages;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class UpdateProject {

    String projectName = "UPB";
    String update = "Updated";

    public Button newProject = new Button(By.xpath("//td[text()='Add New Project']"));
    public TextBox addProjectName = new TextBox(By.id("NewProjNameInput"));
    public Button addProject = new Button(By.id("NewProjNameButton"));


    public Button project = new Button(By.xpath("//li[last()]//td[text()='"+projectName+"']"));
    public Button options = new Button(By.xpath("//div[@style=\"display: block;\"]/img"));
    public Button edit = new Button(By.xpath("//ul[contains(@style,'block')]/li/a[text()='Edit']"));
    public TextBox editProjectText = new TextBox(By.xpath("//td/div/input[@id='ItemEditTextbox']"));
    public Button save = new Button(By.xpath("//td/div/img[@id=\"ItemEditSubmit\"]"));
}
