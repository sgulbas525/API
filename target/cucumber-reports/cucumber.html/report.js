$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/LoginProcess.feature");
formatter.feature({
  "name": "Product Login",
  "description": "  As a user, we would like to be able to connect successfully with the right credentials.\n\n  RULES :\n  - The user must have a valid username\n  - The user must have a valid password\n  - User will get a generic error message following login attempt with invalid credentials.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.scenario({
  "name": "The user successfully logs in with valid credentials.",
  "description": "  This scenario tests that a user is able to successfully login when they enter valid credentials.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username \"Tester\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters password as \"test\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Login",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be logged in",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.the_user_should_be_logged_in()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user arrives at the home page and welcome text containing the username \"Tester\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.the_user_arrives_at_the_home_page_and_welcome_text_containing_the_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user attempts to log in with invalid credentials",
  "description": "  This scenario tests that a user is not able to log in when they enter invalid credentials.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username \"InvalidUserName\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters password as \"InvalidPassword\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Login",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login and \"Invalid Login or Password.\" error must be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.the_user_should_not_be_able_to_login_and_error_must_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "The user attempts to log in with multiple invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.step({
  "name": "the user enters username \"\u003cusername\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "the user enters password as \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "the user clicks on the Login",
  "keyword": "And "
});
formatter.step({
  "name": "the user should not be able to login and \"Invalid Login or Password.\" error must be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ]
    },
    {
      "cells": [
        "frank",
        "1234"
      ]
    },
    {
      "cells": [
        "jack",
        "4321"
      ]
    }
  ]
});
formatter.scenario({
  "name": "The user attempts to log in with multiple invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username \"frank\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters password as \"1234\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Login",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login and \"Invalid Login or Password.\" error must be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.the_user_should_not_be_able_to_login_and_error_must_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "The user attempts to log in with multiple invalid credentials.",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters username \"jack\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_username(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters password as \"4321\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_enters_password_as(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user clicks on the Login",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_clicks_on_the_Login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should not be able to login and \"Invalid Login or Password.\" error must be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.the_user_should_not_be_able_to_login_and_error_must_be_displayed(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/WebOrdesPage.feature");
formatter.feature({
  "name": "Product Web Orders Page Feature",
  "description": "  As a user, we would like to be able to validate the features that have been implemented on the web orders page.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in with valid credentials, \"Tester\" as username and \"test\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_logged_in_with_valid_credentials_as_username_and_as_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web orders page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_is_on_the_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In the web orders page, the level 1 header is displayed as \"Web Orders\".",
  "description": "  This scenario tests whether the web orders header is displayed or not.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user views the level 1 header is displayed as \"Web Orders\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_views_the_level_header_is_displayed_as(java.lang.Integer,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in with valid credentials, \"Tester\" as username and \"test\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_logged_in_with_valid_credentials_as_username_and_as_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web orders page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_is_on_the_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In the vertical menu bar, items are displayed",
  "description": "  This scenario tests whether the vertical menu bar items are displayed or not.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@webOrder"
    }
  ]
});
formatter.step({
  "name": "the user is on the web orders page",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_is_on_the_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see \"View all orders\" section in vertical menu bar",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_should_be_able_to_see_section_in_vertical_menu_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see \"View all products\" section in vertical menu bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_should_be_able_to_see_section_in_vertical_menu_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should be able to see \"Order\" section in vertical menu bar",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_should_be_able_to_see_section_in_vertical_menu_bar(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in with valid credentials, \"Tester\" as username and \"test\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_logged_in_with_valid_credentials_as_username_and_as_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web orders page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_is_on_the_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "In the web orders page, the user attempts to log out.",
  "description": "  This scenario tests that a user is able to successfully log out when they click the logout button.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "the user clicks on the logout button",
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_clicks_on_the_logout_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logs out and navigates to the login page",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_logs_out_and_navigates_to_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/features/addOrderProcess.feature");
formatter.feature({
  "name": "Add order",
  "description": "  As use, I want to be able to create new orders",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@add_order"
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the login page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.LoginProcessStepDefs.user_is_on_the_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user logged in with valid credentials, \"Tester\" as username and \"test\" as password",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_logged_in_with_valid_credentials_as_username_and_as_password(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user is on the web orders page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.WebOrdersPageStepDefs.the_user_is_on_the_web_orders_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "The user successfully create an order",
  "description": "  This scenario tests that a user is able to successfully create an order by entering valid inputs.",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@add_order"
    }
  ]
});
formatter.step({
  "name": "the user navigates to \"Order\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters address information:",
  "rows": [
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_enters_address_information(java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters payment information:",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_enters_payment_information(java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user enters product information:",
  "rows": [
    {},
    {}
  ],
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_enters_product_information(java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on calculate button",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_click_on_calculate_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user should verify that total 216 is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_should_verify_that_total_is_displayed(java.lang.Integer)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user click on process button",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_click_on_process_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the user navigates to \"View all orders\" page",
  "keyword": "And "
});
formatter.match({
  "location": "com.dover.assesment.step_definitions.OrderStepDefs.the_user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});