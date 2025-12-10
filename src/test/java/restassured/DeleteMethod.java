package restassured;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import net.minidev.json.JSONObject;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class DeleteMethod {

    @Test
    public void verifyDeleteMethod(){
        RestAssured.baseURI = "https://reqres.in/api/";
        RestAssured
                .given()
                .header("x-api-key", "reqres_6cf85fefb2aa4b49a35d645903090fa1")
                .header("content-type", ContentType.JSON)
                .log().all()
                .delete("users/2")
                .then().log().all()
                .assertThat()
                .statusCode(HttpStatus.SC_NO_CONTENT);

    }
}
