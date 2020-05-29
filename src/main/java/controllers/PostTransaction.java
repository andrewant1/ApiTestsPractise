package controllers;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.parsing.Parser;
import io.restassured.specification.RequestSpecification;
import requests.Base;

import static io.restassured.RestAssured.given;

public class PostTransaction {

    private RequestSpecification requestSpecification;
    private Base createOrder;

    public PostTransaction(Base testOrder) {
        requestSpecification = new RequestSpecBuilder()
                .setBaseUri("https://unl-plategka.test")
                .setBasePath("/ishop2/server/")
                .addHeader("Ishop-MerchantId", "7766554")
                .addHeader("Ishop-Signature", "test")
                .setContentType(ContentType.JSON)
                .setRelaxedHTTPSValidation()
                .build();

        RestAssured.defaultParser = Parser.JSON;
        this.createOrder = testOrder;
    }

    public void postTrains() {
        given(requestSpecification)
                .body(createOrder)
                .post().as(Base.class);
    }
}
