Feature: Verify ContactUs Page Functionality of SCENT arts site.

Scenario: Check all functionalities on the Contact Us page by passing valid Data

Given launch the Browser sc three
And enter the url sc three

 And Click the Contact us page SC-Three
 And verify contact us page has opened or not
 And Enter Your full Name
 |Vicky|Rocky|Jacky|
 And enter your company name
 |inmakes|Imakes|HiMakes|
 And enter your phone number
 |64964485|548544|654465| 
 And enter email address
 |hgdd@gmail.com|hguj@gmail.com|55jii@gmail.com|
 |kvekj@gmail.com|hfi@gmail.com|ikd@gmail.com|
 And select the type of service
 And select the country
 And Enter your message
 And Click the send button
 Then check wheather the message sent or not