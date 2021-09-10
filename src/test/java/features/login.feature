Feature: Login into application

Scenario Outline: Positive test validating Login
Given Intilize the browser with chrome
And Navigate to "http://www.qaclickacademy.com//" site
And Click on Login link to land on the secure signin page
When User enters <username> and <password> and logs in
And user enters "anusha" and password as "12345"
And close browesers

Examples:
|username          |password|
|test99@gmail.com  |123456  |
|test123@gmail.com |12345|



