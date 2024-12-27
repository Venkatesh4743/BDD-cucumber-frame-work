@staging
Feature: Login Feature
In order to perform succesfull login
As a user
I have entered correct user and password 


Background:
Given user navigates to the facebook website
When user validates the homepage titles


@staging
Scenario: : Login to the facebook website as a valid user on Staging

Then user enters "valid" username 
And user enters "valid" password
And user validates capctha image
And user clicks on sign-in button


Scenario: : Login to the facebook website as a Invalid user on Staging

Then user enters "Invalid" username 
And user enters "Invalid" password
And user validates capctha image
And user clicks on sign-in button


