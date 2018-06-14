Feature: To register as a new user on avenueCode website
  and perform series of task

  Scenario: user opens avenueCode site to signup as new user
    Given User navigates to signup page
    When  User enters username, email id and Password
    Then User should be able to sign up verified by welcome title