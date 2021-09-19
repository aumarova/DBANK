$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/CheckingAccount.feature");
formatter.feature({
  "line": 1,
  "name": "As a Customer, I want to add/edit/manage Bank Account Payment Profile",
  "description": "",
  "id": "as-a-customer,-i-want-to-add/edit/manage-bank-account-payment-profile",
  "keyword": "Feature"
});
formatter.background({
  "line": 3,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "User logs in with following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 6
    },
    {
      "cells": [
        "qa6@gmail.com",
        "Passwordvalid45"
      ],
      "line": 7
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User should successfully be logged in to home page",
  "keyword": "When "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 6448930125,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_logs_in_with_following_credentials(LoginDataContainer\u003e)"
});
formatter.result({
  "duration": 2322533708,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_should_successfully_be_logged_in_to_home_page()"
});
formatter.result({
  "duration": 29696791,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "As a user, I want to be able to view all details of my account home page",
  "description": "",
  "id": "as-a-customer,-i-want-to-add/edit/manage-bank-account-payment-profile;as-a-user,-i-want-to-be-able-to-view-all-details-of-my-account-home-page",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Verify that \"Welcome QA\" welcoming message is displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "Verify that home page panel with account info is displayed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Welcome QA",
      "offset": 13
    }
  ],
  "location": "CheckingSteps.verify_that_welcoming_message_is_displayed(String)"
});
formatter.result({
  "duration": 150677250,
  "status": "passed"
});
formatter.match({
  "location": "CheckingSteps.verify_that_home_page_panel_with_account_info_is_displayed()"
});
formatter.result({
  "duration": 517843792,
  "status": "passed"
});
formatter.after({
  "duration": 1698270750,
  "status": "passed"
});
formatter.uri("features/SignIn.feature");
formatter.feature({
  "line": 2,
  "name": "Digital Bank Login",
  "description": "",
  "id": "digital-bank-login",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 4286874500,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "As a user, I want to successfully login with valid credentials",
  "description": "",
  "id": "digital-bank-login;as-a-user,-i-want-to-successfully-login-with-valid-credentials",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "User logs in with following credentials",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 10
    },
    {
      "cells": [
        "qa6@gmail.com",
        "Passwordvalid45"
      ],
      "line": 11
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User should successfully be logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_logs_in_with_following_credentials(LoginDataContainer\u003e)"
});
formatter.result({
  "duration": 2165384167,
  "status": "passed"
});
formatter.match({
  "location": "SignInSteps.user_should_successfully_be_logged_in_to_home_page()"
});
formatter.result({
  "duration": 38902750,
  "status": "passed"
});
formatter.after({
  "duration": 1390659666,
  "status": "passed"
});
formatter.uri("features/Transactions.feature");
formatter.feature({
  "line": 2,
  "name": "Digital Bank Transactions",
  "description": "",
  "id": "digital-bank-transactions",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3954303208,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 13413375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 1929637750,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 30525542,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Submitting deposit without account",
  "description": "",
  "id": "digital-bank-transactions;submitting-deposit-without-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "User navigates to Deposit page",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "User submits a deposit with the following info",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 14
    },
    {
      "cells": [
        "---------- Select Account -----------",
        "112"
      ],
      "line": 15
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "Verify field error message \"Please select an item in the list.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TransactionsSteps.user_navigates_to_Deposit_page()"
});
formatter.result({
  "duration": 865527083,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.userSubmitsADepositWithTheFollowingInfo(DepositDataContainer\u003e)"
});
formatter.result({
  "duration": 442894000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please select an item in the list.",
      "offset": 28
    }
  ],
  "location": "CheckingSteps.verify_field_error_message_is_displayed(String)"
});
formatter.result({
  "duration": 35091416,
  "status": "passed"
});
formatter.after({
  "duration": 1131190041,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3739910125,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 11734166,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 2304983708,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 35151667,
  "status": "passed"
});
formatter.scenario({
  "line": 18,
  "name": "Submitting deposit without deposit",
  "description": "",
  "id": "digital-bank-transactions;submitting-deposit-without-deposit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 17,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 19,
  "name": "User navigates to Deposit page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "User submits a deposit with the following info",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 21
    },
    {
      "cells": [
        "ABC (Standard Checking)",
        ""
      ],
      "line": 22
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "Verify field error message \"Please fill out this field.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TransactionsSteps.user_navigates_to_Deposit_page()"
});
formatter.result({
  "duration": 981148750,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.userSubmitsADepositWithTheFollowingInfo(DepositDataContainer\u003e)"
});
formatter.result({
  "duration": 516422541,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please fill out this field.",
      "offset": 28
    }
  ],
  "location": "CheckingSteps.verify_field_error_message_is_displayed(String)"
});
formatter.result({
  "duration": 54246042,
  "status": "passed"
});
formatter.after({
  "duration": 1049772083,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3626907458,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 6547291,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 2012129292,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 29979125,
  "status": "passed"
});
formatter.scenario({
  "line": 26,
  "name": "Submitting deposit with zero deposit amount",
  "description": "",
  "id": "digital-bank-transactions;submitting-deposit-with-zero-deposit-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 25,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 27,
  "name": "User navigates to Deposit page",
  "keyword": "Given "
});
formatter.step({
  "line": 28,
  "name": "User submits a deposit with the following info",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 29
    },
    {
      "cells": [
        "ABC (Standard Checking)",
        "0"
      ],
      "line": 30
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 31,
  "name": "Verify alert error message \"Error The deposit amount ($0.00) must be greater than $0.00\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "TransactionsSteps.user_navigates_to_Deposit_page()"
});
formatter.result({
  "duration": 1435464000,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.userSubmitsADepositWithTheFollowingInfo(DepositDataContainer\u003e)"
});
formatter.result({
  "duration": 2154646417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error The deposit amount ($0.00) must be greater than $0.00",
      "offset": 28
    }
  ],
  "location": "TransactionsSteps.verifyAlertErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 43758833,
  "status": "passed"
});
formatter.after({
  "duration": 1592593417,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3746170083,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 9941041,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 2406198708,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 31029167,
  "status": "passed"
});
formatter.scenario({
  "line": 42,
  "name": "Submitting withdraw without account",
  "description": "",
  "id": "digital-bank-transactions;submitting-withdraw-without-account",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 41,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 43,
  "name": "User navigates to Withdraw page",
  "keyword": "Given "
});
formatter.step({
  "line": 44,
  "name": "User User submits a withdraw with following information",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 45
    },
    {
      "cells": [
        "---------- Select Account -----------",
        "500"
      ],
      "line": 46
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 47,
  "name": "Verify field error message \"Please select an item in the list.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "WithdrawSteps.userNavigatesToWithdrawPage()"
});
formatter.result({
  "duration": 1514016875,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawSteps.userUserSubmitsAWithdrawWithFollowingInformation(WithdrawDataContainer\u003e)"
});
formatter.result({
  "duration": 259756916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please select an item in the list.",
      "offset": 28
    }
  ],
  "location": "CheckingSteps.verify_field_error_message_is_displayed(String)"
});
formatter.result({
  "duration": 23245708,
  "status": "passed"
});
formatter.after({
  "duration": 1269560708,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3616546667,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 3668416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 2084443250,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 34173375,
  "status": "passed"
});
formatter.scenario({
  "line": 49,
  "name": "Submitting withdraw without deposit",
  "description": "",
  "id": "digital-bank-transactions;submitting-withdraw-without-deposit",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 48,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 50,
  "name": "User navigates to Withdraw page",
  "keyword": "Given "
});
formatter.step({
  "line": 51,
  "name": "User User submits a withdraw with following information",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 52
    },
    {
      "cells": [
        "ABC (Standard Checking)",
        ""
      ],
      "line": 53
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 54,
  "name": "Verify field error message \"Please fill out this field.\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "WithdrawSteps.userNavigatesToWithdrawPage()"
});
formatter.result({
  "duration": 1003117542,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawSteps.userUserSubmitsAWithdrawWithFollowingInformation(WithdrawDataContainer\u003e)"
});
formatter.result({
  "duration": 435891916,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Please fill out this field.",
      "offset": 28
    }
  ],
  "location": "CheckingSteps.verify_field_error_message_is_displayed(String)"
});
formatter.result({
  "duration": 32126625,
  "status": "passed"
});
formatter.after({
  "duration": 1239695666,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3648700250,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 2862792,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 1825677334,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 23645333,
  "status": "passed"
});
formatter.scenario({
  "line": 56,
  "name": "Submitting withdraw with zero deposit amount",
  "description": "",
  "id": "digital-bank-transactions;submitting-withdraw-with-zero-deposit-amount",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 55,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 57,
  "name": "User navigates to Withdraw page",
  "keyword": "Given "
});
formatter.step({
  "line": 58,
  "name": "User User submits a withdraw with following information",
  "rows": [
    {
      "cells": [
        "account",
        "amount"
      ],
      "line": 59
    },
    {
      "cells": [
        "ABC (Standard Checking)",
        "0"
      ],
      "line": 60
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 61,
  "name": "Verify alert error message \"Error The withdraw amount ($0.00) must be greater than $0.00\" is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "WithdrawSteps.userNavigatesToWithdrawPage()"
});
formatter.result({
  "duration": 973114167,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawSteps.userUserSubmitsAWithdrawWithFollowingInformation(WithdrawDataContainer\u003e)"
});
formatter.result({
  "duration": 1384127417,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Error The withdraw amount ($0.00) must be greater than $0.00",
      "offset": 28
    }
  ],
  "location": "TransactionsSteps.verifyAlertErrorMessageIsDisplayed(String)"
});
formatter.result({
  "duration": 39712666,
  "status": "passed"
});
formatter.after({
  "duration": 1131850500,
  "status": "passed"
});
formatter.background({
  "line": 4,
  "name": "User should successfully be logged in to home page",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "User navigates to Digital Bank login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Verify that web title is \"Digital Bank\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "User logs in with \"qa6@gmail.com\" and \"Passwordvalid45\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "User successfully logged in to home page",
  "keyword": "Then "
});
formatter.match({
  "location": "SignInSteps.user_navigates_to_Digital_Bank_login_page()"
});
formatter.result({
  "duration": 3612895209,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Digital Bank",
      "offset": 26
    }
  ],
  "location": "TransactionsSteps.verify_that_web_title_is(String)"
});
formatter.result({
  "duration": 4589375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "qa6@gmail.com",
      "offset": 19
    },
    {
      "val": "Passwordvalid45",
      "offset": 39
    }
  ],
  "location": "TransactionsSteps.user_logs_in_with_and(String,String)"
});
formatter.result({
  "duration": 1854733584,
  "status": "passed"
});
formatter.match({
  "location": "TransactionsSteps.user_successfully_logged_in_to_home_page()"
});
formatter.result({
  "duration": 25670792,
  "status": "passed"
});
formatter.scenario({
  "line": 63,
  "name": "Submitting valid withdraw",
  "description": "",
  "id": "digital-bank-transactions;submitting-valid-withdraw",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 62,
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "line": 64,
  "name": "User navigates to Withdraw page",
  "keyword": "Given "
});
formatter.step({
  "line": 65,
  "name": "User selects withdraw account as \"Money Market (Standard Checking)\"",
  "keyword": "And "
});
formatter.step({
  "line": 66,
  "name": "User submits a withdraw with \"20\" amount",
  "keyword": "When "
});
formatter.step({
  "line": 67,
  "name": "Verify that withdraw amount has been applied",
  "keyword": "Then "
});
formatter.match({
  "location": "WithdrawSteps.userNavigatesToWithdrawPage()"
});
formatter.result({
  "duration": 802056375,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Money Market (Standard Checking)",
      "offset": 34
    }
  ],
  "location": "WithdrawSteps.userSelectsWithdrawAccountAs(String)"
});
formatter.result({
  "duration": 116351750,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "20",
      "offset": 30
    }
  ],
  "location": "WithdrawSteps.userSubmitsAWithdrawWithAmount(String)"
});
formatter.result({
  "duration": 1293613375,
  "status": "passed"
});
formatter.match({
  "location": "WithdrawSteps.verifyThatWithdrawAmountHasBeenApplied()"
});
formatter.result({
  "duration": 423792,
  "status": "passed"
});
formatter.after({
  "duration": 1209846875,
  "status": "passed"
});
});