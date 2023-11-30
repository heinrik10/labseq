package io.github.otavio.labseq.controller;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CalculationControllerTest {

    @Test
    public void calculateEndpointOK() {
        given()
          .when().get("/calculate/1")
          .then()
             .statusCode(200)
             .body(is("1"));
    }

    @Test
    public void calculateEndpointNotOK() {
        given()
          .when().get("/calculate/-1")
          .then()
             .statusCode(500);
    }

}