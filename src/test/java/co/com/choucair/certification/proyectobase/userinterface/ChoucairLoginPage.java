package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ChoucairLoginPage extends PageObject {
    public static final Target LOGIN_BUTTON = Target.the("button that shows us the way to login").located(By.xpath("//div[@class='d-none d-lg-block']//strong[contains(text(),'Ingresar')]"));
    public static final Target INPUT_USER = Target.the("place to write user name").located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the("place to write a password").located(By.id("username"));
    public static final Target ENTER_BUTTON = Target.the("button to confirm login").located(By.xpath("//button[contains(@class,'btn btn-primary')]"));
}
