Feature: Verify Add Money Button is Displayed
  @smoke
  Scenario: Verify Add Money Button is Displayed
    Given I Login Into The TNB
    When   I Am On The Home Page
    When I Should See Add Money Button Is Displayed
