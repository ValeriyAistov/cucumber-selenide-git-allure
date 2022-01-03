package Pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class Page {
    public void clickButton(String text){
        $(By.xpath("//div[text()='"+ text +"']")).click();
    }
    public void clickNextButton(){
        $(By.cssSelector("#passp\\:sign-in")).click();
    }
}
