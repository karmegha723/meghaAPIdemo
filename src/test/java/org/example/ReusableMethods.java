package org.example;

import io.restassured.path.json.JsonPath;

public class ReusableMethods {
    public static JsonPath resue() {
        JsonPath jp = new JsonPath(JsonBody.postjsonBody("Mouli","Leader"));

        return jp;

    }
}
