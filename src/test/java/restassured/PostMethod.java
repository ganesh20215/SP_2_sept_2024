package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class PostMethod {

    @Test
    public void verifyPostMethod(){
        RestAssured.baseURI = "https://reqres.in/api/";
        JSONObject js = new JSONObject();
        js.put("name", "Swati");
        js.put("job", "Capgemini");
        js.put("position", "Automation Lead");
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cf85fefb2aa4b49a35d645903090fa1")
                .header("content-type", ContentType.JSON)
                .body(js.toString())
                .log().all()
                .post("users")
                .then().log().all()
                .assertThat()
                .statusCode(HttpStatus.SC_CREATED)
                .body("name", Matchers.equalTo("Swati"),
                        "position", Matchers.equalTo("Automation Lead"),
                        "job", Matchers.equalTo("Capgemini"),
                        "id", Matchers.notNullValue(),
                        "createdAt", Matchers.notNullValue());
    }
}
