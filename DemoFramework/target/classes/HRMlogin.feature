Feature: Login functionality

Scenario: login with valid user details



Given User launch chrome browser

When user open app URL "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"

And user enter username as "Admin" and password as "admin123"

And click on Login

