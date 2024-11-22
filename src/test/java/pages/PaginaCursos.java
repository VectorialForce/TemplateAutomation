//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

public class PaginaCursos extends BasePage {
    private String FundamentosTestingLink = "//a[normalize-space()='Fundamentos del Testing' and @href]";

    public PaginaCursos() {
        super(driver);
    }

    public void clickFundamentosTestingLink() {
        this.clickElement(this.FundamentosTestingLink);
    }
}
