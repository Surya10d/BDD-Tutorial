Feature: Search the given content

	# Using background, scenario will be executed before to all scenario, scenario outline 

	Background: Open yahoo and then google search engine
			Given go to google page "https://in.yahoo.com"

	# Using '@' references the 'TAG / LABLES' which can be used in execution file as tags="{@tagname}"
	# Multiple can also be used tags = {"@OnlyScenarioTest, @ScenarioOutlineTest"}
	# In Scenario: We cant able to use the Examples as TEST-data
	# Comments should not used inside of the @tag,Scenario and Scenario outline, it will throw initialisation error
	
	@OnlyScenarioTest
		Scenario: Search on google page
			Given go to google page "https://www.google.co.in"
			When I type "JAVA" in search bar
			And I click on search bar button

	# In Scenario Outline: We can able to use the Examples as TEST-data
	# By using <url> within quotes, it will able to identify the test data	
	
	@ScenarioOutlineTest
		Scenario Outline: Search on google page
			Given go to google page "<url>"
			When I type "<search>" in search bar
			And I click on search bar button
			Then Search information for python must appear
			
			When I click on the python link
			Then "<search>" page must appear

		Examples:
			|	url	|	search	|
			|	https://www.google.co.in	|	Python	|
