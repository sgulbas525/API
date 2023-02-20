@smoke @login
Feature: Product Login

  As a user, we would like to be able to connect successfully with the right credentials.

  RULES :
  - The user must have a valid username
  - The user must have a valid password
  - User will get a generic error message following login attempt with invalid credentials.

#  Background: User navigates to Company home page
#    Given I am on the "Company home" page on URL "www.mycomany.com"
#    Then I should see "Log In as Employee" message
#
#  Scenario: Successful login
#    When I fill in "Username" with "Test"
#    And I fill in "Password" with "123"
#    And I click on the "Log In" button
#    Then I am on the "My profile" page on URL "www.mycompany.com/myprofile"
#    And I should see "Welcome to your profile" message
#    And I should see the "Log out" button
#
#  Scenario Outline: Failed login using wrong credentials
#    When I fill in "Username" with "<username>"
#    And I fill in "Password" with "<password>"
#    And I click on the "Login" button
#    And I should see "<warning>" message
#    Examples:
#      | username    | password   | warning                           |
#      | Test        | !23        | Incorrect credentials. Try again! |
#      | Tset        | 123        | Incorrect credentials. Try again! |
#      | Tset        | !23        | Incorrect credentials. Try again! |
#      | Test        |            | Please enter password.            |
#      |             | 123        | Please enter username.            |
#      |             |            | Please enter your credentials.    |




