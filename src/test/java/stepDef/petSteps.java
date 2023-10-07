package stepDef;

import POJO.Pet;
import Request.RequestData;
import Response.ResponseData;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class petSteps {

    private Pet pet;
    private RequestData requestData;
    private ResponseData responseData;

    public petSteps(RequestData requestData,ResponseData responseData) {
        this.requestData = requestData;
        this.responseData = responseData;
    }
    
    @Given("Create a GET request to fetch Pet using ID")
    public void create_a_GET_request_to_fetch_Pet_using_ID() {
        requestData.createRequestURL();
    }

    @When("I add a petID in the Request URL")
    public void i_add_a_petID_in_the_Request_URL() {
        //requestData.setQueryParameter("status","available");
        requestData.updateBasePath("1");
    }

    @Then("the pet request response has a 200 response code")
    public void the_pet_request_response_has_a_response_code() {
        responseData.setResponse(requestData.requestUsingGET());
        responseData.setResponseCode(responseData.getResponse().getStatusCode());
        Assert.assertEquals(responseData.getResponseCode(),200,"Request Failed");
    }

    @Then("the pet requests response contains the correct json data")
    public void the_pet_requests_response_contains_the_correct_json_data() {
            this.pet = responseData.getResponse().getBody().as(Pet.class);
            System.out.println(pet.toString());
    }
}
