package org.example;


import io.restassured.RestAssured;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.http.Method;

import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.pojo.Emp;
import org.testng.annotations.Test;

/**
 * Unit
 * test for simple App.
 */
public class AppTest {
    @Test
    public void api_Test() {
        RestAssured.baseURI = "https://reqres.in/";
        given().log().all().header("ContentType", "application/json").
                when().get("api/users/2").
                then().log().all().assertThat().statusCode(200).body("data.id", equalTo(2));


    }
        @Test
    public void api_putTest() {
            RestAssured.baseURI = "https://reqres.in/";
            String body=given().when().get("api/users/2").then().extract().response().body().asString();
            System.out.println(body);
            JsonPath jp = ReusableMethods.resue();
            int id=jp.get("data.id");
            System.out.println(id);
            //String st1=given().log().all().header("ContentType","application/json").body(JsonBody.postjsonBody()).
                    when().post("api/users").asPrettyString();
            //System.out.println(st1);
    }
    @Test
    public void api_postTest() {
        Emp e = new Emp();
        e.setName("Megha2");
        e.setJob("Tester");
        RequestSpecification requestSn = new RequestSpecBuilder().setContentType(ContentType.JSON).
                setBaseUri("https://reqres.in/").setBody(e).build();
        ResponseSpecification responsp = new ResponseSpecBuilder().expectStatusCode(201)
                .expectContentType(ContentType.JSON).build();
        Response respnse = given().spec(requestSn).when().post("api/users")
                .then().spec(responsp).extract().response();
        System.out.println(respnse.asPrettyString());


       /* RestAssured.baseURI = "https://reqres.in/";
        String body=given().header("Content-Type","application/json").body(e).
                when().post("api/users").then().extract().response().body().asString();
        System.out.println(body); */

    }
    @Test
    public void specification_Test() {
        /*RestAssured.baseURI = "https://reqres.in/";
        given().log().all().header("ContentType", "application/json").
                when().get("api/users/2").
                then().log().all().assertThat().statusCode(200).body("data.id", equalTo(2));*/
//url and header
        RequestSpecification resqestspec = new RequestSpecBuilder().
                setBaseUri("https://reqres.in/").setContentType(ContentType.JSON).build();
        //response
        ResponseSpecification responseSpec = new ResponseSpecBuilder().expectContentType(ContentType.JSON).expectStatusCode(200).build();

        Response response = given().spec(resqestspec).when().get("api/users/2").then().spec(responseSpec).extract().response();
        response.asPrettyString();
        System.out.println(response.asPrettyString());

    }
}
