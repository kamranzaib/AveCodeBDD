Feature: Check if information of home page matches the requirements criteria
Scenario: User browsing on home page of avenueCode website checking today's todolist and task
  Given user is on home page of avenuecode website
  When user clicks MyTask next page and reads the top title under navigation bar
  Then title should read "Hey Username, this is your todo list for today:"