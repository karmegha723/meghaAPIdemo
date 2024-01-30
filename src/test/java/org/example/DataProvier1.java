package org.example;

import io.restassured.RestAssured;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class DataProvier1 {
    //HashMap/Excel/DataProvider
    @Test(dataProvider = "empdata")
    public void createMutipleUser(String name,String job)
    {
        RestAssured.baseURI="https://reqres.in/";
        String st1=given().log().all().body(JsonBody.postjsonBody(name,job)).
                when().post("api/users").
                then().extract().response().asPrettyString();
        System.out.println(st1);
    }
    @DataProvider(name = "empdata")
    public Object[][] getData()
    {
        Object[][] objects = new Object[][]
                {{"MK","R1"},{"DK","R2"},{"Mk1","R2"}};
        return objects;

    }



}
