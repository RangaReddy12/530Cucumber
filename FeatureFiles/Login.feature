Feature: Login page
As a Admin user i want to login feature
@tag1
Scenario: Validate Login
Given I open url in chrome browser
When I enter admin in usernamefield
When I enter admin in passwordfield
When I click on Login button
Then I verify Url
@tag2
Scenario Outline: Validate login with datatable
Given User Open url in "<Browser>" 
When user Enter "<Username>" in username textbox
When user Enter "<Password>" in password textbox
When User clcik on login button
Then User validates url
Then User close browser
Examples:
|Browser|Username|Password|
|chrome|Admin|Qedge123!@#|
|firefox|Admin|Qedge123!@#|
|chrome|Admin1|Qedge123!@#|
|chrome|Admin|Qedge123!@#5|
|chrome|Admin|Qedge123!@#|
|chrome|Admin|Qedge123!@#|


