package com.example.tests;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.json.JSONException;
import org.testng.Assert;
import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.responseSpecification;
import static org.hamcrest.core.IsEqual.equalTo;


public class TestRest {

    @Test(description = "API GET REQUEST TEST")
    public <string> void getRequestExampleTest() throws JSONException {

        RestAssured.baseURI = "https://api.vk.com/method/users.get?user_id=20723173&access_token=4d3f7b9fb2e866be5146d3b9dbdd6a828a56bff67995e6acc02dd464970e10c1ac585a5aaa2e373e39777&v=5.92";
         RequestSpecification httpRequest = given();
         Response response = httpRequest.get("/id");
         ResponseBody body = response.getBody();
         String bodyAsString = body.asString();
         Assert.assertTrue(bodyAsString.contains("id"), "Response body contains Hyderabad");
         response.prettyPrint();




    }
}

