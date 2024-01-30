package org.example;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class DynamicJSon {
    @Test
    public void createTest() {
        RestAssured.baseURI = "https://reqres.in/";
        String st1=given().log().all().header("Content-Type", "application/json").
        body(JsonBody.postjsonBody("Mouli","Leader")).
                when().post("api/users").then().assertThat().log().all()
                .body("name",equalTo("Mouli"))

                .extract()
                .response().asPrettyString();
        System.out.println(st1);
        JsonPath jp = ReusableMethods.resue();
        String name =jp.get("name");
        String job=jp.get("job");
        System.out.println(name);
        System.out.println(job);

    }
}
