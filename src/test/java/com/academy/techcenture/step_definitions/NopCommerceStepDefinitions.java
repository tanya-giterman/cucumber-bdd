package com.academy.techcenture.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NopCommerceStepDefinitions {
    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        System.out.println("user is on the home page");
    }
    @When("user clicks on the login link")
    public void user_clicks_on_the_login_link() {
        System.out.println("user clicks on login link");
    }
    @Then("user should be navigated to login page")
    public void user_should_be_navigated_to_login_page() {
        System.out.println("user navigated to login page");
    }
    @When("user enters users login creds {string} and {string} and clicks on login button")
    public void user_enters_users_login_creds_and_and_clicks_on_login_button(String username, String password) {
        System.out.println("using" + username+ "and " + password + "for login");
    }
    @Then("user should be able to login")
    public void user_should_be_able_to_login() {
        System.out.println("user should be able to login");

    }

}
