//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

public class PaginaPrincipal extends BasePage {
    private String sectionLink = "//a[normalize-space()='%s' and @href]";

    public PaginaPrincipal() {
        super(driver);
    }

    public void navigateToFreeRangeTesters() {
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section) {
        String xpathSection = String.format(this.sectionLink, section);
        this.clickElement(xpathSection);
    }
}

