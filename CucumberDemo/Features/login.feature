Feature: Login functionality







Scenario: login with valid user details



Given User launch chrome browser

When user open app URL "https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F"

And user enter email as "admin@yourstore.com" and password as "admin"

And click on Login

When user click on Logout link
