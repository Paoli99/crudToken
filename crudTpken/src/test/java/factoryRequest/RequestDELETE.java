package factoryRequest;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RequestDELETE implements IRequest {
    @Override
    public Response send(RequestInformation requestInformation) {

       Response response= given()
                            .header(requestInformation.getAuthType(), requestInformation.getAuthValue())
                            .contentType(ContentType.JSON)
                            .log().all()
                          .when()
                            .delete(requestInformation.getUrl());

       response.then().log().all();
       return response;
    }
}
