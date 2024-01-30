package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.example.pojo.Location;
import org.example.pojo.LocationDetails;
import org.testng.annotations.Test;

import java.util.*;

public class PostDemo {
    @Test
    public void post_API()
    {
        RestAssured.baseURI=" https://rahulshettyacademy.com/";

        LocationDetails ld = new LocationDetails();
        Location l = new Location();
        l.setLat(-38.383494);
        l.setLng(33.427362);
        ld.setLocation(l);

        ld.setAccuracy(50);
        ld.setName("Frontline house");
        ld.setPhone_number("(+91) 983 893 3937");
        ld.setAddress("29, side layout, cohen 09");
        List<String> l1= new ArrayList<String>();
        l1.add("shoe park");
        l1.add("shop");
        ld.setTypes(l1);
        ld.setWebsite("http://google.com");
        ld.setLanguage("French-IN");

        Response responsedata=given().queryParam("key","qaclick123").
                header("Content-Type","application/json").
                body(ld)
                .when().
                post("maps/api/place/add/json").
                then().extract().response();

        System.out.println(responsedata.asPrettyString());

    }
}
