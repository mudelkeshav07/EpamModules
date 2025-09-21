Feature: Signup/Signout Functionality

  Scenario: SignIn
    Given user should be on Signin Page
    When user should enter name & email and hit the button
    And Enter all the details
    Then Validate account created message


  Scenario: SignOut
    Given user will be on logged in page
    When click on Logout Button
    Then user should redirect to Loginpage