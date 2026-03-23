package healing;

import driver.DriverFactory;
import org.openqa.selenium.*;

import java.util.List;

public class SelfHealingDriver {

    public static WebElement findElement(By primary, List<By> fallbacks) {
        try {
            return DriverFactory.getDriver().findElement(primary);
        } catch (NoSuchElementException e) {
            for (By fallback : fallbacks) {
                try {
                    return DriverFactory.getDriver().findElement(fallback);
                } catch (NoSuchElementException ignored) {}
            }
        }
        throw new NoSuchElementException("Element not found using self-healing logic");
    }
}
