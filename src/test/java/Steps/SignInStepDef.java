package Steps;

import Pages.Page;
import Pages.SignInPage;
import config.UserConfig;
import io.cucumber.java.en.Then;

public class SignInStepDef {
    SignInPage signInPage = new SignInPage();
    Page page = new Page();

    @Then("Input login and click Enter")
    public void inputLoginAndClickEnter() {
        signInPage.inputLog(UserConfig.LOGIN);
        page.clickNextButton();
    }

    @Then("Input Password and click Enter")
    public void inputPasswordAndClickEnter() {
        signInPage.inputPass(UserConfig.PASS);
        page.clickNextButton();
    }

    @Then("Check correctness steps")
    public void CheckCorrectnessSteps(){
        signInPage.checkCorrectPass();
    }
}
