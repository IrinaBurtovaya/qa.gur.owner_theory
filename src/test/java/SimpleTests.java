import config.WebDriverProvider;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SimpleTests {

    private WebDriver driver = new WebDriverProvider().get();

    @Test
    void testGithubTests() {
        String title = driver.getTitle();
        assertEquals(title, "GitHub: Where the world builds software · GitHub");
    }

    @AfterEach
    public void stopDriver() {
        driver.quit();
    }
}
