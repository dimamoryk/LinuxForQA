package com.example.demo;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.equalTo;

public class HelloControllerRestAssuredTest {

    @BeforeEach
    public void setUp() {
        // Явно указываем IPv4 и порт
        System.setProperty("java.net.preferIPv4Stack", "true");
        RestAssured.baseURI = "http://127.0.0.1";
        RestAssured.port = 8080;
    }

    @Test
    public void testHelloEndpoint() {
        RestAssured.given()
            .when()
                .get("/hello")
            .then()
                .statusCode(200)
                .body(equalTo("Hello from Spring Boot in Docker!"));
    }
}
