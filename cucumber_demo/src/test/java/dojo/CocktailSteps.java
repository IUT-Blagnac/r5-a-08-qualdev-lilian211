package dojo;

import static org.junit.Assert.*;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;

import java.util.List;

public class CocktailSteps {
    private Order order;

    @Given("{string} who wants to buy a drink")
    public void who_wants_to_buy_a_drink(String buyer) {
        order = new Order();           
        order.declareOwner(buyer); 
    }

    @When("an order is declared for {string}")
    public void an_order_is_declared_for(String target) {
        order.declareTarget(target);  
    }

    @Then("there are {int} cocktails in the order")
    public void there_are_cocktails_in_the_order(int expectedCocktailCount) {
        List<String> cocktails = order.getCocktails();  
        assertEquals(expectedCocktailCount, cocktails.size());  
    }
}
