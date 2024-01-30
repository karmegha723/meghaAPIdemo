package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.example.pojo.Data;
import org.example.pojo.ResourceDetails;
import org.testng.annotations.Test;

import java.util.List;

public class GetDemo {
    @Test
    public void get_Value()
    {
        RestAssured.baseURI="https://reqres.in";
        String res_string=given().log().all().
                when().get("/api/users").then().log().all().assertThat().statusCode(200)
                .extract().response().asPrettyString();
        System.out.println(res_string);
        ResourceDetails rd = given().log().all().
                when().get("/api/users").as(ResourceDetails.class);
        System.out.println(rd.getTotal());
        List<Data> data = rd.getData();
        for(Data d:data)
        {
            System.out.println(d.getId() +","+d.getEmail()+","+d.getFirst_name()+","+d.getLast_name());
        }
    }
}
