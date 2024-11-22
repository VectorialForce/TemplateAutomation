
package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import java.util.Arrays;
import java.util.List;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pages.PaginaCursos;
import pages.PaginaFundamentosTesting;
import pages.PaginaPrincipal;
import pages.PaginaRegistro;

public class FreeRangeSteps {
    SoftAssert soft = new SoftAssert();
    PaginaPrincipal landingPage = new PaginaPrincipal();
    PaginaCursos cursosPage = new PaginaCursos();
    PaginaFundamentosTesting fundamentosPage = new PaginaFundamentosTesting();
    PaginaRegistro registro = new PaginaRegistro();

    public FreeRangeSteps() {
    }

    @Given("abro www.freerangetesters.com")
    public void iNavigateToFRT() {
        this.landingPage.navigateToFreeRangeTesters();
    }

    @When("voy a {word} usando la barra de navegacion")
    public void navigationBarUse(String section) {
        this.landingPage.clickOnSectionNavigationBar(section);
    }

    @Given("navego a www.freerangetesters.com")
    public void iNavigateToFRT2() {
        this.landingPage.navigateToFreeRangeTesters();
    }

    @And("selecciono introduccion al testing")
    public void clickEnIntroduccionTesting() {
        this.cursosPage.clickFundamentosTestingLink();
    }

    @And("(?:I|The user|The client) selecciono? Elegir Plan$")
    public void navigateToIntro() {
        this.fundamentosPage.clicEnElegirPlanButton();
    }

    @Then("(?:I|The user|The client) puede validar opciones en la pagina$")
    public void validateCheckoutPlans() {
        List<String> lista = this.registro.returnPlanDropdownValues();
        List<String> listaEsperada = Arrays.asList("Academia: $16.99 / mes • 13 productos", "Academia: $176 / año • 13 productos", "Free: Gratis • 3 productos");
        Assert.assertEquals(listaEsperada, lista);
    }
}

