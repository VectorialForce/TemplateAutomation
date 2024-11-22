//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package steps;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import pages.BasePage;

public class Hooks extends BasePage {
    public Hooks() {
        super(driver);
    }

    @AfterStep
    public void tearDown(Scenario scenario) {
        byte[] screenshot;
        if (!scenario.isFailed()) {
            scenario.log("El escenario fue exitoso. Este es el screenshot");
            screenshot = (byte[])((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot del error");
        } else {
            scenario.log("El escenario fue fallido. Este es el screenshot");
            screenshot = (byte[])((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "Screenshot del error");
        }

    }
}
