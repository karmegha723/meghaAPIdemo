package org.example;

import io.restassured.RestAssured;
import static io.restassured.RestAssured.*;

import org.codehaus.groovy.reflection.stdclasses.ByteCachedClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DataReadFromJsonFile {
    @Test
    public void externalJsonFile() throws IOException {
        RestAssured.baseURI="https://reqres.in/";

        byte[] content=Files.readAllBytes(Paths.get("C:\\Users\\DESKTOP\\Desktop\\Adduser.json"));
        //pick path of json -->convert it to bytecode-->convert it to String

        String st1=given().log().all().header("Content-Type","application/json").
                body(new String(content)).
                when().post("api/users").then().log().all().extract().response().asPrettyString();
    }


}
