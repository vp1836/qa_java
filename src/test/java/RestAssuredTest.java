import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.get;
import static org.hamcrest.Matchers.equalTo;

public class RestAssuredTest {

    @BeforeEach
    public void setUp() {
        RestAssured.baseURI = "http://api.zippopotam.us";
    }

    @Test
    public void firstTest() {
        get("/us/90210").then().statusCode(200).body("country", equalTo("United States"))
                .log().body();

    }
}
