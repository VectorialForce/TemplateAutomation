//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package pages;

public class PaginaFundamentosTesting extends BasePage {
    private String elegirUnPlanButton = "//a[normalize-space()='Elegir Plan']";

    public PaginaFundamentosTesting() {
        super(driver);
    }

    public void clicEnElegirPlanButton() {
        this.clickElement(this.elegirUnPlanButton);
    }
}
