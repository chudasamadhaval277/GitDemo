Feature: Application Login

Scenario Outline: Positive test Login
Given Initialize the browser with "chrome"
And Navigate  to "http://qaclickacademy.com" site
And Click on login link in home page to land on sign in page
When User enter <username> and <password> and login in
Then Verify the User is succefully login


Examples:
|username						|password	|
|test99@gmail.com				|123456		|
|chudasamadhaval277@gmail.com	|dhaval27	|