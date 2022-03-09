package control;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import singleton.Session;

public class Control {
    protected WebElement control;
    protected By locator;
    //protected By switchAlert;

    public Control(By locator){
        this.locator = locator;
    }

    protected void find(){
        this.control= Session.getInstance().getDriver().findElement(this.locator);
    }



    public void click(){
        this.find();
        this.control.click();
    }

    public boolean isControlDisplayed(){
        try {
            this.find();
            return this.control.isDisplayed();
        } catch (Exception e){
            return false;
        }
    }

    public String getTextControl(){
        this.find();
        return this.control.getText();
    }

    public String getTextAttributeControl(String attribute){
        this.find();
        return this.control.getAttribute(attribute);
    }

}
