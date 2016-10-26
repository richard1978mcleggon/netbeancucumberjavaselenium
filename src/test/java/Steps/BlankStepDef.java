/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Steps;

import PageObjects.LehmanCollegeHomepage;
import PageObjects.AcademicsPage;
import PageObjects.PartnershipsPage;
import Modules.AcademicAction;
import Modules.PartnershipsAction;
import static com.thoughtworks.selenium.SeleneseTestBase.assertEquals;
import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 *
 * @author U021169
 */
public class BlankStepDef {

    public WebDriver driver;

    public BlankStepDef() {
        driver = Hooks.driver;
    }

    @When("^I navigate to lehman college website$")
    public void navigate_to_website() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        driver.get("http://www.lehman.cuny.edu/");
    }

    @And("^I navigate to academics page$")
    public void navigate_to_academics_page() throws Throwable {
        PageFactory.initElements(driver, LehmanCollegeHomepage.class);
        PageFactory.initElements(driver, AcademicsPage.class);
        AcademicAction.Execute(driver);
    }

    @And("^I navigate to partnerships page$")
    public void navigate_to_partnerships_page() throws Throwable {
        PageFactory.initElements(driver, LehmanCollegeHomepage.class);
        PageFactory.initElements(driver, PartnershipsPage.class);

        PartnershipsAction.Execute(driver);
    }

    @And("^I validate page title \"([^\"]*)\" and URL \"([^\"]*)\"$")
    public void verify_title_url(String title, String url) throws Throwable {
        assertEquals(title, driver.getTitle());
        assertEquals(url, driver.getCurrentUrl());

    }
}
