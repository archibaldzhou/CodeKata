package Kata01;

import junit.framework.Assert;
import org.apache.commons.lang.StringUtils;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created with IntelliJ IDEA.
 * User: 305030777
 * Date: 15-7-8
 * Time: 下午3:36
 * To change this template use File | Settings | File Templates.
 */
public class HelloWorldSteps {
    private HelloWorld helloWorld;

    @Given("nothing")
    public void nothing() {
    }

    @When("I run")
    public void run() {
        helloWorld = new HelloWorld();
    }

    @Then("say $word")
    public void say(String word) {
        Assert.assertEquals(helloWorld.say(), StringUtils.isNotEmpty(word) ? word.trim() : "");
    }

}
