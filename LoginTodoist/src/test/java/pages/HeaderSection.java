package pages;

import control.Image;
import org.openqa.selenium.By;

public class HeaderSection {
    public Image profileImage = new Image(By.xpath("//*[@id=\"top_bar_inner\"]/div[2]/button[5]/img"));
}
