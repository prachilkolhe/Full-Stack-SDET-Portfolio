Feature: Newtoors Login Authentication
    To test the login with valid and invalid and length of inputs
    Background: Newtoors page is open
    Given newtoors page is open

    Scenario: Valid Data Login
        When mercury is typed as username
        And mercury123 typed as password
        And signin
        Then Flights page is open
        And ticket booking form should be available

    Scenario: Invalid Data Login
        When alexwrong is typed as username
        And wrongpassword is typed as password
        And signin
        Then Message of invalid credentials should be displayed

    Scenario Outline: small length inputs
        When {username} is entered
        Then message saying username should be of atleast eight characters
        When {password} is entered
        Then message with password should be eight characters with alpha numeric and special characters

    Example: 
        | username | password  |
        | abc      | passabc   |
        | xyzabc   | pass12345 |
        | krish    | passkrish |

        


