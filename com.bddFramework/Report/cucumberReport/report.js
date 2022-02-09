$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Jyoti/Desktop/com.bddFramework/src/test/java/FeatureFile/Login.feature");
formatter.feature({
  "name": "Checking Login functionality of the application",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Checking Login functionality with valid login credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "user is on Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "login.User_is_on_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username in  username textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_enters_username_in_username_textfields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters password in password textfield",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_enters_password_in_password_textfields()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user click on the Login button",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_clicks_on_the_Login_buttons()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user is on HomePage",
  "keyword": "Then "
});
formatter.match({
  "location": "login.user_is_on_Home_Page()"
});
formatter.result({
  "status": "passed"
});
});