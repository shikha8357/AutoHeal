package pages;

import healing.SelfHealingDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class LoginPage {

    private By username = By.id("username");

    private List<By> usernameFallbacks = List.of(
            By.name("user"),
            By.cssSelector("input[type='text']"),
            By.xpath("//input[contains(@placeholder,'User')]")
    );

    public WebElement getUsernameField() {
        return SelfHealingDriver.findElement(username, usernameFallbacks);
    }
}
