package pages;

import control.ALink;
import org.openqa.selenium.By;

public class MainPage {
    public ALink loginLink = new ALink(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[1]/a"));
}
