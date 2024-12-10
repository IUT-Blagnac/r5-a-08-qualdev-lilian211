package hellocucumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    static class IsItFriday {
        static String isItFriday(String today) {
            return "Friday".equals(today) ? "TGIF" : "Nope";
        }
    }

    private String today;
    private String answer;

    @Given("today is {string}")
    public void today_is(String string) {
       today = string;
    }

    @Given("today is Sunday")
    public void today_is_sunday() {
        today = "Sunday";
    }

    @When("I ask whether it's Friday yet")
    public void i_ask_whether_it_s_friday_yet() {
        answer = IsItFriday.isItFriday(today);
    }

    @Then("I should be told {string}")
    public void i_should_be_told(String expectedAnswer) {
        assertEquals(expectedAnswer, answer);
    }

    @Given("today is Friday")
    public void today_is_friday() {
        today = "Friday";
    }
}