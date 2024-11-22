//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage extends Configuracion {

    public BasePage(WebDriver driver) {
        super(driver);
    }

    public static void closeBrowser() {
        driver.close();
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement find(String locator) {
        return (WebElement)this.wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clickElement(String locator) {
        this.find(locator).click();
    }

    public void write(String locator, String keysToSend) {
        this.find(locator).clear();
        this.find(locator).sendKeys(new CharSequence[]{keysToSend});
    }

    public void selectFromDropdownByValue(String locator, String value) {
        Select dropdown = new Select(this.find(locator));
        dropdown.selectByValue(value);
    }

    public void selectFromDropdownByIndex(String locator, String value, int index) {
        Select dropdown = new Select(this.find(locator));
        dropdown.selectByIndex(index);
    }

    public int dropDownSize(String locator) {
        Select dropdown = new Select(this.find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        return dropdownOptions.size();
    }

    public List<String> getDropdownValues(String locator) {
        Select dropdown = new Select(this.find(locator));
        List<WebElement> dropdownOptions = dropdown.getOptions();
        List<String> values = new ArrayList();
        Iterator var5 = dropdownOptions.iterator();

        while(var5.hasNext()) {
            WebElement option = (WebElement)var5.next();
            values.add(option.getText());
        }

        return values;
    }

    public void desplazarAlFinal() {
        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }
}
