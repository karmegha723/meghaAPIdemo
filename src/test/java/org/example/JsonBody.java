package org.example;

public class JsonBody {

    public  static String getjsonBody()
    {
        String body="{\n" +
                "    \"data\": {\n" +
                "        \"id\": 2,\n" +
                "        \"email\": \"janet.weaver@reqres.in\",\n" +
                "        \"first_name\": \"Janet\",\n" +
                "        \"last_name\": \"Weaver\",\n" +
                "        \"avatar\": \"https://reqres.in/img/faces/2-image.jpg\"\n" +
                "    },\n" +
                "    \"support\": {\n" +
                "        \"url\": \"https://reqres.in/#support-heading\",\n" +
                "        \"text\": \"To keep ReqRes free, contributions towards server costs are appreciated!\"\n" +
                "    }\n" +
                "}";
        return body;
    }
    public  static String postjsonBody(String name,String leader)
    {
        String body="{\n" +
                "    \"name\": \""+name+"\",\n" +
                "    \"job\": \""+leader+"\"\n" +
                "}";
        return body;
    }

}
