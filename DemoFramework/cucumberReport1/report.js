$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/HRMlogin.feature");
formatter.feature({
  "name": "Login functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "login with valid user details",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "HRMLoginStepDef.user_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user open app URL \"https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\"",
  "keyword": "When "
});
formatter.match({
  "location": "HRMLoginStepDef.user_open_app_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter username as \"Admin\" and password as \"admin123\"",
  "keyword": "And "
});
formatter.match({
  "location": "HRMLoginStepDef.user_enter_username_as_and_password_as(String,String)"
});
formatter.result({
  "error_message": "java.lang.NullPointerException\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy13.sendKeys(Unknown Source)\r\n\tat com.pages.HRMLoginPage.enterUserName(HRMLoginPage.java:26)\r\n\tat com.stepDefination.HRMLoginStepDef.user_enter_username_as_and_password_as(HRMLoginStepDef.java:36)\r\n\tat ✽.user enter username as \"Admin\" and password as \"admin123\"(file:Features/HRMlogin.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on Login",
  "keyword": "And "
});
formatter.match({
  "location": "HRMLoginStepDef.click_on_Login()"
});
formatter.result({
  "status": "skipped"
});
});