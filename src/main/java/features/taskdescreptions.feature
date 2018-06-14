Feature: Entering information into sub task description, allowing user to further explain the additional
  information and requirements for the task

  Scenario: User after entering task opens task manager and enters information into subtask description
    Given User is on pop up modal for sub task description
    When User enters valid character max 250 and due date
    Then subtask should ONLY accept if characters of count 250 and due date are filled