$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/ScentArtsOne.feature");
formatter.feature({
  "name": "Navigate to SCENTARTS Site.",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "to launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "home.to_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the url to launch",
  "keyword": "Given "
});
formatter.match({
  "location": "home.enter_the_url_to_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Verify AREASOFSCENTING Site.",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Click the About us button",
  "keyword": "And "
});
formatter.match({
  "location": "home.click_the_About_us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll to Areas of Scenting",
  "keyword": "And "
});
formatter.match({
  "location": "home.scroll_to_Areas_of_Scenting()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Descriptions for Hotels",
  "keyword": "And "
});
formatter.match({
  "location": "home.verify_Descriptions_for_Hotels()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Descriptions for offices",
  "keyword": "And "
});
formatter.match({
  "location": "home.verify_Descriptions_for_offices()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Descriptions for Airports",
  "keyword": "And "
});
formatter.match({
  "location": "home.verify_Descriptions_for_Airports()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "the descriptions must be viewed",
  "keyword": "Then "
});
formatter.match({
  "location": "home.the_descriptions_must_be_viewed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "to launch the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "home.to_launch_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the url to launch",
  "keyword": "Given "
});
formatter.match({
  "location": "home.enter_the_url_to_launch()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Navigate to ContactUs from Our Service",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "click the Our Services button",
  "keyword": "And "
});
formatter.match({
  "location": "services.click_the_Our_Services_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Scroll to Contact Us button",
  "keyword": "And "
});
formatter.match({
  "location": "services.scroll_to_Contact_Us_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Contact us page",
  "keyword": "And "
});
formatter.match({
  "location": "services.click_the_Contact_us_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Contact us page mustbe viewed",
  "keyword": "Then "
});
formatter.match({
  "location": "services.contact_us_page_mustbe_viewed()"
});
formatter.result({
  "status": "passed"
});
formatter.uri("src/test/resources/ScentFunctionality.feature");
formatter.feature({
  "name": "Verify ContactUs Page Functionality of SCENT arts site.",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Check all functionalities on the Contact Us page by passing valid Data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "launch the Browser sc three",
  "keyword": "Given "
});
formatter.match({
  "location": "formfields.launch_the_browser_sc_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter the url sc three",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_the_url_sc_three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the Contact us page SC-Three",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.click_the_Contact_us_page_SC_Three()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify contact us page has opened or not",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.verify_contact_us_page_has_opened_or_not()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter Your full Name",
  "rows": [
    {
      "cells": [
        "Vicky",
        "Rocky",
        "Jacky"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_Your_full_Name(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your company name",
  "rows": [
    {
      "cells": [
        "inmakes",
        "Imakes",
        "HiMakes"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_your_company_name(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter your phone number",
  "rows": [
    {
      "cells": [
        "64964485",
        "548544",
        "654465"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_your_phone_number(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "enter email address",
  "rows": [
    {
      "cells": [
        "hgdd@gmail.com",
        "hguj@gmail.com",
        "55jii@gmail.com"
      ]
    },
    {
      "cells": [
        "kvekj@gmail.com",
        "hfi@gmail.com",
        "ikd@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_email_address(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the type of service",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.select_the_type_of_service()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "select the country",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.select_the_country()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter your message",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.enter_your_message()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click the send button",
  "keyword": "And "
});
formatter.match({
  "location": "formfields.click_the_send_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "check wheather the message sent or not",
  "keyword": "Then "
});
formatter.match({
  "location": "formfields.check_wheather_the_message_sent_or_not()"
});
formatter.result({
  "status": "passed"
});
});