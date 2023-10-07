package Request;

import Utils.BasePage;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import java.util.Map;

public class RequestData extends BasePage {

    private RequestSpecification request = RestAssured.given();
    public void setRequest(RequestSpecification request) {
        this.request = request;
    }
    public RequestSpecification getRequest() {
        return this.request;
    }
    public void setRequestWithJsonHeaders() {
        this.request.contentType("application/json");
    }
    public void createRequestURL() {
        this.request.baseUri(getUri());
        this.request.basePath(getBasePath());
    }
    public void setQueryParameter(String key, String value) {
        this.request.queryParam(key,value);
    }
    public Response requestUsingGET() {
         return request.log().all().when().get();
    }

    public void updateBasePath(String basePath) {
        setBasePath(getBasePath().concat("/").concat(basePath));
        this.request.basePath(getBasePath());
    }
}
