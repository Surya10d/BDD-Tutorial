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

Feature: Api automation practice
  Automation of API endpoints

	# List users api endpoint by GET Method
  @GET	@list_user @E2ERun
  Scenario: Hit list users GET api endpoint
		Given Load all the preconditions
		When I hit the GET api endpoint "https://reqres.in/api/users?page=1"
		Then All the user information should appear
		
	# Create user api endpoint by POST Method
	@POST @create_user @E2ERun
	Scenario: Hit create user POST api endpoint
		Given Load all the preconditions
		When I hit the POST api endpoint "https://reqres.in/api/users"
		And create user with user details
		|	name	|	job	|
		|	morpheus	|	leader	|
		Then New user should create
	
	# Update user api endpoint by PUT Method	
	@PUT @update_user @E2ERun
	Scenario: Hit update user PUT api endpoint
		Given Load all the preconditions
		When I hit the PUT api endpoint "https://reqres.in/api/users/680"
		And Update the user with user details by put method
		|	name	|	job	|	
		|	morpheus	|	zion resident put	|
		Then User should be updated
	
	# Update user api endpoint by PATCH Method
	@PATCH @update_user @E2ERun
	Scenario: Hit update user PATCH api endpoint
		Given Load all the preconditions
		When I hit the PATCH api endpoint "https://reqres.in/api/users/680"
		And Update the user with user details by patch method
		|	name	|	job	|	
		|	morpheus	|	zion resident patch	|
		Then User should be updated
	
	# DELETE user api endpoint by DELETE Method	
	@DELETE @delete_user @E2ERun
	Scenario: Hit delete user DELETE api endpoint
		Given Load all the preconditions
		When I hit the DELETE api endpoint "https://reqres.in/api/users/680"
		Then User should be deleted
	
