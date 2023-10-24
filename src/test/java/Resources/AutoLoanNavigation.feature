Feature: Auto Loan Test
  @smoke
  Scenario: Auto Loan Navigation Test
    Given I Login Into The TNB
    When I Am On The Home Page
    And I Hover Over Product Button
    And I Should See Auto Link
    And I Click Auto Loan
    Then I Am On Auto Loan Page
    When I Enter First Name as "John"
    And I Enter Last Name as "Smith"
    And I Enter Address as "234 RedLion st PA"
    And I Enter Email as "smith@gmail.com"
    And I Enter Phone as "1231231212"
    And I Enter Social Security as "123121234"
    And I Enter Income as "123121"
    And I Enter Job Title as "Manager"
    And I Click Continue Button
    Then I Should be Into Vehicle Information
    And I Select Vehicle Type as "Sedan"
    And I Select Year as "2023"
    And I Select Make as "Toyota"
    And I Select Model as "Camry"
    And I Select Color as "Black"
    And I Enter VIN as "123123123"
    And I Enter Mileage as "12312"
    And I Click Submit Application
    And I Should Be See Submitted Successfully And Accept
    Then I Should be in Home Page
