Feature: Download PDF and Page Information on Wikipedia
  I am an user
  I want to search a person's wiki
  I want to download pdf
  I want to check the page information
  I also want to check the article in other language


  Background:
    Given I am on the Main page of Wikipedia
    Then I check if the main page is open
    When I type "Albert Einstein" in the search field

#  Scenario: Download PDF
#    Then I check if the main page is open
#    When I type "Albert Einstein" in the search field
#    And I click the submit button
#    And I click the Tool menu button
#    And I click Download as PDF button
#    And I download the file from the Download as PDF page
#    Then the file with the provided name on the Download as PDF page is downloaded

  Scenario: Page Information
#    Then I check if the main page is open
#    When I type "Albert Einstein" in the search field
    And I click the submit button
    And I click the Tool menu button
    And I click Page Information on the Article page
    Then the Information page for the "Albert Einstein" article is displayed

  Scenario: Search Language
#    Then I check if the main page is open
#    When I type "Albert Einstein" in the search field
    And I change the search language to "Español"
    And I click the submit button
    Then the Article page for "Albert Einstein" in Español is opened
