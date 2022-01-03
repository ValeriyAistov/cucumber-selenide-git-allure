package Steps;

import Pages.Page;
import io.cucumber.java.en.Then;

public class BasicPageDef {
    Page page = new Page();

    @Then("Click {string} button")
    public void clickButton(String arg0) {
        page.clickButton(arg0);
    }


}
