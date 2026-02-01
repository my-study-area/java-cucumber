package br.com.estudo.spring_cucumber;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import static org.hamcrest.MatcherAssert.assertThat;


public class VersionSteps extends StepDefsDefault {
    @Autowired
    private TestRestTemplate restTemplate;

    private ResponseEntity<String> response;

    @When("the client calls \\/version")
    public void the_client_calls_version() {
        response = restTemplate.getForEntity("http://localhost:8080/version", String.class);
    }

    @Then("the client receives status code of {int}")
    public void the_client_receives_status_code_of(Integer int1) {
        int statusCode = response.getStatusCode().value();
        Assertions.assertEquals(int1, statusCode);
    }

    @Then("the client receives server version {string}")
    public void the_client_receives_server_version(String double1) {
        Assertions.assertEquals(double1, response.getBody());
    }

}
