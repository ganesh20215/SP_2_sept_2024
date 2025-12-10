package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class GetRequest {

    @Test
    public void verifyGetRequest() {
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cf85fefb2aa4b49a35d645903090fa1")
                .header("content-type", ContentType.JSON)
                .log().all()
                .get("users/2")
                .then().log().all()
                .assertThat()
                .statusCode(HttpStatus.SC_OK)
                .body("data.id", Matchers.equalTo(2),
                        "data.first_name", Matchers.equalTo("Janet"),
                        "data.last_name", Matchers.equalTo("Weaver"));
    }
}
