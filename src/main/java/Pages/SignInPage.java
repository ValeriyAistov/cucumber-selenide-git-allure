package Pages;

import com.codeborne.selenide.SelenideElement;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.openqa.selenium.By;


import static com.codeborne.selenide.Selenide.$;
@Log4j2
public class SignInPage {
   private SelenideElement login = $(By.xpath("//*[@id=\"passp-field-login\"]"));
    private SelenideElement password = $(By.xpath("//*[@id=\"passp-field-passwd\"]"));
    private SelenideElement wrongPass = $(By.xpath("//div[text() = 'Неверный пароль']"));

    public void inputLog(String text){
        this.login.val(text);
    }

    public void inputPass(String text){
        this.password.val(text);
    }

    public void checkCorrectPass(){
        if (wrongPass.exists()) {
            log.error("Password wrong");
        } else {
           log.info("Password correct");
        }

    }
}
