Feature: check returned countries by API

  Background: 
    * url 'https://restcountries.eu'
    * header Accept = 'application/json'
  Scenario:
    Given path '/rest/v2/all'
    When method get
    Then status 200
