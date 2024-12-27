@bvt
Feature: Login Feature - Production 
In order to perform succesfull login
As a user
I have entered correct user and password 




Feature: Login Feature

Scenario Outline: : Login to the facebook website as a user on production 
Given user navigates to the facebook website
When user validates the homepage titles
Then user enters "<username>" username 
And user enters "<password>" password
And user validates capctha image 
And user clicks on sign-in button


Examples:

| username | password |

| valid    | valid    |
| invalid  | invalid  |
| valid    | invalid  |
| invalid  | valid    |