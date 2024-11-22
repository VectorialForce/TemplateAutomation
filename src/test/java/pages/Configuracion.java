package pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Configuracion {
    protected static WebDriver driver;
    WebDriverWait wait;

    public Configuracion(WebDriver driver) {
        this.wait = new WebDriverWait(BasePage.driver, Duration.ofSeconds(5L));
        BasePage.driver = driver;
    }

    static {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    //Importamos dotenv para poder trabajar con archivos .env
    public static Dotenv dotenv;

    //cargamos el archivo .env para usarlo en las pruebas
    static {
        try {
            String nombreArchivo = "datos.env";
            String ubicacionArchivo = "src/test/resources";
            dotenv = Dotenv.configure().
                    directory(ubicacionArchivo).
                    filename(nombreArchivo).
                    load();
        } catch (Exception e) {
            System.err.println(e.getMessage());
            dotenv = null;
        }

    }

    //creamos una función para obtener datos del archivo .env
    public static String obtenerDato(String dato) {
        if (dotenv == null) {
            System.err.println("El archivo .env no está cargado");
            return null;
        }
        return null;
    }
}
