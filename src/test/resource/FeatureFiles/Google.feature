@google @regression 
Feature: Users ability to search in google

Scenario Outline: User should able to search in google 

	Given Browse to Google homepage
	When Search by "<Keyword>"
	Then Verify search result appear
	
	Examples: 
		|Keyword |
		|Car     |