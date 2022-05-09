Feature: Search the given content

Scenario: Search on google page
Given go to google page "https://www.google.co.in"
When I type "java" in search bar
Then Search information for java must appear