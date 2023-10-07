Feature: Pet Tests
  This feature includes tests that test the pet RESTFul services

  @smokeTest
  Scenario: Users are able to view pet
    Given Create a GET request to fetch Pet using ID
    When I add a petID in the Request URL
    Then the pet request response has a 200 response code
    And the pet requests response contains the correct json data