package Response;

import io.restassured.response.Response;
public class ResponseData {

    private Response response;

    private int responseCode;

    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public void setResponse(Response response) {
//        this.response = response.then().log().all().extract().response();
        this.response = response;
    }

    public Response getResponse() {
        return this.response;
    }
}
