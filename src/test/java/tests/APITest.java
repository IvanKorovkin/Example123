package tests;

import io.restassured.http.ContentType;
import models.POSTBody;
import models.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;
import static tests.BaseAPI.requestSpec;

public class APITest {

    @Test
    void GETListUsers() {

        given(requestSpec)
                .log().all()
        .when()
                .get("api/users")
        .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void POSTCreateUser() {

        given(requestSpec)
                .log().all()
                .when()
                .body("src/test/resources/body.json")
                .post("api/users")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void POSTCreateUser1() {

        POSTBody postBody = new POSTBody();
        postBody.setName("Ваня");
        postBody.setJob("тестировщик");

        given(requestSpec)
                .log().all()
                .when()
                .body(postBody)
                .post("api/users")
                .then()
                .log().all()
                .statusCode(200);
    }

    @Test
    void POSTCreateUser2() {

        POSTBody postBody = new POSTBody();
        postBody.setName("Ваня");
        postBody.setJob("тестировщик");

        Response response = given(requestSpec)
                .log().all()
                .when()
                .body(postBody)
                .post("api/users")
                .then()
                .log().all()
                .statusCode(200)
                .extract().as(Response.class);

        assertThat(response.getName()).isEqualTo("Ваня");
    }

}
