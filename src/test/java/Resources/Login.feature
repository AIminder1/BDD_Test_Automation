Feature: Login Test
  @smoke
  Scenario: Login Test
    Given I Navigate To Login Page
    When I Enter Username as "admin"
    And I Enter Password as "password"
    And I Click Login Button
    Then I Should Login Successfully
