Feature: Performance test for absence flow
  as a lots of guardian
  we want to create/edit/delete absence

  @base_flow
  Scenario: 10 guardian call absence flow
    Given 1 threads is loaded
      And ramp-up period is set to 1 second
      And duration run time is set to 30 second
     When 1 guardian login system and call get user options api
      And call create absence api
      And if create absence successfully
     Then call edit absence item
      And call delete absence item
     Then verify the response time for all call api
   
