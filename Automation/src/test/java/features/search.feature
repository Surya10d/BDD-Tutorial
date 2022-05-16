Feature: Search the given content

Scenario: Search on google page
Given go to google page "https://www.google.co.in"
When I type "python" in search bar
And I click on search bar button
Then Search information for python must appear

When I click on the python link
Then "Python" page must appear