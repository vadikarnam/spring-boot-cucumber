package com.cucumber.example.demo.controller;

import static org.junit.Assert.assertEquals;

import com.cucumber.example.demo.SpringIntegrationTest;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CalculatorStepDefinitions extends SpringIntegrationTest {
 
    int response = 0;
    String url = DEFAULT_URL + "calc/";
 
    @When("^the client calls /calc/add with values (\\d+) and (\\d+)$")
    public void the_client_calls_calc_add_with_values_and(int arg1, int arg2) throws Throwable {
    	response = restTemplate.getForObject(url + "add?a=" +
    			arg1 + "&b=" + arg2, Integer.class);
    }
    
    @When("^the client calls /calc/sub with values (\\d+) and (\\d+)$")
    public void the_client_calls_calc_sub_with_values_and(int arg1, int arg2) throws Throwable {
    	response = restTemplate.getForObject(url + "sub?a=" +
    			arg1 + "&b=" + arg2, Integer.class);
    }
    
   
    
    @When("^the client calls /calc/mul with values (\\d+) and (\\d+)$")
    public void the_client_calls_calc_mul_with_values_and(int arg1, int arg2) throws Throwable {
    	response = restTemplate.getForObject(url + "mul?a=" +
    			arg1 + "&b=" + arg2, Integer.class);
    }

    @Then("^the client receives answer as (\\d+)$")
    public void the_client_receives_answer_as(int arg1) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
    	 assertEquals(arg1, response);
    }
 
}
