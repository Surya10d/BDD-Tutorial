#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
Feature: Automate practice page

  @inputCheck @E2ERun
  Scenario: Automate input elements
    Given go to practice page "https://rahulshettyacademy.com/AutomationPractice/"
   	When I select radio button
   	And I enter "india" in suggestion box
   	And I select india option in suggestion box
   	And I select option_two in dropdown box
   	And I click on option_two checkbox
   	
	@switchtoWindow @E2ERun
	Scenario: switch to window methods
		Given go to practice page "https://rahulshettyacademy.com/AutomationPractice/"
		When I click on open window button
		And I need to switch to window
		Then I close the child Window
		And I switch to parent window
	
	@switchtoTab @E2ERun
	Scenario: switch to Tab methods
		Given go to practice page "https://rahulshettyacademy.com/AutomationPractice/"
		When I click on open tab button
		And I need to switch to tab
		Then I close the child tab
		And I switch to parent window
		
	@switchtoAlert @E2ERun
	Scenario: switch to Alert methods
		Given go to practice page "https://rahulshettyacademy.com/AutomationPractice/"
		When I enter "Test" in switch to textbox
		When I click on alert button
		And I need to switch to alert mode
		Then I click on Ok on alert popup
		And I switch to parent window
	
	@switchtoConfirmAlert @E2ERun
	Scenario: switch to Alert methods
		Given go to practice page "https://rahulshettyacademy.com/AutomationPractice/"
		When I enter "Test" in switch to textbox
		When I click on confirm button
		And I need to switch to alert mode
		Then I click on Ok on alert popup
		When I enter "Test" in switch to textbox
		When I click on confirm button
		And I need to switch to alert mode
		Then I click on cancel on alert popup


