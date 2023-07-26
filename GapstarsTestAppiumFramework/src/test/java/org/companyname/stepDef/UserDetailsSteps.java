package org.companyname.stepDef;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.companyname.TestUtils.AndroidBaseTest;
import org.companyname.eCommerceHybrid;
import org.testng.Assert;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class UserDetailsSteps extends AndroidBaseTest{
    private eCommerceHybrid ecommerceHybrid = new eCommerceHybrid();

    @Then("User clicks on Submit button")
    public void userClicksOnSubmitButton() throws InterruptedException{
        formPage.submitForm();
    }

    @When("User enter username as {string}")
    public void userEnterUsernameAs(String name) {
        Assert.assertTrue(formPage.setNameField(name));
    }

    @And("User selects gender as {string}")
    public void userSelectsGenderAs(String gender) throws InterruptedException{
        formPage.setGender(gender);
    }

    @And("User selects country as {string}")
    public void userSelectsCountryAs(String country) throws InterruptedException{
        formPage.setCountrySelection(country);
    }

    @Then("Form is submitted successfully")
    public void formIsSubmittedSuccessfully() {
    }

    @When("I fill the form with the data")
    public void i_fill_the_form_with_the_data(List<HashMap<String, String>> testData) throws InterruptedException {
        HashMap<String, String> input = testData.get(0); // Assuming there's only one set of test data
        ecommerceHybrid.FillForm(input);
    }
}
