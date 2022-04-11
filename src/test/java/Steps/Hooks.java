package Steps;

import io.cucumber.java.Before;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    @Before
    public void openUrl(){
        System.setProperty("webdriver.chrome.driver","D:\\Тестировка\\chromedriver.exe");
        open("https://yandex.ru/");
    }

    public void closeUrl(){
        System.setProperty("webdriver.chrome.driver","D:\\Тестировка\\chromedriver.exe");
        open("https://yandex.ru/");
    }
}
