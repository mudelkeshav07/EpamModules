package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class Stepdef {

    Accounts a;

    @Given("I have a balance of ${int} in my account")
    public void i_have_a_balance_of_$_in_my_account(Integer balance) {
         a = new Accounts(100);
    }
    @When("I request ${int}")
    public void i_request_$(Integer amount) {
        a.Withdraw(20);
    }
    @Then("${int} should be dispensed")
    public void $_should_be_dispensed(Integer balance) {
        System.out.println(a.getBalance());
        Assert.assertEquals(80, a.getBalance());
    }


}
