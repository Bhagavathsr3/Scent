Feature: Navigate to SCENTARTS Site.
Background:
Given to launch the browser
Given enter the url to launch

Scenario: Verify AREASOFSCENTING Site.

And Click the About us button 
And Scroll to Areas of Scenting
And verify Descriptions for Hotels
And verify Descriptions for offices
And verify Descriptions for Airports
Then the descriptions must be viewed





Scenario: Navigate to ContactUs from Our Service

And click the Our Services button
And Scroll to Contact Us button
And Click the Contact us page
Then Contact us page mustbe viewed